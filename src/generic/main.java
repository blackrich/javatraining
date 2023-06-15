package generic;



public class main {
    public static void main(String[] args) {
    	couple<man, woman> couple1 = new couple<>(new man("man", "10", 'm'), new woman("woman", "15", 'f'));
    	couple1.showinfo();
    	
    	couple<man, man> couple2 = new couple<>(new man("man1", "20", 'm'), new man("man2", "25", 'm'));
    	couple2.showinfo();
    	
    	
		Gen<Type1> g1 = new Gen<>(new Type1("type1"));
		g1.showinfo();
		
		Gen<Type2> g2 = new Gen<Type2>(new Type2("type2"));
		g2.showinfo();
		
//		Gen<Type3> g3 = new Gen<Type3>(new Type2("type3"));
//		g3.showinfo();
    }
}
class person{
	String name;
	String age;
	char gender;
	public person(String name, String age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String toString() {
		return "name: " + name + " || age: " + age + " || gender: " + gender;
	}
}
class woman extends person{
	public woman(String name, String age, char gender) {		
		super(name, age, gender);
	}
}
class man extends person{
	public man(String name, String age, char gender) {		
		super(name, age, gender);
	}
}
class couple<x extends person, y extends person>{
	private x member1;
	private y member2;
	couple(x member1, y member2){
		this.member1 = member1;
		this.member2 = member2;
	}
	
	void showinfo() {
		System.out.println("member1: " + member1);
		System.out.println("member2: " + member2);
	}
}



class heritage{
	String type;
	@Override
	public String toString() {
		return type;
	}
}
class Type1 extends heritage{
	Type1(String type1){this.type=type1;}
}

class Type2 extends heritage{
	Type2(String type2){this.type=type2;}

}
class Type3{
	Type3(String type3){this.type=type3;}
	String type;
	@Override
	public String toString() {
		return "3 " + type;
	}
}
class Gen<T extends heritage>{
	private T type;
	Gen(T type){
		this.type = type;
	}
	void showinfo() {
		System.out.println("type: " + type.toString());
	}
}

