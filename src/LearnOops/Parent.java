package LearnOops;

class Parent {
	private int x;
	private int y;

	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	protected void fun() {
		System.out.println("In Parent Function");
	}
    protected void fun(int x) {
		System.out.println(x);	
    }
}
class Child extends Parent{
	private int z;

	public Child(int x, int y,int z) {
		super(x, y);
	     this.z=z;	
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	protected void fun() {
		System.out.println("In Child Class");
	}	
}