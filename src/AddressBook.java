import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> addressbook;
	
	public AddressBook() {
		addressbook = new ArrayList<BuddyInfo>();
	}
	
	public BuddyInfo removeBuddy(int index) {
		return this.addressbook.remove(index);
	}
	
	public void addBuddy(BuddyInfo buddyinfo) {
		addressbook.add(buddyinfo);
	}
	
	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "1234");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
	}

}
