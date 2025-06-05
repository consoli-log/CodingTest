package com.soli.codingtest.programmers.level0;

import java.util.Arrays;

/**
 * 프로그래머스 - 문자열 섞기
 * 난이도: 🤍 Level 0
 * 유형: 문자열 / 반복문 / 인덱스 조작
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181942
 */

public class MixStrings {

    public String solution(String str1, String str2) {
        char[] charArr = new char[str1.length() + str2.length()];

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        for (int i = 0; i < arr1.length; i++) {
            charArr[i * 2] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            charArr[i * 2 + 1] = arr2[i];
        }

        return new String(charArr);

        // for(int i = 0; i < str1.length(); i++) {
        //            answer += "" + str1.charAt(i) + str2.charAt(i);
        //        }
    }

    public static void main(String[] args) {
        MixStrings ms = new MixStrings();

        System.out.println(ms.solution("aaaaa", "bbbbb")); // ababababab
    }
}
