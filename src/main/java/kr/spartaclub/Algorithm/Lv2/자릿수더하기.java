package kr.spartaclub.Algorithm.Lv2;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);

        for (char c : str.toCharArray()) {
            answer += c - '0';
        }

        return answer;
    }
}
