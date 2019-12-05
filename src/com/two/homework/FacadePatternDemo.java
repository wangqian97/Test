package com.two.homework;

public class FacadePatternDemo {

	public static void main(String[] args) {
		ShapeMaker shapeMaker =new ShapeMaker();
		shapeMaker.drawApple();
		shapeMaker.drawBanana();
		shapeMaker.drawOrangle();//实现接口。

	}

}
