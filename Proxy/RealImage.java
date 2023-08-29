public class RealImage implements Image {
 
    private String fileName = null; 

    public RealImage(String strFileName){
        this.fileName = strFileName;
    }

    @Override
    public void showImage() {
        System.out.println("Show Image:" +fileName);
 
    }
}
