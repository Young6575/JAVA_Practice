package 자바_12장_입출력처리;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01 {
	
	public static void main(String[] args) {
		try(FileInputStream fi = new FileInputStream("a.txt");
			FileOutputStream fo = new FileOutputStream("b.txt");) {
			int c = 0;
			while ((c=fi.read()) != -1) {
				fo.write(c);
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
			e.printStackTrace();
		}
	}
	
	
}
