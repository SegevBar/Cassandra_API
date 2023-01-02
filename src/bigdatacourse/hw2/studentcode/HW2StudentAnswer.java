package bigdatacourse.hw2.studentcode;

import java.nio.file.Paths;
import java.time.Instant;
import java.util.Arrays;
import java.util.TreeSet;

import com.datastax.oss.driver.api.core.CqlSession;

import bigdatacourse.hw2.HW2API;

public class HW2StudentAnswer implements HW2API{
	
	// general consts
	public static final String		NOT_AVAILABLE_VALUE 	=		"na";

	// CQL stuff
	//TODO: add here create table and query designs 
	
	// cassandra session
	private CqlSession session;
	
	// prepared statements
	//TODO: add here prepared statements variables
	
	
	@Override
	public void connect(String pathAstraDBBundleFile, String username, String password, String keyspace) {
		if (session != null) {
			System.out.println("ERROR - cassandra is already connected");
			return;
		}
		
		System.out.println("Initializing connection to Cassandra...");
		
		this.session = CqlSession.builder()
				.withCloudSecureConnectBundle(Paths.get(pathAstraDBBundleFile))
				.withAuthCredentials(username, password)
				.withKeyspace(keyspace)
				.build();
		
		System.out.println("Initializing connection to Cassandra... Done");
	}


	@Override
	public void close() {
		if (session == null) {
			System.out.println("Cassandra connection is already closed");
			return;
		}
		
		System.out.println("Closing Cassandra connection...");
		session.close();
		System.out.println("Closing Cassandra connection... Done");
	}

	
	
	@Override
	public void createTables() {
		//TODO: implement this function
		System.out.println("TODO: implement this function...");
	}

	@Override
	public void initialize() {
		//TODO: implement this function
		System.out.println("TODO: implement this function...");
	}

	@Override
	public void loadItems(String pathItemsFile) throws Exception {
		//TODO: implement this function
		System.out.println("TODO: implement this function...");
	}

	@Override
	public void loadReviews(String pathReviewsFile) throws Exception {
		//TODO: implement this function
		System.out.println("TODO: implement this function...");
	}

	@Override
	public void item(String asin) {
		//TODO: implement this function
		System.out.println("TODO: implement this function...");
		
		// required format - example for asin B005QB09TU
		System.out.println("asin: " 		+ "B005QB09TU");
		System.out.println("title: " 		+ "Circa Action Method Notebook");
		System.out.println("image: " 		+ "http://ecx.images-amazon.com/images/I/41ZxT4Opx3L._SY300_.jpg");
		System.out.println("categories: " 	+ new TreeSet<String>(Arrays.asList("Notebooks & Writing Pads", "Office & School Supplies", "Office Products", "Paper")));
		System.out.println("description: " 	+ "Circa + Behance = Productivity. The minute-to-minute flexibility of Circa note-taking meets the organizational power of the Action Method by Behance. The result is enhanced productivity, so you'll formulate strategies and achieve objectives even more efficiently with this Circa notebook and project planner. Read Steve's blog on the Behance/Levenger partnership Customize with your logo. Corporate pricing available. Please call 800-357-9991.");;
		
		// required format - if the asin does not exists return this value
		System.out.println("not exists");
	}
	
	
	@Override
	public void userReviews(String reviewerID) {
		// the order of the reviews should be by the time (desc), then by the asin
		//TODO: implement this function
		System.out.println("TODO: implement this function...");
		
		
		// required format - example for reviewerID A17OJCRPMYWXWV
		System.out.println(	
				"time: " 			+ Instant.ofEpochSecond(1362614400) + 
				", asin: " 			+ "B005QDG2AI" 	+
				", reviewerID: " 	+ "A17OJCRPMYWXWV" 	+
				", reviewerName: " 	+ "Old Flour Child"	+
				", rating: " 		+ 5 	+ 
				", summary: " 		+ "excellent quality"	+
				", reviewText: " 	+ "These cartridges are excellent .  I purchased them for the office where I work and they perform  like a dream.  They are a fraction of the price of the brand name cartridges.  I will order them again!");

		System.out.println(	
				"time: " 			+ Instant.ofEpochSecond(1360108800) + 
				", asin: " 			+ "B003I89O6W" 	+
				", reviewerID: " 	+ "A17OJCRPMYWXWV" 	+
				", reviewerName: " 	+ "Old Flour Child"	+
				", rating: " 		+ 5 	+ 
				", summary: " 		+ "Checkbook Cover"	+
				", reviewText: " 	+ "Purchased this for the owner of a small automotive repair business I work for.  The old one was being held together with duct tape.  When I saw this one on Amazon (where I look for almost everything first) and looked at the price, I knew this was the one.  Really nice and very sturdy.");

		System.out.println("total reviews: " + 2);
	}

	@Override
	public void itemReviews(String asin) {
		// the order of the reviews should be by the time (desc), then by the reviewerID
		//TODO: implement this function
		System.out.println("TODO: implement this function...");
		
		
		// required format - example for asin B005QDQXGQ
		System.out.println(	
				"time: " 			+ Instant.ofEpochSecond(1391299200) + 
				", asin: " 			+ "B005QDQXGQ" 	+
				", reviewerID: " 	+ "A1I5J5RUJ5JB4B" 	+
				", reviewerName: " 	+ "T. Taylor \"jediwife3\""	+
				", rating: " 		+ 5 	+ 
				", summary: " 		+ "Play and Learn"	+
				", reviewText: " 	+ "The kids had a great time doing hot potato and then having to answer a question if they got stuck with the &#34;potato&#34;. The younger kids all just sat around turnin it to read it.");

		System.out.println(	
				"time: " 			+ Instant.ofEpochSecond(1390694400) + 
				", asin: " 			+ "B005QDQXGQ" 	+
				", reviewerID: " 	+ "AF2CSZ8IP8IPU" 	+
				", reviewerName: " 	+ "Corey Valentine \"sue\""	+
				", rating: " 		+ 1 	+ 
				", summary: " 		+ "Not good"	+
				", reviewText: " 	+ "This Was not worth 8 dollars would not recommend to others to buy for kids at that price do not buy");

		System.out.println(	
				"time: "			+ Instant.ofEpochSecond(1388275200) + 
				", asin: " 			+ "B005QDQXGQ" 	+
				", reviewerID: " 	+ "A27W10NHSXI625" 	+
				", reviewerName: " 	+ "Beth"	+
				", rating: " 		+ 2 	+ 
				", summary: " 		+ "Way overpriced for a beach ball"	+
				", reviewText: " 	+ "It was my own fault, I guess, for not thoroughly reading the description, but this is just a blow-up beach ball.  For that, I think it was very overpriced.  I thought at least I was getting one of those pre-inflated kickball-type balls that you find in the giant bins in the chain stores.  This did have a page of instructions for a few different games kids can play.  Still, I think kids know what to do when handed a ball, and there's a lot less you can do with a beach ball than a regular kickball, anyway.");

		System.out.println("total reviews: " + 3);
	}


}
