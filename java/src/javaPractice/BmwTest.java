package javaPractice;

import junit.framework.TestCase;
public class BmwTest extends TestCase  {

	@Test
	public void testAdd() {
	int expected=40;
	int actual=BmwFlyingcars.add(20,20);
	assertEquals(expected,actual);
	}
	class BmwFlyingcars{
		static int add(int x,int y) {
			int actual=x+y;
			return actual;
		}
	}
}

