package interfaceex.sort;

public class BubbleSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort ascendning");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort 입니다.");
	}
	

	

}