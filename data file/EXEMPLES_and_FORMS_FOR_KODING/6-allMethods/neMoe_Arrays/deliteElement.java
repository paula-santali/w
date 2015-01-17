package neMoe_Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;

public class deliteElement {

	public static void main(String[] args) {
		Integer[][] ar = { { 1, 2, 3 }, { 11, 22, 33 }, { 111, 222, 333 } };
		System.out.println(Arrays.deepToString(ar));
		System.out.println("---------------");
		ar=deleteRow(ar, 0);
		System.out.println(Arrays.deepToString(ar));
		System.out.println("---------------");

	}
	public static <T> T[][] deleteRow(T[][] src, int idx) {
		for (int i = 0; i < src.length; i++) {
			src[i] = deleteElement(src[i], idx);
		}
		return src;
	}
	public static <T> T[] deleteElement(T[] src, int idx) {
		@SuppressWarnings("unchecked")
		T[] dest = (T[]) Array.newInstance(src[0].getClass(), src.length - 1);
		for (int i = 0; i < src.length; i++) {
			if (i < idx) {
				dest[i] = src[i];
			} else if (i > idx) {
				dest[i - 1] = src[i];
			}
		}
		return dest;
	}

}
