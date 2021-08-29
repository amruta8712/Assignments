package SpringMVC.Que2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleIntrestController {
	
	@RequestMapping(value="/hello.html",method=RequestMethod.GET)
	public ModelAndView goesToHyperlinkPage(){
		ModelAndView m= new ModelAndView("SimpleIntrest");
      return m;
   }
	
	@RequestMapping(value="FirstSpringMVCProject/submit.html",method=RequestMethod.POST)
	public ModelAndView pringTheMessage(@ModelAttribute("s") SI s)
	{
		double SInterest = (s.PA*s.NY*s.getRI())/100;
		ModelAndView m1= new ModelAndView("DisplaySI");
		m1.addObject("msg",SInterest);
      return m1;
   }
}