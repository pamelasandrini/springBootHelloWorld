package hello;

import java.text.MessageFormat;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest controller.
 * 
 * @author pborsoni
 */
@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Hello World! Starting with Spring Boot";
	}

	@RequestMapping("/{name}")
	public String index(@PathVariable String name) {
		return MessageFormat.format("Hello {0}! Starting with Spring Boot", name);
	}
}
