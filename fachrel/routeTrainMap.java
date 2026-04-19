package fachrel;

import shared.train;

public class routeTrainMap {
    entry[] bucket = new entry[10];

    int hash(String key){
    return Math.abs(key.hashCode()) % bucket.length;
    }

    void put(String key, train value){
        int index = hash(key);
        entry newentry = new entry(key, value);

        if (bucket[index] == null){
            bucket[index] = newentry;
        } else{
            entry current = bucket[index];
            while (current.next != null){
                current = current.next;
            }
            current.next = newentry;
        }

    
   
    }

    train get(String key){
        int index = hash(key);
        entry current = bucket[index];

        while (current != null){
            if (current.key == key){
                return current.value;
            }
            current = current.next;
        }
        return null;   
    }


    void getTrainsOnRoute(String key){
        System.out.printf("=== Kereta Route ", key, " ===");

        int index = hash(key);
        entry current = bucket[index];
        int i = 1;

        while (current.next != null){
            System.out.printf(i , ". " );
            i++;

        }

    }



    

    


}

class entry {
    String key;
    train value;
    entry next;

    entry(String key, train value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    
        
    
}
