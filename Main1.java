package project2;

public class Main1 {
	public static void main(String [] args) {
		vehicle mycar=new car();
		vehicle mybike=new bike();
		mycar.startEngine();
		mybike.startEngine();
		mycar.stopEngine();
		mybike.stopEngine();
	}

}
