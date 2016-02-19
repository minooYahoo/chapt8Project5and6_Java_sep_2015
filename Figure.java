/*Course: CS 112          

Chapter Number: 8 	Project Number:5&6	
Programmer(s):  MINOO MESHGIN
Date Created/ Last Modified: Sep 15, 2015                               

Program Title:  Figure, Rectangle, Triangle, Demo Program
Program Description: Class Figure is a BASE class, Triangle and 
Rectangle are derived fromthe Figure. 
Each class has ERASE & DRAW & CENTER methods 
-------------------------------*/
public class Figure
{
	private int x;
	private int y;

	private int width;
	private int height;

	public Figure(int x, int y, int width, int height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;

	}
	//getters & setters
	public int getX()
	{
		return x;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	public int getWidth()
	{
		return width;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}
	
	//drawing a figure method
	public void draw()
	{
		System.out.println("Inside of the Figure class. Erasing method");
		System.out.println("drawing");

	}
	//Erasing a figure method
	public void erase()
	{
		System.out.println("Inside of the Figure class. Erasing method");
		System.out.println("");		
	for(int i=0; i<getHeight(); i++)
		{
		 for (int j=0; j<getWidth();j++ )
		 {
			 System.out.print("");
			 
		 }
		System.out.println();
		}
		
	}
	//centering a figure method
	public void center()
	{
		
		System.out.println("Inside of the Figure class in center method");
		System.out.println("");
		
		draw();
		erase();
	}

}