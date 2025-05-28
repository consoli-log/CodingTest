package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 치킨 쿠폰
 * 난이도: 🤍 Level 0
 * 유형: 수학 / 구현 / 재귀 없이 반복 처리
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120884
 */

public class ChickenCoupon {

    public int solution(int chicken) {
        int service = 0;
        int coupon = chicken;

//        while (coupon >= 10) {
//            service += coupon / 10;
//            coupon = (coupon / 10) + (coupon % 10);
//            System.out.println("service = " + service);
//            System.out.println("coupon = " + coupon);
//        }

        while (coupon >= 10) {
            int bonus = coupon / 10;
            service += bonus;
            coupon = (coupon % 10) + bonus;
            System.out.println("bonus = " + bonus);
            System.out.println("service = " + service);
            System.out.println("coupon = " + coupon);
        }

        return service;
    }

    public static void main(String[] args) {
        ChickenCoupon cc = new ChickenCoupon();
        System.out.println(cc.solution(100)); // 11
        System.out.println(cc.solution(1081)); // 120
    }
}

