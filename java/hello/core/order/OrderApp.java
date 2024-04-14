package hello.core.order;

import hello.core.Appconfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class OrderApp {

    public static void main(String[] args) {

        Appconfig appconfig = new Appconfig();
        MemberService memberService = appconfig.memberService();
        OrderSerivce orderSerivce = appconfig.orderSerivce();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderSerivce.createOrder(memberId, "itemA", 20000);

        System.out.println("order = " +order);
        System.out.println("order.calculatePrice = " +order.calculatePrice());

    }
}
