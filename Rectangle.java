public class Rectangle extends Figure
{

	public Rectangle(int x, int y, int width, int height)
	{
		super(x, y, width, height);
	}

	public void draw()
	{
		// #5 hmwk
		 System.out.println("Inside of the Rectangle class. Drawing the Rectangle");
		 System.out.println("");

		for (int i = 0; i < getHeight(); i++)

		{
			//WIDTH and HEIGHT are private so using getWidth() , and getHeight()  to access them
			for (int j = 0; j < getWidth(); j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			
		}

	}
/*	-------Now drawing the figure in the center of the screen */
	public void center()
		{
		
		
	//		this is for #5
			System.out.println("Inside of the Rectangle class.Drawing a Rectangle in the CENTER");
			System.out.println("");		
	//		this is for #6
			for (int i = 0; i < getHeight(); i++)

		{
			//WIDTH and HEIGHT are private so using getWidth() , and getHeight
			System.out.print("                              ");
			for (int j = 0; j < getWidth(); j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
			
			
		}






}
