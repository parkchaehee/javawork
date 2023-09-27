package datainputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample1 {
	
	public static void main(String[] args) {
		
		try {
			//출력 스트림 객체 생성(생성자 - 파일경로)
			OutputStream os = new FileOutputStream("C:/File/test1.db");
			
			//데이터 변수 선언
			byte a = 10;
			byte b = 20;
			byte c = 30;
			//char d = '가';//바이트기반
			int d = 97; // 문자(char)로 출력하면 a(아스키 코드값) 
			
			//db파일에 데이터 쓰기
			os.write(a);
			os.write(b);
			os.write(c);
			//os.write(d);
			
			os.flush(); //내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
			os.close(); //출력 스트림을 닫아서 사용한 메모리를 해제
			
		} catch (FileNotFoundException e) {//파일이 없을때
			e.printStackTrace();
		} catch (IOException e) { //전송중 오류
			e.printStackTrace();
		}
	}

}
