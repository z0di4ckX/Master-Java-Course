import java.io.*;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {
        Scanner keybord = new Scanner (System.in);
        FileReader reader;
        Scanner fileInput;
        PrintWriter fileOutput;
        String namesList [] = new String [30], 
        name, strLine, 
        nameOfInputFile, nameOfOutputFile;

        int matchesCount = 0, inches;

        System.out.print("Name of the input file and add .txt: ");
        nameOfInputFile = keybord.next();
        System.out.print("Name fo the output file and add .txt: ");
        nameOfOutputFile = keybord.next();

        try {
            reader = new FileReader(nameOfInputFile);
            fileInput = new Scanner (reader);

            while (fileInput.hasNextLine()) {
                strLine = fileInput.nextLine();
                name = strLine;
                strLine = fileInput.nextLine();
                inches = Integer.valueOf(strLine);

                if (inches <= 62) {
                    namesList[matchesCount] = name;
                    matchesCount += 1;
                }
		else {
		    namesList[matchesCount] = name;
	    	    matchesCount -= 1;	    
		}
            }
            fileInput.close();
        }catch(IOException error) {
            System.out.println("File error " + error);
        }
        try {
            fileOutput = new PrintWriter(nameOfOutputFile);
            for (int i = matchesCount -1; i >= 0; i--) {
                System.out.println("Name: " + namesList[i]);
                fileOutput.println(namesList[i]);
            }
            fileOutput.close();
        }catch(IOException error) {
            System.out.println("File error " + error);
        }
    }
}
