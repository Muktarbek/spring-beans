package peaksoft.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.model.AnimalsCage;
import peaksoft.model.Timer;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {
//    @Bean
//    public Timer getTimer(){
//        return new Timer();
//    }
//    @Bean
//    public AnimalsCage getAnimalsCage(){
//        return new AnimalsCage(getTimer());
//    }
    }
