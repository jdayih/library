package Library;

public class MediaResources extends Item {

	private String itemSpecificiation;
	private int yearOfManufacture;

	public MediaResources(String name, int id, String itemSpecificiation, int yearOfManufacture) {
		super(name, id);
		this.itemSpecificiation = itemSpecificiation;
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getItemSpecificiation() {
		return itemSpecificiation;
	}

	public void setItemSpecificiation(String itemSpecificiation) {
		this.itemSpecificiation = itemSpecificiation;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	@Override
	public int calculateLoanTime() {
		return yearOfManufacture / 100;
	}
}
