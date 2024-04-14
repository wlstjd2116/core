package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderSerivce;
import hello.core.order.OrderServiceImpl;

public class Appconfig {

    // 생성자 주입
    public MemberService memberService() {
        return new MemberServiceImpl(MemberRepository());
    }

    private static MemberRepository MemberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderSerivce orderSerivce() {
        return new OrderServiceImpl(MemberRepository(), discountPolicy());
    }

    // 할인 정책이 변경되었을 때, 아래의 클래스만 변경해주면 된다.
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

}
