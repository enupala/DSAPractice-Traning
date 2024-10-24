package org.example.practice2;

public class Problem4 {
    public static void main(String[] args) {
/*"

Examples:
Given (0,0) and String - ""UUU""
    Answer : (0,3)

Given (0,0) and String - ""URRDDL""
    Answer : (1,-1)

Additional testcase : String - ""DOWN UP 2xRIGHT DOWN 3xLEFT""
    Answer : (-1,-1)"
*/
        String s1="UUU";
        String s2="URRDDL";
        String s3="DOWN UP 2xRIGHT DOWN 3xLEFT";
        finalCoordinates(s3);
    }

    private static void finalCoordinates(String s1) {
        int x=0,y=0;
        String[] str={};
        if(s1.contains(" "))
             str =s1.split(" ");
        else
         str =s1.split("");
        for (String s : str) {
            if (s.equalsIgnoreCase("U") || s.equalsIgnoreCase("UP")) {
                y += 1;
            } else if (s.equalsIgnoreCase("D") || s.equalsIgnoreCase("DOWN")) {
                y -= 1;
            } else if (s.equalsIgnoreCase("R") || s.equalsIgnoreCase("RIGHT")) {
                x += 1;
            } else if (s.equalsIgnoreCase("L") || s.equalsIgnoreCase("LEFT")) {
                x -= 1;
            } else if(s.matches("\\d+x[A-Za-z]+")){
                String[] dir =s.split("x");
               int count= Integer.parseInt(dir[0]);
                String direction= dir[1];

                switch (direction)
                {
                    case "UP":y+=count;break;
                    case "DOWN":y-=count;break;
                    case "RIGHT":x+=count;break;
                    case "LEFT" :x-=count;break;

                }

            }
        }
        System.out.println(x+" "+y);
    }
}
