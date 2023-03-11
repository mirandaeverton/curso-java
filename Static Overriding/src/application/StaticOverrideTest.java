package application;

public class StaticOverrideTest {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.name();
		
		p = new Child();
		p.name();
		
		Child c = new Child();
		c.name();

	}

}

class Parent{
	public static void name(){ 
		System.out.println("static method from Parent"); 
	}
}

class Child extends Parent{
	public static void name(){
		System.out.println("static method from Child"); 
	}
}
