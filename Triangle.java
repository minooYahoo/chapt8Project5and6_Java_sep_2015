
public class Triangle extends Figure
{

	public Triangle(int x, int y, int width, int height)
	{
		super(x, y, width, height);
	}
	
	public void draw()
	{
//		this is for #5
		System.out.println("Inside of the Triangle class.Drawing a Triangle");
		System.out.println("");		
//		this is for #6
		for (int i=0; i<getHeight(); i++)
		{
			for(int j=0; j < i+1; j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
/*----------------------*/	
	public void center()
	{
	
	
//		this is for #5
		System.out.println("Inside of the Triangle class.Drawing a Triangle in the CENTER");
		System.out.println("");		
//		this is for #6
		for (int i=0; i<getHeight(); i++)
		{
			System.out.print("                              ");
			for(int j=0; j < i+1; j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
	}

}
