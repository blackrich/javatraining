package smallworld;

import java.util.*;

public class _Func {
	
    String filePath = "C:\\Users\\Administrator\\Desktop\\java_io_file\\";
    String fileName = "smallworld.txt";
	
	public void func() {

		Scanner sc = new Scanner(System.in);
		ArrayList<_Object> al = new ArrayList<_Object>();
		
		do{
			System.out.println("small world calculator!");
			System.out.println("1.add 2.read 3.calculator 0.done");
			switch(sc.nextInt()) {
				case 1: 
					_Output output = new _Output();
					output._Output(filePath, fileName);
					break;
				case 2:
					_Input input = new _Input();
					input._Input(al, filePath, fileName);
					break;
				case 3:
					Search search = new Search(al);
					search._Print();
					break;
				case 4:
				case 5:
				case 0:
					System.out.print("done");
					return ;
				default: 
			}
		}while(true);
	}
}








