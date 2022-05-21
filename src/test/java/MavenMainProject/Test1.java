package MavenMainProject;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

	
	@Parameters({"URL"})
	@Test
	public void test1(String urlname) {
		System.out.println("Test case 1 executed");
		System.out.println("URL is " + urlname );
		System.out.println("URL is and  " + urlname );
		System.out.println("URL is and and  " + urlname );
	}
	
	@Test
	public void test11() {
		System.out.println("Test case 11 executed");
	}
	
	@Test
	public void test111() {
		System.out.println("Test case 111 executed");
	}
	@Test
	public void Mobile() {
		System.out.println("Test Mobile");
	}
}
