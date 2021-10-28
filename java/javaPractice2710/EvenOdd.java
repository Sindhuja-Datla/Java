package javaPractice2710;

import org.junit.Test;

import junit.framework.TestCase;

	public class EvenOdd extends TestCase  {
		@Test
		public void Test() {
	   boolean actual = Test1.Evenodd(6);
		assertTrue(actual);
		}
	public class Test1 {
		 static boolean Evenodd(int n) {
			if(n%2==0) {
				return true;
				}
				else {
					return false;
				}
		}
		  
	}
	}
		


