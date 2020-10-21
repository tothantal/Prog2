package artifactid;

import java.io.Writer;

public interface MapImage {
    void addPoint(double x, double y, String state);

    void save(Writer targetStream);
}