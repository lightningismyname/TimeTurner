package org.timeturner.model;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author Barak
 */
public class TimeRange {
    private final Instant start;
    private final Instant end;

    public TimeRange(Instant start, Instant end) {
        this.start = start;
        this.end = end;
    }

    public TimeRange(Instant start, Duration duration) {
        this(start, start.plus(duration));
    }

    public Instant getStart() {
        return start;
    }

    public Instant getEnd() {
        return end;
    }
    
    public Duration getDuration() {
        return Duration.between(start, end);
    }
}
