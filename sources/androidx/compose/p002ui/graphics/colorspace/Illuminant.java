package androidx.compose.p002ui.graphics.colorspace;

/* renamed from: androidx.compose.ui.graphics.colorspace.Illuminant */
/* compiled from: Illuminant.kt */
public final class Illuminant {

    /* renamed from: A */
    private static final WhitePoint f264A = new WhitePoint(0.44757f, 0.40745f);

    /* renamed from: B */
    private static final WhitePoint f265B = new WhitePoint(0.34842f, 0.35161f);

    /* renamed from: C */
    private static final WhitePoint f266C = new WhitePoint(0.31006f, 0.31616f);
    private static final WhitePoint D50 = new WhitePoint(0.34567f, 0.3585f);
    private static final float[] D50Xyz = {0.964212f, 1.0f, 0.825188f};
    private static final WhitePoint D55 = new WhitePoint(0.33242f, 0.34743f);
    private static final WhitePoint D60 = new WhitePoint(0.32168f, 0.33767f);
    private static final WhitePoint D65 = new WhitePoint(0.31271f, 0.32902f);
    private static final WhitePoint D75 = new WhitePoint(0.29902f, 0.31485f);

    /* renamed from: E */
    private static final WhitePoint f267E = new WhitePoint(0.33333f, 0.33333f);
    public static final Illuminant INSTANCE = new Illuminant();

    private Illuminant() {
    }

    public final WhitePoint getA() {
        return f264A;
    }

    public final WhitePoint getB() {
        return f265B;
    }

    public final WhitePoint getC() {
        return f266C;
    }

    public final WhitePoint getD50() {
        return D50;
    }

    public final float[] getD50Xyz$ui_graphics_release() {
        return D50Xyz;
    }

    public final WhitePoint getD55() {
        return D55;
    }

    public final WhitePoint getD60() {
        return D60;
    }

    public final WhitePoint getD65() {
        return D65;
    }

    public final WhitePoint getD75() {
        return D75;
    }

    public final WhitePoint getE() {
        return f267E;
    }
}
