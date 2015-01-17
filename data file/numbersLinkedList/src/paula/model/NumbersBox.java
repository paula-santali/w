package paula.model;
import java.util.Comparator;

public interface NumbersBox extends Iterable<Integer>{
public  void addNumbers(int number);
boolean removeNumber(int number);
NumbersBox getNumbersByComparator(Comparator<Integer> comp, int patern);
void removeRepeated();
void union(NumbersBox nb);
void intersection(NumbersBox nb);
void subtract(NumbersBox nb);
}
