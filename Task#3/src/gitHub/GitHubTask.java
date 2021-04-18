package gitHub;
import java.util.Scanner;
public class GitHubTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no. of minutes");
	int minutes=sc.nextInt();
	int years = minutes / 525600;
	int days = (minutes / 60 / 24 ) % 365;
	
	
	System.out.println( years + "years " + "  " + days + "days " );
	}

}

