package cn.edu.jxnu.design.decorator;

public class ConcreteComponent implements Component {

	@Override
	public void methodA() {
		System.out.println("被装饰类，实现了抽象组件的功能");
	}

}