package puzzle.read;

import java.util.ArrayList;
import java.util.List;

import jdk.nashorn.internal.objects.NativeArray;

/**
 * @author Peter_Fazekas
 */
public class SolutionParser extends GameParser {

    public Solution parse(List<String> rows) {
        String author = rows.remove(0);
        return new Solution(author, parseGameFieldsFrom(rows));
    }

    public List<Solution> parseSolutions(List<String> rows) {
        List<Solution> solutions = new ArrayList<>();
        int size = Integer.valueOf(rows.remove(0));
        for (int i = 0; i < size; i++) {
            List<String> solutionRows = new ArrayList<>();
            for (int j = 0; j < 11; j++) {
                solutionRows.add(rows.remove(0));
            }
            solutions.add(parse(solutionRows) );
        }
        return solutions;
    }
}
