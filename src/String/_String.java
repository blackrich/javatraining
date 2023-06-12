package String;

public class _String {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test();
	}

	public static void test() {
		String str = "as";
		str += "df";
		str = str.concat("qw");
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb.append("er");
		
		System.out.println(sb);
		System.out.println(str);
	}

}
