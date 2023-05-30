package streamtest;
import java.io.*;
public class customer implements Serializable {
	private int age;
	private int id;
	private String name;
	private boolean isadmin;
	
	public void setter(int id, int age, String name, boolean isadmin) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.isadmin = isadmin;
	}
	public int get_id() {
		return id;
	}
	public int get_age() {
		return age;
	}
	public String get_name() {
		return name;
	}
	public boolean get_isadmin() {
		return isadmin;
	}
}
