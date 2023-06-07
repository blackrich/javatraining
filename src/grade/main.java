package grade;
import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		student std = new student();
		
		
		System.out.println("put in score (kor eng math): ");
		std.init(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.print(std.getpass());
		
	}

}
