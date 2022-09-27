package Oppgave_3_d;

public class main {

	public static void main(String[] args) {
		Student a = new Student(10, "Ole");
		Student b = new Student(10,"Ole");
		
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

	}

}
