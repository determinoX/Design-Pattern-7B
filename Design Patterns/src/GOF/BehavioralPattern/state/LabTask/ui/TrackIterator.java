/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author FA20-BSE-042
 */


package GOF.BehavioralPattern.state.LabTask.ui;

import java.util.List;

public class TrackIterator {
    private List<String> tracks;
    private int currentTrackIndex;

    public TrackIterator(List<String> tracks) {
        this.tracks = tracks;
        this.currentTrackIndex = 0;
    }

    public boolean hasNext() {
        return currentTrackIndex < tracks.size() - 1;
    }

    public String next() {
        if (hasNext()) {
            currentTrackIndex++;
            return tracks.get(currentTrackIndex);
        }
        return null; // Handle end of tracks
    }

    // Add any other necessary methods
}
