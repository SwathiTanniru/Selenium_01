package testNG_Concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithDependesOnMethods {
@Test
public void register_module() {
	//int a=10/0;
	Reporter.log("From register module",true);
}
@Test(dependsOnMethods="register_module")
public void login_module() {
	//int a=10/0;
	Reporter.log("Frome login module",true);
}
}
