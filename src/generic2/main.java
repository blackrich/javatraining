package generic2;

import java.util.*;

public class main {
    public static void main(String[] args) {
    	Tiger[] t= {new Tiger("t1"), new Tiger("t2")};
    	printinfo(t);
    	
    	Panda[] p = {new Panda("p1"), new Panda("p2"), new Panda("p3")};
    	printinfo(p);
    	
    	printinfo2(p);
    	
    }
    public static <T> void printinfo(T[] array) {
    	for (T el : array) {
    		System.out.print(el.toString() + " ");
    	}
		System.out.println();
    }
	public static  void printinfo2(Object[] array)
	{
		for(Object el : array)
		{
			if(el instanceof Tiger) {
				Tiger down = (Tiger)el;
				System.out.print(down + " ");
			}else if(el instanceof Panda) {
				Panda down = (Panda)el;
				System.out.print(down + " ");
			}
		}
		System.out.println();
	}
}

class Tiger{
	String name;
	public Tiger(String name) {
		super();
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

class Panda{
	String name;
	public Panda(String name) {
		super();
		this.name = name;
	}
	public String toString() {
		return name;
	}
}