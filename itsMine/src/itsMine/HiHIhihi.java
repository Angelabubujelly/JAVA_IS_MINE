package itsMine;

import java.io.FileWriter;
import java.io.IOException;

public class HiHIhihi {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("D:\\KJK\\Temp\\file1.txt", true);
		
		fw.write("����ġ ������ �ʹ� Ŀ " +"\r\n");
		fw.write("���� ��� ����ġ ��Ծ�" + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("Great job");

	}

}
