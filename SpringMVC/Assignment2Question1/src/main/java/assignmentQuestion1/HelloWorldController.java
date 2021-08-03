package assignmentQuestion1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value = "/HelloWorld")
	public String helloWorld()
	{
		return "HelloWorld";
	}

}
