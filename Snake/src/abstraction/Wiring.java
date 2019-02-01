package abstraction;

public class Wiring {
	
	public static void main(String[] args) {
		ISwitchBoard switchBoard;
		IDrive drive = null;
		drive.drive();
		drive.brake();
		switchBoard = new GEAppliances();
				//new HavellsAppliances();///wiring
		
		switchBoard.switchOnAC();
		switchBoard.switchOnFan();
		switchBoard.switchOnLight();
		
	}

}
