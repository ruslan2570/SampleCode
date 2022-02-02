import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of copies of the file: ");
        int count = scan.nextInt();
        System.out.print("Enter a path: ");
        String enterPath = scan.next();
        System.out.print("Enter filename: ");
        String fileName = scan.next();

        String fileExpansion = fileName.substring(fileName.length() - 4);
        String namePath = enterPath + fileName;
        FileInputStream fileInputStream = null;
        byte[] buf = null;

        try {
            fileInputStream = new FileInputStream(namePath);
            buf = fileInputStream.readAllBytes();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error: Photo not found!");
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File createDir = new File(enterPath + "\\papka");
        createDir.mkdir();
        String PATH_FOR_FILE_SAMPLE = enterPath + "\\papka\\";

        try {
            for (int i = 1; i <= count; i++) {
                String currentPath = PATH_FOR_FILE_SAMPLE + fileName.replaceAll(fileExpansion, "") + "_" + i + fileExpansion;
                File file = new File(currentPath);
                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(buf);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
