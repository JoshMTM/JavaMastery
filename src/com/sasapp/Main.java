package com.sasapp;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //Primitive date type:
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isAnAdult = true;
        //Reference data type:
        Date now = new Date();
        now.getTime();

        //More reference types
        // Point point1 = new Point(x:1, y:2);
//        Point point2 = point1;
//        point1.x = 2;
        String message = "Hello String";

        //IntByteShortLong
        int myValue = 10000;
        int myIntMinValue = Integer.MIN_VALUE;
        int myIntMaxValue = Integer.MAX_VALUE;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        double myMinDoubleValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;

        float myMinFloatValue = Float.MIN_VALUE;
        float MyMaxFloatValue = Float.MAX_VALUE;


        System.out.println("My min Float value: " + myMinFloatValue);
        System.out.println("My max Float value: " + MyMaxFloatValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("This is my Long max: " + myMinLongValue);
        System.out.println("This is my Long Min: " + myMaxLongValue);

        System.out.println("My double minimum value = " + myMinDoubleValue);
        System.out.println("My double maximum value = " + myDoubleMaxValue);

        System.out.println("My Byte Minimum Value =" + myMinByteValue);
        System.out.println("My Byte Maximum Value =" + myMaxByteValue);
        System.out.println("My Int Minimum Value =" + myIntMinValue);
        System.out.println("My Int Maximum Value =" + myIntMaxValue);


        double storeBanana = 200d;
        double bananaInKgs = storeBanana * 0.45359237d;
        System.out.println("This is the amount of banana in Kgs: " + bananaInKgs + " Kgs");

//        System.out.println(message.replace("t", "l"));
//        System.out.println(message.toLowerCase());
//        System.out.println(message.toUpperCase());
//        System.out.println(message);

        //String class or primitive type:
        String myString = "This is a string";
        System.out.println("This is my String: " + myString);

        //Logical and operators
        int topScore = 90;
        if (topScore >= 90) {
            System.out.println("This is the highest score");
        }
        int secondTopScore = 80;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("this is not supposed to happen");
        }

        double numberFirst = 20.00;
        double numberSecond = 80.00;
        double result = ((numberFirst + numberSecond) * 100);

        double remainder = result % 40.00;

        boolean remainderIsZero = remainder == 0 ? true : false;

        System.out.println(remainderIsZero);

        if (!remainderIsZero) {
            System.out.println("Got some remainder");
        }

        //More if and if else statement:
       calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighScorePosition(300);
        displayHighScorePosition("Joshua", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Frank", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Carol", highScorePosition);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus ) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1500;
            System.out.println("Your final score was: " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playersName, int position){
        System.out.println(playersName + " Managed to get into position: " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500 ) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }
        //Alternative way of solving this challenge
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
