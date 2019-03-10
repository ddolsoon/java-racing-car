import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RacingGameTest {

    private RacingGame racingGame;

    @Before
    public void setup() {
        racingGame.setRacingCars(3);
    }

    @Test
    public void run_시도횟수0번() {

        int tryCount = 0;
        int[] move_이동거리0_자동차3대 = new int[3];
        for(int i = 0; i < 3; i++)
        {
            move_이동거리0_자동차3대[i] = 0;
        }


    }






}
