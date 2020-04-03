package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Skill_prac {
public static void main(String[] args) {
	String dimes=JOptionPane.showInputDialog("How many dimes do you have?");
	int dims=Integer.parseInt(dimes)*10;
	JOptionPane.showMessageDialog(null, "you have " + dims + " cents");
	String height=JOptionPane.showInputDialog("How tall are you in inches?");
	int hit=Integer.parseInt(height);
	if(hit<=36) {
		JOptionPane.showMessageDialog(null, "eat ur wheaties");
	}
	for (int i = 0; i < 31; i++) {
		if(i%3==0)	{
			System.out.println(i);
		}
	}
	Random ran=new Random();
	 int randomInt = ran.nextInt(20);
	System.out.println(randomInt);
	Random ron=new Random();
	 int randomnt = ron.nextInt(10);
	System.out.println(randomnt);
	JOptionPane.showMessageDialog(null, randomInt-randomnt);
	String city=JOptionPane.showInputDialog("What city do you live in?");
	city=city.toUpperCase();
	if(city.equals("San diego"))	{
		JOptionPane.showMessageDialog(null, "You live in America's finest city");
	}
	else	{
		JOptionPane.showMessageDialog(null, "Move to San Diego");
	}
	String cars=JOptionPane.showInputDialog("How many cars do you have?");
	int carrs=Integer.parseInt(cars);
	if(carrs==0)	{
		JOptionPane.showMessageDialog(null, "I bet you use public transportation");
	}
	else if(carrs==1)	{
		JOptionPane.showMessageDialog(null, "________________________________________\r\n" + 
				"		          / 						          \\\r\n" + 
				"                                 |  						[]         |\r\n" + 
				"	 _______________________________________________________________\r\n" + 
				"	|										         |\r\n" + 
				"	|     										         |\r\n" + 
				"	|										         |\r\n" + 
				"	________________________________________________________________\r\n" + 
				"		0									0");
	}
	else	{
		JOptionPane.showMessageDialog(null, "Your cars have " + 4*carrs + " wheels on them");
	}
	String skool=JOptionPane.showInputDialog("What school do you go to?");
	JOptionPane.showMessageDialog(null, skool +" is a fantastic school");
}
}