package protectedex.pack2;

import protectedex.pack1.A;



//A를 D가 상속받음
// 다른패키지여도 상속 관계는 protected에 접근(사용) 가능
public class D extends A{
	
	public D() {
		super();//매개변수없을땐 생략가능
		this.field = "YES";
		this.method();
	}

}
