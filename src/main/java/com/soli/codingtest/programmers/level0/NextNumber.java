package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 다음에 올 숫자
 * 난이도: 🤍 Level 0
 * 유형: 수학 / 수열 규칙 / 등차수열 또는 등비수열
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120924
 */

public class NextNumber {

    public int solution(int[] common) {
        if (common[1] - common[0] == common[2] - common[1]) { // 등차수열
            return common[common.length - 1] + (common[1] - common[0]);
        } else { // 등비수열
            return common[common.length - 1] * (common[1] / common[0]);
        }
    }

    public static void main(String[] args) {
        NextNumber nn = new NextNumber();

        System.out.println(nn.solution(new int[]{1, 2, 3, 4}));  // 5
        System.out.println(nn.solution(new int[]{2, 4, 8}));     // 16
        System.out.println(nn.solution(new int[]{-1, 2, -4}));   // 8
        System.out.println(nn.solution(new int[]{7, 14, 28}));   // 56
    }
}

