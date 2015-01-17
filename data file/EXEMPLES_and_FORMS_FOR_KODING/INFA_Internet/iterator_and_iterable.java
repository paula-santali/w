package infa;import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class iterator_and_iterable {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]) {	
		ArrayList al = new ArrayList();	// Create an array list	
		al.add("C");// add elements to the array list
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");		
		System.out.print("Original contents of al: ");// Use iterator to display contents of al
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " ");
		}	      		
		ListIterator litr = al.listIterator();// Modify objects being iterated
		while(litr.hasNext()) {
			Object element = litr.next();
			litr.set(element + "+");
		}
		System.out.print("\nModified contents of al: ");
		itr = al.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.print("\nModified list backwards: ");// Now, display the list backwards
		while(litr.hasPrevious()) {
			Object element = litr.previous();
			System.out.print(element + " ");}}}

//                                         Итераторы в Java.
	/** 
	Сегодня я расскажу вам о итераторах.
	Итератор — это объект, который позволяет программисту пробежать по элементам коллекции.
	«Ну и что?» — скажут некоторые — «Я могу это сделать с помощью обычного цикла!».
	Да, действительно, большинство стандартных коллекций из пакета java.util предоставляют возможность выборки элемента по его индексу, вот так:
	
	List list = new ArrayList();
	list.add("One");
	list.add("Two");
	list.add("Three");
	 
	for (int i = 0; i &lt; list.size(); i++) {
	System.out.println(list.get(i));
	}
	
	Но таким образом можно поступить далеко не со всеми коллекциями. 
	Возьмём, к примеру  Set. Если внимательно посмотреть на описание интерфейса java.util.Set, 
	то станет понятно, что в нём нет ни одного метода, который бы возвращал элемент данного множества.
	Как же тогда быть? Как обойти элементы Set’а?
	Вот тут то нам и придёт на помощь итератор.
	Все коллекции из java.util реализуют интерфейс Collection, который, в свою очередь,
	расширяет интерфейс Iterable. Вот оно, наше решение! В интерфейсе Iterable описан только
	один метод:

	Iterator    iterator()
	
	Он и возвращает т.н. итератор, т.е. объект, который поочерёдно возвращает все элементы коллекции.
    Вот так это выглядит в коде:
	
	Set set = new HashSet();
	set.add("One");
	set.add("Two");
	set.add("Three");
	Iterator iterator = set.iterator();
	while (iterator.hasNext()) {
	System.out.println(iterator.next());
	}
	
	Да да, вот так всё просто. Рассмотрим подробнее методы возвращаемого класса Iterator.
	
	boolean hasNext() — метод возвращает true, если в коллекции ещё остались элементы и false, если достигнут конец коллекции.
	E next() — метод возвращает текущий элемент. Т.к. итератор является параметризованным классом, то этот метод нам будет возвращает не Object, а сразу тот тип, которы нам нужен.
*/	
	//          Итераторы в Map.
/**	
	Теперь обратим своё внимание на интерфейс Map. Элементы реализующего этот интерфейс коллекции также можно обойти с помощью итераторов.
	Да, в этом интерфейсе нет метода iterator, но зато есть метод entrySet(). Этот метод вернёт нам Set, содержащий все пары ключ — значение для этой коллекции.
	Выглядеть это все будет так:

	Map pets = new HashMap();
	pets.put("Мурзик", "кот");
	pets.put("Бобик", "собака");
	pets.put("Кеша", "попугай");
	 
	Map.Entry set = pets.entrySet();
	Iterator&gt; iter = set.iterator();
	 
	while (iter.hasNext()) {
	Map.Entry pet = iter.next();
	System.out.println(pet.getKey() + " это " + pet.getValue());
	}
	
	После компилляции и запуска этого примера мы получим:
	
	Мурзик это кот
	Бобик это собака
	Кеша это попугай
	
	Что, нам и требовалось.
	*/