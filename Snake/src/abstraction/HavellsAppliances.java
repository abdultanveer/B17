package abstraction;

public class HavellsAppliances implements ISwitchBoard {

	@Override
	public void switchOnFan() {
		System.out.println("havelss fan is on");
	}

	@Override
	public void switchOnLight() {
		System.out.println("havells light is on");
		
	}

	@Override
	public void switchOnAC() {
		System.out.println("havells AC is on");
		
	}

}
