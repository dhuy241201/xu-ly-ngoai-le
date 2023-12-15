

import java.io.File;

public class RenameToExample {
    public static void main(String[] args) {
        // Tạo một đối tượng File cho tệp test.txt
        File file = new File("C:\\Users\\ADMIN\\Downloads\\New folder (2)\\test.txt");
        file.mkdirs();
        // Tạo một đối tượng File cho vị trí mới là new.txt
        File dest = new File("C:\\Users\\ADMIN\\Downloads\\New folder (2)\\new.txt");
        dest.mkdirs();
        // Đổi tên hoặc di chuyển test.txt sang new.txt
        boolean result = file.renameTo(dest);
        // Hiển thị kết quả
        if (result) {
            System.out.println("Đổi tên hoặc di chuyển thành công");
        } else {
            System.out.println("Đổi tên hoặc di chuyển không thành công");
        }
    }
}
