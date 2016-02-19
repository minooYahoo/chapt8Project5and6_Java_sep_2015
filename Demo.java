
public class Demo
{

	public static void main(String[] args)
	{
		//instantiating the Figure class. Creating new objects
		Figure rect1 = new Rectangle(0, 0, 10, 4);
		Figure tri1 = new Triangle(5, 5, 20, 12);
		
		//calling methods
		rect1.draw();
		System.out.println("");
		rect1.erase();
	
		rect1.center();
		System.out.println("");
		rect1.erase();
		
		tri1.draw();
		System.out.println("");
		tri1.erase();
		
		tri1.center();
		System.out.println("");
		tri1.erase();

	}

}
