package TIL.practice0416.Basic.ch06.sec11.exam02;

public class Earth {
    static final double RADIUS = 64000;

    static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * RADIUS * RADIUS;
    }

}
