package command;

public class MyCommandMain {
	public static void main(String[] args) {

		SystemController systemController = new SystemController();
		CarSystem carsystem = new CarSystem();
		CarSystemStart carSystemStart = new CarSystemStart(carsystem);
		Command carSystemStop= new CarSystemStop(carsystem);

		systemController.setCommand(carSystemStart);
		systemController.pressButton();

		systemController.setCommand(carSystemStart);
		systemController.pressButton();

	}

}
