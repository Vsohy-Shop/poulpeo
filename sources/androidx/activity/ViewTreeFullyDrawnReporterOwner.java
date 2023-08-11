package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.C12775o;

/* compiled from: ViewTreeFullyLoadedReporterOwner.kt */
public final class ViewTreeFullyDrawnReporterOwner {
    public static final FullyDrawnReporterOwner get(View view) {
        C12775o.m28639i(view, "<this>");
        return (FullyDrawnReporterOwner) C13662o.m31283p(C13662o.m31288u(C13657m.m31272f(view, C0102x54146ae.INSTANCE), C0103x54146af.INSTANCE));
    }

    public static final void set(View view, FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        C12775o.m28639i(view, "<this>");
        C12775o.m28639i(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(C0100R.C0101id.report_drawn, fullyDrawnReporterOwner);
    }
}
