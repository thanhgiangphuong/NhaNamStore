package Case__Study;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    // Create a file creation method
    public static void FileCreating(String fileName) {
        // Create file
        try {
            File CS_file = new File(fileName);
            if (CS_file.createNewFile()) {
                System.out.println("File đã được tạo: " + CS_file.getName());
            } else {
                System.out.println("File đã tồn tại");
            }
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi");
            e.printStackTrace();
        }
    }

    // Create a file writer method
    public static void FileWriting(String fileWriterName, String myLine) {
        try {
            FileWriter CS_fileWriter = new FileWriter(fileWriterName, true);
            BufferedWriter CS_bfWriter = new BufferedWriter(CS_fileWriter);
            CS_bfWriter.write(myLine);
            CS_bfWriter.newLine();
            CS_bfWriter.close();
            System.out.println("Ghi file thành công");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi");
            e.printStackTrace();
        }
    }

    // Create a file reader method
    public static List<String> FileReader(String fileReaderName) {
        List<String> listline = new ArrayList<>();
        try {
            FileReader CS_fileReader = new FileReader(fileReaderName);
            BufferedReader CS_bfReader = new BufferedReader(CS_fileReader);
            String line = null;
            while ((line = CS_bfReader.readLine()) != null) {
                listline.add(line);
            }
            CS_bfReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listline;
    }
}