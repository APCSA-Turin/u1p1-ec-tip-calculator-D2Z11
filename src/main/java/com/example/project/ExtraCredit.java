package com.example.project;
import java.util.Scanner;
// https://www.w3schools.com/java/java_arraylist.asp

public class ExtraCredit {
    public static String roundToTwoPlaces(double num) {
        // https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        double rounded = Math.round(num * 100.0) / 100.0;
        String roundedStr = String.valueOf(rounded);
        // https://stackoverflow.com/questions/51462081/how-to-split-string-in-java-based-on-period
        // Append a "0" if there is only one digit after the period -> ex: $15.0 should be $15.00
        if (roundedStr.split("\\.")[1].length() == 1) {
            roundedStr += '0';
        }
        return roundedStr;
    }

    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost, String items) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        Scanner readIn = new Scanner(System.in);
        String[] itemsArr = items.split("\\R");

        // NOTE: Why did I put roundToTwoPlaces in the string and not in the variable? It was sometimes giving incorrect results because the double didn't have enough detail/digits
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + '\n'); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        double tip = cost * (percent / 100.0);
        result.append("Total tip: $" + roundToTwoPlaces(tip) + '\n');
        double total = (tip + cost);
        result.append("Total Bill with tip: $" + roundToTwoPlaces(total) + '\n');
        double perPersonBeforeTip = (cost / people);
        result.append("Per person cost before tip: $" + roundToTwoPlaces(perPersonBeforeTip) + '\n');
        double perPersonForTip = (tip / people);
        result.append("Tip per person: $" + roundToTwoPlaces(perPersonForTip) + '\n');
        double totalCostPerPersonIncludingTip = (total / people);
        result.append("Total cost per person: $" + roundToTwoPlaces(totalCostPerPersonIncludingTip) + '\n');
        result.append("-------------------------------\n");

        // "best practices" 😒
        readIn.close();

        // return result.toString();
        // ## EXTRA CREDIT ##
        result.append("Items ordered:\n");
        //itemsArr.size() you can figure this out using intellisense (looking at the options for arraylists)
        for (int i = 0; i < itemsArr.length; i++) {
            result.append(itemsArr[i] + '\n');
        }
        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        // Learned this in an earlier lesson + w3schools: https://www.w3schools.com/java/java_arraylist.asp
        // ArrayList<String> items = new ArrayList<String>();
        String items = "";

        // ## EXTRA CREDIT ##
        System.out.println("Enter an item or type -1 to finish:");
        // .trim is same in Javascript
        String stream = readIn.nextLine();
        items += (stream) + '\n';
        // While is very similar to many languages
        while (!stream.equals("-1")) {
            System.out.println("Enter an item or type -1 to finish:");
            stream = readIn.nextLine();
            if (stream.equals("-1")) {
                break;
            }
            items += (stream) + '\n';
        }

        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        System.out.println(calculateTip(people,percent,cost,items));
        readIn.close();
    }
}
        

// public class ExtraCredit {


//     public static String calculateTip(int people, int percent, double cost, String items) {
//         StringBuilder result = new StringBuilder();

//                 //COPY AND PASTE YOUR CODE HERE 

//         //the two lines  should go below result.append("-------------------------------\n"); 
//         result.append("Items ordered:\n");
//         result.append(items);


//         return result.toString();
//     }
                                   
//     public static void main(String[] args) {
//         int people;
//         int percent;
//         double cost;
//         String items; 

//         //Your scanner object and while loop should go here
                             
//         System.out.println(calculateTip(people,percent,cost,items));
//     }
// }
