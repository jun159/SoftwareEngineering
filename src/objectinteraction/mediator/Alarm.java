package objectinteraction.mediator;

public class Alarm {

	public static void alarm() {
		System.out.println("Alarm");
	}
	
	public void onEvent() {
		Calendar.calendar();
		CoffeePot.coffee();
		Sprinkler.sprinkler();
	}
	
	public void onEventMediator() {
		new Communicate().onAlarm();
	}
}
