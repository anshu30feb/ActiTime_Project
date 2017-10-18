package generic;

import java.io.FileInputStream;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lib 
{
	public static String getCellValue(String path,String sheet,int r,int c)
	{
		String v="";
		try
		{
			Workbook w=WorkbookFactory.create(new FileInputStream(path));
			w.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e)
		{
			
		}
		return v;
	}
	
	public static String getPpt(String path,String key)
	{
		String v="";
		try
		{
			Properties p=new Properties();
			p.load(new FileInputStream(path));
			v=p.getProperty(key);
		}
		catch(Exception e)
		{
			
		}
		return v;
	}
	
	public static int getRowCount(String path,String sheet)
	{
		int rc=0;
		try
		{
			Workbook w=WorkbookFactory.create(new FileInputStream(path));
			rc=w.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			
		}
		return rc;
	}
	

	
}
