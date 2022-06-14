package steps;

import base.TestBase;
import io.cucumber.java.After;


public class Hooks extends TestBase{
	
	@After
	public void AfterScenario() {
		driver.quit();
		
	}

}
