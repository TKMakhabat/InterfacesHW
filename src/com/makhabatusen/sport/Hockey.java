package com.makhabatusen.sport;

public class Hockey implements Sport {

    @Override
    public void setHomeTeam(String team) {
        System.out.printf("\nHome team: %s", team);
    }

    @Override
    public void setVisitingTeam(String team) {
        System.out.printf("\nVisiting team: %s", team);
    }

    public void setWinningTeam(String team) {
        System.out.printf("\nThe winning team: %s", team);
    }
}
