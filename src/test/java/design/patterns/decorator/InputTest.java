package design.patterns.decorator;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;

/**
 * 测试类（对LowerCaseInputStream进行测试）
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        InputStream in = null;
        try {
            in = new LowerCaseInputStream(
                        new BufferedInputStream(
                                new FileInputStream("src/test/java/design/patterns/decorator/test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
