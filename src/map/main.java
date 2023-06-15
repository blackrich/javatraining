package map;

import java.util.*;

public class main {
	public static void main(String[] args) {

		objectcollector oc = new objectcollector();
		oc.objectcollector();
	}
}
class authcollector {
	
	HashMap<String, Integer> map = new HashMap<>();
	
	public void insert(String id, int pw) {
		for(String key : map.keySet()) {
			if(id.equals(key)) {
				System.out.print("already exist id");
				return;
			}
		}
		map.put(id, pw);	
	}
	
	public void showinfo() {
		for(String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}
	
}



class objectcollector{
	public void objectcollector() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("a", new t1(1));
		map.put("b", new t2(2));
		map.put("c", new t1(3));
		map.put("c", new t2(4));
		System.out.println(map);


        Object value = map.get("c");
        if (value instanceof t2) {
            t2 t2Object = (t2) value;
            int result = t2Object.get();
            System.out.println("t2 클래스의 get() 메소드 반환 값: " + result);
        } else {
            System.out.println("키 'c'에 해당하는 값은 t2 클래스의 인스턴스가 아닙니다.");
        }
	}
}
class t1{
	private int a;
	t1(int a){
		this.a = a;
	}
	public int get() {
		return a;
	}
}
class t2{
	private int b;
	t2(int b){
		this.b = b;
	}
	public int get() {
		return b;
	}
	
}