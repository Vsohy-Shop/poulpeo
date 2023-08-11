package androidx.core.content.res;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;

/* renamed from: androidx.core.content.res.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1546b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ResourcesCompat.FontCallback f466b;

    /* renamed from: c */
    public final /* synthetic */ Typeface f467c;

    public /* synthetic */ C1546b(ResourcesCompat.FontCallback fontCallback, Typeface typeface) {
        this.f466b = fontCallback;
        this.f467c = typeface;
    }

    public final void run() {
        this.f466b.lambda$callbackSuccessAsync$0(this.f467c);
    }
}
