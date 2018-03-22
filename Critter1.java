package assignment4;

public class Critter1 extends Critter {

	@Override
	public void doTimeStep() {
		run(getRandomInt(8));
	}

	@Override
	public boolean fight(String opponent) {
		return true;
	}

	@Override
	public String toString () {
		return "1";
	}
}
