/*
 * CS2261 Project 1 Summer 2021
 * Author: Illia Arzamastsev
 * 
Every school morning Steve is woken up by the sound of his alarm clock. Since he is a bit forgetful, quite often he leaves the alarm on Saturday morning too. That’s not too bad though, since he feels good when he realizes he doesn’t have to get up from his warm and cozy bed.

He likes that so much that he would like to experience that on other days of the week too! His friend Justin offered this simple solution: set his alarm clock 45 minutes early, and he can enjoy the comfort of his bed, fully awake, for 45 minutes each day.

Steve decided to heed Justin’s advice, however Steve’s alarm clock uses 24-hour notation and Steve has issues with adjusting the time. Help Steve and write a program that will take one time stamp, in 24-hour notation, and print out a new time stamp, 45 minutes earlier, also in 24-hour notation.

If you are unfamiliar with 24-hour time notation yourself, you might be interested to know it starts with 0:00 (midnight) and ends with 23:59 (one minute before midnight).

Input
The first and only line of input will contain exactly two integers H and M (0 <= H <= 23, 0 <= M <= 59) separated by a single space, the input time in 24-hour notation. H denotes hours and M minutes. Ensure your program does not terminate if there is bad input and can recover gracefully.
*/


import java.util.Scanner;//import to use Scanner for input

public class AlarmClock {

public static void main(String[] args) {
	int H, M;
	System.out.println("Please, enter hours(0-23) and minutes(0-59):");
	Scanner sc = new Scanner(System.in);
	H = sc.nextInt();
	M = sc.nextInt();
	
	while ((H < 0 || H > 23) || (M < 0 || M > 59))  {
		System.out.println("Wrong input!");
		System.out.println("Please, enter hours (0-23) and minutes (0-59):");
		H = sc.nextInt();
		M = sc.nextInt();
	}
	
	sc.close();
	
	if (M >= 45) {//update minutes if more than 45
		M = M - 45;//add 45 minute, according to project task description
	}
	else {
		if (H == 0) {//special case, 0am
			H = 23;
			M = M + 60 - 45;
		} else {
		M = M + 60 - 45;
		H -= 1;
		}
	}
	
	System.out.print("New alarm set for " + H + " : " + M);
	
}
}