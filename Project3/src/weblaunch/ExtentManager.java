package weblaunch;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager extends BaseTest
{

		public static ExtentReports report;
		
		public static ExtentReports getInstane()
		{
		  if(report==null)
		  {
			  report = new ExtentReports(projectPath+"//HTML Reports//report.html");
			  report.loadConfig(new File(projectPath+"//extentreportconfig.xml"));
			  report.addSystemInfo("Selenium Language Binding", "3.141.59").addSystemInfo("Envirornment", parentProp.getProperty("env") );
			  
		  }
		  return report;
		}


	}


 