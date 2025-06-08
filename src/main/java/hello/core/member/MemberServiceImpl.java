package hello.core.member;

public class MemberServiceImpl implements MemberService {
    //MemberServiceImpl : 회원 서비스 구현체(회원가입, 회원조회 기능)

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findByMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
