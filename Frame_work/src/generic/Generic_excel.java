package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_excel {
public static String getData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
{
	String val="";
	FileInputStream fis=FileInputStream("./Excel/testdata.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	val=book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return val;
	
}

private static java.io.FileInputStream FileInputStream(String string) {
	// TODO Auto-generated method stub
	return null;
}
}
