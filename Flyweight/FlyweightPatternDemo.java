public class FlyweightPatternDemo {
   private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
   public static void main(String[] args) {

      for(int i=0; i < 20; ++i) {
         Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
         circle.draw();
      }

      for(int i=0; i < 5; ++i) {
         Triangle triangle = (Triangle)ShapeFactory.getTriangle(getRandomColor());
         triangle.draw();
      }	

   }
   private static String getRandomColor() {
      return colors[(int)(Math.random()*colors.length)];
   }
}
