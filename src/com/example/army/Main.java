package com.example.army;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Integer h = 0, e = 0, at = 0, sg = 0;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\SG0307830\\IdeaProjects\\Shah-Army\\out\\production\\Shah-Army\\com\\example\\army\\input.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String stgs[] = s.split(" ");
            for(String stg : stgs)
                input(stg);
            List<Integer> arr = new ArrayList<>();
            arr.add(h);
            arr.add(e);
            arr.add(at);
            arr.add(sg);
            System.out.println(Armies.predict(arr));
        }

    }

    private static void input(String s) {
        if(s.endsWith("H")){
            h = Integer.valueOf(s.replace("H", ""));
        }
        if(s.endsWith("E")){
            e = Integer.valueOf(s.replace("E", ""));
        }
        if(s.endsWith("AT")){
            at = Integer.valueOf(s.replace("AT", ""));
        }
        if(s.endsWith("SG")){
            sg = Integer.valueOf(s.replace("SG", ""));
        }
    }

}
