package GOF.BehavioralPattern.state.LabTask.states;

import GOF.BehavioralPattern.state.LabTask.ui.Player;

public class LockedState extends State {
    private long track5StartTime = 0;

    LockedState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    public String onLock() {
        if (player.isPlaying()) {
            player.changeState(new ReadyState(player));
            return "Stop playing";
        } else {
            return "Locked...";
        }
    }

    @Override
    public String onPlay() {
        if (player.getCurrentTrackInfo().equals("Track 5")) {
            track5StartTime = System.currentTimeMillis();
        }
        player.changeState(new ReadyState(player));
        return "Ready";
    }

    @Override
    public String onNext() {
        if (player.getCurrentTrackInfo().equals("Track 5") && track5StartTime > 0) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - track5StartTime > 3000) {
                player.setPlaying(false);
                return "Track 5 exceeded 3 seconds, player technically damaged. Reset the player.";
            }
        }
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        if (player.getCurrentTrackInfo().equals("Track 5") && track5StartTime > 0) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - track5StartTime > 3000) {
                player.setPlaying(false);
                return "Track 5 exceeded 3 seconds, player technically damaged. Reset the player.";
            }
        }
        return "Locked...";
    }
}
