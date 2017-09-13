import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach c= context.getBean("myCoach",Coach.class);
		
		
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getFortuneService());
		context.close();
	}

}
