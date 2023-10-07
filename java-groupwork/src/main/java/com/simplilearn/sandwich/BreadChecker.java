package com.simplilearn.sandwich;

import java.util.List ;

public class BreadChecker {

	public boolean check ( List <String> sandwich1, List <String> sandwich2 ) {
		return false ;
	}

	public static void main ( String [ ] args ) {
		BreadChecker bc = new BreadChecker ( ) ;
		List <String> pbj = List.of ( "Pumpernickel", "Peanut Butter", "Jelly", "Pumpernickel" ) ;
		List <String> sandwich2 = List.of ( "Pumpernickel", "Ham", "Mustard", "Pumpernickel" ) ;

		boolean actual = bc.check ( pbj, sandwich2 ) ; // expect true
		System.out.println ( "Expect true, got " + actual ) ;

		List <String> sandwich3 = List.of ( "Rye", "Peanut Butter", "Jelly", "Rye" ) ;
		List <String> sandwich4 = List.of ( "Pumpernickel", "Ham", "Mustard", "Pumpernickel" ) ;

		actual = bc.check ( sandwich3, sandwich4 ) ; // expect false
		System.out.println ( "Expect false, got " + actual ) ;

		List <String> sandwich5 = List.of ( "Rye", "Peanut Butter", "Jelly", "Pumpernickel" ) ;
		List <String> sandwich6 = List.of ( "Rye", "Ham", "Mustard", "Pumpernickel" ) ;

		actual = bc.check ( sandwich5, sandwich6 ) ; // expect true
		System.out.println ( "Expect true, got " + actual ) ;

		List <String> sandwich7 = List.of ( "Pumpernickel", "Peanut Butter", "Jelly", "Rye" ) ;
		List <String> sandwich8 = List.of ( "Rye", "Ham", "Mustard", "Pumpernickel" ) ;

		actual = bc.check ( sandwich7, sandwich8 ) ; // expect true
		System.out.println ( "Expect true, got " + actual ) ;
	}
}
