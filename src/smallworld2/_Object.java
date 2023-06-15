package smallworld2;

public class _Object {
	private String atk, def, lvl, name, type, el;
	
	public _Object(String name, String atk, String def, String lvl, String type, String el ) {
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
	public String getatk() {
		return this.atk;
	}
	public String getdef() {
		return this.def;
	}
	public String getlvl() {
		return this.lvl;
	}
	public String gettype() {
		return this.type;
	}
	public String getel() {
		return this.el;
	}
}
