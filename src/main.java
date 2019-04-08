import java.util.* ;
import java.util.Scanner ;

class Dice {
	static int diceCount = 0 ;
	static int total = 0 ;
	static Vector<Integer> points = new Vector<Integer>(0) ;
	
	public static void SetPoints() {
		for ( int i = 0 ; i < diceCount ; i ++ ) points.add( (int)( Math.random()*6 )+1 ) ;
	} // set the dice points
	
	public static void PrintAndCountTheTotal() {
		System.out.println( "This is what you roll :" ) ;
		for ( int i = 0 ; i < diceCount ; i ++ ) {
			total = total + points.get(i) ;
			System.out.print( points.get(i) + " " ) ;
		} // count the points and print
		System.out.println() ;
	} // print dice points
	
	public static void AnalyzePoints() {
		System.out.print( "It's " );
		Collections.sort( points ) ;
		boolean pair = false ;
		boolean threeOfAKind = false ;
		boolean straight = false ;
		int[] pointCount = new int[8] ;
		for ( int i = 0 ; i < diceCount ; i ++ ) pointCount[ points.get(i)-1 ]++ ;
		for ( int i = 0 ; i < 6 ; i ++ ) {
			if ( pointCount[i] == 2 ) pair = true ;
			else if ( pointCount[i] == 3 ) threeOfAKind = true ;
			else if ( pointCount[i] == 1 && pointCount[i+1] == 1 && pointCount[i+2] == 1 ) straight = true ;
		} // analyzing
		if ( pair ) System.out.println( "a pair." ) ;
		if ( threeOfAKind ) System.out.println( "three of a kind." ) ;
		if ( straight ) System.out.println( "a straight." ) ;
		if ( !pair && !threeOfAKind && !straight ) System.out.println( "nothing, and the total is " + total + "." ) ;
	} // analyze the points and print the result
} // class Dice

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in ) ;
		System.out.println( "Welcome to DICE SIMULATION !" ) ;
		System.out.println( "Please enter the number of dice you want to simulate :" ) ;
		Dice.diceCount = scanner.nextInt() ;
		Dice.SetPoints() ;
		Dice.PrintAndCountTheTotal() ;
		Dice.AnalyzePoints() ;
	} // run
} // class main
