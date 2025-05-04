package javapractices;

import TestSample.ExampleOfPackgaes;

public class BuildInClasses {

	public static void main(String[] args) {
		
		
		System.out.println(Math.max(20, 50));
		ExampleOfPackgaes expg = new ExampleOfPackgaes();
		expg.run();
		
		
		GenericUtils gUtils = new GenericUtils();
		gUtils.print();

	}

}
