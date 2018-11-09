package com.rivatech.footballfrenzy.service;

import com.rivatech.footballfrenzy.model.LiveMatches;
import com.rivatech.footballfrenzy.model.PastMatches;
import com.rivatech.footballfrenzy.model.UpcomingMatches;
import org.springframework.stereotype.Service;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@Service
@EnableSwagger2
public interface HomeScreenService {

    /**
     * Returns The list of {@link UpcomingMatches}.
     * @return The list of {@link UpcomingMatches}.
     */
    public List<UpcomingMatches> upcomingMatches();

    /**
     * Returns The list of {@link LiveMatches}.
     * @return The list of {@link LiveMatches}.
     */
    public List<LiveMatches> liveMatches();

    /**
     * Returns The list of {@link PastMatches}.
     * @return The list of {@link PastMatches}.
     */
    public List<PastMatches> pastMatches();
}
