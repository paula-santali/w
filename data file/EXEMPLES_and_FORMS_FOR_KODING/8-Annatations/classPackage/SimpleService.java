package classPackage;
import anatationPackage.Init;
import anatationPackage.Service;


@Service(name = "bla")
public class SimpleService {
	
	@Init
public void initService(){
	System.out.println("initService work");
}
	
}
