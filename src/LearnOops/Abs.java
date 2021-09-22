package LearnOops;

public abstract class Abs {
	int x; // normal variable allowed
	abstract void printAbs();
	
//	void printAbstract();  // not allowed w/o abstract Keyword
	
	public int add(int x, int y) {return x+y;} //all type of function allowed 
											   //not only static and default as in the case of Interface
	public int add(int x, int y,int z) {return x+y+z;}
	public int sub(int x,int y) {return x-y;}
}
class TestAbs extends Abs{

	@Override
	void printAbs() {
		// TODO Auto-generated method stub
		System.out.println("Hello Abstract");
	}
	@Override
	public int add(int x, int y) {return x+y+1;}
		
}
