package toys.design_patterns;

public class MagicalBoard {
	
	private Command command;
	
	public Command getCommand() {
		return command;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void isCommandSaid() {
		if(this.command == null) {
			System.out.println("No command set");
			return;
		}
		this.command.execute();
	}
}
