package shared;

public class train{
    String name;
    String id;

    public train(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    public static void main(String[] args) {
        train t1 = new train("kereta", "T1");
        System.out.println(t1);
        train t2 = new train(null, null);
    }
    

}
