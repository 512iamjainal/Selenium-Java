package day12;

public class AdderMain {

	public static void main(String[] args) {
		
		Adder addObj = new Adder();
		addObj.sum();
		addObj.sum(100, 200);
		addObj.sum(10.5, 20);
		addObj.sum(10, 20.9);
		addObj.sum(2, 3, 5);

	}

}
