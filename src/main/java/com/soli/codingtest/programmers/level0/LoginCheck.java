package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 로그인 성공?
 * 난이도: 🤍 Level 0
 * 유형: 문자열 / 배열 / 조건문
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120883
 */

public class LoginCheck {

    public String solution(String[] id_pw, String[][] db) {
        // 1. id_pw의 id가 db에 있는지 확인
        // 2. 있으면 pw가 동일한지 확인
        // 3. 동일하면 "login", 틀렸으면 "wrong pw", 없으면 "fail"

        String answer = "";

        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {
                if (id_pw[1].equals(db[i][1])) {
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                    break;
                }
            } else {
                answer = "fail";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        LoginCheck lc = new LoginCheck();

        String[] id_pw1 = {"meosseugi", "1234"};
        String[][] db1 = { {"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        String[] id_pw2 = {"programmer01", "15789"};
        String[][] db2 = { {"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
        String[] id_pw3 = {"rabbit04", "98761"};
        String[][] db3 = { {"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};
        String[] id_pw4 = {"abc04", "345"};
        String[][] db4 = { {"abc04", "335"}, {"abc03", "345"}};

        System.out.println(lc.solution(id_pw1, db1)); // "login"
        System.out.println(lc.solution(id_pw2, db2)); // "wrong pw"
        System.out.println(lc.solution(id_pw3, db3)); // "fail"
        System.out.println(lc.solution(id_pw4, db4)); // "wrong pw"
    }
}

