package shared;

public class train {
    String name;
    String id;
    String origin;
    String destination;
    String departureTime;

    public train(String name, String id, String origin, String destination, String departureTime) {
        this.departureTime = departureTime;
        this.destination = destination;
        this.name = name;
        this.id = id;
        this.origin = origin;
    }
    public String getName(){
        return this.name;
    }
   public String getId(){
    return this.id;
   }
   
        
    
    
}
