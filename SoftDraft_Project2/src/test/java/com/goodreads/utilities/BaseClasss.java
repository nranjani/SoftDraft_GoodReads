package com.goodreads.utilities;

import java.io.File;

import java.nio.file.StandardCopyOption;
import java.nio.file.Files;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class BaseClasss {
	
	public String baseURL = "https://www.goodreads.com/";
	public String username = "ranjanin04@gmail.com";
	public String password = "Goodreads";
	public String searchContent="Above Ground";
	public static WebDriver driver;
	private static final Logger logger = LogManager.getLogger(BaseClasss.class);
	
	public BaseClasss() {
		initializeLogger();
	}
	
	private void initializeLogger() {
		Configurator.initialize(null, "log4j2.xml");
	}
	
	public void logInfo(String message) {
		logger.info(message);
	}
	
	public void logError(String message) {
		logger.error(message);
	}
	
    public void onTestFailure(ITestResult result) {
        captureScreenshot(result.getName());
    }

    public void captureScreenshot(String fileName) {
        if (driver instanceof TakesScreenshot) {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String customPath = "C:/Users/ranja/eclipse-workspace/SoftDraft_Project/screenshots";
            File destinationFile = new File(customPath + fileName + ".png");
            try {
                Files.copy(screenshotFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Screenshot saved: " + destinationFile.getAbsolutePath());
            } catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
        }
    }

    }
       
    

	
    
    
	

