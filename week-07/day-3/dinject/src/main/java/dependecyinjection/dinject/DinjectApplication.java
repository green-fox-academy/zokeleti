package dependecyinjection.dinject;

import dependecyinjection.dinject.service.MyColor;
import dependecyinjection.dinject.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DinjectApplication implements CommandLineRunner {

    private static Printer printer;
    private static MyColor myColor;

    @Autowired
    DinjectApplication(Printer printer, MyColor myColor){
        this.myColor = myColor;
        this.printer = printer;
    }

    public static void main(String[] args) {
        SpringApplication.run(DinjectApplication.class, args);
        printer.log(myColor.printColor());
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
