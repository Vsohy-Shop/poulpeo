package androidx.compose.p002ui.graphics.colorspace;

/* renamed from: androidx.compose.ui.graphics.colorspace.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0979k implements DoubleFunction {

    /* renamed from: a */
    public final /* synthetic */ Rgb f289a;

    public /* synthetic */ C0979k(Rgb rgb) {
        this.f289a = rgb;
    }

    public final double invoke(double d) {
        return Rgb.eotfFunc$lambda$1(this.f289a, d);
    }
}
