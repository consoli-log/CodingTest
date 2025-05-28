package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - k의 개수
 * 난이도: 🤍 Level 0
 * 유형: 수학 / 문자열 변환 / 반복문
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120887
 */

public class CountK {

    public int solution(int s, int e, int k) {
        int count = 0;
        String[] arr = new String[e - s + 1];

        for (int i = s; i <= e; i++) {
            arr[i - s] =  Integer.toString(i);
        }

        String str = String.join("", arr);
        char[] chr = str.toCharArray();
        String target = Integer.toString(k);

        for (int i = 0; i < chr.length; i++) {
            if (String.valueOf(chr[i]).equals(target)) {
                count++;
            }
        }

        return count;

//        String str = "";
//
//        for(int a = i; a <= j; a++) {
//            str += a + "";
//        }
//
//        return str.length() - str.replace(k + "", "").length();
    }

    public static void main(String[] args) {
        CountK ck = new CountK();

        System.out.println(ck.solution(1, 13, 1)); // 6
        System.out.println(ck.solution(10, 50, 5)); // 5
        System.out.println(ck.solution(3, 10, 2)); // 0
    }
}

