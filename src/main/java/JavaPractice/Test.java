package JavaPractice;

abstract class Test1{
	
	abstract void run1();
	abstract void run2();
	public void disp() {
		System.out.println("concret class");
	}
	
}

 class Test2 extends Test1{

   @Override
	void run1() {
		
	   System.out.println("abstract class1");	
	}

@Override
void run2() {
	System.out.println("abstract class2");
	
}  
   
   
}
 
 public class Test{
	 
	 public static void main(String[] args) {
		
	
	 Test2 tst = new Test2();
	 tst.run1();
	 tst.run2();
	 tst.disp();
	 } 
 }