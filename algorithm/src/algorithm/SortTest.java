package algorithm;

public class SortTest {

	public static void main(String[] args) {
		// 오름 차순 정렬 - 버블 정렬(거품)
		// 자리 바꾸기(위치) a, b, temp
		// 2, 3, 4, 5, 6, 9
		int[] arr = {3, 6, 9, 2, 5, 4};
		int temp;  //임시 변수
		
		//중첩 for
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) { //j>arr.length-1; =>내림차순
				if(arr[j] > arr[j+1]) { //자리바꿈
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
		/*
		 1행 362549
		 2행 325469
		 3행 234569
		 */
				}
			}
		}
		//arr 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
