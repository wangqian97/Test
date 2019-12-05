package com.two.homework;
//总体框架为外观模式，构造三个类为Apple Banana orangle 最后
public class ShapeMaker {
    private Shape apple;
    private Shape orangle;
    private Shape banana;
    public ShapeMaker() {
    	apple = new Apple();
    	orangle= new Orangle();
    	banana= new Banana();
    }
    public void drawApple() {
    	apple.draw();
    }
    public void drawOrangle() {
    	orangle.draw();
    }
    public void drawBanana() {
    	banana.draw();    //这里使用了单例模式。在单例类被加载时实例化一个对象给自己引用
    }
}
