package test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGLearn1 {

	@BeforeSuite
    public void beforeClass() {
        System.out.println("this is before Suite");
    }

    @Test
    public void TestNgLearn1() {
        System.out.println("this is TestNG test case1");
    }
    @Test
    public void TestNgLearn2() {
        System.out.println("this is TestNG test case2");
    }
    @Test
    public void TestNgLearn3() {
        System.out.println("this is TestNG test case3");
    }
    @Test
    @Parameters("test1")
    public void ParaTest(String test1){
        System.out.println("This is " + test1);
    }

    @AfterTest
    public void afterClass() {
        System.out.println("this is after Test");
    }
    
}
