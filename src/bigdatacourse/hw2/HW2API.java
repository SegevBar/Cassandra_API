package bigdatacourse.hw2;

public interface HW2API {

	// connects to AstraDB
	public void connect(String pathAstraDBBundleFile, String username, String password, String keyspace);
	
	// close the connection to AstraDB
	public void close();
	
	// create database tables;
	public void createTables();
	
	// initialize the prepared statements 
	public void initialize();
	
	// loads the items in the file into the db
	public void loadItems(String pathItemsFile) throws Exception;
	
	// loads the reviews into the db
	public void loadReviews(String pathReviewsFile) throws Exception;
	
	// prints the item's details  
	public void item(String asin);

	// prints the user's reviews in a descending order (latest review is printed first)
	public void userReviews(String reviewerID);
	
	// prints the items's reviews in a descending order (latest review is printed first)
	public void itemReviews(String asin);
}
