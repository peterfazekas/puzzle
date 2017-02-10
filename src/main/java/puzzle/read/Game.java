package puzzle.read;

import java.util.List;

import puzzle.dto.Field;

/**
 * @author Peter_Fazekas
 */
public class Game {

    List<Field> fields;

    public Game(List<Field> fields) {
        this.fields = fields;
    }

    public int getFieldSize() {
        return fields.size();
    }
}
