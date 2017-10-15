
public class HW1_2 {
	public static void main(String[] args) {
	double ContainSweet = 0.001 ;
	double Mweight = 0.1; //kg
	double Fweight = 100; 
	double SweetkillMouse = 0.00002;
	double SweetkillFriend = (SweetkillMouse / Mweight) * Fweight; //how many can a mouse consume
	double sodapop = SweetkillFriend / ContainSweet;
	
	System.out.println( sodapop + " can is most soda pop my friend can drink." ) ;
}
}