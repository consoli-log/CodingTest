package com.soli.codingtest.programmers.level0;

import java.util.Arrays;

/**
 * 프로그래머스 - 등수 매기기
 * 난이도: 🤍 Level 0
 * 유형: 정렬
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120882
 */

public class RankAssignment {

    public int[] solution(int[][] score) {
        int n = score.length;

        // [총합, 원래 인덱스, 등수] 형태의 배열 생성
        int[][] avg = new int[n][3];

        // 1. 총합 + 원래 인덱스 저장
        for (int i = 0; i < n; i++) {
            avg[i][0] = score[i][0] + score[i][1]; // 총합
            avg[i][1] = i;                         // 원래 인덱스
        }

        // 2. 총합 기준 내림차순 정렬
        Arrays.sort(avg, (a, b) -> Integer.compare(b[0], a[0]));

        // 3. 등수 매기기 (동점자 동일 등수 처리)
        int rank = 1;
        avg[0][2] = rank;

        for (int i = 1; i < n; i++) {
            if (avg[i][0] == avg[i - 1][0]) {
                avg[i][2] = avg[i - 1][2]; // 동점 → 같은 등수
            } else {
                avg[i][2] = i + 1; // 인덱스 기준 등수
            }
        }

        // 4. 원래 인덱스 순서로 결과 복원
        int[] result = new int[n];
        for (int[] row : avg) {
            int originalIndex = row[1];
            int rankValue = row[2];
            result[originalIndex] = rankValue;
        }

        return result;

        /*
        int[][] avg = new int[score.length][2];

        // 1. 평균 구하기
        for (int i = 0; i < score.length; i++) {
            avg[i][0] = score[i][0] + score[i][1]; // 총합 (정수 비교하므로 평균 안 나눠도 됨)
        }

        // 2. 등수 매기기
        for (int i = 0; i < score.length; i++) {
            int rank = 1;
            for (int j = 0; j < score.length; j++) {
                if (avg[j][0] > avg[i][0]) {
                    rank++;
                }
            }
            avg[i][1] = rank;
        }

        // 3. 결과만 따로 추출
        int[] result = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            result[i] = avg[i][1];
        }

        return result;
        */
    }

    public static void main(String[] args) {
        RankAssignment ra = new RankAssignment();

        System.out.println(Arrays.toString(ra.solution(new int[][] {{80, 70}, {90, 50}, {40, 70}, {50, 80}}))); // [1, 2, 4, 3]
        System.out.println(Arrays.toString(ra.solution(new int[][] {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}}))); // [4, 4, 6, 2, 2, 1, 7]
    }

}

