import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyByteStreamTest {

	
	public static void main(String[] args) {
		
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("xanadu.txt");
			out = new FileOutputStream("outagain.txt");
			
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
