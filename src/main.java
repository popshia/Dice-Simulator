import java.util.Scanner ;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in ) ;
		System.out.println( "Welcome to DICE SIMULATION !" ) ;
		System.out.println( "Please enter the number of dice you want to simulate :" ) ;
		Dice.diceCount = scanner.nextInt() ;
		Dice.SetPoints() ;
		Dice.PrintAndCountTheTotal() ;
		Dice.AnalyzePoints() ;
		scanner.close();
	} // run
} // class main
