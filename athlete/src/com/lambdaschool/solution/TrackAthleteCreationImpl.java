package com.lambdaschool.solution;

public class TrackAthleteCreationImpl implements Athlete
{
    @Override
    public void displayAthlete(String sport, String position)
    {
        System.out.println(sport + " " + position);
    }
}
