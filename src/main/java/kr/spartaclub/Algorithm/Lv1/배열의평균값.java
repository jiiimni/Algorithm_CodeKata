package kr.spartaclub.Algorithm.Lv1;

public class 배열의평균값 {
        public double solution(int[] numbers) {
            double sum = 0;

            for (int num : numbers) {
                sum += num;
            }

            return sum / numbers.length;
        }
}
