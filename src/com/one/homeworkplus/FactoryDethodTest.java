package com.one.homeworkplus;

public class FactoryDethodTest {

	public static void main(String[] args) {
		AnimalFactory animalFactory=new CatFactory();//多态的使用,父类的引用指向子类的对象
		Animal animal=animalFactory.creatAnimal();
		animal.eat();
		animal.play();
		animal.sleep();
        /*具体实现：
		猫要吃饭~~~~
		猫要玩耍~~~~
		猫要睡觉~~~~
        */
	}

}
