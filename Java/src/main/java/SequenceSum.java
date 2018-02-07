import java.util.ArrayList;
import java.util.List;

public class SequenceSum {
    public static int[] sumOfN(int number) {
        List<Integer> sequence = new ArrayList<Integer>();
        int sumSoFar = 0;

        for(int i = 0 ; i <= Math.abs(number) ;i++){
            if (number > 0){
                sumSoFar+= i;
            }else{
                sumSoFar-= i;
            }

            sequence.add(sumSoFar);
        }

        return toIntArray(sequence);
    }

    private static int[] toIntArray(List<Integer> sequence) {
        int[] ints = new int[sequence.size()];
        for(int i = 0 ; i< sequence.size() ; i++){
            ints[i] = sequence.get(i);
        }
        return ints;
    }
}