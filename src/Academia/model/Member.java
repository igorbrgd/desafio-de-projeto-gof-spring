package Academia.model;


public abstract class Member {
    private String name;
    private String membershipId;

    public Member(String name, String membershipId) {
        this.name = name;
        this.membershipId = membershipId;
    }

    public String getName() {
        return name;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public abstract void accessGym();
}
