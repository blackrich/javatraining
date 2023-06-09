package learning;

public class overload {
	public static void main(String[] args) {
		student std = new student();
		std.setter(27);
		std.setter("lee");
		std.setter(3.7);
		std.printSpec();
		
		extstudent1 exstd1 = new extstudent1();
//		exstd1.setter(26);
//		exstd1.setter("park");
//		exstd1.setter(4.1);
		exstd1.printSpec();
		
		extstudent2 exstd2 = new extstudent2();
		exstd2.setter(29);
		exstd2.setter("go");
		exstd2.setter(4.3);
		exstd2.printSpec();
		
		_print p = new _print(25, "kim", 3.2);
		p._print();
	}
}

class student {
	protected int age;
	protected String name;
	protected double grades;
	
	public void setter(int age) {//overload
		this.age = age;
	}
	public void setter(String name) {
		this.name = name;
	}
	public void setter(double grades) {
		this.grades = grades;
	}
	
	public void printSpec() {
		System.out.println("name: " + name + " | age: " + age + " | grades: " + grades);
		System.out.println("this is student");
	}
}

class extstudent1 extends student{//override
	public void setter(int age) {
		this.age = age;
	}
	public void setter(String name) {
		this.name = name;
	}
	public void setter(double grades) {
		this.grades = grades;
	}
	public void printSpec() {
		System.out.println("name: " + name + " | age: " + age + " | grades: " + grades);
		System.out.println("this is extstudent1");
	}
}

class extstudent2 extends student{}

class _print extends extstudent1{
	public _print(int age, String name, double grades) {
		super();
        this.age = age;
        this.name = name;
        this.grades = grades;
    }
    public void _print() {
        printSpec();
    }
}



