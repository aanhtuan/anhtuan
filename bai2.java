import java.io.File;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        // Nhập đường dẫn thư mục hoặc tệp tin từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đường dẫn của thư mục hoặc tệp tin: ");
        String path = scanner.nextLine();
        scanner.close();

       
        File file = new File(path);

      
        if (file.exists()) {
            if (file.isDirectory()) {
                deleteDirectory(file);
                System.out.println("Đã xóa thư mục thành công.");
            } else {
                boolean deleted = file.delete();
                if (deleted) {
                    System.out.println("Đã xóa tệp tin thành công.");
                } else {
                    System.out.println("Không thể xóa tệp tin.");
                }
            }
        } else {
            System.out.println("Thư mục hoặc tệp tin không tồn tại.");
        }
    }

   
    private static void deleteDirectory(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                }
            }
        }
        directory.delete();
    }
}