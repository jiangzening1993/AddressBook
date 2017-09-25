import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> addressbook;
	
	public AddressBook() {
		addressbook = new ArrayList<BuddyInfo>();
	}
	
	public void removeBuddy(int index) {
		addressbook.remove(index);
	}
	
	public void addBuddy(BuddyInfo bi) {
		addressbook.add(bi);
	}
	
	public static void main(String[] args) {
		System.out.println("AddressBook");
	}

}
