public class Circle implements Shape {
   private String color;
   private int x;
   private int y;
   private int radius;

   
   public Circle(String color){
      this.color = color;
	x = getRandomX();
	y = getRandomX();
	radius = 100; 
   }

   private int getRandomX() {
      return (int)(Math.random()*100 );
   }
   private int getRandomY() {
      return (int)(Math.random()*100);
   }

   @Override
   public void draw() {
      System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
   }
}
