class Shape
{
    void area(int r)
    {
        System.out.println("Area of Circle is " + 3.14159*r*r);
    }
    
    void area(int l, int b)
    {
        System.out.println("Area of rectangle is " + l*b);
    }
    
    void area(float l, float b)
    {
        System.out.println("Area of triangle is " + 0.5*b*l);
    }

}
public class Area
{
	public static void main(String[] args) {
	    
		Shape s=new Shape();
		s.area(9);
		s.area(9,3);
		s.area(6.0f,4.0f);
	}
}