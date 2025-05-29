package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 종이 자르기
 * 난이도: 🤍 Level 0
 * 유형: 수학 / 규칙 찾기 / 구현
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120922
 */

public class CutPaper {

    public int solution(int M, int N) {
        return M * N - 1;
    }

    public static void main(String[] args) {
        CutPaper cp = new CutPaper();

        System.out.println(cp.solution(2, 2)); // 3
        System.out.println(cp.solution(2, 5)); // 9
        System.out.println(cp.solution(1, 1)); // 0
    }
}

