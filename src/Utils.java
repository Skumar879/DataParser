import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    public static ArrayList<ElectionResult> parse2016ElectionResults(String data) {
//        Create your return arraylist
//        split input data by \n to create array of rows
//        loop over all rows BUT SKIP THE FIRST ROW (look at the file to see why)
//        for each row {
//            split it into individual values and save into the right kinds of variables.
//                    Create a new object using those values
//            Add it to your list.
//        }
//        return results;
        ArrayList<ElectionResult> results = new ArrayList<ElectionResult>();
        String[] rows = data.split("\n");

        for (int i = 1; i < rows.length; i++) {
            ElectionResult temp = new ElectionResult();
            String row = rows[i];
            String[] splitrow = row.split(",");
            temp.inputfullSet(splitrow);
        }
        return results;
    }

    public static ArrayList<State> sortData(String presidential, String educationdata, String unemploymentdata){
        parseElectionResults(presidential);
        parseEducationData(educationdata);
        parseUnemploymentData(unemploymentdata);

        return null;
    }

    private static void parseUnemploymentData(String educationdata) {
        String[] rows = educationdata.split("\n");

    }

    private static void parseEducationData(String educationdata) {
        String[] rows = educationdata.split("\n");
    }

    private static void parseElectionResults(String presidentialdata) {
        String[] rows = presidentialdata.split("\n");
        for (int i = 0; i < rows.length; i++) {
            String row = rows[i];
            int firstquote = row.indexOf("\"");
            int secondquote = row.indexOf("\"", firstquote + 1);
            String quotes = row.substring(firstquote, secondquote + 1);
            if(quotes.contains(",")){
                //add removecomma method
                //add removequotes method
            }
        }
    }
}
