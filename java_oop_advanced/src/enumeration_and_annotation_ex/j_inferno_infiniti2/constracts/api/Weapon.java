package enumeration_and_annotation_ex.j_inferno_infiniti2.constracts.api;

public interface Weapon {
    String getName();

    void addGem(String gemType, Integer ind);

    void removeGem(Integer ind);
}
