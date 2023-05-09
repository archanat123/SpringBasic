package sprinttest;

public class LifeCycleHook {
	
	
	static
	{
		System.out.println("static block ::  LifeCycleHook.enclosing_method()");
	}
	
	{
		System.out.println("init block ::  LifeCycleHook.enclosing_method()");
	}
	public void initialization()
	{
		System.out.println("LifeCycleHook.initialization()");
		
	}
	public void cleanUp()
	{
		System.out.println("LifeCycleHook.cleanUP()");
	}
	
    public LifeCycleHook()
    {
	System.out.println("LifeCycleHook.LifeCycleHook()");
     }
	

}
