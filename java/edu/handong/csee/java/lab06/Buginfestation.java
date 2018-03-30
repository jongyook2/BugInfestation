package edu.handong.csee.java.lab06; //package name
import java.util.Scanner; //import standard input from keyboard

/**
 * This class defines Buginfestation object.<br>
 * class Buginfestation has main method and computeNumOfBugsToUseKiller() method.<br>
 * main method implements computeNumOfBugsToUseKiller() method.
 * computeNumOfBugsToUseKiller method calculates totalBugVolume and countWeek by the time totalBugVolume bigger than houseVolume.<br>
 * Also, it prints startPopulation,  houseVolume, countWeeks, population, and totalBugVolume.<br>
 * 
 * @author YJW <br>
 * 
 */
	public class Buginfestation { //declares class, name is Buginfestation
	
		final double GROWTH_RATE = 0.95; //declare instance variable=> growth rate (constant)
		final double ONE_BUG_VOLUME = 0.002; //declare instance variable=> first bug volume (constant)
/**
 * This method defines main <br>
 * Instantiate computerNumOfBugsToUseKiller to myCesco (class) <br>
 * implements myCesco.computeNumOfBugsToUseKiller() <br>
 * @param args
 */
	
	public static void main(String[] args) { //public static void main! method declaration. we use methods here
		
		Buginfestation myCesco = new Buginfestation(); // instantiate Class Buginfestation to myCesco.
		myCesco.computeNumOfBugsToUseKiller(); //method computeNumofBugsToUseKiller() of myCesco call
	}

	/**
	 * This method is computeNumOfBugsToUseKiller()
	 * computeNumOfBugsToUseKiller method calculates totalBugVolume and countWeek by the time totalBugVolume bigger than houseVolume.<br>
	 * Also, it prints startPopulation,  houseVolume, countWeeks, population, and totalBugVolume.<br>
	 */
	public void computeNumOfBugsToUseKiller() { // public void omputeNumOfBugsToUseKiller method declaration
		Scanner keepWork =new Scanner(System.in); // instantiate Class Scanner to keyboard(input)
		System.out.print("Enter the total volume of your house in cubic feet: "); //output(Enter the total volume of your house in cubic feet:) is shown in your monitor
		double houseVolume = keepWork.nextDouble(); //bouseVolume is input(double type) from keyboard
		System.out.print("Enter the estimated number of raches in your house: "); //output(Enter the estimated number of raches in your house:) is shown in your monitor
		double startPopulation = keepWork.nextDouble(); //startPopulation is input(double type) from keyboard
		
		double population = startPopulation; //declare local variable population and initialization to startPopulation
		double totalBugVolume = population * ONE_BUG_VOLUME; //declare local variable totalBugVolume and initialization to population * ONE_BUG_VOLUME
		//ctrl+스페이스바(tip)
		
		int countWeeks = 0; //declare local variable countWeeks and initialization to 0
		
		while(totalBugVolume < houseVolume) { //loop by the time totalBugVolume is larger than houseVolume
			double newBugs = population * GROWTH_RATE; //initiate local varible newBugs and initialization to population * GROWTH_RATE
			double newBugVolume = newBugs * ONE_BUG_VOLUME; //initiate local varible newBugsVolume and initialization to newBugs * ONE_BUG_VOLUME
			population = population + newBugs; //add newBugs to current population
			totalBugVolume = totalBugVolume + newBugVolume; //add newBugVolume to current totalBugVolume
			countWeeks = countWeeks + 1; //countWeeks increases by 1
		}
		
		System.out.println("Strating with a roach population of " + (int)startPopulation); //output(Strating with a roach population of startPopulation(value)) is shown in your monitor
		System.out.println("and a house with a Volume of " + houseVolume+" cubic feet."); //output(and a house with a Volume of houseVolume(value)) is shown in your monitor
		System.out.println("after " +countWeeks+" weeks"); //output(after countWeeks(value) weeks) is shown in your monitor
		System.out.println("the house will be filed with " + (int)population+ " roaches"); //output(the house will be filed with population(value)) is shown in your monitor
		System.out.println("They will fill a volume of " + (int)totalBugVolume+ " cubic feet."); //output(They will fill a volume of totalBugVolume(value)) is shown in your monitor
		System.out.println("Better call Debugging Experts Inc."); //output(Better call Debugging Experts Inc.) is shown in your monitor
		}
}
