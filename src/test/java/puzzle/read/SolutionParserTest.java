package puzzle.read;

import static org.testng.Assert.*;

import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author Peter_Fazekas
 */
public class SolutionParserTest {

    private SolutionParser underTest;

    @BeforeMethod
    public void setUp() {
        underTest = new SolutionParser();
    }

    @Test
    public void testParseSolutions() {
        List<String> rows = PuzzleReader.read("solution.txt"); //  dataprovider

        List<Solution> solutions = underTest.parseSolutions(rows);

        assertEquals(solutions.size(), 10);
    }

    @Test
    public void testParseNewSolutions() {
        List<String> rows = PuzzleReader.read("solution2.txt"); //  dataprovider

        List<Solution> solutions = underTest.parseSolutions(rows);

        assertEquals(solutions.size(), 8);
    }

    @Test
    public void testParseSolutionsShouldSetName() {
        List<String> rows = PuzzleReader.read("solution2.txt"); //  dataprovider

        List<Solution> solutions = underTest.parseSolutions(rows);

        assertEquals(solutions.get(0).getAuthor(), "Absolon");
        assertEquals(solutions.get(7).getAuthor(), "Bazil");
    }

    @Test
    public void testParseSolutionsShouldSetFields() {
        List<String> rows = PuzzleReader.read("solution2.txt"); //  dataprovider

        List<Solution> solutions = underTest.parseSolutions(rows);

        assertEquals(solutions.get(0).getFieldSize(), 100);
        assertEquals(solutions.get(7).getFieldSize(), 100);
    }

}