import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Damian on 30.01.2018.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        String filePatch = "C:/Users/Damian/IdeaProjects/CalculatorSource/file.txt";
        String fileVaribleOne = null;
        String fileVaribleTwo = null;
        String fileVaribleApply = null;
        BufferedReader fileReader = null;

        try {
            fileReader = new BufferedReader(new FileReader(filePatch));
            String numberAsStringOne = fileReader.readLine();
            fileVaribleOne = String.valueOf(numberAsStringOne.substring(numberAsStringOne.length() - 2));
            String numberAsStringTwo = fileReader.readLine();
            fileVaribleTwo = String.valueOf(numberAsStringTwo.substring(numberAsStringTwo.length() - 2));
            String numberAsStringApply = fileReader.readLine();
            fileVaribleApply = String.valueOf(numberAsStringApply.substring(numberAsStringApply.length() - 2));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
        int varibleOne = Integer.parseInt(fileVaribleOne.trim());
        int varibleTwo = Integer.parseInt(fileVaribleTwo.trim());
        int apply = Integer.parseInt(fileVaribleApply.trim());
        int add = 0;
        int multiply = 0;


        switch (varibleOne){
            case 2:
                add = varibleOne;
                multiply = varibleTwo;
                System.out.println((apply + add) * multiply);
            break;

            case 3:
                multiply = varibleOne;
                add = varibleTwo;
                System.out.println((apply * multiply) + add);
                break;
                default:
                    System.out.println(apply);
                    break;
        }

    }
}
