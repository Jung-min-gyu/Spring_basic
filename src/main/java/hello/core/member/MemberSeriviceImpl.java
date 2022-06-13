package hello.core.member;

public class MemberSeriviceImpl implements MemberService{

    private MemberRepository memberRepository;

    public MemberSeriviceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
