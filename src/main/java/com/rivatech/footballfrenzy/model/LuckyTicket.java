/*
 * Copyright (c) 2018.
 *
 * Developed by Vikas Ranjan.
 */

package com.rivatech.footballfrenzy.model;

public class LuckyTicket {

    private int year;

    private SeasonType seasonType;

    private int week;

    private Team homeTeam;

    private Team awayTeam;

    private TicketEntry ticketEntry;

    private AllocatedGrid allocatedGrid;

    private UserDetails userDetails;

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public SeasonType getSeasonType() {
        return this.seasonType;
    }

    public void setSeasonType(SeasonType seasonType) {
        this.seasonType = seasonType;
    }

    public int getWeek() {
        return this.week;
    }

    public void setWeek(int week) {
        this.week = week;
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

    public TicketEntry getTicketEntry() {
        return this.ticketEntry;
    }

    public void setTicketEntry(TicketEntry ticketEntry) {
        this.ticketEntry = ticketEntry;
    }

    public AllocatedGrid getAllocatedGrid() {
        return this.allocatedGrid;
    }

    public void setAllocatedGrid(AllocatedGrid allocatedGrid) {
        this.allocatedGrid = allocatedGrid;
    }
}
