package com.conditionals.in.java.programming.Ternary.Operation;

public class ternaryOperationRunner {
    public static void main(String[] args) {
        /*介紹三元運算
        * 三元運算適合用在簡單的判斷，不是和用於很複雜的判斷，因為會增加閱讀的難度。
        * */

        int i = 6;
        boolean isEven;
//        if(i%2==0){
//            isEven = true;
//        }else{
//            isEven = false;
//        }

        isEven = (i%2==0 ? true : false);

        System.out.println(isEven);
    }
}
