package devopss;

import org.testng.Assert;
import org.testng.annotations.Test;

import devopss.com.lbrce.UserValidation;

public class UserValidationTest {
		@Test
		public void testCase1()
		{
			UserValidation uv=new UserValidation();
			Assert.assertEquals(false,uv.check("", ""));
		}
		@Test
		public void testCase2()
		{
			UserValidation uv=new UserValidation();
			Assert.assertEquals(false,uv.check("", "Srinu@12345"));
		}
		@Test
		public void testCase3()
		{
			UserValidation uv=new UserValidation();
			Assert.assertEquals(false,uv.check("srinu", ""));
		}
		@Test
		public void testCase4()
		{
			UserValidation uv=new UserValidation();
			Assert.assertEquals(false,uv.check("SRINU", "SRINU12345"));
		}
		/*@Test
		public void testCase5()
		{
			UserValidation uv=new UserValidation();
			Assert.assertEquals(true,uv.check("srinu", "srinu@12345"));
		}*/

	}

