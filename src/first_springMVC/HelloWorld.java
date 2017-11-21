package first_springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	@RequestMapping("helloworldaaa")
	public String helloworld(){
		System.out.println("helloworld.....");
		return "success";
	}
}
//ทรฮส   localhost:8080/first_springMVC/helloworldaaa
