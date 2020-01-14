
public class Main {

	public Main() {
		Board b = new Board();
		b.draw();
		System.out.println();
		System.out.println("Board is initiated as follows: ");
		double decidedNumOfStart = Math.random();
		if (decidedNumOfStart > 0.25 && decidedNumOfStart < 0.5)
			b.numStart(2);
		else if (decidedNumOfStart > 0.5 && decidedNumOfStart < 0.75)
			b.numStart(4);
		else if (decidedNumOfStart > 0.75 && decidedNumOfStart < 0.1)
			b.numStart(6);
//		double whoGoesFirst = Math.random();
//		if (whoGoesFirst < 0.5)
//			b.computerMove();
//		else
//			b.draw(); // human will move first
		b.computerMove();
		while (!b.boardFull()) {
			if (b.computerMove()) {
				System.out.println("Computer 1 wins this one!");
				break;
			}
			if (!b.boardFull() && b.computerMove()) {
				System.out.println("Computer 2 wins this one.");
				break;
			}
		}
		if (b.boardValue() == 0)
			System.out.println("Tie!");
	}

	public static void main(String[] args) {
		new Main();
	}
	
}
