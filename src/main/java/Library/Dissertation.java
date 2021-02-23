package Library;

public class Dissertation extends Item implements ReadableItem {

	private String subject;
	private int demandRating;

	public Dissertation(String name, int id, String subject, int demandRating) {
		super(name, id);
		this.subject = subject;
		this.demandRating = demandRating;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int demandRating() {
		return demandRating;
	}

	public void demandRating(int demandRating) {
		this.demandRating = demandRating;
	}

	@Override
	public int calculateLoanTime() {
		return demandRating * 2;
	}

	@Override
	public void canRead() {
		System.out.println("You can read dissertatiosn");

	}

}
