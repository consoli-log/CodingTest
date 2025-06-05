package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - flag에 따라 다른 값 반환하기
 * 난이도: 🤍 Level 0
 * 유형: 조건문 / boolean 분기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181933
 */

public class ConditionalByFlag {

    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }

    public static void main(String[] args) {
        ConditionalByFlag cbf = new ConditionalByFlag();

        System.out.println(cbf.solution(-4, 7, true));   // 3
        System.out.println(cbf.solution(-4, 7, false));  // -11
    }
}
