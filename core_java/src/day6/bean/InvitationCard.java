package day6.bean;

public class InvitationCard {
	private String name;
	private int memberCount;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMemberCount() {
		return memberCount;
	}
	public void setMemberCount(int memberCount) {
		this.memberCount = memberCount;
	}

	public InvitationCard() {
		
	}
	public InvitationCard(String name, int memberCount) {
		super();
		this.name = name;
		this.memberCount = memberCount;
	}
	@Override
	public String toString() {
		return "InvitationCard [name=" + name + ", memberCount=" + memberCount + "]";
	}

}
