package facade;

public class Computer {

	private ComputerCPU computerCPU;
	private Memory memory;
	private HardDrive hardDrive;
	
	public Computer() {
		this.computerCPU = new ComputerCPU();
		this.memory = new Memory();
		this.hardDrive = new HardDrive();
	}
	
	public void startComputer() {
		memory.loadMemoryPosition();
		hardDrive.readHardDrive();
		computerCPU.startCPU();
	}	
}
