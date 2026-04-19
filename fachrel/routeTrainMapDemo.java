package fachrel;
import shared.train;


public class routeTrainMapDemo {
    public static void main(String[] args) {
        
        routeTrainMap jawa = new routeTrainMap();
        jawa.put("JKT-SBY", new train("a", "b", "c", "d", "e"));
        train a = jawa.get("JKT-SBY");
        System.out.println(a.getName());
        
        
    }

    }

