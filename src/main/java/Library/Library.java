package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Item> items = new ArrayList<>();
	private List<Member> members = new ArrayList<>();
	private int memberCount = 0;
	private int itemCount = 0;

	// method to calculate loan time
	public int calculateLoanTime() {
		int loanTime = 0;
		for (Item item : this.items) {
			loanTime += ((Library) items).calculateLoanTime();
		}
		return loanTime;
	}

	// removes an item from the library
	public boolean removeItemById(int id) {
		final List<Item> itemsToRemove = new ArrayList<>();
		for (Item item : this.items) {
			if (item.getId() == id) {
				itemsToRemove.add(item);
			}
		}
		return this.items.removeAll(itemsToRemove);
	}

	// adds an item to the library
	public boolean addItemToLibrary(Item item) {
		item.setId(itemCount++);
		return this.items.add(item);
	}

	// updates an item in the library

	// checks an item into the library
	public void checkItemIn(int id) {
		for (Item item : this.items) {
			if (item.getId() == id) {
				item.setCheckedIn(true);
			}
		}
	}

	// checks an item out of the library
	public void checkItemOut(int id) {
		for (Item item : this.items) {
			if (item.getId() == id) {
				item.setCheckedIn(false);
			}
		}
	}

	// register person
	public boolean registerPerson(Member member) {
		member.setMemberId(memberCount++);
		return this.members.add(member);
	}

	// delete person
	public boolean removeMemberById(int id) {
		List<Member> membersToRemove = new ArrayList<>();
		for (Member member : this.members) {
			if (member.getMemberId() == id) {
				membersToRemove.add(member);
			}
		}
		return this.members.removeAll(membersToRemove);
	}

	// update person

}
