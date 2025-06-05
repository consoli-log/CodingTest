package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 문자 리스트를 문자열로 변환하기
 * 난이도: 🤍 Level 0
 * 유형: 문자 배열 / 문자열 변환 / 반복 처리
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181941
 */

public class CharArrayToString {

    public String solution(String[] arr) {
        return String.join("", arr);
    }

    public static void main(String[] args) {
        CharArrayToString cats = new CharArrayToString();

        System.out.println(cats.solution(new String[]{"a", "b", "c"})); // abc
    }
}

