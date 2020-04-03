package _06_for_loop_gauntlet;

public class For_loopz {
public static void main(String[] args) {
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}
	for (int i = 100; i >= 0; i--) {
		System.out.println(i);
	}
	for (int i = 0; i <= 100; i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	for (int i = 0; i < 100; i++) {
		if(i%2==1)	{
			System.out.println(i);
		}
	}
	for (int i = 1; i < 501; i++) {
		if(i%2==0)	{
			System.out.println(i+" even");
		}
		else	{
			System.out.println(i+" odd");
		}
	}
	
}
}
