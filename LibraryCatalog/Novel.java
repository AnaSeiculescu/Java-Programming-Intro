public class Novel extends Book {
	public String type;

	@Override
	public String toString() {
		return "Novel{" +
				"name='" + name + '\'' + ", " +
				"number of pages='" + numberOfPages + '\'' + ", " +
				"type='" + type	+ '\'' +
				'}';
	}
}