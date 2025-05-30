package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 문자열 겹쳐쓰기
 * 난이도: 🤍 Level 0
 * 유형: 문자열 / 인덱스 조작 / 부분 치환
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181943
 */
public class OverwriteString {

    public String solution(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());

        return before + overwrite_string + after;

//        char[] my_chars = my_string.toCharArray();
//        char[] overwrite_chars = overwrite_string.toCharArray();
//        for (int i = 0; i < overwrite_chars.length; i++) {
//            my_chars[s + i] = overwrite_chars[i];
//        }
//        return String.valueOf(my_chars);
    }

    public static void main(String[] args) {
        OverwriteString os = new OverwriteString();

        System.out.println(os.solution("He11oWor1d", "lloWorl", 2)); // HelloWorld
        System.out.println(os.solution("Program29b8UYP", "merS123", 7)); // ProgrammerS123
    }
}

