package inheritance.q4;

public class Engineer extends practiceP278{
	/*
	 오류원인 - Employee의 생성자를 상속받지 않음
	 결함 조치 - super()를 사용하여 생성자를 상속받음
	 */
	private String skillset;
	
	public Engineer(String name) {
		super();
	}
	public String getSkillset() {
		return skillset;
		
		
	}
	public void setSkillSet(String skillset) {//g,{} 없음
		this.skillset = skillset;
	}
	
}
