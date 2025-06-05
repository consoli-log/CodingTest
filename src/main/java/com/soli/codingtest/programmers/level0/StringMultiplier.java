package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 문자열 곱하기
 * 난이도: 🤍 Level 0
 * 유형: 문자열 / 반복 출력 / 문자열 곱셈
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181940
 */

public class StringMultiplier {

    public String solution(String my_string, int k) {
        String answer = "";

        for (int i = 0; i < k; i++) {
            answer += my_string;
        }

        return answer;

        // return my_string.repeat(k);
    }

    public static void main(String[] args) {
        StringMultiplier sm = new StringMultiplier();

        System.out.println(sm.solution("string", 3)); // stringstringstring
        System.out.println(sm.solution("love", 10));   // lovelovelovelovelovelovelovelovelovelove
    }
}


