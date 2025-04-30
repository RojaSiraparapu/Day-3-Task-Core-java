public class ShapeCalculator
{
 public static double calculatePerimeter(double length,double width)
{
 return 2*(length+width);
}
public static void main(String[] args)
{
 System.out.println(ShapeCalculator.calculatePerimeter(3.0,15.0));
}
}