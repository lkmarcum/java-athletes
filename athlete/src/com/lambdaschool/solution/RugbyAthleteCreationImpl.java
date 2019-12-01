package com.lambdaschool.solution;

public class RugbyAthleteCreationImpl implements Athlete
{
    @Override
    public void displayAthlete(String sport, String position)
    {
        System.out.println(sport + " " + position);
    }
}
