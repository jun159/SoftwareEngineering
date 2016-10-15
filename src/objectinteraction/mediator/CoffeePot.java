package objectinteraction.mediator;

public class CoffeePot {

	public static void coffee() {
		System.out.println("CoffeePot");
	}
	
	public void onEvent() {
		Alarm.alarm();
		Calendar.calendar();
		Sprinkler.sprinkler();
	}
	
	public void onEventMediator() {
		new Communicate().onCoffeePot();
	}
}
