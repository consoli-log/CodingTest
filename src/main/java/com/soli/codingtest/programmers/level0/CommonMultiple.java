package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 공배수
 * 난이도: 🤍 Level 0
 * 유형: 수학 / 배수 / 조건문
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181936
 */

public class CommonMultiple {

    public int solution(int number, int n, int m) {
        return (number % n == 0) && (number % m == 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        CommonMultiple cm = new CommonMultiple();

        System.out.println(cm.solution(60, 2, 3)); // 1
        System.out.println(cm.solution(55, 10, 5)); // 0
    }
}

