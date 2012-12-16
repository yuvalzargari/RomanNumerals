
public class RomanNumerals {
	String sRoman  = "";

	public String toRoman(int iInput) {
//		if (iInput == 1)
//			return "I";
//		if(iInput ==2 )
//		return "II";
		
		sRoman  = "";
		while(iInput != 0)
		{
		 while (iInput >= 1000) {
	            iInput = iInput - 1000;
	            sRoman += ("M");
	        }
	        while (iInput >= 900) {
	            iInput = iInput - 900;
	            sRoman += ("CM");
	        }
	        while (iInput >= 500) {
	            iInput = iInput - 500;
	            sRoman += ("D");
	        }
	        while (iInput >= 400) {
	            iInput = iInput - 400;
	            sRoman += ("CD");
	        }
	        while (iInput >= 100) {
	            iInput = iInput - 100;
	            sRoman += ("C");
	        }
	        while (iInput >= 90) {
	            iInput = iInput - 90;
	            sRoman += ("XC");
	        }
	        while (iInput >= 50) {
	            iInput = iInput - 50;
	            sRoman += ("L");
	        }
	        while (iInput >= 40) {
	            iInput = iInput - 40;
	            sRoman += ("XL");
	        }
	        while (iInput >= 10) {
	            iInput = iInput - 10;
	            sRoman += ("X");
	        }
	        while (iInput >= 9) {
	            iInput = iInput - 9;
	            sRoman += ("IX");
	        }
	        while (iInput >= 5) {
	            iInput = iInput - 5;
	            sRoman += ("V");
	        }
	        while (iInput >= 4) {
	            iInput = iInput - 4;
	            sRoman += ("IV");
	        }
	        while (iInput >= 1) {
	            iInput = iInput - 1;
	            sRoman += ("II"); // MISTAKE
	        }
		}

	        return sRoman;
	        
	    }

	}


