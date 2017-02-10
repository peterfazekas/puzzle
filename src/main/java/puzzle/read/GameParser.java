package puzzle.read;

import java.util.ArrayList;
import java.util.List;

import puzzle.dto.Field;

/**
 * @author Peter_Fazekas
 */
public class GameParser {

    public Game parse(List<String> rows) {
        return new Game(parseGameFieldsFrom(rows));
    }

    protected List<Field> parseGameFieldsFrom(List<String> rows) {
        List<Field> result = new ArrayList<>();
        for (String row : rows) {
            String[] raw = row.split(" ");
            for (int i = 0; i < raw.length; i++) {
                Field field = new Field();
                result.add(field);
            }
        }
        return result;
    }

    private List<Field> parseSolutionFieldsFrom(List<String> rows) {
        return null;
    }

}
