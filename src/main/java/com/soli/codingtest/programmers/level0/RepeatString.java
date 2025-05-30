package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 문자열 반복해서 출력하기
 * 난이도: 🤍 Level 0
 * 유형: 문자열 처리 / 반복 출력 / Scanner
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181950
 */

import java.util.Scanner;

public class RepeatString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        System.out.println(str.repeat(n));  // abc 3 → abcabcabc
    }
}

