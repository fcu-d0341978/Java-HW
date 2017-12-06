import java.util.Scanner;

public class HW2_2 {
	 public static void main(String[] args) {
	        String pro1, pro2, pro3;
	        double sc1, sc2, sc3, totals1, totals2, totals3, ftotal, ftotals;
	        double percent;
	        
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Name of excercise 1:");          
	        pro1 = scanner.nextLine();	
	        do {
	        System.out.println("Score receive for excercise 1:");
	        sc1 = scanner.nextDouble();
	        System.out.println("Total score possible for excercise 1:");
	        totals1 = scanner.nextDouble();
	        }while(sc1 > totals1);
	        String junk = scanner.nextLine(); 
	        
	        System.out.println("Name of excercise 2:");
	        pro2 = scanner.nextLine();
	        do {
	        System.out.println("Score receive for excercise 2:");
	        sc2 = scanner.nextDouble();
	        System.out.println("Total score possible for excercise 1: 2:");
	        totals2 = scanner.nextDouble();
	        }while(sc2 > totals2);
	        junk = scanner.nextLine();
	         
	        System.out.println("Name of excercise 3:");
	        pro3 = scanner.nextLine();
	        do {
	        System.out.println("Score receive for excercise 3:");
	        sc3 = scanner.nextDouble();
	        System.out.println("Total score possible for excercise 1: 3:");
	        totals3 = scanner.nextDouble();
	        }while(sc2 > totals2);
	        
	        ftotal = sc1 + sc2 + sc3;
	        ftotals = totals1 + totals2 + totals3;
	        percent = (ftotal / ftotals) * 100 ;
	        
	        System.out.println("Excercise            Score      Total Possible");
	        System.out.printf("%-20s %-10.0f %-10.0f  \n", pro1, sc1, totals1);
	        System.out.printf("%-20s %-10.0f %-10.0f  \n", pro2, sc2, totals2);
	        System.out.printf("%-20s %-10.0f %-10.0f  \n", pro3, sc3, totals3);
	        System.out.printf("Total:               %-10.0f %.0f         \n", ftotal, ftotals);
	        System.out.printf("Your total is %.0f out of %.0f , or %.2f %%", ftotal, ftotals, percent);
}
}