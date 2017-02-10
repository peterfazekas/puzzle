package puzzle.read;

import static org.testng.Assert.*;

import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author Peter_Fazekas
 */
public class GameParserTest {

    private GameParser underTest;

    @BeforeMethod
    public void setUp() {
        underTest = new GameParser();
    }

    @Test
    public void testParseCreatesGame() {
        // GIVEN
        List<String> rows = PuzzleReader.read("puzzle.txt"); //  dataprovider
        // WHEN
        Game actual = underTest.parse(rows);
        // THEN
        assertEquals(actual.getFieldSize(), 100);
    }

    @Test
    public void testParseCreatesGameForDifferentSize() {
        // GIVEN
        List<String> rows = PuzzleReader.read("puzzle2.txt"); //  dataprovider
        // WHEN
        Game actual = underTest.parse(rows);
        // THEN
        assertEquals(actual.getFieldSize(), 81);
    }


}

