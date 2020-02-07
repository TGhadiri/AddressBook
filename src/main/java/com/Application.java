package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
//    @Bean
//    public CommandLineRunner demo(BuddyInfoRepository repository) {
//        return (args) -> {
//            // save a few customers
//            repository.save(new BuddyInfo("Tara", "bank", "44"));
//            repository.save(new BuddyInfo("John", "Kent", "456"));
//            repository.save(new BuddyInfo("Peter", "Queen", "765"));
//            repository.save(new BuddyInfo("Don", "King", "89"));
//            repository.save(new BuddyInfo("Kevin", "Prince", "3298"));
//
//            // find all BuddyInfos
//            log.info("BuddyInfos found with findAll():");
//            for (BuddyInfo bi : repository.findAll()) {
//                log.info(bi.toString());
//            }
//
//            // find BuddyInfos by last name
//            log.info("com.BuddyInfo found with findByLastName('John'):");
//            repository.findByName("John").forEach(John -> {
//                log.info(John.toString());
//            });
//
//        };
//    }


}
