package cg;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class ValidatorTest {

	@Test
	void test1() {
		Validator ob=new Validator();
		String data="100";
		Assumptions.assumeTrue(data!=null);
		//Assumptions.assumeFalse(data!=null);
		System.out.println("assertTrue");
		assertTrue(ob.validateNo(data));
		
		System.out.println("assertFalse");
		data="abc";
		assertFalse(ob.validateNo(data));
	}

	@Test
	void test2() {
		Validator ob=new Validator();
		assertThrows(NullPointerException.class, ()->ob.validateNo(null));
		
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"racecar", "radar", "nitin", "naman"})
	void test3(String data) {
		Validator ob=new Validator();
		System.out.println("test isPalindrome with value "+data);
		assertTrue(ob.isPalindrome(data));
	}
	
	@ParameterizedTest
	@CsvSource({ "4, 5", "10, 20", "100, 500"})
	void test4(int a, int b) {
		Calculator ob=new Calculator();
		System.out.println("test add with values a="+a+", b="+b);
		assertTrue(ob.add(a, b)>0);
	}
	
	@ParameterizedTest
	@MethodSource("testaddwithoutput")
	void withMethodSource(int a, int b, int op) {
		Calculator ob=new Calculator();
		System.out.println("test add with input a="+a+", b="+b+" output="+op);
		assertEquals(op, ob.add(a, b));
	}
	
	private static Stream<Arguments> testaddwithoutput(){
		return Stream.of(Arguments.of(4,5,9), Arguments.of(100,500,600));
	}
	
	@ParameterizedTest
	@EnumSource(Size.class)
	void withAllEnumValues(Size size) {
		System.out.println("Test Enum value"+size);
		Validator ob=new Validator();
		assertEquals(size.getMl(), ob.getSizeMl(size));
	}
}
