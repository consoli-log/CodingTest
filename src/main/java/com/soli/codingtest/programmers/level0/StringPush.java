package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 문자열 밀기
 * 난이도: 🤍 Level 0
 * 유형: 문자열 / 시뮬레이션 / 반복 처리
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120921
 */

public class StringPush {

    public int solution(String A, String B) {
        int count = 0;

        if (!A.equals(B)) {
            for (int i = 0; i < A.length(); i++) {
                A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);

                if (A.equals(B)) {
                    count = i + 1;
                    break;
                } else {
                    count = -1;
                }
            }
        }
        return count;

//        return (B+B).indexOf(A);

    }

    public static void main(String[] args) {
        StringPush sp = new StringPush();

        System.out.println(sp.solution("hello", "ohell")); // 1
        System.out.println(sp.solution("apple", "elppa")); // -1
        System.out.println(sp.solution("atat", "tata")); // 1
        System.out.println(sp.solution("abc", "abc")); // 0
    }
}

