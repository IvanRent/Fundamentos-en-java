package org.test.upperclas;

public class X {

private int a;
private float b;
 static X c;

public X (int a, float b)
{
	this.a=a;
	this.b=b;
	c=this;
	
}
public static X obtenerX()
{
	return new X(1,2.3);
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
