package millitary.elite.immplemintation;

import millitary.elite.interfaces.Repair;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

public class EngineerImpl extends SpecialisesSoldierimpl{
    private Collection<Repair> repairs;
    public EngineerImpl(int id, String firstName, String lastName,
                        double salary, String corps,Collection<Repair>repairs) {
        super(id, firstName, lastName, salary, corps);
        this.setRepairs(repairs);
    }
    

    @Override
    public Collection<Repair> getRepairs() {
        return this.repairs;
    }

    private void setRepairs(Collection<Repair> repairs) {
        if (repairs != null){
            this.repairs = new ArrayList<>(repairs);
            return;
        }
        this.repairs = new ArrayList<>(repairs);

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append(System.lineSeparator());
        sb.append("Repairs:").append(System.lineSeparator());
        this.getRepairs().forEach(m -> sb.append("  ").append(m).append(System.lineSeparator()));
        return sb.toString();
    }

}
