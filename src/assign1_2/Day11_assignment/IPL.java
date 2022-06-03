package Day11_assignment;
import java.util.Scanner ;

public class IPL {

	static void homeTeamStadium(Stadium stadium) {
		
		switch (stadium){
		case EDEN_GARDENS_STADIUM :
			System.out.println("This is home ground of KKR");
			break ;
		case WANKHEDE_STADIUM :
			System.out.println("This is home ground of Mumbai Indians");
			break ;
		case CHIDAMBARAM_STADIUM:
			System.out.println("This is home ground of CSK");
			break ;
		case M_CHINNASWAMY_STADIUM:
			System.out.println("This is home ground of RCB");
			break ;
		default :
		System.out.println("Enter valid Stadium");
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter stadium Name");
		String stadium = input.next();
		 Stadium st =Stadium.valueOf(stadium);
		homeTeamStadium(st) ;
		
//		System.out.println(te);
	}
}
