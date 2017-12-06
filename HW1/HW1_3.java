
public class HW1_3 {
	public static void main(String[] args) {
		String str = "I love love you";
		
		System.out.println("The line of text to be changed is:");
		System.out.println(str);
		System.out.println("The line of text changed into:");
		System.out.println(str.replaceFirst("love", "hate"));

}
}