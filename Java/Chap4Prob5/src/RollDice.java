class RollDice {
	//Simulates the rolling of three dice
	public static void main(String[] args) {
		Dice one;
		one = new Dice( );
		one.roll();
		one.roll();
		one.roll();
		System.out.println("Results are " + one.getNumber( ) + " " + one.getNumber( ) + " " + one.getNumber( ) );
	}
}