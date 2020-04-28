package command;

public class CarSystemStart {

	private CarSystem carsystem;

	public CarSystemStart(CarSystem carsystem) {
		this.carsystem = carsystem;
	}

	public void execute() {
		this.carsystem.switchStop();
	}
}
