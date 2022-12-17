package org.system;

public class Automation extends MultipleLanguage {

	public static void main(String[] args) {

		//Create object for class Multiple Language

		Automation  auto = new Automation();
		auto.java();
		auto.selenium();
		auto.python();
		auto.ruby();
	}

	public void java() {
		System.out.println("Java Language");
	}

	public void selenium() {
		System.out.println("World wide used Automation Tool is Selenium");
	}

	@Override
	public void ruby() {

		System.out.println("Ruby");

	}
}
