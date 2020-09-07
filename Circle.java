package com.sapient.shapes;
//changes on branch2
public class Circle{
	public int Radius;
	Circle()
	{
	
	}
	Circle(int Radius)
	{
	  this.Radius=Radius;	
	}
	void calculateAreaOfCircle(int Radius)
	{
		System.out.println(3.14*Radius*Radius);
		/*changes made by person 1 */
                System.out.println("Area of circle");

	}

}
