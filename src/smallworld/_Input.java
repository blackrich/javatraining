package smallworld;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class _Input {
	public ArrayList<_Object> _Input(ArrayList<_Object> al, String filePath, String fileName){
		
        try {
            // FileInputStream 생성
            FileInputStream fileInputStream = new FileInputStream(filePath + fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));

            int tmp = 0;
            
            String line;
            while ((line = reader.readLine()) != null) {
            	
                // 객체로 변환
                _Object obj = parseObjectFromLine(line);
                // 객체 사용 예시: 
                al.add(obj);
                // TODO: 객체 처리 코드 추가
//                tmp++;
//                System.out.println(tmp + ". " + obj.getname());
//                System.out.println(line);
            }

            // 스트림 닫기
            reader.close();
            fileInputStream.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return al;
    }

    private static _Object parseObjectFromLine(String line) {
        // "/"를 기준으로 값을 분리하여 객체 생성
        String[] values = line.split("/");
        return new _Object(values[0], values[1], values[2], values[3], values[4], values[5]);
    }
}
