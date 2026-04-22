public class hashmap {
    public static void main(String[] args) {
        hashesMap map = new hashesMap();
        map.assign("Asep", "Adi");
        map.assign("g", "Ada");
        map.assign("Johnny", "Ado");
        map.assign("Ado", "Ade");
        map.assign("Joseph", "Adu");
        //map.display("g");
        //map.display("Asep");
        map.listkey();
        map.removeroute("g");
        map.listkey();

        
    }
    
}

class hashesMap{
    entry[] bucket = new entry[10];
    

    int hash(String key){
        return Math.abs(key.hashCode()) % bucket.length;
        
    }

    void assign(String key,String value){
        int index = hash(key);
        entry current = bucket[index];

        if (current == null){
            bucket[index] = new entry(key,value);
            System.out.println(value + " berhasil ditambahkan ke " + key);
        } else{
            while (current.next != null){
                    current = current.next;
            }
            current.next = new entry(key,value);
            System.out.println(value + " berhasil ditambahkan ke " + key);
                
            }
        }
        
    void listkey(){
        for (int i = 0; i < bucket.length; i++){
            entry current = bucket[i];
            if (current == null){
                continue;
            }else{
                while (current != null){
                    System.out.println("- " + current.key);
                    current = current.next;
                }
            }
        }
    }
    
    void removeroute(String key){
        int index = hash(key);
        entry current = bucket[index];
        entry prev = null;

        while (current != null){
            if (current.key == key){
                if (prev == null){
                    bucket[index] = current.next;
                    System.out.println("Berhasil menghapus " + key);
                } else {
                    prev.next = current.next;
                    current = prev.next;
                    System.out.println("Berhasil menghapus " + key);

                }
            
            }else{
            prev = current;
            current = current.next;
            }
        }
        


        
    }

    void display(String key){
        int index = hash(key);
        entry current = bucket[index];
        while (current != null){
            if (current.key == key){
                System.out.println("=== " + "Nama " + key + " ===");
                System.out.println(current.value);
            }
            current = current.next;
        }

    }
}





class entry{
    String key;
    String value;
    entry next;

    entry(String key, String value){
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
