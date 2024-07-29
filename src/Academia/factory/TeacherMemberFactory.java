package Academia.factory;

@Component
public class TeacherMemberFactory extends MemberFactory {
    @Override
    public Member createMember(String name, String membershipId) {
        return new TeacherMember(name, membershipId);
    }
}