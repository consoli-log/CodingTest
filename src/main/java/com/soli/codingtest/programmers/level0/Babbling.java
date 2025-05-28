package com.soli.codingtest.programmers.level0;

import java.util.Arrays;

/**
 * 프로그래머스 - 옹알이 (1)
 * 난이도: 🤍 Level 0
 * 유형: 문자열 / 구현
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120956
 */
public class Babbling {

    public int solution(String[] babbling) {
        int count = 0;

        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("aya","1");
            babbling[i] = babbling[i].replaceAll("ye","2");
            babbling[i] = babbling[i].replaceAll("woo","3");
            babbling[i] = babbling[i].replaceAll("ma","4");
        }

        for (int i = 0; i < babbling.length; i++) {
            if (babbling[i].matches("[+-]?\\d*(\\.\\d+)?")) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Babbling b = new Babbling();
        String[] input1 = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] input2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        System.out.println(b.solution(input1)); // 1
        System.out.println(b.solution(input2)); // 3
    }
}

