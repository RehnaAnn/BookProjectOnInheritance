
public class EBook extends Book {
	private String link;
	private float filesize;

	public EBook(long isbn, String title, String link, float fileSize) {
		super(isbn, title);
		this.filesize = filesize;
		this.link = link;
	}

	public EBook(long isbn, String title, String author, String link, float filesize) {
		super(isbn, title, author);
		this.link = link;
		this.filesize = filesize;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public float getFilesize() {
		return filesize;
	}

	public void setFilesize(float filesize) {
		this.filesize = filesize;
	}
	public String eBookProvider() {
		return "Amazon Kindle";
	}
	

}
