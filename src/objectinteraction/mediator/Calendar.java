package objectinteraction.mediator;

public class Calendar {
	
	public static void calendar() {
		System.out.println("Calendar");
	}
	
	public void onEvent() {
		Alarm.alarm();
		CoffeePot.coffee();
		Sprinkler.sprinkler();
	}
	
	public void onEventMediator() {
		new Communicate().onCalendar();
	}
}
