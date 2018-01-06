package iterators_and_comparators_ex.h_pet_clinics;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Clinic implements Iterable{

    private String name;
    private List<Pet> animals;
    private Integer size;

    Clinic(String name, Integer size) {
        this.name = name;
        this.setAnimals(size);
    }

    void setAnimals(Integer size) {
        if(size % 2 == 0){
            //todo message
            throw new IllegalArgumentException("Invalid operation!");
        }
        this.animals = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
             this.animals.add(null);
        }
        this.size = size;

    }

    @Override
    public Iterator<Integer> iterator() {
        return new PetIterator<>();
    }

    public boolean addPet(Pet pet){
        if(pet == null){
            throw new IllegalArgumentException("Invalid operation!");
        }

        boolean addedAnimal = false;
        if(this.iterator().hasNext()) {
            Integer ind = this.iterator().next();
            animals.set(ind, pet);
            addedAnimal = true;
        }

        return addedAnimal;
    }

    void print(){
        for (Pet animal : animals) {
            if(animal == null){
                System.out.println("Room empty");
            }else{
                System.out.println(animal);
            }
        }
    }

    void print(Integer index){
        System.out.println(this.animals.get(index));
    }

    public List<Pet> getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public Boolean hasEmptyRooms(){
        Boolean hasEmptyRoom = false;

        for (Pet animal : animals) {
            if(animal == null){
                hasEmptyRoom = true;
            }
        }

        return hasEmptyRoom;
    }

     Boolean releaseAnimal(){

        int currentInd = animals.size() / 2;
        Boolean releasedAnimal = false;

        while(true){
            if(animals.get(currentInd) != null){
                animals.set(currentInd, null);
                releasedAnimal = true;
                break;
            }

            if(currentInd == animals.size() - 1){
                currentInd = 0;
            }else{
                currentInd++;
            }

            if(currentInd == animals.size() / 2) break;
        }

        return releasedAnimal;
    }

    private class PetIterator<T extends Integer> implements Iterator<Integer>{

        @Override
        public boolean hasNext() {
            return animals.get(animals.size() - 1) == null;
        }

        @Override
        public Integer next() {
            int diff = 1;
            int counter = -1;
            Integer index = -1;

            while (true) {

                counter++;

                if(index == animals.size() - 1) {
                    return index;
                }

                if(counter == 0){
                    index = animals.size() / 2;
                    if (animals.get(index) == null){
                        return index;
                    };
                  //  continue;
                }else {

                    if (counter % 2 != 0) {
                        index = animals.size() / 2 - diff;

                    } else if (counter % 2 == 0) {
                        index = animals.size() / 2 + diff;
                        diff++;
                    }
                }

                if(animals.get(index) == null){
                    return index;
                }

            }
        }
    }
}
