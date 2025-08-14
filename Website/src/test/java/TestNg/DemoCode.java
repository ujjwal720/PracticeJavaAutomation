package TestNg;


import org.testng.annotations.*;

public class DemoCode {


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite - Runs before the entire test suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test - Runs before any test in the <test> tag");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class - Runs before the first method in the current class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method - Runs before each @Test method");
    }

    @Test
    public void testCase1() {
        System.out.println("Executing Test Case 1");
    }

    @Test
    public void testCase2() {
        System.out.println("Executing Test Case 2");
    }

    @Test
    public void testCase3() {
        System.out.println("Executing Test Case 3");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method - Runs after each @Test method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class - Runs after all test methods in the class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test - Runs after all tests in the <test> tag");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite - Runs after the entire test suite");
    }
}
