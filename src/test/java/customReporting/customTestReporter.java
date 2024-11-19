package customReporting;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.xml.XmlSuite;

import java.io.*;
import java.time.Instant;
import java.util.List;
import java.util.Map;

public class customTestReporter implements IReporter {

    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        PrintWriter reportWriter = null;
        File reportFile = new File("target/customReport" + Instant.now().getEpochSecond() + ".html");
        try{
            reportWriter = new PrintWriter(new BufferedWriter(new FileWriter(reportFile)));
        }
        catch (IOException e){
            e.printStackTrace();
        }

        if (reportWriter == null)
            return;

        reportWriter.println("<!DOCTYPE html>");
        reportWriter.println("<head>");
        reportWriter.println("<title>My Custom Report</title>");
        reportWriter.println("</head>");

        reportWriter.println("<body>");
        for (ISuite suite : suites) {
            Map<String, ISuiteResult> suiteResults = suite.getResults();
            reportWriter.println("<p>" + suite.getName());
            reportWriter.println("<ul>");
            for (String key : suiteResults.keySet()) {
                ISuiteResult result = suiteResults.get(key);
                result.getTestContext().getName();
                reportWriter.println("<li>" + result.getTestContext() + "</li>");
                reportWriter.println("<li>" + result.getTestContext().getFailedTests() + "</li>");
                reportWriter.println("<li>" + result.getTestContext().getPassedTests() + "</li>");
                reportWriter.println("<br>");
            }
            reportWriter.println("</ul></p>");
        }
        reportWriter.println("<h1>My Custom Report</h1>");
        reportWriter.println("<p>This is a custom report.</p>");
        reportWriter.println("</body>");

        reportWriter.println("</html>");

        reportWriter.flush();
        reportWriter.close();
    }
}
