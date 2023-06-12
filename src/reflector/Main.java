package reflector;

import java.lang.reflect.*;

public class Main {    
	public static void main(String[] args) throws Exception {
    // 클래스 정보 가져오기
    Class<?> clazz = MyClass.class;

    // 필드 값 조작하기
    Field field = clazz.getDeclaredField("myField");
    field.setAccessible(true); // private 필드에 접근하기 위해 필요
    Object obj = clazz.newInstance();
    field.set(obj, "New Value");
    System.out.println(field.get(obj));

    // 메서드 호출하기
    Method method = clazz.getDeclaredMethod("myMethod", int.class);
    method.setAccessible(true); // private 메서드에 접근하기 위해 필요
    Object result = method.invoke(obj, 10);
    System.out.println(result);
}
}

class MyClass {
	private String myField;

	private int myMethod(int num) {
	    return num * 2;
	}
}