package com.soli.codingtest.programmers.level0;

import java.util.Arrays;

/**
 * 프로그래머스 - 수열과 구간 쿼리 3
 * 난이도: 🤍 Level 0
 * 유형: 배열 / 구간 업데이트 / 이중 반복문
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181924
 */

public class IntervalQuery3 {

    public int[] solution(int[] arr, int[][] queries) {
        int temp = 0;

        for (int i = 0; i < queries.length; i++) {
            int from = queries[i][0];
            int to = queries[i][1];

            temp = arr[from];
            arr[from] = arr[to];
            arr[to] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        IntervalQuery3 iq = new IntervalQuery3();

        System.out.println(Arrays.toString(iq.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}}))); // [3, 4, 1, 0, 2]
    }
}

