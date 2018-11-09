/*
 * Copyright (c) 2018.
 *
 * Developed by Vikas Ranjan.
 */

package com.rivatech.footballfrenzy.model;

public enum Team {

    AFC("Arizona Cardinals"),
    ATL("Atlanta Falcons"),
    BAL("Baltimore Ravens"),
    BUF("Buffalo Bills"),
    CAR("Carolina Panthers"),
    CHI("Chicago Bears"),
    CIN("Cincinnati Bengals"),
    CLE("Cleveland Browns"),
    DAL("Dallas Cowboys"),
    DEN("Denver Broncos"),
    DET("Detroit Lions"),
    GB("Green Bay Packers"),
    HOU("Houston Texans"),
    IND("Indianapolis Colts"),
    JAX("Jacksonville Jaguars"),
    KC("Kansas City Chiefs"),
    MIA("Miami Dolphins"),
    MIN("Minnesota Vikings"),
    NE("New England Patriots"),
    NO("New Orleans Saints"),
    NYG("NY Giants"),
    NYJ("NY Jets"),
    OAK("Oakland Raiders"),
    PHI("Philadelphia Eagles"),
    PIT("Pittsburgh Steelers"),
    SD("San Diego Chargers"),
    SF("San Francisco 49ers"),
    SEA("Seattle Seahawks"),
    STL("St. Louis Rams"),
    TB("Tampa Bay Buccaneers"),
    TEN("Tennessee Titans"),
    WAS("Washington Redskins");

    private String teamName;

    Team(final String teamName) {
        this.teamName = teamName;
    }
    public String getTeamName() {
        return teamName;
    }
}
