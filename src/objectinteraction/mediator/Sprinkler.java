package objectinteraction.mediator;

public class Sprinkler {
	
	public static void sprinkler() {
		System.out.println("Sprinkler");
	}
	
	public void onEvent() {
		Alarm.alarm();
		Calendar.calendar();
		CoffeePot.coffee();
	}
	
	public void onEventMediator() {
		new Communicate().onSprinkler();
	}
}
