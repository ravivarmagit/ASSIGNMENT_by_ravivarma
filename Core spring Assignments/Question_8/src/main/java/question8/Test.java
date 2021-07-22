package question8;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		context.registerShutdownHook();
		
		Example example=(Example) context.getBean("example");
		System.out.println(example);
		

	}

}