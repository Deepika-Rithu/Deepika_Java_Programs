package Package1;
abstract class Abstract_Class_Two
{
	abstract void add();
}

public class Abstract_Class_One extends Abstract_Class_Two
{
	void sub()
	{
		System.out.println("Subtraction");	
	}
public static void main(String[] args) 
	{
	Abstract_Class_One a1=new Abstract_Class_One();
	a1.add();
	a1.sub();
	}
	void add()
	{
		System.out.println("Addition");
	}

}
