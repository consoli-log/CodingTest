package com.soli.codingtest.programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 프로그래머스 - 카운트 업
 * 난이도: 🤍 Level 0
 * 유형: 구현 / 반복문 / 배열 생성
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181920
 */

public class CountUp {

    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = start_num; i <= end_num; i++) {
            answer.add(i);
        }

        return answer.stream().mapToInt(i -> i).toArray();

//        return IntStream.rangeClosed(start, end).toArray();
    }

    public static void main(String[] args) {
        CountUp cu = new CountUp();

        System.out.println(Arrays.toString(cu.solution(3, 10)));  // [3, 4, 5, 6, 7, 8, 9, 10]
    }
}

