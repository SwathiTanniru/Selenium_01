package testNG_Concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithPriority {
@Test
public void demo_02() {
	Reporter.log("hi testng2");
	Reporter.log("hi testng2",true);
}
@Test(priority=-1)
public void demo_01() {
	Reporter.log("hi testng1");
	Reporter.log("hi testng1",true);
	
}
}
