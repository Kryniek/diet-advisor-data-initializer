package pl.dietadvisor.datainitializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.dietadvisor.common.dataInitializer.config.DataInitializer;

@SpringBootApplication
@DataInitializer
public class DataInitializerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataInitializerApplication.class, args);
    }

}
