package hello.core.member;

public interface MemberRepository {
    //MemberRepository : 회원 데이터 저장소(Memory or DB 방식으로)
    void save(Member member);

    Member findById(Long memberId);
}
