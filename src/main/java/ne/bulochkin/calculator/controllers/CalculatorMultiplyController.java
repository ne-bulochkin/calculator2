package ne.bulochkin.calculator.controllers;

import com.bulochkin.calculator.services.CalculatorMultiplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculatorMultiplyController {
    private final CalculatorMultiplyService calculatorMultiplyService;

    @GetMapping(value = "/calculator/multiply")
    @ResponseBody
    public String response(@RequestParam(value = "num1") Integer num1,
                            @RequestParam(value = "num2") Integer num2){
        return calculatorMultiplyService.getResponse(num1,num2);
    }
}
