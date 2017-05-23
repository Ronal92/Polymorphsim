package com.jinwoo;

public class PolyMain {
	public static void main(String[] args){
		Shape shape1 = new Triangle();
		shape1.draw();
		
		Shape shape2 = new Rectangle();
		shape2.draw();
	}
	
	
}


interface Shape{	
	
	public void draw();
	
}









class Triangle implements Shape{
	int x = 15;
	int y = 20;
	int z = 35;
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.printf("x=%d y=%d z=%d\n",x,y,z);
	}
	
}

class Rectangle implements Shape{
	int x = 20;
	int y = 8;
	int z = 17;
	int w = 37;
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.printf("x=%d y=%d z=%d w=%d\n",x,y,z,w);
	}
		
}