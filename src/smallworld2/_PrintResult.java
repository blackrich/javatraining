package smallworld2;

import java.io.*;
import java.util.*;

class _PrintResult {
	_PrintResult(String filePath, ArrayList<String> al){
	    try {
	        // FileOutputStream 생성
	        FileOutputStream fileOutputStream = new FileOutputStream(filePath + "Smallworld Result.txt");
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream));

	        
	        for(String result : al) {
	        	writer.write(result);// 객체1을 파일에 쓰기
	        	writer.newLine();// 객체 구분을 위한 줄 바꿈
	        }
	        
	        // 스트림 닫기
	        writer.close();
	        fileOutputStream.close();

//	        System.out.println("객체가 파일에 성공적으로 쓰여졌습니다.");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}