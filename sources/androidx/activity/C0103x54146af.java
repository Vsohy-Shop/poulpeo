package androidx.activity;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2 */
/* compiled from: ViewTreeFullyLoadedReporterOwner.kt */
final class C0103x54146af extends C12777p implements Function1<View, FullyDrawnReporterOwner> {
    public static final C0103x54146af INSTANCE = new C0103x54146af();

    C0103x54146af() {
        super(1);
    }

    public final FullyDrawnReporterOwner invoke(View view) {
        C12775o.m28639i(view, "it");
        Object tag = view.getTag(C0100R.C0101id.report_drawn);
        if (tag instanceof FullyDrawnReporterOwner) {
            return (FullyDrawnReporterOwner) tag;
        }
        return null;
    }
}
