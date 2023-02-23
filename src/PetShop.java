import java.util.ArrayList;
public class PetShop {
    private ArrayList<Dog> aPets;


    public PetShop(){
        this.aPets = new ArrayList<Dog>();
    }


    public void addPet(Dog aPet){
        assert aPet !=null;
        aPets.add(aPet);
    }

    public void removePet(Dog aPet){
        assert aPet != null;
        aPets.remove(aPet);
    }

    public static void main(String[] args){

    }

}
