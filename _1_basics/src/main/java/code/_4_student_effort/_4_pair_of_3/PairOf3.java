package code._4_student_effort._4_pair_of_3;

import java.util.Arrays;
import java.util.HashMap;

public class PairOf3 {
    public int pairOf3(int[] array){
        int pairs=0;
        Arrays.sort(array);
        HashMap<Integer,String> map=new HashMap<Integer, String>();
        for(int i=0;i<array.length;i++){
            map.put(array[i],"no pair");
        }
        for(int i=0;i<array.length-2;i++){
            for(int j=i+1;j<array.length-1;j++){
                for(int k=j+1;k<array.length;k++) {
                    if (array[i] + array[j] + array[k]== 0 && map.get(array[i]) == "no pair" && map.get(array[j]) == "no pair"&& map.get(array[k])=="no pair") {
                        pairs++;
                        if (array[i] != array[i + 1])
                            map.put(array[i], "yes");
                        if (array[j] != array[j + 1])
                            map.put(array[j], "yes");
                        if(k+1<array.length&&array[k]!=array[k+1]||(k+1)==array.length)
                            map.put(array[k],"yes");
                        break;
                    }
                }
            }
        }
        return pairs;
    }
}
