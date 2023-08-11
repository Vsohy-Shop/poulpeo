package p353hd;

import android.animation.TimeInterpolator;
import androidx.annotation.NonNull;

/* renamed from: hd.b */
/* compiled from: EasingInterpolator */
public class C12058b implements TimeInterpolator {

    /* renamed from: a */
    private final C12057a f18894a;

    public C12058b(@NonNull C12057a aVar) {
        this.f18894a = aVar;
    }

    public float getInterpolation(float f) {
        return C12059c.m26234a(this.f18894a, f);
    }
}
