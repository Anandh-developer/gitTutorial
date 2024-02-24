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
	@Given("commit from first project but git changed")
	public void commit_from_first_project_but_git_changed() {

	}
//commit from four tag
	@Given("commit from four tag")
	public void commit_from_four_tag() {
	}
}
