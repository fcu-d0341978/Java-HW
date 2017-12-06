
public class HW1 {
	 public static void main(String[] args) {
		   String first = "patrick";
	       String last = "yang";
	       first = first.substring(1, 7);
	       last = last.substring(1, 4);
	       first = first.toUpperCase().charAt(0) + first.substring(1);
	       last = last.toUpperCase().charAt(0) + last.substring(1);
	       System.out.println(first + "pay");
	       System.out.println(last + "yay");
}
}