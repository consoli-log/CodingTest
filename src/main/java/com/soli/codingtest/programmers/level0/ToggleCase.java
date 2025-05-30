package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 대소문자 바꿔서 출력하기
 * 난이도: 🤍 Level 0
 * 유형: 문자열 / 대소문자 변환 / 반복 처리
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181949
 */

import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }

        System.out.println(sb.toString());  // aBc → AbC
    }
}

