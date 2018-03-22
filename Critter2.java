package assignment4;

public class Critter2 extends Critter{

	@Override
	public void doTimeStep() {
		walk(getRandomInt(8));
		walk(getRandomInt(8));
	}

	@Override
	public boolean fight(String opponent) {
		walk(getRandomInt(8));
		walk(getRandomInt(8));
		return false;
	}

	@Override
	public String toString () {
		return "2";
	}
}
