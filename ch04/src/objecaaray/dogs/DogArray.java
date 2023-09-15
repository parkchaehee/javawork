package objecaaray.dogs;

public class DogArray {

	public static void main(String[] args) {
		// Dog 인스턴스 4개를 생성해서 배열에 저장하고
		// 정보를 출력하세요(get()함수 사용)
		Dog[] dogs = new Dog[4];
		
		//배열에저장(입력)
		dogs[0] = new Dog("백구","진돗개");
		dogs[1] = new Dog("해피","시츄");
		dogs[2] = new Dog("대박","불독");
		dogs[3] = new Dog("사랑","치와와");
		
		//name[2].showDogInfo();
		
		
		//전체 출력                     //인덱싱 하는것
		for(int i=0; i<dogs.length; i++) {
			/*library[i].showBookInfo();*/
			System.out.println(dogs[i].getName()+ ", " + dogs[i].getType());
		}		
		
		System.out.println();
		
		//향상된 for 문                //인덱싱 안하는것
		//for(자료형 변수 : 배열){}
		for(Dog dog : dogs)
			System.out.println(dog.getName()+ ", " +dog.getType());
	}

}
