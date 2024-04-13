package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    /** option + enter
     *
     * @param member
     * @param price
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
