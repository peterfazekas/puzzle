package puzzle.read;

import java.util.List;

import puzzle.dto.Field;

/**
 * @author Peter_Fazekas
 */
public class Solution extends Game {

    private String author;

    public Solution(String author, List<Field> fields) {
        super(fields);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
