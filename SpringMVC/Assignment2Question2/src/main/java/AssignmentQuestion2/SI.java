package AssignmentQuestion2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SI {
	
	@RequestMapping(value= "/calculate")
	public String calculate(@RequestParam("amount")int amount, @RequestParam("time")int time, @RequestParam("rate")int rate,Model m)
	{
		double r = (amount*time*rate/100);
		m.addAttribute("r",r);
		return "result";
	}
	

}
