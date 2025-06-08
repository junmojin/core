package hello.core.member;

public interface MemberService {
    //MemberService : 회원가입,회원조회
    void join(Member member);

    Member findByMember(Long memberId);
}
