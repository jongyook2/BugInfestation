package edu.handong.csee.java.lab06;
import java.util.Scanner;

/**
 * This class defines Buginfestation object.<br>
 * class Buginfestation has computeNumOfBugsToUseKiller() method.<br>
 * computeNumOfBugsToUseKiller method calculates totalBugVolume and countWeek by the time totalBugVolume bigger than houseVolume.<br>
 * Also, it prints startPopulation,  houseVolume, countWeeks, population, and totalBugVolume.<br>
 * 
 * @author YJW
 * 
 */

public class Buginfestation {
	
	final double GROWTH_RATE = 0.95;
	final double ONE_BUG_VOLUME = 0.002;
	
	public static void main(String[] args) {
		
		Buginfestation myCesco = new Buginfestation();
		myCesco.computeNumOfBugsToUseKiller();
	}
	public void computeNumOfBugsToUseKiller() {
		Scanner keepWork =new Scanner(System.in);
		double houseVolume = keepWork.nextDouble();
		double startPopulation = keepWork.nextDouble();
		
		double population = startPopulation;
		double totalBugVolume = population * ONE_BUG_VOLUME;//ctrl+스페이스바
		
		int countWeeks = 0;
		
		while(totalBugVolume < houseVolume) {
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
