package org.test.upperclas;

public class ChangeValue {
	public ChangeValue(){
		
	}
	public void ChangeValue(Integer value)
	{
	Integer	MyValue = new Integer(2);
	}
	 public static void main(String[] params)
	 {
		ChangeValue sample = new ChangeValue();
		Integer myValue = Integer.valueOf(params[0]);
		Sample1.changeValue(myValue);
		System.out.println(myValue.intValue());
	 }
}