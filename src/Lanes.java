import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lanes {

    List<List<String>> lanes = new ArrayList<>();
    List<Integer> maxLengths = new ArrayList<>();
    int laneNum = -1;

    public Lanes addLane(String... lane) {

        if (laneNum == -1){
            laneNum = lane.length;
            for(int column = 0; column < laneNum; column++) {
                maxLengths.add(0);
            }
        }

        if (laneNum != lane.length) {
            throw new IllegalArgumentException();
        }

        for(int column = 0; column < laneNum; column++) {
            int length = Math
                    .max(
                            maxLengths.get(column),
                            lane[column].length()
                    )
                    ;
            maxLengths.set( column, length );
        }

        lanes.add( Arrays.asList(lane) );

        return this;
    }

    public void print(){
        System.out.println(toString());
    }

    public String toString(){
        String result = "";
        for(List<String> line : lanes) {
            for(int i = 0; i < laneNum; i++) {
                result += pad( line.get(i), maxLengths.get(i) + 1 );
            }
            result += System.lineSeparator();
        }
        return result;
    }

    private String pad(String word, int newLength){
        while (word.length() < newLength) {
            word += " ";
        }
        return word;
    }
}