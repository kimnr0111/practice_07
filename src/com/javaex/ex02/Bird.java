package com.javaex.ex02;

public abstract class Bird {
    private String name;
    
    public abstract void sing();
    
    public abstract void fly();

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
	
	public abstract void showName();
	
	


    


}
