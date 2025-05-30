package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 문자열 돌리기
 * 난이도: 🤍 Level 0
 * 유형: 문자열 / 반복 출력 / 문자 순회
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181945
 */

import java.util.Scanner;

public class RotateString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            System.out.println((char)str.charAt(i));
        }
    }
}

