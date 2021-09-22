package LearnOops;

interface I {
	int X=2;  // Public,static and final by default
	
	void printInteface();  //by default Abstract
	
	int increment(int x);	// with parameter

	//	int Sub(int x,int y) {return x-y;}  body not allowed
	
	default	int Subs(int x,int y) {return x-y;} // allowed
	
	static int Substraction(int x,int y) {return x-y;} //allowed

}

class TestInterface implements I{
	@Override
	public void printInteface() {
		// TODO Auto-generated method stub
		System.out.println("overided in TestInterface");
	}

	@Override
	public int increment(int x) {
		// TODO Auto-generated method stub
		return x+1;
	}
	int Substraction(int x,int y) {return x-y-1;} //allowed
	public int Subs(int x,int y) {return x-y-1;}
}

