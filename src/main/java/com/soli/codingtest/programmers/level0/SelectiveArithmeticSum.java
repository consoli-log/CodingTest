package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 등차수열의 특정한 항만 더하기
 * 난이도: 🤍 Level 0
 * 유형: 수학 / 등차수열 / 조건 누적합
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181931
 */

public class SelectiveArithmeticSum {

    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for(int i = 0; i < included.length; i++) {
            if(included[i]) {
                answer += a;
//                answer += a + (d * i);
            }
            a += d;
        }

        return answer;
//        return IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum();
    }

    public static void main(String[] args) {
        SelectiveArithmeticSum sas = new SelectiveArithmeticSum();

        System.out.println(sas.solution(3, 4, new boolean[]{true, false, false, true, true})); // 37
        System.out.println(sas.solution(7, 1, new boolean[]{false, false, false, true, false, false, false})); // 10
    }
}

