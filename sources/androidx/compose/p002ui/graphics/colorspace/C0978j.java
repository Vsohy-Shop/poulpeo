package androidx.compose.p002ui.graphics.colorspace;

/* renamed from: androidx.compose.ui.graphics.colorspace.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0978j implements DoubleFunction {

    /* renamed from: a */
    public final /* synthetic */ Rgb f288a;

    public /* synthetic */ C0978j(Rgb rgb) {
        this.f288a = rgb;
    }

    public final double invoke(double d) {
        return Rgb.oetfFunc$lambda$0(this.f288a, d);
    }
}
