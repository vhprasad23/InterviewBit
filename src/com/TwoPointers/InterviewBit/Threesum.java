package com.TwoPointers.InterviewBit;
import java.util.*;

/**
 * Created by priyavivek on 10/22/15.
 */
public class Threesum {
    public int threeSumClosest(ArrayList<Integer> a, int b) {
        Collections.sort(a);
        int j=a.size()-1;
        //int j=0;
        if(a.size() ==3){
            return a.get(0)+a.get(1)+a.get(2);
        }
        int result = a.get(0)+a.get(1)+a.get(j);
        int temp,temp2;
        for(int i=0;i<j-1;i++){
            temp = a.get(i)+a.get(i+1)+a.get(j);
            if(b-temp<b-result){
                result = temp;
            }

            if(result == b){
                return result;
            }
            for(;j>i+1;j--){

                temp2 = a.get(i)+a.get(i+1)+a.get(j);
                if(b-temp2<b-result){
                    result = temp2;
                }

                if(result < b){
                    break;
                }else if(result == b){
                    return result;
                }
            }

        }

        return result;


    }

    public static void main(String[] args){
        Threesum t = new Threesum();
        ArrayList<Integer> ip = new ArrayList<Integer>(Arrays.asList(-5, 1, 4, -7, 10, -7, 0, 7, 3, 0, -2, -5, -3, -6, 4, -7, -8, 0, 4, 9, 4, 1, -8, -6, -6, 0, -9, 5, 3, -9, -5, -9, 6, 3, 8, -10, 1, -2, 2, 1, -9, 2, -3, 9, 9, -10, 0, -9, -2, 7, 0, -4, -3, 1, 6, -3));
        int result = t.threeSumClosest(ip,-1);
        System.out.println(result);

    }

}
