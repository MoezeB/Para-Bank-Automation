package com.excel.read;

public class HandleExampleTableData {

	public int getActualRow(String value) {

		// String user = "Row2_Col1"

		// Split Example table value
		String row = value.split("_")[0];

		// Remove 'Row' text
		String actualRowNumber = row.replace("Row", "");

		// Convert String to int
		int rowNo = Integer.parseInt(actualRowNumber);

		// 🔹 Excel rows are 0-based (Row1 -> index 0)
		int excelRowIndex = rowNo - 1;

		// Debug (keep for learning, remove in CI)
		System.out.println("Excel Row Index: " + excelRowIndex);

		return excelRowIndex;
	}

	public int getActualCol(String value) {

		// String user = "Row2_Col1"

		// Split Example table value
		String col = value.split("_")[1];

		// Remove 'Col' text
		String actualColNumber = col.replace("Col", "");

		// Convert String to int
		int colNo = Integer.parseInt(actualColNumber);

		// 🔹 Excel columns are 0-based (Col1 -> index 0)
		int excelColIndex = colNo - 1;

		// Debug (keep for learning, remove in CI)
		System.out.println("Excel Column Index: " + excelColIndex);

		return excelColIndex;
	}

	public static void main(String[] args) {

		// Local test
		String value = "Row2_Col1";

		HandleExampleTableData obj = new HandleExampleTableData();

		obj.getActualRow(value);
		obj.getActualCol(value);
	}
}


