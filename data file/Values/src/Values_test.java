
public class Values_test {

	
	public static void main(String[] args) {
		int res;
		res=pow2(2)-1;
		System.out.println(res);
		
	}
	static int pow2(int k){
		int k1 = 0,res;
		for(res=1;res>0;k1--){
			res=res*2;
		}
		return res;
	}

}
