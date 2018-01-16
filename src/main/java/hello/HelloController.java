package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {

    @RequestMapping("/lucas")
    public String index() {
        return "Greetings from Lucas!";
    } 
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    } 

    @RequestMapping("/index2")
    public String index2() {
        return "Greetings from Spring Boot!2";
    }
    
    @RequestMapping(value = "/postTest", method = RequestMethod.POST)
    public ResponseEntity<Car> postTest(@RequestBody Car car) {
    	car.setCor("azul");
        return new ResponseEntity<Car>(car, HttpStatus.OK);
    }
}
