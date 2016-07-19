import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author Alexey Krylov (lexx)
 * @since 19.07.2016
 */
public class ElevatorMovementAnalyzer {

    /*===========================================[ INSTANCE VARIABLES ]===========*/

    private int maxFloor;
    private int maxCapacity;
    private int maxWeight;
    private Queue<MovementRequest> movementRequests;

    /*===========================================[ CONSTRUCTORS ]=================*/

    public ElevatorMovementAnalyzer(int maxFloor, int maxCapacity, int maxWeight) {
        this.maxFloor = maxFloor;
        this.maxCapacity = maxCapacity;
        this.maxWeight = maxWeight;
        movementRequests = new LinkedList<>();
    }

    /*===========================================[ CLASS METHODS ]================*/

    public void accept(MovementRequest movementRequest) {
        movementRequests.add(movementRequest);
    }

    /*===========================================[ GETTER/SETTER ]================*/

    public int analyzeMovementsCount() {
        int movementsCount = 0;
        Set<Integer> movementSessionFloors = new HashSet<>();
        while (!movementRequests.isEmpty()) {
            int movementSessionWeight = 0;
            for (int i = 0; i < maxCapacity && movementSessionWeight < maxWeight && !movementRequests.isEmpty(); i++) {
                MovementRequest accepted = movementRequests.poll();
                movementSessionWeight += accepted.getWeight();
                movementSessionFloors.add(accepted.getTargetFloor());
            }

            movementsCount += movementSessionFloors.size() + 1;
            movementSessionFloors.clear();
        }
        return movementsCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ElevatorMovementAnalyzer{");
        sb.append("maxFloor=").append(maxFloor);
        sb.append(", maxCapacity=").append(maxCapacity);
        sb.append(", maxWeight=").append(maxWeight);
        sb.append(", movementRequests=").append(movementRequests);
        sb.append('}');
        return sb.toString();
    }
}
