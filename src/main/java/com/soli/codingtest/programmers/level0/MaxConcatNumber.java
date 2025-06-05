package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 더 크게 합치기
 * 난이도: 🤍 Level 0
 * 유형: 문자열 변환 / 숫자 비교 / 형 변환
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181939
 */

public class MaxConcatNumber {

    public int solution(int a, int b) {
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int ba = Integer.parseInt(String.valueOf(b) + String.valueOf(a));

        if (ab >= ba) {
            return ab;
        } else {
            return ba;
        }
        // return ab >= ba ? ab : ba;

        // return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
    }

    public static void main(String[] args) {
        MaxConcatNumber mcn = new MaxConcatNumber();

        System.out.println(mcn.solution(9, 91));   // 991
        System.out.println(mcn.solution(89, 8));   // 898
    }
}

