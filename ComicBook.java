package OnlainMagazin;

public class ComicBook extends Book {
	private String colour;
	
	public ComicBook(double regularPrice,
						String publisher,
						int yearPublished,
						String colour) {
		super(regularPrice, publisher, yearPublished);
		setColour(colour);
	}

	public double computeSalePrice(){
        return super.getRegularPrice() * 0.4;
    }
	
	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}
