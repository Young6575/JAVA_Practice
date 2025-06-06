package 자바_12장_입출력처리;

import java.io.File;
import java.io.PrintWriter;

public class Test05 {
	//p577
	public static void main(String[] args) {
		try {
			File dir = new File("c:\\work");
			dir.mkdir();
			
			File file = new File(dir, "file1.txt");
			file.createNewFile();
			
			//파일 또는 디렉터리 여부 판단
			if (dir.isDirectory())
				System.out.println(dir.getName() + "은 디렉터리입니다.");
			if (file.isFile())
				System.out.println(file.getName() + "은 파일입니다.");
			
			//파일에 데이터 출력 후 읽기
			if (file.exists() ) {
				try (PrintWriter out = new PrintWriter(file)) {
					out.println("hello java");
				}
			System.out.println("파일 이름 : " + file.getName() );
			System.out.println("파일 경로 : " + file.getPath() );
			System.out.println("쓰기 가능 : " + file.canWrite() );
			System.out.println("읽기 가능 : " + file.canRead() );
			System.out.println("파일 길이 : " + file.length() + "바이트");
			} else {
				System.out.println("작업할 파일이 존재하지 않음");
				
			}
			
			File subdir = new File("c:\\work\\subdir");
			subdir.mkdir();
			File file2 = new File(subdir, "file2.txt");
			file2.createNewFile();
			
			//파일 절대 경로
			String file2Path = file2.getAbsolutePath();
			System.out.println("절대 경로 :" + file2Path);
			
			// 부모 디렉터리
			String parentDir = file2.getParent();
			System.out.println("부모 경로 :" + parentDir);
			
			//디렉터리 목록 구하기
			File parentFile = file.getParentFile();
			String[] fileNames = parentFile.list();
			System.out.println(parentDir + " 목록 ==>");
			for (String name : fileNames)
				System.out.println(name);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
