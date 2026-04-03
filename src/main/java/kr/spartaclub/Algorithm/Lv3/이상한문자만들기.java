package kr.spartaclub.Algorithm.Lv3;

public class 이상한문자만들기 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = 0; // 단어 내 인덱스

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(c);
                index = 0; // 공백 만나면 초기화
            } else {
                if (index % 2 == 0) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                index++;
            }
        }

        return answer.toString();
    }
}
