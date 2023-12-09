package GOF.BehavioralPattern.state.LabTask.states;

import GOF.BehavioralPattern.state.LabTask.ui.Player;

public class DamagedState extends State {
    public DamagedState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        return "Player is damaged. Reset to restore.";
    }

    @Override
    public String onPlay() {
        return "Player is damaged. Reset to restore.";
    }

    @Override
    public String onNext() {
        return "Player is damaged. Reset to restore.";
    }

    @Override
    public String onPrevious() {
        return "Player is damaged. Reset to restore.";
    }
}
