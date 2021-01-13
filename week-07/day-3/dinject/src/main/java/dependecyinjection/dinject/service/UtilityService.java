package dependecyinjection.dinject.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UtilityService {

    private List<String> colors;
    private Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public String[] emailValidator(String email){
        String[] emailArray = email.split("@");
        try{
            String[] emailArray2 = emailArray[1].split("\\.");
        } catch (Exception e){
            return new String[]{email + " is an invalid email address", "red"};
        }
        String[] emailArray2 = emailArray[1].split("\\.");
        if(emailArray.length == 2 && emailArray2.length > 1){
            return new String[]{email + " is a valid email address", "green"};
        } else {
            return new String[]{email + " is an invalid email address", "red"};
        }
    }


    public String caesar(String text, int number) {
        if (number < 0) {
            number = 26 + number;
        }

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
            result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
        }
        return result;
    }
}