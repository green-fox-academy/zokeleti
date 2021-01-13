package dependecyinjection.dinject.service;

import org.springframework.stereotype.Service;

public class RedColor implements MyColor{
    @Override
    public String printColor() {
        return "\u001B[31mIt is red in color... \u001B[0m";
    }
}
