package files;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportFiles {
	 
	public static void GenerateExtendReport() {
		
		ExtentReports reports = new  ExtentReports();
		
		File reportfile = new File(System.getProperty("user.dir")+"/test-output/ExtentReport/extentReport.html");
		
		ExtentSparkReporter spark = new ExtentSparkReporter(reportfile);
		
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("test automation test results");
		spark.config().setDocumentTitle("test automation");
		spark.config().setTimeStampFormat("mm/dd/yyyy hh:mm:ss");
		
		reports.attachReporter(spark);
	}

}
