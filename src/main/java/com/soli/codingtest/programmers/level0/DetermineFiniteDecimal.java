package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 유한소수 판별하기
 * 난이도: 🤍 Level 0
 * 유형: 수학
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120878
 */

public class DetermineFiniteDecimal {

    public int solution(int a, int b) {
        int gcd = getGCD(a, b);  // 최대공약수
        b /= gcd;                // 기약분수 만들기

        // 2와 5 제거
        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;

        return b == 1 ? 1 : 2;   // 유한소수면 1, 아니면 2
    }

    private int getGCD(int x, int y) {
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        DetermineFiniteDecimal dfd = new DetermineFiniteDecimal();

        System.out.println(dfd.solution(7, 20)); // 1
        System.out.println(dfd.solution(11, 22)); // 1
        System.out.println(dfd.solution(12, 21)); // 2
    }

}

