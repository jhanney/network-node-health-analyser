package Models;

public enum Status {
	OK(0),
	WARN(10),
	ERROR(25);
	
	private final int penalty;

	Status(int penalty) {
		// TODO Auto-generated constructor stub
		this.penalty = penalty;
	}
	
	public int getPenalty() {
		return penalty;}; 
	
	
}
