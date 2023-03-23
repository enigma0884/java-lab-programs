import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5 {
  public static void main(String[] args) throws FileNotFoundException, IOException {

    char c;
    int i;

    FileOutputStream fout = new FileOutputStream("./text.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    do {
      c = (char) br.read();
      if (c != 'q')
        fout.write(c);
    } while (c != 'q');

    fout.close();

    FileInputStream fin = new FileInputStream("./text.txt");
    do {
      i = fin.read();
      if (i != -1)
        System.out.println((char) i);
    } while (i != -1);

    fin.close();
  }
}
