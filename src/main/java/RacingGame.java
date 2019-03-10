public class RacingGame {

    private static RacingCar[] racingCars;

    public RacingCar[] getRacingCars() {
        return racingCars;
    }

    void setRacingCars(int carCocount) {
        racingCars = new RacingCar[carCocount];
    }

    public static void run (int carCount, int tryCount)
    {
        // TODO 구현
        int[] moveDistance = new int[carCount];

        for(int i = 0; i <tryCount; i++)
        {
            getRandomMoveDistance(moveDistance);
            RacingGame.move(moveDistance);
        }
    }

    public static void getRandomMoveDistance(int[] moveDistance)
    {
        for(int i =0; i< moveDistance.length; i++)
        {
            int random = (int)(Math.random() * 10); // 0 ~ 9
            moveDistance[i] = random;
        }
    }


    public static void move(int[] moveDistance) {

        for(int i =0; i <racingCars.length;i++) {
            racingCars[i].setMoveDistance(moveDistance[i]);
        }

        return;
    }
}
