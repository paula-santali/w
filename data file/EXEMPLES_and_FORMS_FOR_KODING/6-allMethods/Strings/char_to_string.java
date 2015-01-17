package Strings;
public class char_to_string {
	/*int i = 5;
	while(0<i){ 
		char[] ch = new char[10];
		ch[4]='*';
		ch[6]='*';
		ch[2]='*';
		ch[8]='*';
		ch[9]='*';
		String str = String.valueOf(ch);

		System.out.println(str);
		i--;
	}*/

	/*
@Override
	public Iterator<String> iterator() {
		int maxYnumber = 0;
		int maxXnumber = 0;
		for(int i=0; i < point.length;i++){
			if(point[i].getX() > maxXnumber){
				maxXnumber = point[i].getX();
			}
			if(point[i].getY() > maxYnumber){
				maxYnumber = point[i].getY();
			}
		}

		String[] layer = new String[maxYnumber];		
		char[] symbol = new char[maxXnumber];
		int in = 0;
		for(int y = 0;y < layer.length;y++){			
			for(int x = 0;x < point.length;x++){			
				if(y == point[x].getY() && in >= 0 && in < symbol.length-1)
				symbol[in] = '*';
				in++;
			}
			in = 0;
			layer[y] = String.valueOf(symbol);
		}

		LayersIterator li = new LayersIterator(layer);
		return li;
	}
	 */

}
