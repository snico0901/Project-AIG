
public class Move {

	Board b;
	
	int square, value;

	public Move(int square, int value) {
		this.square = square;
		this.value = value;
	}

	public Move() {
	}

	public boolean betterThan(Move m) {
		if (b.xturn())
			return this.value > m.value;
		else
			return this.value < m.value;
	}

	public String toString() {
		return "[ square=" + square + ", value=" + value + " ]";
	}
}
