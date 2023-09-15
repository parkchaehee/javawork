package data;

public class TypeConversionTest {

	public static void main(String[] args) {
		// 형 변환 - 1자동, 2강제
		int iNum = 20;
		float fNum = iNum; //실수형4byte = 정수형4byte(대입)
		
		System.out.println(iNum); //20
		System.out.println(fNum); //20.0
		
		double dNum; //실수형 8byte
		dNum = iNum + fNum; //자동 형변환(묵시적 형변환)
		
		System.out.println(dNum); //40.0
		
		//강제 형변환(cast)
		double dNum1 =  1.2;
		float fNum2 = 0.9f;
		int iNum2 = (int)dNum1 + (int)fNum2;//1+0
		System.out.println(iNum2);
		
		int iNum3 = (int)(dNum1 + fNum2);//2
		System.out.println(iNum3);
		
		double iNum4 = (double)(dNum1 + fNum2);
		System.out.println(iNum4);
		
		

	}

}
