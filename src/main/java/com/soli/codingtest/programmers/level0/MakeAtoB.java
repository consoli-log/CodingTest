package com.soli.codingtest.programmers.level0;

import java.util.Arrays;

/**
 * 프로그래머스 - A로 B 만들기
 * 난이도: 🤍 Level 0
 * 유형: 문자열 / 정렬 / 비교
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120886
 */

public class MakeAtoB {

    public int solution(String before, String after) {
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        for (int i = 0; i < beforeArr.length; i++) {
            if (beforeArr[i] != afterArr[i]) {
                return 0;
            }
        }

        return 1;
        // return new String(beforeArr).equals(new String(afterArr)) ? 1 :0;
    }

    public static void main(String[] args) {
        MakeAtoB mab = new MakeAtoB();

        System.out.println(mab.solution("olleh", "hello")); // 1
        System.out.println(mab.solution("allpe", "apple")); // 0
    }
}

