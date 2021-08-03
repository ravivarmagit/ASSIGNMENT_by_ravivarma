package AssignmentQuestion2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index {
	@RequestMapping(value = "/index")
	public String print() {
		return "SI";
	}
}
