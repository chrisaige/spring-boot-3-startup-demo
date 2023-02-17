package com.example.demo;

import com.example.demo.test.TestEntity;
import com.example.demo.test.TestRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
class DemoApplicationTests {

	@Autowired
	private TestRepository repo;

	@Test
	void contextLoads() {
		var test = new TestEntity();
		test.setKey('A');
		test.setValue("Test 123456789 ÄÖÜQWERTZUIOP");
		repo.save(test);
	}

}
