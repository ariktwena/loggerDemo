package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here






    }


    private static void readFromFile(String filnavn)  {

        File file = new File(filnavn);

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {

                System.out.println(scanner.nextLine());

            }
        } catch (FileNotFoundException e) {
            Log.severe("fra funktionen readFromFile " + e.getMessage());
        }


    }


    private static void question(int x) throws Exception {

        String []  sokrates  = { "Du ", "Perikles " , "kan ",  "du ", "sige " ,  "mig ",  "- ",    "hvornår " , "smager ",  "en ",  "Tuborg " ,  "bedst? "};



            for (int i = 0; i < x; i++) {

                System.out.println(sokrates[i]);

            }



    }

    private static String getString(String s) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(s);

        return scanner.nextLine();

    }

    private static int getInt(String s )  {

        int i = Integer.parseInt(getString(s));

        return i;
    }

    private static int  divideBy(int x) {

        return 100 /x;




    }


}
