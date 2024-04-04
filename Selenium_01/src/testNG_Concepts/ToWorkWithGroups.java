package testNG_Concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithGroups {
@Test(groups="functional testing")
public void register_module_FT_01() {
	int a=10/0;
	Reporter.log("From register module",true);
}
@Test(dependsOnGroups="functional testing",alwaysRun=true)
public void login_module_FT_01() {
	int a=10/0;
	Reporter.log("From login module",true);
}
}
