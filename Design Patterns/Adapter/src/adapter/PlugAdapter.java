package adapter;
public class PlugAdapter extends TwoPinPlug{
	private ThreePinPlug threePinPlug;
	
	public PlugAdapter(ThreePinPlug threePinPlug) {
		this.threePinPlug=threePinPlug;
	}
	
	public void connectToTwoPinPlug() {
		threePinPlug.connectToThreePinPlug();
	}
	
}
