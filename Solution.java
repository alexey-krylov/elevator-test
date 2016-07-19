/**
 * @author Alexey Krylov (lexx)
 * @since 19.07.2016
 */
public class Solution {

    /*===========================================[ CLASS METHODS ]================*/

    public int solution(int[] A, int[] B, int M, int X, int Y) {
        //A - weight
        //B - floor (0-M)
        //X - max capacity
        //Y - max weight

        ElevatorMovementAnalyzer analyzer = new ElevatorMovementAnalyzer(M, X, Y);
        for (int i = 0; i < A.length; i++) {
            analyzer.accept(new MovementRequest(A[i], B[i]));
        }
        System.out.println(analyzer);
        return analyzer.analyzeMovementsCount();
    }
}
