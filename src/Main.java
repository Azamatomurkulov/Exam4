import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        HashMap<String, String> toys = new HashMap<>();
        toys.put("m16","gun");
        toys.put("Batman","Solder");
        toys.put("BMW","car");

        keyValueInfo(toys);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
        keyInfo(toys);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
        valueInfo(toys);
    }
    public static void keyValueInfo(Map<String, String> map){
        for(Map.Entry<String, String> e: map.entrySet()){
            System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
        }
    }
    public static void keyInfo(Map<String, String> map){
        for(Map.Entry<String, String> e: map.entrySet()){
            System.out.println("Key: "+e.getKey());
        }
    }
    public static void valueInfo(Map<String, String> map){
        for(Map.Entry<String, String> e: map.entrySet()){
            System.out.println("Value: "+e.getValue());
        }
    }
}
