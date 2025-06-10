package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 코드 처리하기
 * 난이도: 🤍 Level 0
 * 유형: 문자열 / 시뮬레이션 / 상태 전이
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181932
 */

public class ProcessCode {

    public String solution(String code) {
        int mode = 0;
        String ret = "";

        for (int i = 0; i < code.length(); i++) {

            if (code.charAt(i) == '1') {
                mode = mode == 0? 1 : 0;
            }

            if (mode == 0) {
                if (i % 2 == 0) {
                    ret += code.charAt(i) == '1' ? "" : code.charAt(i);
                }
            } else if (mode == 1) {
                if (i % 2 != 0) {
                    ret += code.charAt(i) == '1' ? "" : code.charAt(i);
                }
            }
        }

        if (ret.equals("")) {
            return "EMPTY";
        }

        return ret;

//        StringBuilder answer = new StringBuilder();
//        int mode = 0;
//
//        for (int i = 0; i < code.length(); i++) {
//            char current = code.charAt(i);
//            if (current == '1') {
//                mode = mode == 0 ? 1 : 0;
//                continue;
//            }
//
//            if (i % 2 == mode) {
//                answer.append(current);
//            }
//        }
//
//        return answer.length() == 0 ? "EMPTY" : answer.toString();

    }

    public static void main(String[] args) {
        ProcessCode pc = new ProcessCode();

        System.out.println(pc.solution("abc1abc1abc")); // "acbac"
    }
}

