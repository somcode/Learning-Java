package Package1;

public class ClassTemplate {
	int day = 1;
	public int week = 7;
	protected int month = 31;
	private int year = 365;
	
	public int printWeek() {
		return day + week + month + year;	
	}

}
