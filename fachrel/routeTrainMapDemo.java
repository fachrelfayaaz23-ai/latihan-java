package fachrel;
import shared.train;


public class routeTrainMapDemo {
    public static void main(String[] args) {
        
        routeTrainMap jawa = new routeTrainMap();
        jawa.assignTrain("JKT-SBY", new train("a", "b", "c", "d", "e"));
        jawa.assignTrain("JKT-SBY", new train("b", "b", "c", "d", "e"));
        jawa.assignTrain("JKT-MLG", new train("c", "b", "c", "d", "e"));
        jawa.assignTrain("JKT-BDG", new train("d", "b", "c", "d", "e"));
        jawa.assignTrain("JKT-BDG", new train("e", "b", "c", "d", "e"));
        
        jawa.getTrainsOnRoute("JKT-SBY");
        jawa.getTrainsOnRoute("JKT-BDG");
        jawa.listRoute();
        
        
    }

    }

