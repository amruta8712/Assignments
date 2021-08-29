package SpringMVC.Que1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping(value="/hello.html",method=RequestMethod.GET)
	public ModelAndView goesToHyperlinkPage(){
		ModelAndView m= new ModelAndView("Index");
      return m;
   }
	@RequestMapping(value="submit.html",method=RequestMethod.GET)
	public ModelAndView pringTheMessage(){
		ModelAndView m1= new ModelAndView("HelloWorld");
		m1.addObject("msg","HelloWorld");
      return m1;
   }
}