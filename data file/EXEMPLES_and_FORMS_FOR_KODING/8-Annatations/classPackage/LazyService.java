package classPackage;

import anatationPackage.Init;
import anatationPackage.Service;

@Service(name = "tutu")
public class LazyService {
	
	@Init
public void lazyInit()throws Exception{
	System.out.println("lazyInit work");
}
	
}
