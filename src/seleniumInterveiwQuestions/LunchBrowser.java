package seleniumInterveiwQuestions;

public class LunchBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/");

	}

}
