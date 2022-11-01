package onboarding;

/**
 * 기능목록
 * 1. 손벽을 쳐야하는 개수를 출력하는 기능
 */
public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        for (int i = 0; i <= number; i++) {
            answer += clapCount(i);
        }
        return answer;
    }

    /**
     * 기능 1
     * @param num
     * @return 해당 숫자에 쳐야하는 손벽의 개수
     */
    private static int clapCount(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
                count += 1;
            }
            num /= 10;
        }
        return count;
    }
}
