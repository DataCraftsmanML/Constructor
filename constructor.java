public class constructor {

    int x;
    String jia;


    public constructor(int character, String name){

        x = character;
        jia = name;
   

    }

    public static void main(String[] args){

        constructor store = new constructor(12, "jia");
        System.out.println("The Digit Is " + store.x + " And" + " This Character Is " + store.jia);

        
    
    }
    
}
