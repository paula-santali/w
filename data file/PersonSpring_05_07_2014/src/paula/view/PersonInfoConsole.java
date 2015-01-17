package paula.view;

public class PersonInfoConsole implements PersonInfoView{

	@Override
	public String show(String[] lines) {
		for(int i=0;i<lines.length;i++){
			System.out.println(lines[i]);
		}
		return null;
	}

}
