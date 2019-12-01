package com.lambdaschool.solution;

public class BaseballAthleteCreationImpl implements Athlete
{
    @Override
    public void displayAthlete(String sport, String position)
    {
        System.out.println(sport + " " + position);
    }
}
