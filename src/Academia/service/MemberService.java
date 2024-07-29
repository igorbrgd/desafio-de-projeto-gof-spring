package Academia.service;

@Service
public class MemberService {
    private final Map<String, MemberFactory> memberFactories;

    @Autowired
    public MemberService(List<MemberFactory> factories) {
        memberFactories = new HashMap<>();
        memberFactories.put("student", factories.get(0));
        memberFactories.put("teacher", factories.get(1));
    }

    public Member registerMember(String type, String name, String membershipId) {
        MemberFactory factory = memberFactories.get(type.toLowerCase());
        if (factory == null) {
            throw new IllegalArgumentException("Unknown member type: " + type);
        }
        return factory.createMember(name, membershipId);
    }
}
