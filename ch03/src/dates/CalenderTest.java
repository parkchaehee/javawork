package dates;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		//년도
		int year = cal.get(Calendar.YEAR);
		System.out.println(year + "년");
		System.out.println(Calendar.YEAR);
		
		//월(배열 인덱스 기준 - 0: 1월)
		int month = cal.get(Calendar.MONTH) + 1;//미국은 0부터 시작 +1해주기
		System.out.println(month + "월");
		
		//일(date)
		int date = cal.get(Calendar.DATE);
		System.out.println(date + "일");
		
		//요일 (day) - 1:일, 2:월, ...6:금, 7:토
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		String[] days = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		System.out.println(days[0]);
		System.out.println(days[day-1]);
		
		//설정set, 출력get
		//시간
		System.out.print(cal.get(Calendar.HOUR) + "시 ");
		//분
		System.out.print(cal.get(Calendar.MINUTE) + "분 ");
		//초
		System.out.println(cal.get(Calendar.SECOND) + "초");
	}

}
