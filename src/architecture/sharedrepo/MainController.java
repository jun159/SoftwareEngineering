package architecture.sharedrepo;

public class MainController {

	public static void main(String[] args) {
		Input input = new Input();
		input.input();
		
		CircularShift circularShift = new CircularShift();
		circularShift.circularShift();
		
		Alphabetizer alphabetizer = new Alphabetizer();
		alphabetizer.alphabetize();
		
		Output output = new Output();
		output.output();
	}
}
