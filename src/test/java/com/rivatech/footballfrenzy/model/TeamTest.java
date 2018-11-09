/*
 * Copyright (c) 2018.
 *
 * Developed by Vikas Ranjan.
 */

package com.rivatech.footballfrenzy.model;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class TeamTest {

    @Test
    public void testTeamCount() {
        final int teamLength = Team.values().length;
        assertThat(teamLength, is(32));
    }
}
