/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("What is your current age? ");
        String cas = sc.nextLine();
        System.out.printf("At what age would you like to retire? ");
        String ras = sc.nextLine();
        int ca = Integer.parseInt(cas);
        int ra = Integer.parseInt(ras);
        int yl = ra - ca;
        System.out.printf("You have %d years left until you can retire.\n", yl);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.printf("Its %d, so you can retire in %d.", year, year+yl);
    }
}