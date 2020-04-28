package command;

public class Controller {
	public class SystemController {

		private Command command;

		public void setCommand(Command command) {
			this.command = command;
		}

		public void pressButton() {
			System.out.println("Executing command");
			this.command.execute();
		}
	}
}

