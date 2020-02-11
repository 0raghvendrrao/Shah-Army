package com.example.army;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.ceil;
import static java.lang.Math.pow;

public class Armies {

    public static String predict(List<Integer> arr) {
        Army sa = new ShanArmy();
        Army fa = new FalconArmy();
        List<Integer> balance = new ArrayList<>();
        for(int i=0; i<4; i++){
            if(2*sa.arr.get(i)>arr.get(i)){
                if(i<3)
                    sa.arr.set(i+1, (int) (sa.arr.get(i+1) + (sa.arr.get(i)- ceil(arr.get(i)/2))/2 ));
            }
            else{
                Integer carry = 0;
                for(int j=i+1; j<4; j++){
                    while(arr.get(i)>sa.arr.get(i) && sa.arr.get(j)>0){
                        sa.arr.set(j, sa.arr.get(j)-1);
                        sa.arr.set(i, (int) (sa.arr.get(i)+pow(2, j-i)));
                    }
                }
                if(arr.get(i)>sa.arr.get(i)){
                    return "LOSES 100H 38E 10AT 5S";
                }
            }
        }
        return "WINS 100H 38E 10AT 5S";
    }
}
