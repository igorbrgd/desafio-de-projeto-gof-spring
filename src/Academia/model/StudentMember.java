package Academia.model;

public class StudentMember extends Member {
    public StudentMember(String name, String membershipId) {
        super(name, membershipId);
    }

    @Override
    public void accessGym() {
        System.out.println("Student member " + getName() + " with ID " + getMembershipId() + " is accessing the gym.");
    }
}