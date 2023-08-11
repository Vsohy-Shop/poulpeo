package androidx.compose.p002ui.unit;

import android.content.Context;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.unit.AndroidDensity_androidKt */
/* compiled from: AndroidDensity.android.kt */
public final class AndroidDensity_androidKt {
    public static final Density Density(Context context) {
        C12775o.m28639i(context, "context");
        return DensityKt.Density(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }
}
