package com.soli.codingtest.programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 프로그래머스 - 콜라츠 수열 만들기
 * 난이도: 🤍 Level 0
 * 유형: 구현 / 수학 / 반복문
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181919
 */

public class CollatzSequence {

    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(n);

        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            answer.add(n);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        CollatzSequence cs = new CollatzSequence();

        System.out.println(Arrays.toString(cs.solution(10)));  // [10, 5, 16, 8, 4, 2, 1]
    }
}

