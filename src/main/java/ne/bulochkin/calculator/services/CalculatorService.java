package ne.bulochkin.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double devide(Integer num1, Integer num2){
        if (num2 == 0) {
            throw new IllegalArgumentException("Can't divide by zero!");
        }
        return ((double)num1/(double)num2);
    }

    public int minus(int num1, int num2){
        return (num1-num2);
    }

    public int multiply(int num1, int num2){
        return (num1*num2);
    }

    public int plus(int num1, int num2){
        return (num1+num2);
    }

    public String hello(){
        return "<b>hello</b>";
    }


}
