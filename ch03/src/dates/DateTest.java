package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// Date 객체
		Date date = new Date();
		System.out.println(date);
		
		//날짜/시간 포맷 - "yyyy/MM/dd HH:mm:ss a"//m(소문자,분)M(대문자,월)/HH<-24시간
		SimpleDateFormat now = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a");
		System.out.println(now.format(date));

	}

}
