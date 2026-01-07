package com.excel.read;

public class Child {

	
	public static void main(String[] args) {
		
		// Input string that contains both row and column info 
		// Format: Row<number>_Col<number>
		String user = "Row2_Col1";
		
		//---------------------------ROW EXTRACTION-----------------
	
		// Split the string at "_" -> ["Row2, "Col1"] 
		String rowSplit = user.split("_")[0];
		
		// Remove the word "Row" -> "2" 
		String rowNumberAsString = rowSplit.replace("Row", ""); //console: 2
	
		// Convert "2" -> integer 2
		int rowNo = Integer.parseInt(rowNumberAsString);
		
		//-------------------------COLUMN EXTRACTION----------------
		
		//Get second part after "_" -> "Col1"
		String colSplit = user.split("_")[1];
		
		//Remove the word "Col" -> "1"
		String colNumberAsastring = colSplit.replace("Col","");
		
		//Convert "1" -> integer 1
		int colNo = Integer.parseInt(colNumberAsastring);
		
		//------------------------- OUTPUT -------------------------
	
		System.out.println("Row text split: " + rowSplit);
		System.out.println("Row number as String: " + rowNumberAsString);
		System.out.println("Column text split: " + colSplit);
		System.out.println("Column number as String: " + colNumberAsastring);
		
		System.out.println("Actual row in int = " + rowNo);
		System.out.println("Actual column in int = " + colNo);
	
	}
	
}
