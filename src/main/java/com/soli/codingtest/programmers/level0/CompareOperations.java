package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 두 수의 연산값 비교하기
 * 난이도: 🤍 Level 0
 * 유형: 문자열 변환 / 정수 연산 / 형 변환 / 비교
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181938
 */

public class CompareOperations {

    public int solution(int a, int b) {
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        // int ab = Integer.parseInt(a + "" + b);

        return ab >= (2 * a * b) ? ab : (2 * a * b);

        // return Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)),2*a*b);
    }

    public static void main(String[] args) {
        CompareOperations co = new CompareOperations();

        System.out.println(co.solution(2, 91)); // 364
        System.out.println(co.solution(91, 2)); // 912
    }
}

