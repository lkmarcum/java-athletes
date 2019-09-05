package com.lambdaschool.solution;

public class HockeyAthleteCreationImpl implements Athlete
{
    @Override
    public void displayAthlete(String sport, String position)
    {
        System.out.println(sport + " " + position);
    }
}
