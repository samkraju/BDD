//package stepdefinitions;
//
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Login {
//	@When("We enter below mentioned credentials")
//	public void weEnterBelowMentionedCredentials(io.cucumber.datatable.DataTable dataTable) {
//		List<Map<String, String>> data = dataTable.asMaps();
//		System.out.println("--------------");
//		for (Map<String, String> row : data) {
//			Set<String> allKeys = row.keySet();//if there are more number of rows and columns 
//
//			for (String key : allKeys) {
//				String v = row.get(key);
//				System.out.print(v + " ");
//			}
//			System.out.println();
//		}
//		System.out.println("-------------");
//	}
//
////	@When("We enter below mentioned credentials")
////	public void weEnterBelowMentionedCredentials(io.cucumber.datatable.DataTable dataTable) {
////		List<Map<String, String>> data = dataTable.asMaps();
////		System.out.println("--------------");
////		for (Map<String, String> row : data) {
////			String un = row.get("username");
////			System.out.print(un+" ");
////
////			String pw = row.get("password");
////			System.out.println(pw);
////		}
////		System.out.println("-------------");
////	}
//
////	@When("We enter below mentioned credentials")
////	public void weEnterBelowMentionedCredentials(io.cucumber.datatable.DataTable dataTable) {
////		List<List<String>> data = dataTable.asLists();
////		System.out.println("---------------");
////		int rc = data.size();
////		for (int i = 1; i < rc; i++) {//we can control for loop unlike for each loop
////			int cc = data.get(i).size();
////			for (int j = 0; j < cc; j++) {
////				String v = data.get(i).get(j);
////				System.out.print(v + " ");
////			}
////			System.out.println();
////		}
////		System.out.println("---------------");
////	}
//
////	@When("We enter below mentioned credentials")
////	public void weEnterBelowMentionedCredentials(io.cucumber.datatable.DataTable dataTable) {
////		List<List<String>> data = dataTable.asLists();
////		System.out.println("---------------" + data);
////		for (List<String> row : data) {
////			for (String cell : row) {
////				System.out.print(cell + " ");
////			}
////			System.out.println();
////		}
////		System.out.println("---------------");
////	}
//
////	@When("We enter below mentioned credentials")
////	public void weEnterBelowMentionedCredentials(io.cucumber.datatable.DataTable dataTable) {
////		List<List<String>> data = dataTable.asLists();
////		System.out.println("---------------");
////		// String un = data.get(0).get(0);//will get the first row and column which is
////		// username password similar to excel
////		for (int i = 1; i <= 2; i++) {
////			String un = data.get(i).get(0);
////			String pw = data.get(i).get(1);
////			System.out.println(un);
////			System.out.println(pw);
////		}
////		System.out.println("----------------");
////	}
//
//	@When("We enter user name {} and password {}")
//	public void weEnterUserNameAdminAndPasswordAdmin(String un, String pw) {
//		System.out.println("Enter username:" + un);
//		System.out.println("Enter password:" + pw);
//	}
//
//	@When("We enter {string} as user name and {string} as password")
//	public void weEnterAsUserNameAndAsPassword(String un, String pw) {
//		System.out.println("Enter username:" + un);
//		System.out.println("Enter password:" + pw);
//	}
//
//	@Given("Drive path is set")
//	public void drivePathIsSet() {
//		System.out.println("Driver path is set");
//	}
//
//	@When("Open the browser")
//	public void openTheBrowser() {
//		System.out.println("Opening the browser");
//	}
//
//	@Then("Browser is displayed")
//	public void browserIsDisplayed() {
//		System.out.println("Browser has been displayed");
//	}
//
//	@Given("Login Page is Displayed")
//	public void login_page_is_displayed() {
//		System.out.println("Login page gets displayed");
//	}
//
//	@When("We enter valid user name and password")
//	public void we_enter_the_user_name_and_password() {
//		System.out.println("Username and password is entered");
//	}
//
//	@When("Click on Login button")
//	public void click_on_sumbit_button() {
//		System.out.println("Login button clicked");
//	}
//
//	@Then("Home Page should be displayed")
//	public void home_page_should_be_displayed() {
//		System.out.println("Home page has been displayed");
//	}
//
//	@When("We enter invalid user name and password")
//	public void we_enter_invalid_user_name_and_password() {
//		System.out.println("Invalid username and password is entered");
//		// Assert.assertEquals(1, 0);//to check the report with failed result
//	}
//
//	@Then("Error message is displayed")
//	public void error_message_is_displayed() {
//		System.out.println("Error msg gets displayed");
//	}
//
//}
