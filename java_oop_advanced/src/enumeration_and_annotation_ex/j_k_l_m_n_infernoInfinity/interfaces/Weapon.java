package enumeration_and_annotation_ex.j_k_l_m_n_infernoInfinity.interfaces;

import enumeration_and_annotation_ex.j_k_l_m_n_infernoInfinity.enums.GemType;

public interface Weapon extends Comparable<Weapon>{

    public void addGem(int index, GemType gem);

    public void removeGem(int index);

    public double getItemLevel();

    public int compareTo(Weapon w);
}
