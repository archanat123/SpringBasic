package sprinttest;

import org.springframework.stereotype.Component;

@Component
public class Orange {

	
	
	public Orange()
	{
		System.out.println("Orange.Orange()");
		
	}

	@Override
	public String toString() {
		return "Orange []";
	}

	
	
	
	
}
