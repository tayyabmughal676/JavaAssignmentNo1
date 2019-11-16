package com.gaalbaat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        * Developer by Mr. Tayyab MuGhal.
        * B.S.C.S
        * Java Assignment #1
        * University of Gujrat.
        * */
        Main m = new Main();

        System.out.println("" +
                "1 For Pascal Triangle \n" +
                "2 For Armstrong Number \n" +
                "3 For Vowels with If Else \n" +
                "4 For Vowels with Switch \n ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        switch (a){
            case 1:
                m.PascalTriangle();
                break;
            case 2:
                m.ArmstrongNumber();
                break;
            case 3:
                m.VowelsWithIfElse();
                break;
            case  4:
                m.VowelsWithSwitch();
                break;
                    default:
                        System.out.println("Wrong option");
                        break;

        }
    }

    private void PascalTriangle(){
        int r, i, k, number, j;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        r = scan.nextInt();

        for(i=0;i<r;i++) {

            for(k=r; k>i; k--) {
                System.out.print(" ");
            }

            number = 1;

            for(j=0;j<=i;j++) {

                System.out.print(number+ " ");
                number = number * (i - j) / (j + 1);

            }

            System.out.println();
        }
    }

    private void ArmstrongNumber(){
        int
                value,
                originalNumber,
                remainder,
                result = 0;

        System.out.println("Enter any number");
        Scanner number = new Scanner(System.in);
        value = number.nextInt();

        originalNumber = value;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder,3);
            originalNumber /= 10;
        }

        if(result == value){
            System.out.println(number + " is an Armstrong number.");
        }
        else{
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    private void VowelsWithIfElse(){
        String value ;

        System.out.println("Entry any latter.");
        Scanner scan = new Scanner(System.in);
        value = scan.nextLine();

        if(value.equals("a") || value.equals("A")){
            System.out.println("Latter is vowel : "+value);
        }else if (value.equals("e") || value.equals("E")){
            System.out.println("Latter is vowel : "+value);
        }else if (value.equals("i") || value.equals("I")){
            System.out.println("Latter is vowel : "+value);
        }else if (value.equals("o") || value.equals("O")){
            System.out.println("Latter is vowel : "+value);
        }else if (value.equals("u") || value.equals("U")){
            System.out.println("Latter is vowel : "+value);
        }else{
            System.out.println("Latter is not vowel : "+value);
        }

    }

    private void VowelsWithSwitch(){
        String value ;

        System.out.println("Entry any latter.");
        Scanner scan = new Scanner(System.in);
        value = scan.nextLine();

        switch (value) {
            case "a":
            case "A":
            case "e":
            case "E":
            case "i":
            case "I":
            case "o":
            case "O":
            case "u":
            case "U":
                System.out.println("Latter is vowel : " + value);
                break;
            default:
                System.out.println("Latter is not vowel : " + value);
                break;
        }
    }

}
