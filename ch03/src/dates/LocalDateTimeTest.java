package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		// LocalDateTime 클래스 사용
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//날짜,시간 포맷설정 - "yyyy/MM/dd HH:mm:ss a"
		DateTimeFormatter timeFormat = 
				DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss a");
		
		System.out.println(now.format(timeFormat));
		
		//날짜만
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//시간만
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		DateTimeFormatter timeFormat1 = 
				DateTimeFormatter.ofPattern("HH:mm:ss a");
		System.out.println(time.format(timeFormat1));
		
		//특정날짜 지정하기
		LocalDate startDay = LocalDate.of(2023, 8, 1);
		LocalDate toDay = LocalDate.of(2023, 9, 15);
		
		//지나온 날짜 계산하기
		long passedTime = ChronoUnit.DAYS.between(startDay, toDay);
		System.out.println(passedTime + "일이 지났습니다.");

	}

}
