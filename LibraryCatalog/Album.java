public class Album extends Book {
	public String paperQuality;

	@Override
	public String toString() {
		return "Album{" +
				"name='" + name + '\'' + ", " +
				"number of pages='" + numberOfPages + '\'' + ", " +
				"paper quality='" + paperQuality + '\'' +
				'}';
	}
}