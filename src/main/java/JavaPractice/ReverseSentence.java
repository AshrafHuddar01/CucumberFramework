package JavaPractice;

public class ReverseSentence {

	public static void main(String[] args) {

		String s1 = "I am Software Tester";
		String s3 = "";
		String s4 = "";
		String s5 = "";

		String[] s2 = s1.split(" ");

		for (int i = s2.length - 1; i >= 0; i--) {

			if (s2[i].equals("Software") || s2[i].equals("Tester") || s2[i].equals("am") || s2[i].equals("I")) {
				s3 = s2[i];
               s4 = "";
				for (int j = s3.length() - 1; j >= 0; j--) {

					s4 = s4 + s3.charAt(j);

				}

				s5 = s5 + s4.toUpperCase() + " ";
			}
		}

		System.out.println(s5);

	}

}
