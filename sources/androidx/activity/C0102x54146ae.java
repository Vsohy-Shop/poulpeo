package androidx.activity;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1 */
/* compiled from: ViewTreeFullyLoadedReporterOwner.kt */
final class C0102x54146ae extends C12777p implements Function1<View, View> {
    public static final C0102x54146ae INSTANCE = new C0102x54146ae();

    C0102x54146ae() {
        super(1);
    }

    public final View invoke(View view) {
        C12775o.m28639i(view, "it");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
