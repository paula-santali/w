
public class Print_Characters_test {//functia care scrie cite o litera in coloana//
	public static void main(String[] args) {
		String str="Hello";
		printCharacters(str);
	}
	public static void printCharacters(String str){
		int i;
		int size= str.length();
		for(i=0;i<size;i++){
			System.out.println(str.charAt(i));
		}
	}
}
