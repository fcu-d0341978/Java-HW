import java.util.Scanner;
import java.text.DecimalFormat;

public class HW1_1 {
	 public static void main(String[] args) {
	        int quan1, quan2, quan3;
	        double pr1, pr2, pr3, total1, total2, total3, subt, tax, ftotal;
	        String item1, item2, item3; 
	        Scanner scanner = new Scanner(System.in);
	        DecimalFormat df=new DecimalFormat("#.##");
	        
	        System.out.println("Input quantity of item 1:");
	        quan1 = scanner.nextInt();
	        System.out.println("Input price of item 1:");
	        pr1 = scanner.nextDouble();
	        System.out.println("Input name of item 1:");
	        String junk = scanner.nextLine();
	        item1 = scanner.nextLine();	        
	        
	        
	        System.out.println("Input quantity of item 2:");
	        quan2 = scanner.nextInt();
	        System.out.println("Input price of item 2:");
	        pr2 = scanner.nextDouble();
	        System.out.println("Input name of item 2:");
	        junk = scanner.nextLine();
	        item2 = scanner.nextLine();
	        
	        
	        System.out.println("Input quantity of item 3:");
	        quan3 = scanner.nextInt();
	        System.out.println("Input price of item 3:");
	        pr3 = scanner.nextDouble();
	        System.out.println("Input name of item 3:");
	        junk = scanner.nextLine();
	        item3 = scanner.nextLine();	        
	        
	        
	        total1 = quan1*pr1;
	        total2 = quan2*pr2;
	        total3 = quan3*pr3;
	        subt = total1 + total2 + total3;
	        tax = subt * 0.0625;
	        ftotal = subt + tax;
	        		
	        System.out.println("Your bill:");
	        System.out.println("Item                 Quantity   Price      Total");
	        System.out.printf("%-20s %-10d %-10.2f %-10.2f \n", item1, quan1, pr1, total1);
	        System.out.printf("%-20s %-10d %-10.2f %-10.2f \n", item2, quan2, pr2, total2);
	        System.out.printf("%-20s %-10d %-10.2f %-10.2f \n", item3, quan3, pr3, total3);
	        System.out.println("Subtotal: " + "                                 " + df.format(subt));
	        System.out.println("6.25% sales tax:" + "                           " + df.format(tax));
	        System.out.println("Total:" + "                                     " + df.format(ftotal));
	       
	    
}
}