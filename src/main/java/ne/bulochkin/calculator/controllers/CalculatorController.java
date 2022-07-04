package ne.bulochkin.calculator.controllers;

import lombok.AllArgsConstructor;
import ne.bulochkin.calculator.services.CalculatorService;
import ne.bulochkin.calculator.services.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    private final HelloService helloService;

    @GetMapping()
    public String hello(){
        return helloService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1") Integer num1,
                       @RequestParam(value = "num2") Integer num2){

        return num1+" + "+num2+" = "+calculatorService.plus(num1,num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1") Integer num1,
                       @RequestParam(value = "num2") Integer num2){
        return num1+" - "+num2+" = "+calculatorService.minus(num1,num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1") Integer num1,
                        @RequestParam(value = "num2") Integer num2){
        return num1+" / "+num2+" = "+calculatorService.devide(num1,num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1") Integer num1,
                         @RequestParam(value = "num2") Integer num2){
        return num1+" * "+num2+" = "+calculatorService.multiply(num1,num2);
    }

}
