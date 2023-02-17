package com.example.demo.test;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TestConfig
//        implements ApplicationListener<ContextRefreshedEvent>
{

    private final TestRepository repo;

//    @Transactional
//    @PostConstruct
//    public void postConstruct() {
//        var test = new TestEntity();
//        test.setKey('A');
//        test.setValue("Test 123456789 ÄÖÜQWERTZUIOP");
//        repo.save(test);
//    }

//    @Override
//    @Transactional
//    public void onApplicationEvent(ContextRefreshedEvent event) {
//        var test = new TestEntity();
//        test.setKey('A');
//        test.setValue("Test 123456789 ÄÖÜQWERTZUIOP");
//        repo.save(test);
//    }

    @Bean
    public CommandLineRunner runner() {
        return new CommandLineRunner() {

            @Override
            @Transactional
            public void run(String... args) throws Exception {
                var test = new TestEntity();
                test.setKey('A');
                test.setValue("Test 123456789 ÄÖÜQWERTZUIOP");
                repo.save(test);
            }
        };
    }
}
