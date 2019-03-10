import java.util.Scanner;

public class RacingGameMain {

    public static void main(String[] args) {

        // 레이싱 게임 객체 생성
        RacingGame racingGame = new RacingGame();

        // 자동차 대수 입력
        int carCount = RacingGameView.
                inputCountView("자동차 대수는 몇 대 인가요?");

        racingGame.setRacingCars(carCount);

        // 시도할 회수 입력
        int tryCount = RacingGameView.
                inputCountView("시도할 회수는 몇 회 인가요?");

        // 자동차 경주 시작 (run))
        racingGame.run(carCount, tryCount);

        // 게임결과 출력
        RacingGameView.renderGameResult(racingGame);
    }
}
