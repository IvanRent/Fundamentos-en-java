package org.test.upperclas;

import javax.print.attribute.standard.MediaSize.Other;

public class OtherClass {

	/**
	 * @param args
	 */
	public String anAttribute = "attribute1";
	public OtherClass()
	{
		
	}
	public static void main(String[] args) {
		OtherClass sample=( OtherClass)new OtherClass();
		System.out.println(sample.anAttribute);
		
	}
	class Other  extends OtherClass
	{
		public String anAttribute = "attribute2";
	}

}
