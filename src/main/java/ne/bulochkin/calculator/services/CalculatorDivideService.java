package ne.bulochkin.calculator.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CalculatorDivideService {
    public String getResponse(Integer num1, Integer num2){
        log.info("Get request: /calculator/divide");
        if (num2 == 0) {
            throw new IllegalArgumentException("Can't divide by zero!");
        }
        return num1+" / "+num2+" = "+((double)num1/(double)num2);
    }
}
