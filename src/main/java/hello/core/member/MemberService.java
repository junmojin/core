package hello.core.member;

public interface MemberService {
    //MemberService : 회원 서비스 인터페이스
    void join(Member member);

    Member findByMember(Long memberId);
}
