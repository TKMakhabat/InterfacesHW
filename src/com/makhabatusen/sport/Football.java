package com.makhabatusen.sport;

public class Football implements Sport {

    @Override
    public void setHomeTeam(String team) {
        System.out.printf("\nHome team: %s", team);
    }

    @Override
    public void setVisitingTeam(String team) {
        System.out.printf("\nVisiting team: %s", team);
    }

    public void setBestPlayer(String bestPlayer) {
        System.out.printf("\nBest Player: %s", bestPlayer);
    }
}
