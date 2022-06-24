package itsMine;

import java.io.FileWriter;
import java.io.IOException;

public class HiHIhihi {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("D:\\KJK\\Temp\\file1.txt", true);
		
		fw.write("°í½¿µµÄ¡ ¾ûµ¢ÀÌ ³Ê¹« Ä¿ " +"\r\n");
		fw.write("¼¼»ó ¸ðµç °í½¿µµÄ¡ ¹ä¸Ô¾î" + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("Great job");

	}

}
