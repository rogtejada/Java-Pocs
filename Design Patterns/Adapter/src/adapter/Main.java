package adapter;

public class Main {

	public static void main(String[] args) {
		ThreePinPlug threePinPlug = new ThreePinPlug();
		
		PlugAdapter plugAdapter = new PlugAdapter(threePinPlug);
		
		plugAdapter.connectToTwoPinPlug();
		
	}
}
