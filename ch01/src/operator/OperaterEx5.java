package operator;

public class OperaterEx5 {

	public static void main(String[] args) {
		// 산술연산자-증가, 감소 연산자(++, --)
		int num = 10;
		
		// num=num+1; 
		//num+=1; //복합 대입연산자
		//num++; //1증가
		System.out.println(num);
		
		int num2 = 20;
		// num2=num2-1
		//num2-=;
		num2--;
		System.out.println(num2);
		
		//복합 대입 연산자 연습
		int val = 100;
		System.out.println(val+=1); //val=val+1 ==101
		System.out.println(val-=1); //val=val-1 ==100
		System.out.println(val*=10); //val=val*10 ==1000
		System.out.println(val/=10); //val=val/10 ==100
		

	}

}
