package Academia.controller;

@RestController
@RequestMapping("/members")
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/register")
    public ResponseEntity<Member> registerMember(@RequestParam String type, @RequestParam String name, @RequestParam String membershipId) {
        Member member = memberService.registerMember(type, name, membershipId);
        return new ResponseEntity<>(member, HttpStatus.CREATED);
    }
}

