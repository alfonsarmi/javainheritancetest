package NewPackage;
import NewPackage2.*;
import net.code.javar.*;
//import NewPackage2;
public class Test2 extends SuperTest {
	private void Test()
	{
		SuperTest test = new SuperTest(); 
		test.Test3();
		
		SuperTest test2 = new SuperTest(1,2);
	}
}

class Test9
{
	private void test()
	{
		
	}
}

class Test10 extends Test9
{
	private void test3()
	{
		
	}
}
