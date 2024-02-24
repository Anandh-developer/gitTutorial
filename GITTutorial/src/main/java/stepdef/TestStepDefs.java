package stepdef;

import io.cucumber.java.en.Given;

public class TestStepDefs {
	@Given("commit from first project")
	public void commit_from_first_project() {
		System.out.println("Changed from local");

	}
	@Given("commit from second project")
	public void commit_from_second_project() {
		System.out.println("Changed from local two");

	}
}
