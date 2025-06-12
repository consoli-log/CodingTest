package com.soli.codingtest.programmers.level0;

import java.util.Arrays;

/**
 * 프로그래머스 - 수열과 구간 쿼리 2
 * 난이도: 🤍 Level 0
 * 유형: 배열 / 구간 탐색 / 조건 필터링 / 최소값
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181923
 */

public class IntervalQuery2 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int max = -1;

            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2] && (max == -1 || arr[j] < max)) {
                    max = arr[j];
                }
            }
            ans[i] = max;
        }

//        Arrays.fill(ans, -1);
//
//        for (int idx = 0; idx < queries.length; idx++) {
//            int[] query = queries[idx];
//            int s = query[0], e = query[1], k = query[2];
//
//            for (int i = s; i <= e; i++) {
//                if (k < arr[i]) {
//                    ans[idx] = ans[idx] == -1 ? arr[i] : Math.min(ans[idx], arr[i]);
//                }
//            }
//
//        }

        return ans;
    }

    public static void main(String[] args) {
        IntervalQuery2 iq = new IntervalQuery2();

        System.out.println(Arrays.toString(iq.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}}))); // [3, 4, -1]
    }
}

