package cars;

public class Car {
	private Motor motor;
	
	public Car() {
		this.motor = new Motor();
	}
	
	public void accelerate() {
		this.motor.accelerate();
	}
	
	public void stop() {
		this.motor.stop();
	}

	public void printDashboard() {
		System.out.println("--------------------------------");
		System.out.println("DASHBOARD:");
		System.out.println("\t RPM: " + this.motor.getRPM());
		System.out.println("\t Speed: " + this.motor.getSpeed());
		System.out.println("\t Oil level: " + this.motor.getOilLevel());
		System.out.println("\t Gas level: " + this.motor.getGasLevel());
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		
		car.printDashboard();
		car.accelerate();
		car.printDashboard();
		car.stop();
		car.printDashboard();
	}
}
