package net.htlgrieskirchen.smartf1;

import java.util.Arrays;

public class Track {

    private String circuitId;
    private String url;
    private String circuitName;
    private TrackLocation[] trackLocations;

    public String getCircuitId() {
        return circuitId;
    }

    @Override
    public String toString() {
        return "Track{" +
                "circuitId='" + circuitId + '\'' +
                ", url='" + url + '\'' +
                ", circuitName='" + circuitName + '\'' +
                ", trackLocations=" + Arrays.toString(trackLocations) +
                '}';
    }

    public void setCircuitId(String circuitId) {
        this.circuitId = circuitId;
    }

    public String getUrl() {
        return url;
    }

    public Track(String circuitId, String url, String circuitName, TrackLocation[] trackLocations) {
        this.circuitId = circuitId;
        this.url = url;
        this.circuitName = circuitName;
        this.trackLocations = trackLocations;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCircuitName() {
        return circuitName;
    }

    public void setCircuitName(String circuitName) {
        this.circuitName = circuitName;
    }

    public TrackLocation[] getTrackLocations() {
        return trackLocations;
    }

    public void setTrackLocations(TrackLocation[] trackLocations) {
        this.trackLocations = trackLocations;
    }
}
