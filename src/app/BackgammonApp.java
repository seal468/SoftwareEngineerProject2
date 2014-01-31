package app;

import util.Util;

public class BackgammonApp {
	static String	barSpace = "     ";
	static String	space = "   ";
	static String	pip = "||";
	static String 	position01 ="O2",
					position02 =pip,
					position03 =pip,
					position04 =pip,
					position05 =pip,
					position06 ="X5",
					position07 =pip,
					position08 ="X3",
					position09 =pip,
					position10 =pip,
					position11 =pip,
					position12 ="O5",
					position13 ="X5",
					position14 =pip,
					position15 =pip,
					position16 =pip,
					position17 ="O3",
					position18 =pip,
					position19 ="O5",
					position20 =pip,
					position21 =pip,
					position22 =pip,
					position23 =pip,
					position24 ="X2";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String position01, position02, position03, position04, position05, position06, position07, position08, position09, position10, position11, position12 = "|";

		/**
		 * if position == null, assign | to position
		 */
		
		System.out.println("13---14---15---16---17---18 BAR 19---20---21---22---23---24 OFF");
		System.out.println(position13+space+position14+space+position15+space+position16+space+position17+space+position18+barSpace+position19+space+position20+space+position21+space+position22+space+position23+space+position24);
		System.out.println("                            "+"WMW");
		System.out.println(position12+space+position11+space+position10+space+position09+space+position08+space+position07+barSpace+position06+space+position05+space+position04+space+position03+space+position02+space+position01);
		System.out.println("12---11---10---09---08---07 BAR 06---05---04---03---02---01 OFF");
		
		
		
	}

}
