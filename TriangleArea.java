import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      double base1 = in.nextDouble();
      double height1 = in.nextDouble();
      double base2 = in.nextDouble();
      double height2 = in.nextDouble();
      
      Triangle triangle1 = new Triangle();
      triangle1.setBase(base1);
      triangle1.setHeight(height1);
      
      Triangle triangle2 = new Triangle();
      triangle2.setBase(base2);
      triangle2.setHeight(height2);
      
      
      System.out.println("Triangle with larger area:");
      if (triangle1.getArea() > triangle2.getArea()) {
         triangle1.printInfo();
      }
      else{
         triangle2.printInfo();
      }
      
   }
}
