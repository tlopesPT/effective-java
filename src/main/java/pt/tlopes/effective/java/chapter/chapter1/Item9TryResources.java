package pt.tlopes.effective.java.chapter.chapter1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Item9TryResources {

    // try-with-resources on multiple resources - short and sweet
    public void copy(String src, String dst) {
        try (InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[1024];
            int n;
            while ((n = in.read(buf)) >= 0) {
                out.write(buf, 0, n);
            }
        } catch (IOException ignored) {
        }
    }
}
