//package stepdefinitions;
////we can have multiple before and after methods
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterAll;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeAll;
//import io.cucumber.java.BeforeStep;
//
//public class Hooks {
//	@BeforeAll
//	public static void beforeAll()// method must be static
//	{
//		System.out.println("Welcome");
//	}
//
//	@AfterAll
//	public static void afterAll()// method must be static
//	{
//		System.out.println("The end");
//	}
//
//	@Before(order = 2)
//	public void beforeScenario() {
//		System.out.println("----Scenario starts-----");
//	}
//
//	@After("@smoketest") // will run only for smoketest
//	public void afterScenario() {
//		System.out.println("---Scenario ends----");
//	}
//
//	@Before(order = 1)
//	public void beforeScenario2() {
//		System.out.println("-----------------------------");
//	}
//
//	@After
//	public void afterScenario2() {
//		System.out.println("------------------------------");
//	}
//
//	@BeforeStep
//	public void beforeStep()// before each step
//	{
//		System.out.println("Before Step");
//	}
//
//	@AfterStep
//	public void afterStep()// after each step
//	{
//		System.out.println("After Step");
//	}
//
//}
