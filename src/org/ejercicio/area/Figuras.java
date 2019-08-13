package org.ejercicio.area;

public class Figuras {
	public static void main(String[] args) 
    {
        Figuras obj = new Figuras(7);
        System.out.println(obj.tsi(10, '*'));
        System.out.println("N="+ obj.getN());
    }
	private int n;

    public Figuras()
    {
        n=5;
    }
    public Figuras(int n) 
    {
       this.n = n;
    }

    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public String linea(int n, char c)
    {
        String s="";
        
        for (int i = 1; i <= n; i++) 
        {
          s+=c+" ";
        }
        return s;
    }
    
    public String cuadro(int n, char c)
    {
        String s="";
        
        for (int i = 1; i <= n; i++) 
        {
            s+=linea(n,c)+ "\n";
        }
        return s;
    }
    
    public String tsi(int n, char c)
    {
        String s="";
        
        for (int i = 1; i <= n; i++) 
        {
            s+=linea(n+1-i,c)+ "\n";
        }
        return s;
    }
}
