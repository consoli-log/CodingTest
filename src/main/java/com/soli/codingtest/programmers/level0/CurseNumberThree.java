package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 저주의 숫자 3
 * 난이도: 🤍 Level 0
 * 유형: 구현
 * 날짜: 2025-05-25
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120871
 */

public class CurseNumberThree {

    public int solution(int n) {
        int answer = 0;
        int count = 0;

        while (count < n) {
            answer++;

            if (answer % 3 == 0 || Integer.toString(answer).contains("3")) {
                continue;
            }
            count++;
        }

        return answer;
    }

    public static void main(String[] args) {
        CurseNumberThree cnt = new CurseNumberThree();

        System.out.println("n 1: " + cnt.solution(15)); // 25
        System.out.println("n 2: " + cnt.solution(40)); // 76
    }

}