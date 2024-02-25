package stepdef;

import io.cucumber.java.en.Given;

public class TestStepDefs {

	@Given("commit from first project")
	public void commit_from_first_project() {
		System.out.println("Changed from local");

	}
	@Given("commit from third tag")
	public void commit_from_third_tag() {
		System.out.println("third tag");

	}
		@Given("commit from fifth tag")
	public void commit_from_fifth_tag() {
		System.out.println("fifth tag");

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
