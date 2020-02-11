/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */
package main;

import fruit.Avocado;

public class Main {

	public static void main(String[] args) {
		// Declare and instantiate a fruit called avocajoe
		//Fruit avocajoe = new Fruit();  // Cannot instantiate an abstract class
										//Be able to explain why we have abstract classes
		//Declare and instantiate an AvoCado named avocajoe
		Avocado avocajoe = new Avocado(42,500);
		System.out.println(avocajoe.toString());
 
	}
}
