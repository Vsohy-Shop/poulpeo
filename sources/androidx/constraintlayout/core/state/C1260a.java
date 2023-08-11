package androidx.constraintlayout.core.state;

/* renamed from: androidx.constraintlayout.core.state.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1260a implements Interpolator {

    /* renamed from: a */
    public final /* synthetic */ String f415a;

    public /* synthetic */ C1260a(String str) {
        this.f415a = str;
    }

    public final float getInterpolation(float f) {
        return Transition.lambda$getInterpolator$0(this.f415a, f);
    }
}
