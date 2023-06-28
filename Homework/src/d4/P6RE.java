package d4;

import java.util.Calendar;
import java.util.Scanner;

public class P6RE {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 연도와 월을 입력받음
        System.out.print("연도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        // 해당 연도와 월의 첫째 날 구하기
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, 1);
        int startDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        // 해당 월이 며칠까지 있는지 구하기
        int lastDay = cal.getActualMaximum(Calendar.DATE);

        // 달력 출력
        System.out.println(year + "년 " + month + "월");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        // 첫째 날이 시작되기 전까지는 빈 공간 출력
        for (int i = 1; i < startDayOfWeek; i++) {
            System.out.print("\t");
        }

        // 해당 월의 날짜 출력
        for (int i = 1; i <= lastDay; i++) {
            System.out.print(i + "\t");
            if ((startDayOfWeek + i - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
