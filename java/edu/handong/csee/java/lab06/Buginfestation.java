package edu.handong.csee.java.lab06; //package name
import java.util.Scanner; //import standard input from keyboard

/**
 * This class defines Buginfestation object.<br>
 * class Buginfestation has computeNumOfBugsToUseKiller() method.<br>
 * computeNumOfBugsToUseKiller method calculates totalBugVolume and countWeek by the time totalBugVolume bigger than houseVolume.<br>
 * Also, it prints startPopulation,  houseVolume, countWeeks, population, and totalBugVolume.<br>
 * 
 * @author YJW
 * 
 */

public class Buginfestation { //declares class, name is Buginfestation
	
	final double GROWTH_RATE = 0.95; //declare instance variable=> growth rate
	final double ONE_BUG_VOLUME = 0.002; //eclare instance variable=> first bug volume
	
	public static void main(String[] args) { //public static void main! method declaration. we use methods here
		
		Buginfestation myCesco = new Buginfestation(); // instantiate Class Buginfestation to myCesco.
		myCesco.computeNumOfBugsToUseKiller(); //method computeNumofBugsToUseKiller() of myCesco call
	}
	public void computeNumOfBugsToUseKiller() { // public void omputeNumOfBugsToUseKiller method declaration
		Scanner keepWork =new Scanner(System.in); // instantiate Class Scanner to keyboard(input)
		double houseVolume = keepWork.nextDouble(); //bouseVolume is input(double type) from keyboard
		double startPopulation = keepWork.nextDouble(); //startPopulation is input(double type) from keyboard
		
		double population = startPopulation; //declare local variable population and initialization
		double totalBugVolume = population * ONE_BUG_VOLUME; //declare local variable totalBugVolume and initialization
		//ctrl+스페이스바(tip)
		
		int countWeeks = 0; //declare local variable countWeeks and initialization
		
		while(totalBugVolume < houseVolume) { //loop by the time totalBugVolume is larger than houseVolume
			double newBugs = population * GROWTH_RATE;
			double newBugVolume = newBugs * ONE_BUG_VOLUME;
			population = population + newBugs;
			totalBugVolume = population * ONE_BUG_VOLUME;
			countWeeks = countWeeks + 1;
		}
		
		System.out.println("startPop=" + startPopulation);
		System.out.println("houseVol=" + houseVolume);
		System.out.println("countWeek=" +countWeeks);
		System.out.println("pop=" + (int)population);
		System.out.println("total bug vol=" + (int)totalBugVolume);
		}
}
