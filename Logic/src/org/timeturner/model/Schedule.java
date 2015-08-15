package org.timeturner.model;

import java.time.Instant;
import java.util.List;

/**
 *
 * @author Barak
 */
public class Schedule {

    public Schedule() {
        throw new UnsupportedOperationException("not implemented");
    }

    public boolean isAvailable(TimeRange time) {
        throw new UnsupportedOperationException("not implemented");
    }

    public List<TimeRange> getAvailable(Instant from, Instant to) {
        throw new UnsupportedOperationException("not implemented");
    }

    public List<TimeRange> getBusy(Instant from, Instant to) {
        throw new UnsupportedOperationException("not implemented");
    }

    public void set(TimeRange time, boolean available) {
        throw new UnsupportedOperationException("not implemented");
    }
}
