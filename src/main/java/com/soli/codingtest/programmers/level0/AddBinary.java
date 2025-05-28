package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 이진수 더하기
 * 난이도: 🤍 Level 0
 * 유형: 문자열 / 진법 변환 / 구현
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120885
 */

public class AddBinary {

    public String solution(String bin1, String bin2) {
        String sum = Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));

        return sum;
    }

    public static void main(String[] args) {
        AddBinary ab = new AddBinary();

        System.out.println(ab.solution("10", "11")); // 101
        System.out.println(ab.solution("1001", "1111")); // 11000
    }
}

