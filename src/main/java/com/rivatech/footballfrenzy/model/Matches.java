/*
 * Copyright (c) 2018.
 *
 * Developed by Vikas Ranjan.
 */

package com.rivatech.footballfrenzy.model;

import java.io.Serializable;
import java.util.Date;

public class Matches implements Serializable {
    private static final long serialVersionUID = -7308417499823290740L;

    private int year;

    private int week;

    private SeasonType seasonType;

    private Team homeTeam;

    private Team awayTeam;

    private String venueDetails;

    private Date matchDate;

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWeek() {
        return this.week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public SeasonType getSeasonType() {
        return this.seasonType;
    }

    public void setSeasonType(SeasonType seasonType) {
        this.seasonType = seasonType;
    }

    public Team getHomeTeam() {
        return this.homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return this.awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getVenueDetails() {
        return this.venueDetails;
    }

    public void setVenueDetails(String venueDetails) {
        this.venueDetails = venueDetails;
    }

    public Date getMatchDate() {
        return this.matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

}
