package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 원소들의 곱과 합
 * 난이도: 🤍 Level 0
 * 유형: 배열 / 누적 곱 / 누적 합 / 조건문
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181929
 */

public class ElementProductSum {

    public int solution(int[] num_list) {
        int product = 1;
        int sum = 0;

        for(int i = 0; i < num_list.length; i++) {
            product *= num_list[i];
            sum += num_list[i];
        }

        return product < (sum * sum) ? 1 : 0;
    }

    public static void main(String[] args) {
        ElementProductSum eps = new ElementProductSum();

        System.out.println(eps.solution(new int[]{3, 4, 5, 2, 1})); // 1
        System.out.println(eps.solution(new int[]{5, 7, 8, 3}));    // 0
    }
}

