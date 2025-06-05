package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - n의 배수
 * 난이도: 🤍 Level 0
 * 유형: 수학 / 배수 계산 / 조건 처리
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181937
 */

public class MultipleOfN {

    public int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        MultipleOfN mon = new MultipleOfN();

        System.out.println(mon.solution(98, 2)); // 1
        System.out.println(mon.solution(34, 3)); // 0
    }
}

