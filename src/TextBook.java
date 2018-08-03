
public class TextBook extends Book {
	private Boolean intersting;
	private int shelfLife;

	public Boolean getIntersting() {
		return intersting;
	}

	public void setIntersting(Boolean intersting) {
		this.intersting = intersting;
	}
	
	public int computeShelfLife(String title) {
		return shelfLife*2;
	}
}
