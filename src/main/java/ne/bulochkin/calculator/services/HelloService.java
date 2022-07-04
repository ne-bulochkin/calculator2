package ne.bulochkin.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String hello(){
        return "<b>hello</b>";
    }
}
