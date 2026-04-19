public class test {
    public static void main(String[] args) {
        
        map nama = new map();
        nama.assign("asep");
        nama.assignnext("asep","adi");
        nama.assignnext("adi","johhny");
        nama.display();
        nama.remove(0);
        nama.display();
        
        

        /*entry[] testbuck = new entry[10];
        testbuck[0] = new entry("Asep");
        testbuck[0].next = new entry("adi");
        System.out.println(testbuck[0].name);
        entry a = testbuck[0];
        testbuck[0] = null;
        System.out.println(testbuck[0].name);
        */
        


        

    }

   
}

class map{
    entry[] bucket = new entry[10];

    void assign(String name){
        bucket[0] = new entry(name);
        System.out.println("nama " + name + " telah dimasukkan kedalam bucket");
    }

    void assignnext(String head,String next){
        entry current = bucket[0];
        while (current != null){
        if (current.name == head & current.next == null){
            current.next = new entry(next);
            System.out.println(next + " telah dimasukkan setelah " + head);
        } else if (current.name == head & current.next != null) {
            System.out.println("sudah ada next setelah " + head);
        } 
        current = current.next;
        }
        
        }
    
    void display(){
        entry current = bucket[0];
        int i = 1;
        if (current != null){
            while (current != null){
                System.out.println(i + ". " + current.name);
                current = current.next;
                i++;
            }
        }else 
            System.out.println("Tidak ada yang dapat diperlihatkan");
        }
    
    


    void remove(int remove){
        bucket[remove] = null;

    }
}



class entry{
        String name;
        entry next;
        
        entry(String name){
            this.name = name;
            this.next = null;
        }
    }
