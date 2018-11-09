package com.rivatech.footballfrenzy.controller;

import com.rivatech.footballfrenzy.model.UpcomingMatches;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeScreenController {

    @GetMapping("/test")
    public String testHomeController(){
        return "hello world";
    }

    @ApiOperation("Gets the upcoming match details")
    @GetMapping("/upcomingMatches")
    public List<UpcomingMatches> getUpcomingMatches(){
        final UpcomingMatches upcomingMatches = new UpcomingMatches();
        final List<UpcomingMatches> upcomingMatchesList = new ArrayList<>();
        upcomingMatchesList.add(upcomingMatches);
        return upcomingMatchesList;
    }

}
