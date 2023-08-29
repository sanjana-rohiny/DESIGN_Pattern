

public class Client {

public static void main(String[] args) {

	final Image img1 = new ProxyImage("Image***1");
	final Image img2 = new ProxyImage("Image***2");
	
	img1.showImage();
	img2.showImage();
    }
}
