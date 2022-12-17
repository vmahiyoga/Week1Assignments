package org.system;

public abstract class MultipleLanguage implements Language, TestTool{
	
	public void python()
	{
		System.out.println("Programming Language: Python");
	}
	
	//Create an unimplemented method 
	
	public abstract void ruby();

}
