import java.util.Map;

public class Pet {
    private String name;
    public Pet(){
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void petsInfo(Map<String,Pet> pet){
        for(Map.Entry<String,Pet> e: pet.entrySet()){
            System.out.println(e.getKey());
        }
    }
}
