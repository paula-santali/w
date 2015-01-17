import java.util.Comparator;


public class EvenOddComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		if(arg0%2==0&&arg1%2==0)//in crestere dela mic la mare numerele din nauntru pare
			return arg0-arg1;
		if(arg0%2!=0&&arg1%2!=0)//in crestere dela mare la mic numerele din nautru impare
			return arg1-arg0;
		if(arg0%2==0&&arg1%2!=0)// 
			return -1;
		if(arg0%2!=0&&arg1%2==0)
			return 1;
		
		return 0;
	}

}
