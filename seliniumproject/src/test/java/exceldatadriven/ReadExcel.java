package exceldatadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

public class ReadExcel {

	public static void main(String[] args) throws Exception 
	{
	
		File src= new File("C:\\Users\\123\\Desktop\\Latest drivers\\excel\\execeldata.xlsx");
		
		FileInputStream fis= new FileInputStream(src);	
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
	String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
	System.out.println("data from excel"+  data0);
	
	String data2 =sheet1.getRow(5).getCell(1).getStringCellValue();
	
System.out.println("data from excel  "  + data2);	
	
	}

}
