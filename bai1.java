import java.io.File;
import java.util.Scanner;

public class bai1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap duong dan cua tep ");
            String filePath = scanner.nextLine();
            scanner.close();

            File file = new File(filePath);

            if (file.exists()) {
             
                long fileSize = file.length();

            
                double fileSizeKB = fileSize / 1024.0;
                double fileSizeMB = fileSizeKB / 1024.0;
                System.out.println("Kich thuoc cua tep");
                System.out.printf("%.2f KB%n", fileSizeKB);
                System.out.printf("%.2f MB%n", fileSizeMB);
            } else {
                System.out.println("Tep khong ton tai");
            }
        }
    }
}