public class Triangle implements Shape {
   private String color;
   private int x;
   private int y;
   private int z;


   public Triangle(String color){
      	this.color = color;
	x = getRandomX();
	y = getRandomX();
	z = 100; 
   }

   private int getRandomX() {
      return (int)(Math.random()*100 );
   }
   private int getRandomY() {
      return (int)(Math.random()*100);
   }

   @Override
   public void draw() {
      System.out.println("Triangle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", z :" + z);
   }
}
