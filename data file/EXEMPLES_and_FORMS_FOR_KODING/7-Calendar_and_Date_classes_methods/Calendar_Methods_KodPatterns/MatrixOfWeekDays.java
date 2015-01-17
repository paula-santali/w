package Calendar_Methods_KodPatterns;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MatrixOfWeekDays
{
    public static void main(String[] args) {
    	Calendar cl=new GregorianCalendar();
    	cl.set(2014, 01, 01);
        // Объ�?вим ко�?нтанту дл�? размера ма�?�?ива
    	
        int SIZE=12;
       
        // Создаем двумерный ма�?�?ив 
        int[][] graph = new int[SIZE][SIZE];
 int a=1;
 
        // Цикл по первой размерно�?ти (первые квадратные �?кобки)
        for (int i = 0; i < SIZE; i++) {
            // Цикл по второй размерно�?ти (вторые квадратные �?кобки)
            for (int j = 0; j < SIZE; j++) {
                graph[i][j] = a;
                a++;
            }
          
        }
 
        // Теперь выводим ма�?�?ив на �?кран
        // Цикл по первой размерно�?ти выводит �?троки
        for (int i = 0; i < SIZE; i++) {
            // Цикл по второй размерно�?ти выводит колонки - вывод одной �?троки
            for (int j = 0; j < SIZE; j++) {
                // И�?пользуем оператор print - без перехода на �?ледующую �?троку
                System.out.print(graph[i][j]+",");
            }
            // Переход на �?ледующую �?троку
            System.out.println();
        }
    }
}