public class TrackCapuchin {
    private int monkeyX;
    private int monkeyY;
    private int foodX;
    private int foodY;

    public TrackCapuchin(int x, int y){
        foodX = x;
        foodY = y;
        monkeyX = 0;
        monkeyY = 0;
    }

    public int getMonkeyX() {
        return monkeyX;
    }

    public int getMonkeyY() {
        return monkeyY;
    }

    public int getFoodX() {
        return foodX;
    }

    public int getFoodY() {
        return foodY;
    }

    public void moveMonkey(int xMovement, int yMovement){
        monkeyX += xMovement;
        monkeyY += yMovement;
    }

    public double calcFoodDistance(){
        return Math.sqrt((Math.pow(foodX - monkeyX, 2) + Math.pow(foodY - monkeyY, 2)));
    }

    public boolean isCloserThan(TrackCapuchin otherMonkey){
        if(otherMonkey.calcFoodDistance() < this.calcFoodDistance()){
            return true;
        } return false;
    }

}
