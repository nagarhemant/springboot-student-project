package com.example.springbootstudentproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SpringbootStudentProjectApplicationTests {

	private Calculator c=new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	void testSum(){

		int expectedResult=18;
		int actualResult=c.doSum(3,6,9);

		assertThat(actualResult).isEqualTo(expectedResult);
		
	}
	
	@Test
	void doProduct(){

		int expectedResult=9;
		int actualResult=c.doProduct(3,3);
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testCompareTwoNums(){

		Boolean actualResult=c.compareTwoNums(3,3);

		assertThat(actualResult).isTrue();
	}

}
