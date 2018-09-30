package avatar;

import avatar.benders.*;
import avatar.benders.monuments.*;

public class Factory {
    static void  createBender(String type, String name, int power
            , double secPer) {
        switch (type) {
            case "Air":
                Controler.getAirNation().addBender(new AirBender(name, power, secPer));
                break;
            case "Water":
                Controler.getWaterNation().addBender(new WaterBender(name, power, secPer));
                break;
            case "Fire":
                Controler.getFireNation().addBender(new FireBender(name, power, secPer));
                break;
            case "Earth":
                Controler.getEarthNation().addBender(new EarthBender(name, power, secPer));
                break;
            default:
                break;
        }
    }

     static void createMonument(String type, String name, int affinity){
        switch (type){
            case "Air":
                Controler.getAirNation().addMonument(new AirMonument(name,affinity));
                break;
            case "Water":
                Controler.getWaterNation().addMonument(new WaterMonument(name,affinity));
                break;
            case "Fire":
                Controler.getFireNation().addMonument(new FireMonument(name,affinity));
                break;
            case "Earth":
                Controler.getEarthNation().addMonument(new EarthMonument(name,affinity));
                break;
            default:
                break;
        }
    }
}
