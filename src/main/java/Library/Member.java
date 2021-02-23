package Library;

public class Member {
	private String forename;
	private String surname;
	private int age;
	private int membershipDuration;
	private int memberId;

	public Member() {
	}

	public Member(String forename, String surname) {
		this.forename = forename;
		this.surname = surname;
	}

	public Member(String forename, String surname, int age, int membershipDuration, int memberId) {
		this.forename = forename;
		this.surname = surname;
		this.age = age;
		this.memberId = memberId;
	}

	public String getForename() {
		return forename;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	public int getMembershipDuration() {
		return membershipDuration;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMembershipDuration(int membershipDuration) {
		this.membershipDuration = membershipDuration;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
}
