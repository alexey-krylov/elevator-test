/**
 * @author Alexey Krylov (lexx)
 * @since 19.07.2016
 */
public class MovementRequest {

    /*===========================================[ INSTANCE VARIABLES ]===========*/

    private int weight;
    private int targetFloor;

    /*===========================================[ CONSTRUCTORS ]=================*/

    public MovementRequest(int weight, int targetFloor) {
        this.weight = weight;
        this.targetFloor = targetFloor;
    }

    /*===========================================[ CLASS METHODS ]================*/

    @Override
    public String toString() {
        return weight + " -> " + targetFloor;
    }

    /*===========================================[ GETTER/SETTER ]================*/

    public int getWeight() {
        return weight;
    }

    public int getTargetFloor() {
        return targetFloor;
    }
}
