import java.io.*;

public class MergeAudio {
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("audio1.mp3");
        FileInputStream f2 = new FileInputStream("audio2.mp3");
        FileOutputStream output = new FileOutputStream("merged.mp3", true);
        int data;
        while ((data = f1.read()) != -1) {
            output.write(data);
        }
        while ((data = f2.read()) != -1) {
            output.write(data);
        }
        f1.close();
        f2.close();
        output.close();
        System.out.println("Audio files merged successfully.");
    }
}
