package fachrel;

import shared.train;

public class routeTrainMap {
    entry[] bucket = new entry[10];

    int hash(String key){
    return Math.abs(key.hashCode()) % bucket.length;
    }

    void assignTrain(String key, train value){
        int index = hash(key);
        entry current = bucket[index];
        
        if (current == null){ //bucket kosong
            bucket[index] = new entry(key, value);
            return;
        }
        if (current.key.equals(key)){ 
            nodeValue temp = current.value;
                
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new nodeValue(value);
            return;
        }
        while (current.key != key){
            if (current.key.equals(key)){ 
            nodeValue temp = current.value;
                
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new nodeValue(value);
            return;
        }
        current = current.next;
        
        }
        while (current.next != null){
            current = current.next;
        }
        current.next = new entry(key, value);
    }
    
    void listRoute(){
        System.out.println("=== Daftar Rute ===");
        for (int i = 0; i < bucket.length;i++){
            entry current = bucket[i];
            while (current != null){
                System.out.println(current.key);
                current = current.next;
            }
        }
    }

    void getTrainsOnRoute(String key){
        System.out.println("=== Kereta Route " + key + " === ");
        int index = hash(key);
        entry current = bucket[index];

        while (current != null){
            if (current.key == key){
                nodeValue temp = current.value;
                int i = 1;
                while (temp != null){
                    System.out.println(i + "." + temp.value.getName());
                    i++;
                    temp = temp.next;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Tidak ada kereta yang berada di jalur ini");
    }

    void removeRoute(String key){
        int index = hash(key);
        entry current = bucket[index];
        entry prev = null;

        while(current != null){ // cek bucket
            if(current.key == key){ //cek key  
                if(prev == null){ // jika key berada di awal
                    bucket[index] = current.next;
                    System.out.println("key " + key + " berhasil dihapus ");
                    return;
                } else{ // jika key gk berada di awal
                    prev.next = current.next;
                    return;
                }
            }
            prev = current;
            current = current.next;
        }
        
    }

}

class entry {
    String key;
    nodeValue value;
    entry next;

    entry(String key, train value) {
        this.key = key;
        this.value = new nodeValue(value);
        next = null;
    }

}

class nodeValue {
    train value;
    nodeValue next;

    nodeValue(train value){
        this.value = value;
        this.next = null;
    }
}
