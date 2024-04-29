package Utillities;

import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.reporters.IReporterConfig;
import org.testng.xml.XmlSuite;

public class Reporter implements IReporter {

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub
		    for(ISuite suite: suites) {
		    	
		    	System.out.println(suite.getName());
		    	
		    	
		    }
	}

	@Override
	public IReporterConfig getConfig() {
		return null;
		// TODO Auto-generated method stub
		//return IReporter.super.getConfig();
	}

	@Override
	public int hashCode() {
		return 0;
		// TODO Auto-generated method stub
		//return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return false;
		// TODO Auto-generated method stub
		//return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return null;
		// TODO Auto-generated method stub
		//return super.clone();
	}

	@Override
	public String toString() {
		return null;
		// TODO Auto-generated method stub
		//return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
	}

}
