package _05_snowflake;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;


public class Snowflake {
	
	public static void main(String[] args) {

		// #1. Make a new Robot
		Robot yee=new Robot();

		// #2. Set your robot’s position to x=300 and y=300
		yee.moveTo(300, 300);

		// #3. Put the robot's pen down
		yee.penDown();

		// #4. Set the robot’s speed to 5
		yee.setSpeed(5);

		// #5. use a for loop below to do everything ( #6, #7, #8, #9, #12, #13, #14 ) 6 times (use i as the counter)
		for (int i = 0; i < 120389; i++) {
			yee.setPenColor(0,0,0);
			yee.move(50);
			yee.turn(50);
			if(i%2==1)	{
				yee.setPenColor(255, 0, 0);
			}
			else	{
				yee.setPenColor(0, 0, 255);
			}
		}
			
			// #6. Set the pen color to black

			
			// #7. move the robot by 50

			
			// #8. turn the robot to the right by 60
			
			
			// #12. set the pen color to blue for even numbers of i

			
			// #13. set the pen color to red for all odd numbers of i
			
			
			// #9. Use a for loop to do everything (#10, #11) 6 times ( use j as a counter )
			
			
					// #10. turn the robot to the left by 60
		
					
					// #11. move the robot by 50 (play the start button)
					
				
			
			// #14. set the pen color to black
				
		
	}

}
