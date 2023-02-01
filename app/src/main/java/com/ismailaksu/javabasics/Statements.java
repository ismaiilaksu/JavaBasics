package com.ismailaksu.javabasics;

public class Statements {

    public static void main(String[] args) {

        int x = 5;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x = x * 5;
        System.out.println(x);

        int y = 4;

        System.out.println(x>y);

        System.out.println(y>x);

        y = 30;

        System.out.println(x>y);
        System.out.println(x>=y);
        System.out.println((x==y));
        System.out.println(x!=y);

        // and &&
        // or ||

        x = 30;
        y = 4;
        int z = 5;

        System.out.println(x<y && z<y);

        // if statements
        if (x < y){
            System.out.println("y is bigger");
        } else if (y < x) {
            System.out.println("x is bigger");
        }else if (x == y){
            System.out.println("x = y");
        }

        // switch

        int day = 2;
        String dayString="";

        switch (day){
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            default:
                dayString = "Sunday";
                break;
        }

        System.out.println(dayString);
    }
}

