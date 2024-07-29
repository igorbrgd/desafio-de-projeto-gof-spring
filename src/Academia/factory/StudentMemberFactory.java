package Academia.factory;

@Component
public class StudentMemberFactory extends MemberFactory {
    @Override
    public Member createMember(String name, String membershipId) {
        return new StudentMember(name, membershipId);
    }
}