package command;

public class CarSystemStop implements Command {
	private CarSystem carsystem;

	public CarSystemStop(CarSystem carsystem) {
		this.carsystem = carsystem;
	}

	@Override
	public void execute() {
		this.carsystem.switchStop();
	}
}
