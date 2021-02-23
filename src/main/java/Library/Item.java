package Library;

public class Item {
	private String name;
	private int id;
	boolean checkedIn;

	public Item(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public boolean getCheckedIn() {
		return checkedIn;
	}

	public int calculateLoanTime() {
		// TODO Auto-generated method stub
		return 0;
	}

}
