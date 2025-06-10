package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
       // AppConfig appConfig = new AppConfig();
        //MemberService memberService = appConfig.memberService();
       //MemberService memberService = new MemberServiceImpl();

        //AppConfig의 환경설정 파일을 @Bean이라 적힌 곳에 스프링 빈 컨테이너에 넣어서 다 관리한다.
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class); //메서드 이름인 memberService 객체를 찾기 위한것, 두번째는 타입적는거임

        Member member = new Member(1L,"memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findByMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());

    }
}
