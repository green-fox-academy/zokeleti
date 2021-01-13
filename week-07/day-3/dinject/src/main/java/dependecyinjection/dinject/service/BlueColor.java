package dependecyinjection.dinject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor{
    @Override
    public String printColor() {
    return "\u001B[34mIt is blue in color...\u001B[0m";
    }
}
