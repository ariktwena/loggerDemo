package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here



        try {
            question(20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    private static void question(int x) throws Exception {

        String []  sokrates  = { "Du ", "Perikles " , "kan ",  "du ", "sige " ,  "mig ",  "- ",    "hvornår " , "smager ",  "en ",  "Tuborg " ,  "bedst? "};


        try {
            for (int i = 0; i < x; i++) {

                System.out.println(sokrates[i]);

            }
        } catch (Exception e) {
            Log.severe("fra spørgsmålet " + e);
            throw new MinFejl("altid Sokraters.... altid");

        }


    }

    private static String getString(String s) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(s);

        return scanner.nextLine();

    }

    private static int getInt(String s ) {

        return Integer.parseInt(getString(s));

    }

    private static int  divideBy(int x) {

        return 100 /x;




    }

    private static void readFromFile(String filnavn)  {

        File file = new File(filnavn);

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {

                System.out.println(scanner.nextLine());

            }
        } catch (FileNotFoundException e) {
            Log.severe("fra funktionen læs" + e.getMessage());
        }


    }
}
