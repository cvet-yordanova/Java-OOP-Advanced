package dependency_inversion_seggre_ex.contracts;

import java.io.IOException;

public interface Reader {
    String readLine() throws IOException;
}
