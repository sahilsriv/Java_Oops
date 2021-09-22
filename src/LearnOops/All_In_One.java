package LearnOops;

public class All_In_One {

	public static void main(String[] args) {
	// Interface implementation	
		
			//I i = new I();  // object of Tnterface cannot be created
			//TestInterface t = new I();  // refrence of Implementing class cannot refer to Tnterface 
			// means we cannot create obj of interface
			I i = new TestInterface();  
			//int result = i.Substraction(2,1);// error means unable to override static method
			System.out.println(i.Subs(3, 4));
			int result = I.Substraction(2,1);
			System.out.println(result);
			TestInterface t = new TestInterface();
			result = t.Substraction(2,1);// 
			System.out.println(result);
			System.out.println(t.Subs(3, 4));
			
	// Abstract Implementation
//			Abs a = new Abs(); //obj of abs is not allowed
//			TestAbs ta = new Abs(); //obj of Abs is not allowed
			Abs a = new TestAbs();
			TestAbs ta = new TestAbs();
			a.printAbs();
			ta.printAbs();
			System.out.println(a.add(1, 2));
			System.out.println(ta.add(1, 2));
			System.out.println(a.add(1, 2, 3));
			System.out.println(ta.add(1, 2, 3));
			System.out.println(a.sub(1, 2));
			System.out.println(ta.sub(1, 2));
			
	// Inheritence 
		
//			Parent p = new Parent();  //error: no constructor of this type
			Parent p = new Parent(4,5);
			p.fun();
			p.fun(5);
		
//			Parent c = new child(); //error: no constructor of this type
			Parent c = new Child(2,3,4);
			c.fun();  // overridden fun
			c.fun(8);
			
//			Child child = new Child(); //error: no constructor of this type
			Child child = new Child(1,2,3);
			child.fun();  // overridden fun
			child.fun(8);
		}
	}


