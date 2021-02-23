package Library;

public class Books extends Item implements ReadableItem {

	private int isbn;
	private int copiesInStock;

	public Books(String name, int id, int loanTime, int isbn, int copiesInStock) {
		super(name, id);
		this.isbn = isbn;
		this.copiesInStock = copiesInStock;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getcopiesInStock() {
		return copiesInStock;
	}

	public void setcopiesInStock(int copiesInStock) {
		this.copiesInStock = copiesInStock;
	}

	@Override
	public int calculateLoanTime() {
		return copiesInStock * 3;
	}

	@Override
	public void canRead() {
		System.out.println("You can read books.");

	}

}
