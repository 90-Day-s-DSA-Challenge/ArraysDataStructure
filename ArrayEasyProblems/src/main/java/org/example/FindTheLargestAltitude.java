package org.example;


//1732. Find the Highest Altitude
//https://leetcode.com/problems/find-the-highest-altitude/description/

public class FindTheLargestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain){
        int maxAltitude = 0;
        int currentAltitude = 0;

        for(int latitudeGain: gain){
//            add al the altitude in current altitude => sum of all altitude
            currentAltitude += latitudeGain;

//            normal way:
//            if(currentAltitude > maxAltitude){
//                maxAltitude = currentAltitude;
//            }

            // Update maxAltitude if the current altitude is higher
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return  maxAltitude;
    }
}

/**
 Explaination and conclusion

 This problem is quite confusion its question description is very confusing and when i solve that
 its seems very easy.
 */
