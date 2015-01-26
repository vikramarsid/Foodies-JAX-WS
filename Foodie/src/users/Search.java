package users;


public class Search {

	private int id;
	private String searchName;
	private String searchAddress;
	private String searchReview;
	private String searchRating;
	private String city;
	
	
	public Search(String searchName, String city)
	{
		this.searchName = searchName;
		this.city = city;
	}
	
	public Search() {
		// TODO Auto-generated constructor stub
	}

	public int getSearchId() {
		return id;
	}
	public void setSearchId(int id) {
		this.id = id;
	}
	public String getSearchName() {
		return searchName;
	}
	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}
	public String getSearchAddress() {
		return searchAddress;
	}
	public void setSearchAddress(String searchAddress) {
		this.searchAddress = searchAddress;
	}
	public String getSearchReview() {
		return searchReview;
	}
	public void setSearchReview(String searchReview) {
		this.searchReview = searchReview;
	}
	public String getSearchRating() {
		return searchRating;
	}
	public void setSearchRating(String searchRating) {
		this.searchRating = searchRating;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}

