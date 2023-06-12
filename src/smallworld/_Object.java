package smallworld;

public class _Object {
	private int atk, def, lvl;
	private String name, type, el;
	
	public void setter(String name, int atk, int def, int lvl, String type, String el ) {
		this.name = name;
		this.atk = atk;
		this.def = def;
		this.lvl = lvl;
		this.type = type;
		this.el = el;
	}
	public String getname() {
		return this.name;
	}
	public int getatk() {
		return this.atk;
	}
	public int getdef() {
		return this.def;
	}
	public int getlvl() {
		return this.lvl;
	}
	public String gettype() {
		return this.type;
	}
	public String getel() {
		return this.el;
	}
}
