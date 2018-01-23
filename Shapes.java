import java.util.Scanner;
public class Shapes{
   static class Triangle{
      int length;
      public Triangle(int length){
         this.length = length;
      }
      public String toString() {
         return "The area of this triangle is " + this.area();
      }
      public double area(){
         return 0.5*(this.length*this.length);
      }
      public int perimeter(){
         return 3*length;
      }
      
   } 
   static class Rectangle{
      int width;
      int height;
      public Rectangle(int width, int height){
         this.width = width;
         this.height = height;
      }
      public String toString() {
         return "The area of this rectangle is " + this.area();
      }
      public int area(){
         return this.width * this.height;
      }
   }
   public static void main(String args[]){
      System.out.println("Triangle or Rectangle?");
      Scanner sc = new Scanner(System.in);
      String rot = sc.next();
      sc.nextLine();
      if(rot.equalsIgnoreCase("Triangle")){
         System.out.println("What would you like the side length of the triangle to be?");
         int sl = sc.nextInt();
         Triangle t = new Triangle(sl);
         System.out.println(t);
     }else if(rot.equalsIgnoreCase("Rectangle")){
         System.out.println("What would you like the width of the Rectangle to be?");
         int wid = sc.nextInt();
         System.out.println("What would you like the length of the Rectangle to be?");
         int len = sc.nextInt();
         Rectangle r = new Rectangle(wid, len);
         System.out.println(r);
      }else{
         System.out.println("error! rot is " + rot);
      }
      
      
      
   } 
}