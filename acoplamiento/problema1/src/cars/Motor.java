package cars;

public class Motor {
	
	private int speed;
	private int rpm;
	private float oilLevel;
	private float gasLevel;
	
	public Motor() {
	}

	public void accelerate() {
		this.rpm += 100;
		this.speed += 10;
		this.oilLevel -= 0.1;
		this.gasLevel -= 0.5;
	}
	
	public void stop() {
		this.rpm -= 0;
		this.speed -= 0;
		this.oilLevel -= 0.1;
		this.gasLevel -= 0;
	}

	public int getSpeed() {
		return this.speed;
	}

	public int getRPM() {
		return this.rpm;
	}

	public float getOilLevel() {
		return this.oilLevel;
	}

	public float getGasLevel() {
		return this.gasLevel;
	}
}
