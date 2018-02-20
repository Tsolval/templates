package sample

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleApplication {
   @RequestMapping("/")
   @ResponseBody
   def home() {
      'Hello World!'
   }

   static void main (String[] args) {
      SpringApplication.run(SampleApplication.class, args)
   }
}
