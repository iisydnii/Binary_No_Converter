//Name: Sydni Ward
//Class: CSCI 1900-201
/* Conversion */

import javax.swing.JOptionPane;		
import java.util.Scanner;
public class ExtraCredit
{
   public static void main(String args[])
   {	 
		int num = 0;
    	String Bin = "";
    	String Hex = "";
    	String Oct = "";
    	String Dec = "";
    	Scanner input = new Scanner( System.in );
		String Conversion;
		String strInput; 
		String strOutput;
		
		Conversion= JOptionPane.showInputDialog(null, "\nEnter the first three letter " + 
			"of your conversion.\n\nPlease note only type in your input." +  
			"\nExample: if you want binary to decimal, only type: 'BIN'." +
			"\nCasing does not matter.\n", "Conversion", -1);
		
		Conversion = Conversion.toUpperCase();
		
		while(!(Conversion.equals("BIN") || Conversion.equals("DEC") || 
					Conversion.equals("OCT") || Conversion.equals("HEX")))
		{
			Conversion= JOptionPane.showInputDialog(null, "\nERROR." +
					"\nEnter the first three letter of your conversion." +
					"\n\nPlease note only type in your input. \nExample: if you want " +
					"binary to decimal, only type: 'BIN'. \nCasing does not matter.\n", 
					"Conversion", 0);
		
			Conversion = Conversion.toUpperCase();
		}
		
		
		if(Conversion.equals("BIN"))
		{
			Bin = JOptionPane.showInputDialog(null, "Enter a binary number: ", 
					"Conversion", -1);

	/*Binary to decimal*/	 
			num = Integer.parseInt(Bin,2);
			
	/*Binary to hexadecimal*/		
			Hex = Integer.toHexString(num);
			
    /*Binary to octal*/ 	
     		Oct = Integer.toOctalString(num);
			
			strOutput  = "Binary to decimal: "+ num;
			strOutput  += "\nBinary to hexadecimal: " + Hex;
			strOutput  += "\nBinary to octal: " + Oct;
     		
     		JOptionPane.showMessageDialog(null, strOutput, "Conversion", 1);
     	}
     	
     	else if(Conversion.equals("DEC"))
     	{

			Dec = JOptionPane.showInputDialog(null,"Enter a decimal number: ", 
					"Conversion", -1);
	
    		num = Integer.parseInt(Dec,10);
	 /* Decimal to Binary */
			Bin = Integer.toBinaryString(num);
			
	/* Decimal to octal */ 
    		Oct = Integer.toOctalString(num);
			
   /* Decimal to hexadecimal */
			Hex = Integer.toHexString(num);	
   		
   		strOutput  = "Decimal to binary: "+ Bin;	
   		strOutput  += "\nDecimal to octal: " + Oct;
   		strOutput  += "\nDecimal to hexadecimal: " + Hex;
   		
   		JOptionPane.showMessageDialog(null, strOutput, "Conversion", 1);
   		}
   		
   		else if(Conversion.equals("OCT"))
   		{
   			Oct = JOptionPane.showInputDialog(null,"\nEnter octal number:", 
   					"Conversion", -1);
   
   	/*Octal to Decimal*/	
   			num = Integer.parseInt(Oct, 8);
			
	/*Octal to Binary*/
			Bin = Integer.toBinaryString(num);
			
	/*Octal to Hexadecimal*/
			Hex = Integer.toHexString(num);
			
		strOutput  = "Octal to decimal: " + num;
		strOutput  += "\nOctal to binary: " + Bin;
		strOutput  += "\nOctal to hexadecimal: " + Hex;
		
		JOptionPane.showMessageDialog(null, strOutput, "Conversion", 1);
		}
		else if(Conversion.equals("HEX"))
		{
			Hex = JOptionPane.showInputDialog(null,"\nEnter a hexadecimal number:", 
					"Conversion", -1);
	
		/*Hexadecimal to Decimal*/		
   			num = Integer.parseInt(Hex, 16);
			
		/*Hexadecimal to Binary*/
			Bin = Integer.toBinaryString(num);
			
		/*Hexadecimal to Octal*/
			Oct = Integer.toOctalString(num);
			
			strOutput  = "Hexadecimal to decimal: " + num;
			strOutput  += "\nHexadecimal to binary: " + Bin;
			strOutput  += "\nHexadecimal to octal: " + Oct;
			
			JOptionPane.showMessageDialog(null, strOutput, "Conversion", 1);
		}
		System.exit(0);
	}//end main	
}//end ExtraCredit
