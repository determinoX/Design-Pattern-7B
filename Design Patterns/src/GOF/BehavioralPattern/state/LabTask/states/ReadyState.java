package GOF.BehavioralPattern.state.LabTask.states;

import GOF.BehavioralPattern.state.LabTask.ui.Player;

public class ReadyState extends State {
    private long track5StartTime = 0;

    public ReadyState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        return "Locked...";
    }

    @Override
    public String onPlay() {
        if (player.getCurrentTrackInfo().equals("Track 5")) {
            track5StartTime = System.currentTimeMillis();
        }
        String action = player.startPlayback();
        player.changeState(new PlayingState(player));
        return action;
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
