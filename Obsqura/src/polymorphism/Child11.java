package polymorphism;

public class Child11 extends Parent11
{
	final int h=23;
	@Override
public  void display()
{ //h=20;
	super.display();
	System.out.println("child class");
	}
public static void main(String[] args)
{
	Child11 obj=new Child11();
	obj.display();
	}
}
