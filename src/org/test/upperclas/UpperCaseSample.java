package org.test.upperclas;

public class UpperCaseSample {
 public String myString;
 public UpperCaseSample()
 {
	 
 }
 public static void main(String[] args) {
	UpperCaseSample sample = new UpperCaseSample();
	sample.myString.toUpperCase();
	System.out.println(sample.myString);
}
}
