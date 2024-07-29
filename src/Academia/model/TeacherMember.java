package Academia.model;

public class TeacherMember extends Member {
    public TeacherMember(String name, String membershipId) {
        super(name, membershipId);
    }

    @Override
    public void accessGym() {
        System.out.println("Teacher member " + getName() + " with ID " + getMembershipId() + " is accessing the gym.");
    }
}