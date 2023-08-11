package p360id;

import android.view.View;
import kotlin.jvm.internal.C12775o;

/* renamed from: id.g */
/* compiled from: KViewExtensions.kt */
public final class C12139g {
    /* renamed from: a */
    public static final boolean m26472a(View view) {
        C12775o.m28639i(view, "<this>");
        if (view.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m26473b(View view) {
        C12775o.m28639i(view, "<this>");
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final void m26474c(View view, boolean z, int i) {
        C12775o.m28639i(view, "<this>");
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* renamed from: d */
    public static /* synthetic */ void m26475d(View view, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8;
        }
        m26474c(view, z, i);
    }
}
