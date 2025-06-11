package com.soli.codingtest.programmers.level0;

import java.util.Arrays;

/**
 * 프로그래머스 - 마지막 두 원소
 * 난이도: 🤍 Level 0
 * 유형: 배열 / 조건문 / 리스트 확장
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181927
 */

public class LastTwoElements {

    public int[] solution(int[] num_list) {
        int[] arr = new int[num_list.length + 1];

        int last = num_list[num_list.length - 1];
        int prev = num_list[num_list.length - 2];
        int newValue = last > prev ? last - prev : last * 2;

        for (int i = 0; i < num_list.length; i++) {
            arr[i] = num_list[i];
        }
            arr[num_list.length] = newValue;

        return arr;
    }

    public static void main(String[] args) {
        LastTwoElements lte = new LastTwoElements();

        System.out.println(Arrays.toString(lte.solution(new int[]{2, 1, 6}))); // [2, 1, 6, 5]
        System.out.println(Arrays.toString(lte.solution(new int[]{5, 2, 1, 7, 5}))); // [5, 2, 1, 7, 5, 10]
    }
}

