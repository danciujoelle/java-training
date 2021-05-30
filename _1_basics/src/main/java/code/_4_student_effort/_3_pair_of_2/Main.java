package code._4_student_effort._3_pair_of_2;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
       int[] array1={3,2,-3,-2,3,0};
        int[] array2={1,1,0,-1,-1};
        int[] array3={5,9,-5,7,-5};
        System.out.println(pairof2(array1));
        System.out.println(pairof2(array2));
        System.out.println(pairof2(array3));

    }
    public static int pairof2(int[] array){
        int pairs=0;
        Arrays.sort(array);
        HashMap<Integer,String> map=new HashMap<Integer, String>();
        for(int i=0;i<array.length;i++){
            map.put(array[i],"no pair");
        }
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length-1;j++){
                if(array[i]+array[j]==0&&map.get(array[i])=="no pair"&&map.get(array[j])=="no pair"){
                    pairs++;
                    if(array[i]!=array[i+1])
                    map.put(array[i],"yes");
                    if(array[j]!=array[j+1])
                    map.put(array[j],"yes");
                    break;
                }
            }
        }
        return pairs;
    }
}
