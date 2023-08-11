package androidx.compose.foundation;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: ExcludeFromSystemGesture.android.kt */
public final class ExcludeFromSystemGesture_androidKt {
    public static final Modifier excludeFromSystemGesture(Modifier modifier) {
        C12775o.m28639i(modifier, "<this>");
        return SystemGestureExclusionKt.systemGestureExclusion(modifier);
    }

    public static final Modifier excludeFromSystemGesture(Modifier modifier, Function1<? super LayoutCoordinates, Rect> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "exclusion");
        return SystemGestureExclusionKt.systemGestureExclusion(modifier, function1);
    }
}
