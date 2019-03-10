public class RacingCar {

    private int moveDistance;

    public RacingCar(int moveDistance) {
        this.moveDistance = moveDistance;
    }

    public int getMoveDistance() {
        return moveDistance;
    }

    public void setMoveDistance(int moveDistance) {
        this.moveDistance = moveDistance;
    }

    public void addMoveDistance(int moveDistance) {
        if(moveDistance >= 4)
            this.moveDistance += 1;
    }
}
