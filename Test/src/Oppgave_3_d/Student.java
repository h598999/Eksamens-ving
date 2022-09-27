package Oppgave_3_d;

public class Student {

	private int studNr;
	private String namn;
	
	public Student(int studNr, String namn) {
		
		this.studNr = studNr;
		this.namn = namn;
	}
	
	@Override
	public boolean equals(Object b) {
		Student c = (Student) b;
		if (c.getStudNr()==studNr&&c.getNamn().equals(namn)) {
			return true;
		} else
			return false;
	}

	public int getStudNr() {
		return studNr;
	}

	public void setStudNr(int studNr) {
		this.studNr = studNr;
	}

	public String getNamn() {
		return namn;
	}

	public void setNamn(String namn) {
		this.namn = namn;
	}
	
	
}
