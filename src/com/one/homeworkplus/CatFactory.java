package com.one.homeworkplus;

public class CatFactory implements AnimalFactory {

	@Override
	public Animal creatAnimal() {
		
		return Cat.getCat();
	}//具体的动物工厂,生产狗对象的工厂.实现AnimalFactory接口
    
}
