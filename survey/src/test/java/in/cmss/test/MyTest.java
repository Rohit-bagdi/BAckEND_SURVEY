package in.cmss.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import in.cmss.survey.model.Answers;

class MyTest {
@Disabled("unti i fart")
	@Test
	void test() {
	Answers as =new Answers(1,"good");
	Answers ad = new Answers(1,"good");
		assertEquals("as", "ad");
	//fail("hi");
	}

void fun()
{
	assertEquals("as", "ad");
}

}
