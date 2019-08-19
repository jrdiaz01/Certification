package com.mecsoft.certification.oca.chapter01;

public class Primitives {
	
	private byte byteValue;
	
	private short shortValue;
	
	private int intValue;
	
	private long longValue;
	
	private float floatValue;
	
	private double doubleValue;
	
	private char charValue;
	
	private boolean booleanValue;
	
	private String alfa;
	
	{
		System.out.println("bloque de instancia");
	}
	
	static {
		System.out.println("bloque estatico");  
	}
	
	public Primitives(){
		
		System.out.println("Este es el constructor");
		
	}
	
	public static void main (String args[]){
	       	Primitives p = new Primitives();
	       	p.showValues();
	       	System.out.println('\u0000');
	       	System.out.println("############");
	       	Primitives p1 = new Primitives();
	       	p.maxValue();
	       	
	}
	
	public void showValues (){
		
		System.out.println("byte :"+ byteValue);
		System.out.println("short :"+ shortValue);
		System.out.println("int :"+ intValue);
		System.out.println("long :"+ longValue);
		System.out.println("float :"+ floatValue);
		System.out.println("double :"+ doubleValue);
		System.out.println("char :"+ charValue);
		System.out.println("boolean :"+ booleanValue);
		System.out.println("String :"+ alfa);
	}
	
	public void maxValue (){
		
		System.out.println("byte :"+Byte.MAX_VALUE+" "+Byte.MIN_VALUE);
		System.out.println("short :"+ Short.MAX_VALUE+" "+Short.MIN_VALUE);
		System.out.println("int :"+ Integer.MAX_VALUE+" "+Integer.MIN_VALUE);
		System.out.println("long :"+ Long.MAX_VALUE+" "+Long.MIN_VALUE);
		System.out.println("float :"+ Float.MAX_VALUE+" "+Long.MIN_VALUE);
		System.out.println("double :"+ Double.MAX_VALUE+" "+Double.MIN_VALUE);
		System.out.println("char :"+ Character.MAX_VALUE+" "+Character.MIN_VALUE);
		
		
	}
}
