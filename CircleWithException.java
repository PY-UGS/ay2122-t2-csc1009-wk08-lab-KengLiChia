package csc1009.src.lect08;

import java.util.Scanner;

public class CircleWithException {

    public double radius;
    
    public CircleWithException() {
    }
  
    public CircleWithException(double radius) {
      this.radius = radius;
    }
  
    public double getRadius() {
      return radius;
    }
  
    public void setRadius(double radius) {
      this.radius = radius;
    }

    public double getArea(){
      return radius * radius * Math.PI;
    }
   
    public double getDiameter() {
      return 2 *radius;
    }

    public static void main(String[] args) throws Exception {

      Scanner input = new Scanner(System.in);
      System.out.print("Enter radius: ");

      try {
        double radius= input.nextDouble();
        input.close();

        CircleWithException circle = new CircleWithException(radius);
        double area = circle.getArea();
        
        if (radius < 0){
          throw new IllegalArgumentException(); 
        } 
        
        else if (area > 1000){
          throw new Exception();
        }

        System.out.println("Area of circle: " + area);

        } catch (IllegalArgumentException e) {
          System.out.println("Radius must be a non-negative value.");
        }
        catch (Exception e) {
          System.out.println("Area is bigger than 1000.");
        }
    }
}
