package objectinteraction.mediator;

public class Communicate implements Mediator {

	@Override
	public void onAlarm() {
		Calendar.calendar();
		CoffeePot.coffee();
		Sprinkler.sprinkler();
	}

	@Override
	public void onCalendar() {
		Alarm.alarm();
		CoffeePot.coffee();
		Sprinkler.sprinkler();
	}

	@Override
	public void onCoffeePot() {
		Alarm.alarm();
		Calendar.calendar();
		Sprinkler.sprinkler();
	}

	@Override
	public void onSprinkler() {
		Alarm.alarm();
		Calendar.calendar();
		CoffeePot.coffee();
	}
}