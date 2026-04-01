package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	static FileInputStream f; //inbuild class used to input an excel file
	static XSSFWorkbook w;   //inbuild class used to input an excel workbook
	static XSSFSheet s;   //inbuild class used to input an excel sheet
	
	public static String GetStringData(int a, int b) throws IOException {
		f=new FileInputStream("C:\\Users\\prase\\OneDrive\\Desktop\\Book1.xlsx");
		w= new XSSFWorkbook(f);
		s= w.getSheet("Sheet1");
		
		XSSFRow r= s.getRow(a);
		XSSFCell c=r.getCell(b);
		
		return c.getStringCellValue();
		
	}
	public static int GetIntegerData(int a, int b) throws IOException {
		
		f=new FileInputStream("C:\\Users\\prase\\OneDrive\\Desktop\\Book1.xlsx");
		w= new XSSFWorkbook(f);
		s= w.getSheet("Sheet1");
		
		XSSFRow r= s.getRow(a);
		XSSFCell c=r.getCell(b);
		
		//Typecasting conversion of one data type to another
		
		int x=(int) c.getNumericCellValue();
		
		return x;	
		
	}
	
	public static void main(String args[]) throws IOException {
		
		System.out.print(ExcelRead.GetStringData(1, 0));
		System.out.print("  ");
		System.out.println(ExcelRead.GetIntegerData(1, 1));
		System.out.print(ExcelRead.GetStringData(2, 0));
		System.out.print("  ");
		System.out.println(ExcelRead.GetIntegerData(2, 1));
		System.out.print(ExcelRead.GetStringData(3, 0));
		System.out.print("  ");
		System.out.println(ExcelRead.GetIntegerData(3, 1));
		System.out.print(ExcelRead.GetStringData(4, 0));
		System.out.print("  ");
		System.out.println(ExcelRead.GetIntegerData(4, 1));
		System.out.print(ExcelRead.GetStringData(5, 0));
		System.out.print("  ");
		System.out.println(ExcelRead.GetIntegerData(5, 1));
	}
}
