package puzzle.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Peter_Fazekas
 */
public class PuzzleReader {

    private static final String ROOT = "C:\\git\\puzzle\\src\\main\\resources\\";


    public static List<String> read(String filename) {//puzzle.txt
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ROOT + filename))){
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                lines.add(sCurrentLine);
            }
        } catch (IOException e)         {
            e.printStackTrace();
        }
        return lines;
    }
}
