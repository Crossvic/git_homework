import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;

public class AppData {

    private String[] header;
    private int[][] data;
    private String fileName;

    public AppData(String[] header, int[][] data, String fileName) {
        this.header = header;
        this.data = data;
        this.fileName = fileName;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public String getFileName() {
        return fileName;
    }

    public static AppData load(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String headerLine = reader.readLine();
            String[] header = headerLine.split(";");
            List<String> rows = reader.lines().collect(Collectors.toList());
            int[][] data = new int[rows.size()][header.length];
            for (int i = 0; i < rows.size(); i++) {
                data[i] = convertStringArrayToIntArray(rows.get(i).split(";"));
            }
            return new AppData(header, data, filePath);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void save(AppData appData) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(appData.getFileName()))) {
            writeRow(writer, appData.getHeader());
            for (int[] row : appData.getData()) {
                writeRow(writer, convertIntArrayToStringArray(row));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeRow(PrintWriter writer, String[] values) {
        writer.println(String.join(";", values));
    }

    private static String[] convertIntArrayToStringArray(int[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = String.valueOf(array[i]);
        }
        return result;
    }

    private static int[] convertStringArrayToIntArray(String[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = Integer.parseInt(array[i]);
        }
        return result;
    }
}
