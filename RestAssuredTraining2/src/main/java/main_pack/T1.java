package main_pack;

public class T1 {

	public static void main(String[] args) {
		
	/**
	 * Rest Assured library is not visible and accessible inside main paackage
	 * when scope is defined as test in pom maven dependency
	 */
	System.out.println("Committing changes");
	for(int i =1;i<=10;i++) {
		System.out.println("coding  test");
	}
	}
	
}

