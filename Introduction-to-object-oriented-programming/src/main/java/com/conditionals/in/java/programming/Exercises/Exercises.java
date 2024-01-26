package com.conditionals.in.java.programming.Exercises;

public class Exercises {
    public static String datermineNameOfDay(int dayNumber){
        String result = "";
        switch(dayNumber){
            case 0: result = "Sunday";break;
            case 1: result = "Monday";break;
            case 2: result = "Tuesday";break;
            case 3: result = "Wednesday";break;
            case 4: result = "Thursday";break;
            case 5: result = "Friday";break;
            case 6: result = "Saturday";break;
        }
        return result;
    }


    /*第二種寫法
    * 當直接return 時，switch 不會執行下一行
    * */
    public static String datermineNameOfDay2(int dayNumber){

        switch(dayNumber){
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
        }
        return "Invalid_day";
    }


    public static boolean isWeekDay(int dayNumber){
        switch(dayNumber){
            case 0 : return false;
            case 1 : return true;
            case 2 : return true;
            case 3 : return true;
            case 4 : return true;
            case 5 : return true;
            case 6 : return false;
        }

        return false;
    }


    /*isWeekDay 第二種寫法
    * 因為返回的值只有ture和false，藉由switch 沒有break會向下執行的特性，返回相同的值時，可以省略不寫
    * 要更簡略 可以case 0 和case 6 省略不寫，當false時由最外圍的false返回值
    * */

    public static boolean isWeekDay2(int dayNumber){
        switch(dayNumber){
//            case 0 :
//            case 6 : return false;
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 : return true;

        }

        return false;
    }
}
