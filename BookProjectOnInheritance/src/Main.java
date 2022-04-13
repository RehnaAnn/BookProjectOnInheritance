
public class Main {
	public static void main(String[] args) {
		
		Book java=new Book(12122, "Intro Java");
		Book cSharp=new Book(67687, "Intro c#, Sushil");

		PaperBook python= new PaperBook(65576765,"intro python", "Tomss", 200, 2.5f);
		PaperBook nodejs=new PaperBook(688633, "Intro to Node.js", 500, 1.2f);
		
		//long isbn, String title, String link, float fileSize
		EBook angular=new EBook(76687, "intro angular", "angular.dci", 23.4f);
		//long isbn, String title, String author, String link, float filesize
		EBook react=new EBook(4354355, "intro to react", "react.dci.com", 25.5f);

		System.out.println(java.generateID());
		System.out.println(python.generateID());	
		System.out.println(angular.generateID());	

	}

}
