package com.rajeshchinni;

public class Main {

    public static void main(String[] args) {

        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.


        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        Team<FootballPlayer> adelaideCrows = new Team<FootballPlayer>("Adelaide crows");
        Team<FootballPlayer> melbourne = new Team<FootballPlayer>("melbourne");
        Team<FootballPlayer> hawthorne = new Team<FootballPlayer>("Hawthorne");
        Team<FootballPlayer> fremantle = new Team<FootballPlayer>("Fremantle");

        hawthorne.matchResult(fremantle, 1, 0);
        hawthorne.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantle, 2, 1);

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorne);
        footballLeague.add(fremantle);

        footballLeague.showLeagueTable();



    }
}
