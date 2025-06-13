package com.soli.codingtest.programmers.level0;

import java.util.Arrays;

/**
 * 프로그래머스 - 수열과 구간 쿼리 4
 * 난이도: 🤍 Level 0
 * 유형: 배열 / 구간 순회 / 조건 분기 / 반복 처리
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181922
 */

public class IntervalQuery4 {

    public int[] solution(int[] arr, int[][] queries) {
        for (int idx = 0; idx < queries.length; idx++) {
            int[] query = queries[idx];
            int s = query[0], e = query[1], k = query[2];

            for (int i = s; i <= e; i++) {
                if(i % k == 0) {
                    arr[i]++;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        IntervalQuery4 iq = new IntervalQuery4();

        System.out.println(Arrays.toString(iq.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 1}, {0, 3, 2}, {0, 3, 3}}))); // [3, 2, 4, 6, 4]
    }
}

