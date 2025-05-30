package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 덧셈식 출력하기
 * 난이도: 🤍 Level 0
 * 유형: 입력 / 형식 문자열 출력 / 산술 연산
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181947
 */

import java.util.Scanner;

public class PrintSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b)); // a + b = 결과
    }
}
