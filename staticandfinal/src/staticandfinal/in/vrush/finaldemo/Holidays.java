package staticandfinal.in.vrush.finaldemo;

public final class Holidays {
	final String FESTIVAL;
	final int NOOFLEAVES;
		
	public Holidays(String FESTIVAL, int NOOFLEAVES) {
		this.FESTIVAL = FESTIVAL;
		this.NOOFLEAVES = NOOFLEAVES;
	}
	
	public final String getFestival() {
		return FESTIVAL;
	}
	
	public int getNoOfLeaves() {
		return NOOFLEAVES;
	}
	
	@Override
	public String toString() {
		return "Festival: " + FESTIVAL + ", No of Holidays: " + NOOFLEAVES;
	}
}