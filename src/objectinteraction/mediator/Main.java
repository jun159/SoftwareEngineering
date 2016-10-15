package objectinteraction.mediator;

public class Main {
	
	public static void main(String[] args) {
		
		Alarm alarm = new Alarm();
		Calendar calendar = new Calendar();
		CoffeePot coffeePot = new CoffeePot();
		Sprinkler sprinkler = new Sprinkler();
		
		/**
		 * Without mediator, objects communicate directly with each other
		 * Dependencies between communicating objects increases,
		 * hence increases coupling
		 */
		System.out.println("Before mediator");
		alarm.onEvent();
		calendar.onEvent();
		coffeePot.onEvent();
		sprinkler.onEvent();
		
		/**
		 * With mediator, objects communicate with each other through mediator
		 * Reduces the dependencies between communicating objects, 
		 * hence lowering the coupling
		 */
		System.out.println("\nAfter mediator");
		alarm.onEventMediator();
		calendar.onEventMediator();
		coffeePot.onEventMediator();
		sprinkler.onEventMediator();
		
	}
}
