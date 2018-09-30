package millitary.elite.immplemintation;

import millitary.elite.interfaces.Mission;

public class MissionImpl implements Mission{
    private static final String FINISHED_MISSION = "Finished";
    public static final String MISHION_IN_PROGRES_STATUS = "inProgress";
    private String codeName;
    private String state;

    public MissionImpl(String codeName, String state) {
        this.setCodeName(codeName);
        this.setState(state);
    }

    private void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    private void setState(String state) {
        if (MISHION_IN_PROGRES_STATUS.equals(state) || FINISHED_MISSION.equals(state)){
            this.state = state;
        }
    }

    @Override
    public String getCodeName() {
        return this.codeName;
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s",this.getCodeName(),this.getState());
    }

    @Override
    public void completeMission(){
     this.setState(FINISHED_MISSION);
    }
}
