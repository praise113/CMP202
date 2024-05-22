public class Physics {
    float calculateVelocity(float distance, int time){
        return distance/time;
    }
    float calculateVelocity(float initialVelocity, float acceleration, int time){
        return initialVelocity + (acceleration * time);
    }
    public static void main(String[] args) {
        Physics velocity = new Physics();
        System.out.println(velocity.calculateVelocity(40, 10));
        System.out.println(velocity.calculateVelocity(40, 20, 40));
    }
}
