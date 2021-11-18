package prac;

public class APIResponseParser {

	/**
	 * Parses the input text and returns a Book instance containing the parsed data.
	 * 
	 * @param response text to be parsed
	 * @return Book instance containing parsed data
	 */
	public static Book parse(String response) {
		Book book = new Book();
		String endRule = "</title>";

		String startRule = "<title>";
		String title = parse(response, startRule, endRule);
		book.setTitle(title);
		int year=parse1(response,"<original_publication_year type=\"integer\">","</original_publication_year>");
		book.setPublicationYear(year);
		// Your code
		return book;
	}

	// write overloaded parse method with the 3 parameters response, startRule,
	// endRule
	public static String parse(String res, String start, String end) {
		String res1= res.replaceAll("<", " ");
		res1=res1.replaceAll(">", " ");
		String[] temp = res1.split(" ");
		boolean bool = false;
		for (String i : temp) {
			if (bool) {
				return i;
			}
			if (start.equals("<"+i+">")) {
				bool = true;
			}
			if (end.contains("<"+i+">")) {
				bool = false;
			}
		}
		return "no match";

	}
	public static int parse1(String res, String start, String end) {
		String res1= res.replaceAll("<", " ");
		res1=res1.replaceAll(">", " ");
		String[] temp = res1.split(" ");
		boolean bool = false;
		for (String i : temp) {
			if (bool) {
				return Integer.valueOf(i);
			}
			if (start.equals("<"+i+">")) {
				bool = true;
			}
			if (end.contains("<"+i+">")) {
				bool = false;
			}
		}
		return 0;

	}
	public static void main(String[] args) {
		String response = "<work>" + "<id type=\"integer\">2361393</id>"
				+ "<books_count type=\"integer\">813</books_count>"
				+ "<ratings_count type=\"integer\">1,16,315</ratings_count>"
				+ "<text_reviews_count type=\"integer\">3439</text_reviews_count>"
				+ "<original_publication_year type=\"integer\">1854</original_publication_year>"
				+ "<original_publication_month type=\"integer\" nil=\"true\"/>"
				+ "<original_publication_day type=\"integer\" nil=\"true\"/>" + "<average_rating>3.79</average_rating>"
				+ "<best_book type=\"Book\">" + "<id type=\"integer\">16902</id>" + "<title>Walden</title>" + "<author>"
				+ "<id type=\"integer\">10264</id>" + "<name>Henry David Thoreau</name>" + "</author>" + "<image_url>"
				+ "http://images.gr-assets.com/books/1465675526m/16902.jpg" + "</image_url>" + "<small_image_url>"
				+ "http://images.gr-assets.com/books/1465675526s/16902.jpg" + "</small_image_url>" + "</best_book>"
				+ "</work>";

		Book b = APIResponseParser.parse(response);
		System.out.println(b.getTitle());
		System.out.println(b.getPublicationYear());
//		String[] temp = response.split(" ");
//		for (String i : temp) {
//			System.out.println(i);
//		}
		System.out.print("<title>".contains("title"));
	}
}
