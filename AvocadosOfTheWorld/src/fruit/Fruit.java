/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */

package fruit;
/***
 * An Abstract class upon which we will build fruits
 * @author nicomp
 *
 */
public abstract class Fruit {
	private int weight;
	private float cost;
	/***
	 * Constructor
	 * @param Weight Weight of the fruit
	 * @param Cost Cost of the fruit
	 */
	public Fruit(int Weight, float Cost){
		setWeight(weight);
		setCost(Cost);
	}
	
	/***
	 * Gets the weight or the fruit in pounds
	 * @return The weight in pounds
	 */
	public int getWeight() {
		return weight;
	}
	/***
	 * Sets the weight of the fruit in pounds
	 * @param weight If 0 or below will be ignored
	 */
	public void setWeight(int weight) {
		if (weight<=0) {return;}
		this.weight = weight;
	}

	/***
	 * Gets the cost of the fruit
	 * @return The cost of the fruit
	 */
	public float getCost() {
		return cost;
	}
	/***
	 * Sets the cost of the fruit
	 * @param cost If 0 or below will be ignored
	 */
	public void setCost(float cost) {
		if (cost<=0) {return;}
		this.cost = cost;
	}
	
	/***
	 * Returns the information as a string
	 */
	public String toString() {
		return "Weight: "+weight+", Cost: "+cost;
	}
}
