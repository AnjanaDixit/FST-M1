package com.ibm.JobBoard;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class Selenium_JB {
	
	
	public static void main(String[] args)
	{
		Selenium_JB obj1 = new Selenium_JB();
		obj1.openBrowser(); //Activity-1
		obj1.DisplayTitle(); //Activity-1
		obj1.DisplayHeading(); //Activity-2
		obj1.printImageURL(); //Activity-3
		obj1.verifySecondHeading(); //Activity-4
		obj1.navigateToJobs(); //Activity-5
		obj1.applyForJob(); //Activity-6
		obj1.newJobListing(); //Activity-7
		obj1.websiteBackEnd(); //Activity-8
	}
	public static WebDriver jb = new FirefoxDriver();
	
	public void openBrowser()
	{
		jb.navigate().to("https://alchemy.hguy.co/jobs/");		
	}
	
	public void signIn()
	{
		WebElement email = jb.findElement(By.className("input"));
		email.sendKeys("root");
		WebDriverWait wait = new WebDriverWait(jb, 10);
		WebElement pwd = jb.findElement(By.xpath("//*[@id=\"user_pass\"]"));
		pwd.sendKeys("pa$$w0rd");
		WebDriverWait wait1 = new WebDriverWait(jb, 10);
		jb.findElement(By.xpath("//*[@id=\"wp-submit\"]")).submit();
	}
	public void DisplayTitle()
	{
		String title = jb.getTitle();
		if(title.matches("Alchemy Jobs – Job Board Application"))
			System.out.println("Title : "+ title);
	}
	public void DisplayHeading()
	{
		String heading = jb.findElement(By.className("entry-title")).getText();
		System.out.println("Heading : "+ heading);
	}
	public void printImageURL()
	{
		String imageUrl = jb.findElement(By.cssSelector(".attachment-large")).getAttribute("src").toString();
		System.out.println("Image URL : "+ imageUrl);
	}
	public void verifySecondHeading()
	{
		String secURL = jb.findElement(By.cssSelector("#post-16 > div > h2")).getText();
		if(secURL.matches("Quia quis non"))
			System.out.println("Second heading : "+ secURL);
	}
	public void navigateToJobs()
	{
		jb.findElement(By.xpath("//*[@id=\"menu-item-24\"]/a")).click();
		System.out.println("Jobs clicked");
		String title = jb.getTitle();
		System.out.println(title);	
	}
	public void applyForJob()
	{
		WebElement keywords = jb.findElement(By.name("search_keywords"));
		keywords.sendKeys("Banking");
		jb.findElement(By.cssSelector("#post-7 > div > div > form > div.search_jobs > div.search_submit > input[type=submit]")).click();
		//WebDriverWait wait = new WebDriverWait(jb, 30);
		jb.navigate().to("https://alchemy.hguy.co/jobs/job/cs-software-company-2-banking/");
		jb.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div[3]/input")).click();
		String email = jb.findElement(By.className("job_application_email")).getText();
		System.out.println("Email : " + email);
	}
	public void newJobListing()
	{
		openBrowser();
		jb.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[3]/a")).click();
		jb.findElement(By.cssSelector("a.button")).click();
		signIn();
		
		WebDriverWait wait = new WebDriverWait(jb, 10);
		WebElement jobTitle = jb.findElement(By.xpath("//*[@id=\"job_title\"]"));
		jobTitle.sendKeys("IT Engineer");
		Select jobType = new Select(jb.findElement(By.xpath("//*[@id=\"job_type\"]")));
		jobType.selectByIndex(2);
		
		WebElement desc = jb.findElement(By.xpath("//*[@id=\"tinymce\"]"));
		desc.sendKeys("IT Engineer - CSE Degree");
		
		jb.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/form/p/input[4]")).click();
		jb.findElement(By.xpath("button job-manager-button-submit-listing")).click();
		
		jb.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/a")).click();
		if(jb.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/header/div/h1")).toString() == "IT Engineer")
		{
			System.out.println("Job listed successfully");
		}	
	}
	public void websiteBackEnd()
	{
		jb.navigate().to("‘https://alchemy.hguy.co/jobs/wp-admin");
		signIn();
	}
	public void createJobListingBackEnd()
	{
		jb.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[7]/a/div[3]")).click();
		jb.findElement(By.cssSelector(".page-title-action")).click();
		WebElement website = jb.findElement(By.id("_company_website"));
		website.sendKeys("easyGo.com");
		WebElement twitter = jb.findElement(By.id("_company_twitter"));
		twitter.sendKeys("easyGo");
		WebElement name = jb.findElement(By.id("_company_name"));
		name.sendKeys("easyGo");
		WebElement location = jb.findElement(By.id("_job_location"));
		location.sendKeys("Mumbai");
		WebElement tagline = jb.findElement(By.id("_company_tagline"));
		tagline.sendKeys("Go anywhere.Easy.");
		for(int i=0;i<=2;i++)
		{
		jb.findElement(By.xpath("/html/body/div[2]/div/a[2]/span")).click();
		}
		jb.findElement(By.className("ui-state-default")).click();
		jb.findElement(By.className("button button-small wp_job_manager_view_file_button")).click();
		jb.findElement(By.id("_company_video")).sendKeys("https://youtu.be/Q8cTMYLEPlM?list=UUP9ma95lbHYbjzPKTfiNgRQ");
		jb.findElement(By.className("button button-small wp_job_manager_upload_file_button")).click();
		jb.findElement(By.className("attachment-preview js--select-attachment type-image subtype-png landscape")).click();
		jb.findElement(By.className("button media-button button-primary button-large media-button-select")).click();


		
		
		
		
	}
}
