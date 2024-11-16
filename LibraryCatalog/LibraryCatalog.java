public class LibraryCatalog {
	public static void main(String[] args) {

		Novel book1 = new Novel();
		book1.name = "Enigma Otiliei";
		book1.numberOfPages = 496;
		book1.type = "literary realism";

		Novel book2 = new Novel();
		book2.name = "Legendele Olimpului";
		book2.numberOfPages = 568;
		book2.type = "greek mythology";

		Album book3 = new Album();
		book3.name = "Great Paintings";
		book3.numberOfPages = 256;
		book3.paperQuality = "High-quality glossy paper";

		book2 = null;

		System.out.println("book 1 is: " + book1);
		System.out.println("book 2 is: " + book2);
		System.out.println("book 3 is: " + book3);
	}
}