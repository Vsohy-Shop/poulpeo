package p215s;

import android.view.View;

/* renamed from: s.m */
/* compiled from: ViewSizeResolver.kt */
public final class C9421m {
    /* renamed from: a */
    public static final <T extends View> C9418l<T> m19475a(T t, boolean z) {
        return new C9412g(t, z);
    }

    /* renamed from: b */
    public static /* synthetic */ C9418l m19476b(View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return m19475a(view, z);
    }
}
