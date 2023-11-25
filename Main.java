import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 123}, {300, 400, 500}};
        AppData appData = new AppData(header, data, "data.csv");
        appData.save(appData);

        AppData loadedData = AppData.load("data.csv");
        if (loadedData != null) {
            System.out.println("Header: ");
            System.out.println(String.join(", ", loadedData.getHeader()));
            System.out.println("Data:");
            for (int[] row : loadedData.getData()) {
                System.out.println(Arrays.toString(row));
            }
        }
    }
}