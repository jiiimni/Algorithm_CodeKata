package kr.spartaclub.Algorithm.Lv3;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] card : sizes) {

            int w = Math.max(card[0], card[1]);
            int h = Math.min(card[0], card[1]);

            if (w > maxWidth) {
                maxWidth = w;
            }
            if (h > maxHeight) {
                maxHeight = h;
            }
        }

        return maxWidth * maxHeight;
    }
}
