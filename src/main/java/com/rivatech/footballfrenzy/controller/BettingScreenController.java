/*
 * Copyright (c) 2018.
 *
 * Developed by Vikas Ranjan.
 */

package com.rivatech.footballfrenzy.controller;

import com.rivatech.footballfrenzy.model.AllocatedGrid;
import com.rivatech.footballfrenzy.model.LuckyTicket;
import com.rivatech.footballfrenzy.model.TicketEntry;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BettingScreenController {

    /**
     * This API returns available grid for lucky ticket.
     */
    public AllocatedGrid getAvailableGrid(){
        return AllocatedGrid.A;
    }

    @ApiOperation("Assigns the lucky ticket number to the user")
    public LuckyTicket assignLuckyTicket(final TicketEntry ticketEntry){
        return new LuckyTicket();
    }
}
