package users;

public class Item {

	private int id;
	private String itemName;
	private String itemBanner;
	private String itemAddress;
	private String itemReview;
	private String itemRating;
	private String city;
	
	
	public Item(int id, String itemName, String itemBanner, String itemAddress, String itemReview, String itemRating, String city)
	{
		this.id = id;
		this.itemName = itemName;
		this.itemBanner = itemBanner;
		this.itemAddress = itemAddress;
		this.itemReview = itemReview;
		this.itemRating = itemRating;
		this.city = city;
	}
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public int getItemId() {
		return id;
	}
	public void setItemId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemBanner() {
		return itemBanner;
	}
	public void setItemBanner(String itemBanner) {
		this.itemBanner = itemBanner;
	}
	public String getItemAddress() {
		return itemAddress;
	}
	public void setItemAddress(String itemAddress) {
		this.itemAddress = itemAddress;
	}
	public String getItemReview() {
		return itemReview;
	}
	public void setItemReview(String itemReview) {
		this.itemReview = itemReview;
	}
	public String getItemRating() {
		return itemRating;
	}
	public void setItemRating(String itemRating) {
		this.itemRating = itemRating;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
