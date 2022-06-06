import java.util.*;

import javax.sound.sampled.Line;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class App {
    public static void main(String[] args) throws Exception {
      BufferedReader in = new BufferedReader(new FileReader("src\\nums.txt"));
      String line = in.readLine();
      while (line !=null) {
      System.out.println(lineCalc(line));
      line = in.readLine();
      }
  }
    public static Integer lineCalc(String num) {
        Integer num2 = Integer.parseInt(num);
        for (int i = 0; i <= 3; i++) {
          num2 = num2 + i;
        }
        return num2;
    } 

  }


