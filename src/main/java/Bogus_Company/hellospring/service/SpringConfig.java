package Bogus_Company.hellospring.service;

import Bogus_Company.hellospring.reposirory.MemberRepository;
import Bogus_Company.hellospring.reposirory.MemoryMemberRepository;
import Bogus_Company.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
