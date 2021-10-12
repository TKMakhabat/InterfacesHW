package com.makhabatusen;

import com.makhabatusen.building.Theater;
import com.makhabatusen.doctor.Neurosurgeon;
import com.makhabatusen.furniture.Bookcase;
import com.makhabatusen.mobile.Model;
import com.makhabatusen.ship.Flattop;
import com.makhabatusen.ship.Tanker;
import com.makhabatusen.sport.Football;
import com.makhabatusen.sport.Hockey;

public class Main {

    public static void main(String[] args) {

        // Task 1
        Football football = new Football();
        football.setHomeTeam("Brazil");
        football.setVisitingTeam("Spain");
        football.setBestPlayer("Sergio Ramos");
        printSpace();


        Hockey hockey = new Hockey();
        hockey.setHomeTeam("India");
        hockey.setVisitingTeam("Australia");
        hockey.setWinningTeam("Australia");
        printSpace();



        //Task 2

        // Building
        Theater theater = new Theater();
        theater.build(5);
        theater.build(5, "Kiev street 215");
        printSpace();

        //Mobile
        Model model = new Model();
        model.setModel("A31");
        model.setNetWork("GSM");
        printSpace();
        
        model.setNetWork("AF51", "CDMA");
        printSpace();

        // Ships
        Flattop flattop = new Flattop("CV 64");
        flattop.setDestination("USA");
        printSpace();

        Tanker tanker = new Tanker("ST1");
        tanker.setDestination("Africa");
        printSpace();

        // Doctors
        Neurosurgeon neurosurgeon = new Neurosurgeon("Alex");
        neurosurgeon.placeOfWork("Medcenter");
        printSpace();

        // Furniture
        Bookcase bookcase = new Bookcase();
        bookcase.madeFrom("wood");


    }


    public static void printSpace() {
        System.out.println("\n_____");
    }
}
