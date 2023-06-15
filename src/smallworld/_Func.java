package smallworld;

import java.util.*;

public class _Func {
	
    String filePath = "C:\\Users\\Administrator\\Desktop\\java_io_file\\";
    String fileName = "smallworld.txt";
	
	public void func() {

		Scanner sc = new Scanner(System.in);
		ArrayList<_Object> al = new ArrayList<_Object>();
		ArrayList<String> result = new ArrayList<String>();
		Search search = null;
		
		do{
			System.out.println("small world calculator!");
			System.out.println("1.add 2.read 3.calculator 4.print result 0.done");
			switch(sc.nextInt()) {
				case 1: 
					_Output output = new _Output();
					output._Output(filePath, fileName);
					break;
				case 2:
					_Input input = new _Input();
					al = input._Input(filePath, fileName);
					break;
				case 3:
					search = new Search(al);
					break;
				case 4:
					if(search == null) {
						System.out.print("no result value ");
						break;
					}
					_PrintResult outputResult = new _PrintResult(filePath, search._ReturnResult());
				case 5:
				case 0:
					System.out.print("done");
					return ;
				default: 
			}
		}while(true);
	}
}








