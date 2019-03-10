import java.util.Scanner;

public class RacingGameView {

    public static int inputCountView(String inputType) {

        System.out.println(inputType);
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        return count;
    }

    public static void renderGameResult(RacingGame racingGame) {

        System.out.println("실행 결과 \n");

        RacingCar[] racingCars = racingGame.getRacingCars();

        for (int i = 0; i < racingCars.length; i++) {

            int moveDistance = racingCars[i].getMoveDistance();
            printMoveDistance(moveDistance); // 이동거리 출력
            System.out.println();
        }


    }

    public static void printMoveDistance(int length) {
        for (int i = 0; i < length; i++)
            System.out.print('-');
    }
}
