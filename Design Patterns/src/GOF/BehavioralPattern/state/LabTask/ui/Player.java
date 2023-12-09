package GOF.BehavioralPattern.state.LabTask.ui;

import java.util.ArrayList;
import java.util.List;
import GOF.BehavioralPattern.state.LabTask.states.State;
import GOF.BehavioralPattern.state.LabTask.states.ReadyState;

public class Player {
    private State state;
    private boolean playing = false;
    private List<String> playlist = new ArrayList<>();
    private int currentTrack = 0;
    private long track5StartTime = 0;

    private TrackIterator trackIterator;

    public Player() {
        this.state = new ReadyState(this);
        setPlaying(true);
        for (int i = 1; i <= 12; i++) {
            playlist.add("Track " + i);
        }
        trackIterator = new TrackIterator(playlist);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }

     public String startPlayback() {
        String currentTrackInfo = trackIterator.next();
        if (currentTrackInfo.equals("Track 5")) {
            track5StartTime = System.currentTimeMillis();
        }
        return "Playing " + currentTrackInfo;
    }

    public String nextTrack() {
        // Check if current track is Track 5 and duration exceeds 3 seconds
        if (track5StartTime > 0 && playlist.get(currentTrack).equals("Track 5")) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - track5StartTime > 3000) {
                // Alert user about technical damage and stop playing
                setPlaying(false);
                return "Track 5 exceeded 3 seconds, player technically damaged. Reset the player.";
            }
        }
        currentTrack++;
        if (currentTrack > playlist.size() - 1) {
            currentTrack = 0;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    // Implement similar logic for previousTrack() if needed

    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }
    public String getCurrentTrackInfo() {
    return playlist.get(currentTrack); // Assuming currentTrack represents the index of the current track
}

public String previousTrack() {
    currentTrack--;
    if (currentTrack < 0) {
        currentTrack = playlist.size() - 1;
    }
    return "Playing " + playlist.get(currentTrack);
}
}
