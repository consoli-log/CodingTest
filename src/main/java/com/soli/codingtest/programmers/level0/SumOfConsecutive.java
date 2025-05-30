package com.soli.codingtest.programmers.level0;

import java.util.Arrays;

/**
 * 프로그래머스 - 연속된 수의 합
 * 난이도: 🤍 Level 0
 * 유형: 수학 / 등차수열 / 규칙 구현
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120923
 */

public class SumOfConsecutive {

    public int[] solution(int num, int total) {
        int[] arr = new int[num];
        int start = (total - (num * (num - 1) / 2)) / num;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = start;
            start++;
        }

        return arr;
    }

    public static void main(String[] args) {
        SumOfConsecutive sc = new SumOfConsecutive();

        System.out.println(Arrays.toString(sc.solution(3, 12))); // [3, 4, 5]
        System.out.println(Arrays.toString(sc.solution(5, 15))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(sc.solution(4, 14))); // [2, 3, 4, 5]
        System.out.println(Arrays.toString(sc.solution(5, 5))); // [-1, 0, 1, 2, 3]
    }
}

