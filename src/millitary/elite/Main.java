package millitary.elite;

import millitary.elite.immplemintation.*;
import millitary.elite.interfaces.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Soldier> army = new LinkedHashMap<>();
        String line = "";
        while (true) {
            if ("end".equalsIgnoreCase(line = br.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+");
            int id = Integer.valueOf(tokens[1]);
            String name = tokens[2];
            String lastName = tokens[3];
            switch (tokens[0]) {
                case "Private":
                    army.putIfAbsent(id, new PrivateImpl
                            (id, name, lastName, Double.valueOf(tokens[4])));
                    break;

                case "LeutenantGeneral":
                    Collection<Private> somePrivate = new ArrayList<>();
                    Stream.of(tokens).skip(5).map(Integer::parseInt)
                            .collect(Collectors.toList()).forEach(e ->
                            somePrivate.add(Private.class.cast(army.get(e))));

                    army.putIfAbsent(id, new LutenantGeneralImpl(id, name, lastName, Double.valueOf(tokens[4])
                            , somePrivate));
                    break;
                case "Engineer":
                    SpecialisesSoldier engeneer = new EngineerImpl
                            (id, name, lastName, Double.valueOf(tokens[4]), tokens[5], parseRepair(tokens));
                    if (engeneer.getCorps()!= null){

                    army.putIfAbsent(id,engeneer);
                    }
                    break;
                case "Commando":
                    SpecialisesSoldier soldier = new ComandoImpl
                            (id, name, lastName, Double.valueOf(tokens[4]), tokens[5], parseMission(tokens));
                    if (soldier.getCorps()!= null){

                    army.putIfAbsent(id,soldier );
                    }
                    break;
                case "Spy":
                    army.putIfAbsent(id, new Spyimpl(id, name, lastName, Integer.valueOf(tokens[4])));
                    break;

            }

        }
        for (Soldier soldier : army.values()) {
            System.out.println(soldier.toString().trim());
        }
    }

    private static Collection<Repair> parseRepair(String... args) {
        Collection<Repair> rp = new ArrayList<>();
        for (int i = 6; i < args.length; i += 2) {
            rp.add(new RepairImpl(args[i], Integer.valueOf(args[i + 1])));
        }
        return rp;
    }

    private static Collection<Mission> parseMission(String... args) {
        Collection<Mission> mp = new ArrayList<>();
        for (int i = 6; i < args.length; i += 2) {
            Mission m = new MissionImpl(args[i], args[i + 1]);
            if (m.getState() != null) {

                mp.add(m);
            }
        }
        return mp;
    }
}

