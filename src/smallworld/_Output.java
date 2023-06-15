package smallworld;

import java.io.*;
import java.util.*;

public class _Output {	
	public void _Output(String filePath, String fileName) {
	Scanner sc = new Scanner(System.in);
	ArrayList<_Object> al = new ArrayList<_Object>();
	_Object _obj = null;
    
    String name, type, elem, atk, def, lvl;
    
    
	do {
		System.out.print("name(if you wanna break, put 'done'): ");
		name = sc.next();
		if(name.equals("done")) break;
		System.out.print("level: ");
		lvl = sc.next();
		System.out.print("atk: ");
		atk = sc.next();
		System.out.print("def: ");
		def = sc.next();
		System.out.print("type: ");
		type = sc.next();
		System.out.print("element: ");
		elem = sc.next();
		_obj = new _Object(name, lvl, atk, def, type, elem);
		al.add(_obj);
	}while(true); 		
	
	sc.close();
	
    try {
        // FileOutputStream 생성
        FileOutputStream fileOutputStream = new FileOutputStream(filePath + fileName);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream));

        
        for(Object obj : al) {
        	writeObjectToFile(writer, _obj);// 객체1을 파일에 쓰기
        	writer.newLine();// 객체 구분을 위한 줄 바꿈
        }
        
        // 스트림 닫기
        writer.close();
        fileOutputStream.close();

        System.out.println("객체가 파일에 성공적으로 쓰여졌습니다.");
    } catch (IOException e) {
        e.printStackTrace();
    }
	
}

private static void writeObjectToFile(BufferedWriter writer, _Object obj) throws IOException {
    // 값을 "/"로 구분하여 파일에 쓰기
    writer.write(
            obj.getname() + "/" +
            obj.getatk() + "/" +
            obj.getdef() + "/" +
            obj.getlvl() + "/" +
            obj.gettype() + "/" +
            obj.getel()
    );
    writer.newLine();
}

}
