package enumeration_and_annotation_ex.j_k_l_m_n_infernoInfinity.classes;


import enumeration_and_annotation_ex.j_k_l_m_n_infernoInfinity.interfaces.Writer;

public class OutputWriter implements Writer {

    OutputWriter() {}

    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
