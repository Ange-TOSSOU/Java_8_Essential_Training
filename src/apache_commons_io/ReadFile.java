package apache_commons_io;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadFile {

    private static final String fileName = "hello.txt";
    private static final String fileLocation = "/tmp/deps"; // The absolute path

    public static String getFileContents() {

        try {
            File file = new File(fileLocation, fileName);
            FileInputStream in = new FileInputStream(file);
            return IOUtils.toString(in, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.getMessage();
        }

        return null;
    }

}
