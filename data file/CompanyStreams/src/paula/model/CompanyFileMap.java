package paula.model;
import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class CompanyFileMap implements CompanyFile {
String fileName;
HashMap<Integer,EmployeeInfo>employees=new HashMap<Integer,EmployeeInfo>();
public CompanyFileMap(String fileName){
	this.fileName=fileName;
}
	@Override
	public Iterator<EmployeeInfo> iterator() {
		
		return employees.values().iterator();
	}

	@Override
	public boolean addEmployee(EmployeeInfo emp) {
		if(emp!=null){
			employees.put(emp.getId(), emp);
		return true;
		}
		return false;
	}

	@Override
	public EmployeeInfo removeEmployee(int id) {
		EmployeeInfo emp=employees.remove(id);
		return emp;
	}

	@Override
	public void saveCompanyToFile() throws FileNotFoundException   {
		PrintStream bd= new PrintStream(fileName);
		Collection<EmployeeInfo>collection=employees.values();
		for(EmployeeInfo pl:collection){
			bd.println(pl.employeeToLine());
		}
		bd.close();
	}

	@Override
	public void restoreCompanyFromFile() throws Exception {
		BufferedReader in=new BufferedReader(new FileReader(fileName));
		String line;
		while((line=in.readLine())!=null){
			EmployeeInfo emp=new EmployeeInfo(); 
			emp.employeeFromLine(line);
			addEmployee(emp);
		}
		
	}
	@Override
	public void createPersons(EmployeeInfo emp) {
		
	}
	@Override
	public void savePersons(EmployeeInfo emp) {
		// TODO Auto-generated method stub
		
	}

}
