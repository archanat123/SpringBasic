package sprinttest;

import org.springframework.stereotype.Component;

@Component
public class Apple {
	
	
	
	
	public Apple()
	{
	
	System.out.println("Apple.Apple()");
	}

	@Override
	public String toString() {
		return "Apple []";
	}
	
	

}
