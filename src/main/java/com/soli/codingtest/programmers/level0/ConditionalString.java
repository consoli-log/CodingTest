package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 조건 문자열
 * 난이도: 🤍 Level 0
 * 유형: 조건문 / 문자열 비교 / 논리 판단
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181934
 */

public class ConditionalString {

    public int solution(String ineq, String eq, int n, int m) {
        String condition = ineq + eq;

        switch (condition) {
            case ">=": return n >= m ? 1 : 0;
            case ">!": return n > m ? 1 : 0;
            case "<=": return n <= m ? 1 : 0;
            case "<!": return n < m ? 1 : 0;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        ConditionalString cs = new ConditionalString();

        System.out.println(cs.solution(">", "=", 20, 50));  // 0
        System.out.println(cs.solution("<", "!", 41, 78));  // 1
    }
}

