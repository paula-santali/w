package display;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class HelloTest {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		Displayable displ =(Displayable) ctx.getBean("display");
		displ.display("Hello world");

	}

}
