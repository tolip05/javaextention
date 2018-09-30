package avatar;

import avatar.benders.Bender;
import avatar.benders.monuments.*;

import java.util.ArrayList;
import java.util.Collections;

public class Controler {
    private static Nation airNation = new Nation(new ArrayList<>(),new ArrayList<>());
    private static Nation fireNation = new Nation(new ArrayList<>(),new ArrayList<>());
    private static Nation earthNation = new Nation(new ArrayList<>(),new ArrayList<>());
    private static Nation waterNation = new Nation(new ArrayList<>(),new ArrayList<>());

    public static Nation getAirNation() {
        return airNation;
    }

    public static Nation getFireNation() {
        return fireNation;
    }

    public static Nation getEarthNation() {
        return earthNation;
    }

    public static Nation getWaterNation() {
        return waterNation;
    }

    static void beginWar(){
    double airPower = airNation.calculateNationPower();
    double firePower = fireNation.calculateNationPower();
    double earthPower = earthNation.calculateNationPower();
    double waterPower = waterNation.calculateNationPower();

    if (airPower > firePower && airPower > earthPower && airPower > waterPower){
        clearNationBenderAndMonument(earthNation,fireNation,waterNation);
    }else if (firePower > airPower && firePower > earthPower && firePower > waterPower){
        clearNationBenderAndMonument(airNation,earthNation,waterNation);
    }else if (waterPower > airPower && waterPower > firePower && waterPower > earthPower){
        clearNationBenderAndMonument(airNation,fireNation,earthNation);
    }else{
        clearNationBenderAndMonument(airNation,fireNation,waterNation);
    }

    }

    private static void clearNationBenderAndMonument
            (Nation n1, Nation n2, Nation n3) {
   n1.clesrBender();
   n1.clearMonument();
   n2.clesrBender();
   n2.clearMonument();
   n3.clesrBender();
   n3.clearMonument();
    }

    public static String getStatus(String type){
        Nation curentNation = getNation(type);
        StringBuilder sb = new StringBuilder();
        sb.append(type).append(" Nation").append("\n");

        if (curentNation.getBenders().size() > 0){
            sb.append("Benders:").append("\n");
            for (Bender bender : curentNation.getBenders()) {
                sb.append(bender).append("\n");
            }
        }else {
            sb.append("Benders: None").append("\n");
        }
        if (curentNation.getMonuments().size() > 0){
            sb.append("Monuments:").append("\n");
            for (Monument monument : curentNation.getMonuments()) {
                sb.append(monument).append("\n");
            }
        }else {
            sb.append("Monuments: None").append("\n");
        }
        return sb.toString();
    }

    private static Nation getNation(String type){

        switch (type){
            case "Air":
                return airNation;

            case "Water":
                return waterNation;

            case "Fire":
                return fireNation;

            case "Earth":
                return earthNation;
            default:
                return null;
        }
    }

}
