package millitary.elite.immplemintation;

import millitary.elite.interfaces.Comando;
import millitary.elite.interfaces.Mission;
import millitary.elite.interfaces.Repair;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

public class ComandoImpl extends SpecialisesSoldierimpl implements Comando{
    private Collection<Mission>missions;
    public ComandoImpl(int id, String firstName, String lastName, double salary, String corps,
                       Collection<Mission>missions) {
        super(id, firstName, lastName, salary, corps);
        this.setMissions(missions);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append(System.lineSeparator());
        sb.append("Missions:").append(System.lineSeparator());
        this.getMission().forEach(m -> sb.append("  ").append(m).append(System.lineSeparator()));
        return sb.toString();
    }

    @Override
    public Collection<Mission> getMission() {
        return this.missions;
    }

    @Override
    public Collection<Repair> getRepairs() {
        return null;
    }
    private void setMissions(Collection<Mission> missions) {
        if (missions != null){
            this.missions = new ArrayList<>(missions);
            return;
        }
        this.missions = new ArrayList<>();
    }
}
