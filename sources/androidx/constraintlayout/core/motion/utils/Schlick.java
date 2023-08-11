package androidx.constraintlayout.core.motion.utils;

public class Schlick extends Easing {
    private static final boolean DEBUG = false;
    double eps;

    /* renamed from: mS */
    double f410mS;

    /* renamed from: mT */
    double f411mT;

    Schlick(String str) {
        this.str = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f410mS = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        this.f411mT = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    private double dfunc(double d) {
        double d2 = this.f411mT;
        if (d < d2) {
            double d3 = this.f410mS;
            return ((d3 * d2) * d2) / ((((d2 - d) * d3) + d) * ((d3 * (d2 - d)) + d));
        }
        double d4 = this.f410mS;
        return (((d2 - 1.0d) * d4) * (d2 - 1.0d)) / (((((-d4) * (d2 - d)) - d) + 1.0d) * ((((-d4) * (d2 - d)) - d) + 1.0d));
    }

    private double func(double d) {
        double d2 = this.f411mT;
        if (d < d2) {
            return (d2 * d) / (d + (this.f410mS * (d2 - d)));
        }
        return ((1.0d - d2) * (d - 1.0d)) / ((1.0d - d) - (this.f410mS * (d2 - d)));
    }

    public double get(double d) {
        return func(d);
    }

    public double getDiff(double d) {
        return dfunc(d);
    }
}
