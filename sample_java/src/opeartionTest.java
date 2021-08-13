import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class opeartionTest {

	@Test
	void test() {
		opeartion op=new opeartion();
		int expected=2;
		int actual=op.add(1, 1);
		assertEquals(expected,actual);
		
		
	}

}
