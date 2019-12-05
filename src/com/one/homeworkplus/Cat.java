package com.one.homeworkplus;

import java.io.Serializable;
         //具体的一个猫对象，继承了抽象类，重写其三个抽象方法
public class Cat extends Animal implements Serializable {
        
	private Cat() {
		//保证有一个猫对象，这里使用了单例模式，方便操作，避免繁琐。
	}
	private static Cat cat=new Cat();   
	public static Cat getCat() {
		return cat;
	}
	@Override
	//重写抽象类Animal中的三个抽象方法。
	public void eat() {
		System.out.println("猫要吃饭~~~~");

	}

	@Override
	public void sleep() {
		System.out.println("猫要睡觉~~~~");

	}

	@Override
	public void play() {
		System.out.println("猫要玩耍~~~~");

	}

}
