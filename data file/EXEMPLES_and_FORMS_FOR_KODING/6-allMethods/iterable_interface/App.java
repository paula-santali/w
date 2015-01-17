package iterable_interface;

import iterable_interface.Person_Iterable.Person;


public class App {

	//aplication methods
		public static void main(String[] args) {
			Person [] array = new Person[5];
			fill(array);

			for (Person kid : array)  {// Iterate over the kids
				System.out.println(kid.getFirstName()+" | "+kid.getLastName()+" | "+kid.getAge());
			}
		}
		private static void fill(Person[] ted) {
			for(int i = 0;i<ted.length;i++)
				ted[i] = create(ted[i]);	
		}
		private static Person create(Person person) {
			String [] name = {"Moshe  ","Haim   ","Abraham","David  ","Efrat  ","Vasiliy"};
			int id = (int)(Math.random()*name.length);
			String [] neward = {"Neward","Neward","Neward","Neward","Neward","Neward"};
			int ne = (int)(Math.random()*neward.length);
			int age = (int)(Math.random()*(1+50+1)+1);
			Person out = new Person(person);
			out.setAge(age);
			out.setFirstName(name[id]);
			out.setLastName(neward[ne]);
			return out;
		}


}

/**

public class GarageViewFrame implements GarageView { 
  
    private Garage model = null; 
  
    @Override
    public void showGarage() { 
        JFrame frame = new JFrame(); 
        frame.setBounds(300, 200, 250, 200); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        JTextArea ta = new JTextArea(); 
        JScrollPane sp = new JScrollPane(ta); 
        frame.add(sp); 
  
        Car[] cars = model.getCars(); 
        for(int i=0; i<cars.length; i++) 
            ta.append(cars[i].toString() + "\n"); 
  
        frame.setVisible(true);      
    } 
  
    @Override
    public void setGarage(Garage garage) { 
        this.model = garage; 
  
    } 
  
}

 
 
*/