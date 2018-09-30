package millitary.elite.immplemintation;

import millitary.elite.interfaces.LutenantGeneral;
import millitary.elite.interfaces.Private;
import millitary.elite.interfaces.Repair;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

public class LutenantGeneralImpl extends PrivateImpl implements LutenantGeneral {
    private Collection<Private> privates;

    public LutenantGeneralImpl(int id, String firstName, String lastName, double salary, Collection<Private>privates) {
        super(id, firstName, lastName, salary);
        this.setPrivates(privates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append(System.lineSeparator());
        sb.append("Privates:").append(System.lineSeparator());
        this.getPrivates().forEach(p -> sb.append("  ").append(p).append(System.lineSeparator()));
        return sb.toString();
    }

    @Override
    public Collection<Private> getPrivates() {
        return this.privates;
    }



    private void setPrivates(Collection<Private> privates) {
        if (privates != null) {
            this.privates = new ArrayList<>(privates);
            return;
        }
        this.privates = new ArrayList<>(privates);

    }
}
