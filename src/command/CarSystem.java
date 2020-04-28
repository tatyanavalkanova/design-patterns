package command;

public class CarSystem {
	private Boolean carsystemStart;

	public void switchStart() {
		System.out.println("Car System  is started");
		this.carsystemStart = true;
	}

	public void switchStop() {
		System.out.println("Car System is stopped");
		this.carsystemStart = false;
	}

}


