package infa;public class API_Collections_in_java {}
/**
API коллекций Java многими Java-разработчиками был воспринят как очень нужная замена стандартных массивов, 
устраняющая их недостатки. Ассоциирование коллекций в первую очередь с ArrayList не является большой ошибкой, 
однако те, кто ищет, могут открыть для себя в коллекциях намного больше.
Об этой серии статей
Вы думаете, что знаете, как программировать на Java? На самом деле большинство разработчиков лишь поверхностно знакомятся с платформой Java, 
узнавая лишь то, что необходимо для выполнения работы. В этом цикле статей Тед Ньювард углубляется в основную функциональность платформы Java, 
чтобы рассказать о малоизвестных фактах, знание которых может помочь при решении самых сложных задач программирования.
Аналогично, хотя Map (и его распространенная реализация HashMap) являются отличным средством создания пар имя–значение или ключ–значение, нет причины ограничивать себя этими знакомыми инструментами. 
Вы можете исправить много потенциально ошибочного кода, выбрав правильный API или даже правильную коллекцию.
Это вторая статья цикла 5 вещей, в ней мы начнем рассказ о коллекциях, и продолжим его в следующих статьях, так как это одна из самых важных тем Java-программирования. 
Сначала мы рассмотрим самые быстрые (но, возможно, не самые распространенные) способы выполнения рутинных задач, таких как замену массивов коллекциями List. 
После этого мы перейдем к менее известным вещам, таким как написание собственного класса-коллекции и расширение API коллекций Java.
*/
//                1. Коллекции вытесняют массивы
/**
Разработчики, начинающие работать с технологиями Java, могут не знать, что изначально массивы были включены в язык, чтобы защититься от критики относительно производительности, 
поступавшей от разработчиков C++ в начале 1990-х. С тех пор прошло много времени, и достижения массивов в производительности выглядят тускло по сравнению с производительностью библиотеки коллекций Java.
Например, чтобы сформировать из содержимого массива строку, нужно обойти весь массив и объединить содержимое всех его элементов в одном объекте String, 
тогда как в коллекциях имеется готовая реализация метода toString().
За редким исключением, рекомендуется каждый поступающий к вам массив как можно скорее конвертировать в коллекцию.
Это приводит к вопросу: как легче всего выполнить такое преобразование? Оказывается, API коллекций Java делает этот задачу весьма простой, как показано в листинге 1:
 
Листинг 1. ArrayToList

import java.util.*;

public class ArrayToList
{
    public static void main(String[] args)
    {
        // Это не даст нам ничего хорошего
        System.out.println(args);
        
        // Конвертируем args в коллекцию List объектов String
        List<String> argList = Arrays.asList(args);
        
        // Распечатываем
        System.out.println(argList);
    }
}

Обратите внимание, что возвращаемая коллекция List является неизменяемой, поэтому попытка добавить новые элементы приведет к выбрасыванию исключения UnsupportedOperationException.
И, так как в методе Arrays.asList() для добавления элементов List используется параметр varargs, с его помощью можно легко создавать коллекции List из только что созданных объектов.
В начало
*/
//                      2. Итерирование неэффективно
/**
Нередко бывает нужно переместить содержимое одной коллекции (особенно такой, которая был создана из массива) в другую коллекцию, или удалить некоторую часть объектов из коллекции.
Естественное решение здесь – это обойти (с помощью итератора) коллекцию и добавить либо удалить нужные элементы. Однако не стоит так делать.
Итерирование в данном случае имеет несколько серьезных недостатков:
неэффективно изменять размер коллекции при каждом добавлении или удалении элемента;
каждый раз при получении блокировки, выполнении операции и освобождении блокировки могут возникать проблемы, связанные с одновременным доступом;
могут возникнуть гоночные ситуации при доступе к коллекции из других потоков во время добавления или удаления элементов.
Всех этих проблем можно избежать, используя методы addAll или removeAll, передавая в них коллекции, содержащие элементы, которые нужно добавить или удалить.
*/
//                      3. Цикл for для любого объекта с интерфейсом Iterable
/**
Расширенный цикл for – это одно из самых полезных улучшений, добавленных в Java 5, благодаря которому был убран последний барьер для работы с коллекциями в Java.
Ранее разработчикам приходилось вручную получать Iterator, затем с помощью метода next() получать объект, на который этот Iterator указывает, а затем проверять с помощью метода hasNext(), 
имеются ли еще объекты. Начиная с Java 5, вместо этого можно использовать цикл for, в котором все это обрабатывается автоматически.
Фактически этот цикл можно использовать при работе с любым объектом, реализующим интерфейс Iterable, а не только с коллекциями.
В листинге 2 показан способ сделать список детей объекта Person доступным в виде итератора. 
Вместо того чтобы передавать ссылку на внутренний List (которая позволит вызывающей стороне извне объекта Person добавлять ему детей – что не понравилось бы большинству родителей),
тип Person реализует интерфейс Iterable. Такой подход также позволяет с помощью расширенного цикла for обходить детей объекта класса Person.
 
Листинг 2. Расширенный цикл for: покажите мне ваших детей

// Person.java
import java.util.*;

public class Person
    implements Iterable<Person>
{
    public Person(String fn, String ln, int a, Person... kids)
    {
        this.firstName = fn; this.lastName = ln; this.age = a;
        for (Person child : kids)
            children.add(child);
    }
    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public int getAge() { return this.age; }
    
    public Iterator<Person> iterator() { return children.iterator(); }
    
    public void setFirstName(String value) { this.firstName = value; }
    public void setLastName(String value) { this.lastName = value; }
    public void setAge(int value) { this.age = value; }
    
    public String toString() { 
        return "[Person: " +
            "firstName=" + firstName + " " +
            "lastName=" + lastName + " " +
            "age=" + age + "]";
    }
    
    private String firstName;
    private String lastName;
    private int age;
    private List<Person> children = new ArrayList<Person>();
}


// App.java
public class App{
    public static void main(String[] args) {
        Person ted = new Person("Ted", "Neward", 39,
            new Person("Michael", "Neward", 16),
            new Person("Matthew", "Neward", 10));

        // Iterate over the kids
        for (Person kid : ted){
            System.out.println(kid.getFirstName());
        }
    }
}

Использование Iterable имеет некоторые очевидные недостатки при моделировании предметной области, так как с помощью метода iterator() таким образом можно поддерживать только одну коллекцию объектов.
Однако для таких случаев, как этот, где коллекция детей напрашивается сама, интерфейс Iterable делает программирование предметной области намного проще и очевиднее.
*/
//                         4. Классические и пользовательские алгоритмы
/**
Хотели ли вы когда-нибудь обойти коллекцию, но не в прямом, а в обратном порядке? Именно здесь может пригодиться алгоритм коллекций Java.
В листинге 2 дети объекта Person перечисляются в порядке, в котором они были переданы, однако теперь мы хотим перечислить их в обратном порядке.
Можно было бы написать еще один цикл for и вставить в нем объекты в новую коллекцию ArrayList в обратном порядке, однако это может утомить при использовании этого кода третий или четвертый раз.
Здесь можно применить незаслуженно редко используемый алгоритм, показанный в листинге 3.

Листинг 3. ReverseIterator

public class ReverseIterator{
    public static void main(String[] args){
        Person ted = new Person("Ted", "Neward", 39,
            new Person("Michael", "Neward", 16),
            new Person("Matthew", "Neward", 10));

        // Делаем копию списка
        List<Person> kids = new ArrayList<Person>(ted.getChildren());
        // Переворачиваем его
        Collections.reverse(kids);
        // и отображаем
        System.out.println(kids);
    }
}

В классе Collections имеется несколько таких "алгоритмов" – статических методов, принимающих в качестве параметра объект класса Collections и выполняющих над этой коллекцией независящие от реализации действия.
Более того, алгоритмы, представленные в классе Collections, определенно не являются последним словом в замечательной архитектуре этого API.
Например, я предпочитаю, чтобы методы не изменяли содержимое (передаваемой в них коллекции) напрямую. Для таких случаев предусмотрена возможность написания пользовательских алгоритмов,
один из которых в качестве примера показан в листинге 4.
  
Листинг 4. Упрощаем ReverseIterator

class MyCollections{
    public static <T> List<T> reverse(List<T> src){
        List<T> results = new ArrayList<T>(src);
        Collections.reverse(results);
        return results;
    }
}
*/
//                 5. Расширяем API коллекций
/**
Приведенный выше пользовательский алгоритм иллюстрирует последнюю особенность API коллекций в Java: его можно расширять и видоизменять в соответствии с потребностями разработчиков.
Например, допустим, нам нужно, чтобы список детей объекта класса Person всегда был отсортирован по возрасту.
Можно написать алгоритм, который будет каждый раз сортировать список (например, с помощью метода Collections.sort), однако было бы гораздо лучше, если бы класс коллекции выполнял эту сортировку сам.
На самом деле, возможно, вам нет дела до того, в каком порядке объекты были вставлены в коллекцию (что имеет принципиальное значение для коллекции List).
Возможно, вы просто хотите хранить их согласно порядку сортировки.
Ни одна коллекция из пакета java.util не удовлетворяет этим требованиям, однако можно довольно легко написать нужный класс самостоятельно.
Все, что нужно, – это создать интерфейс, описывающий абстрактное поведение, которое должна обеспечивать коллекция. Например, интерфейс SortedCollection,
имеющий исключительно поведенческое предназначение (листинг 5).

Листинг 5. SortedCollection

public interface SortedCollection<E> extends Collection<E>{
    public Comparator<E> getComparator();
    public void setComparator(Comparator<E> comp);
}

Написать реализацию данного интерфейса очень просто (листинг 6).

Листинг 6. ArraySortedCollection

import java.util.*;
public class ArraySortedCollection<E>
    implements SortedCollection<E>, Iterable<E>{
    private Comparator<E> comparator;
    private ArrayList<E> list;
        
    public ArraySortedCollection(Comparator<E> c){
        this.list = new ArrayList<E>();
        this.comparator = c;
    }
    public ArraySortedCollection(Collection<? extends E> src, Comparator<E> c){
        this.list = new ArrayList<E>(src);
        this.comparator = c;
        sortThis();
    }

    public Comparator<E> getComparator() { return comparator; }
    public void setComparator(Comparator<E> cmp) { comparator = cmp; sortThis(); }
    
    public boolean add(E e)
    { boolean r = list.add(e); sortThis(); return r; }
    public boolean addAll(Collection<? extends E> ec) 
    { boolean r = list.addAll(ec); sortThis(); return r; }
    public boolean remove(Object o)
    { boolean r = list.remove(o); sortThis(); return r; }
    public boolean removeAll(Collection<?> c)
    { boolean r = list.removeAll(c); sortThis(); return r; }
    public boolean retainAll(Collection<?> ec)
    { boolean r = list.retainAll(ec); sortThis(); return r; }
    
    public void clear() { list.clear(); }
    public boolean contains(Object o) { return list.contains(o); }
    public boolean containsAll(Collection <?> c) { return list.containsAll(c); }
    public boolean isEmpty() { return list.isEmpty(); }
    public Iterator<E> iterator() { return list.iterator(); }
    public int size() { return list.size(); }
    public Object[] toArray() { return list.toArray(); }
    public <T> T[] toArray(T[] a) { return list.toArray(a); }
    
    public boolean equals(Object o){
        if (o == this)
            return true;
        
        if (o instanceof ArraySortedCollection){
            ArraySortedCollection<E> rhs = (ArraySortedCollection<E>)o;
            return this.list.equals(rhs.list);
        }
        
        return false;
    }
    public int hashCode(){
        return list.hashCode();
    }
    public String toString(){
        return list.toString();
    }
    
    private void sortThis(){
        Collections.sort(list, comparator);
    }
}

Эта реализация была написана «на коленке», без мысли об оптимизации и, очевидно, ее стоит немного переработать. 
Однако суть в том, что API коллекций в Java ни в коем случае не является окончательным решением для всего, что связано с коллекциями. Он нуждается в расширении и поощряет его.
Конечно, некоторые расширения будут из разряда решений "большой мощности", например те, что появились в пакете java.util.concurrent. 
Однако другие расширения могут быть довольно просты – например, написание пользовательского алгоритма или простого расширения существующего класса Collection.
Расширение API коллекций Java может показаться необычайно трудным, однако, начав заниматься этим, вы обнаружите, что это вовсе не так сложно, как вы думали.

*/