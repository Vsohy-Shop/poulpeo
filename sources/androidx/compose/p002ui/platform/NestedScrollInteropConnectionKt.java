package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nNestedScrollInteropConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,236:1\n76#2:237\n36#3:238\n1114#4,6:239\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n*L\n233#1:237\n234#1:238\n234#1:239,6\n*E\n"})
/* renamed from: androidx.compose.ui.platform.NestedScrollInteropConnectionKt */
/* compiled from: NestedScrollInteropConnection.kt */
public final class NestedScrollInteropConnectionKt {
    private static final float ScrollingAxesThreshold = 0.5f;

    private static final float ceilAwayFromZero(float f) {
        double d;
        if (f >= 0.0f) {
            d = Math.ceil((double) f);
        } else {
            d = Math.floor((double) f);
        }
        return (float) d;
    }

    public static final int composeToViewOffset(float f) {
        return ((int) ceilAwayFromZero(f)) * -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: getScrollAxes-k-4lQ0M  reason: not valid java name */
    public static final int m37764getScrollAxesk4lQ0M(long j) {
        int i;
        if (Math.abs(Offset.m35422getXimpl(j)) >= 0.5f) {
            i = 1;
        } else {
            i = 0;
        }
        if (Math.abs(Offset.m35423getYimpl(j)) >= 0.5f) {
            return i | 2;
        }
        return i;
    }

    @Composable
    public static final NestedScrollConnection rememberNestedScrollInteropConnection(View view, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1260107652);
        if ((i2 & 1) != 0) {
            view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1260107652, i, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.kt:231)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) view);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new NestedScrollInteropConnection(view);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        NestedScrollInteropConnection nestedScrollInteropConnection = (NestedScrollInteropConnection) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return nestedScrollInteropConnection;
    }

    private static final float reverseAxis(int i) {
        return ((float) i) * -1.0f;
    }

    /* access modifiers changed from: private */
    /* renamed from: toOffset-Uv8p0NA  reason: not valid java name */
    public static final long m37765toOffsetUv8p0NA(int[] iArr, long j) {
        float f;
        float f2;
        if (Offset.m35422getXimpl(j) >= 0.0f) {
            f = C13537l.m30881h(reverseAxis(iArr[0]), Offset.m35422getXimpl(j));
        } else {
            f = C13537l.m30876c(reverseAxis(iArr[0]), Offset.m35422getXimpl(j));
        }
        if (Offset.m35423getYimpl(j) >= 0.0f) {
            f2 = C13537l.m30881h(reverseAxis(iArr[1]), Offset.m35423getYimpl(j));
        } else {
            f2 = C13537l.m30876c(reverseAxis(iArr[1]), Offset.m35423getYimpl(j));
        }
        return OffsetKt.Offset(f, f2);
    }

    /* access modifiers changed from: private */
    /* renamed from: toViewType-GyEprt8  reason: not valid java name */
    public static final int m37766toViewTypeGyEprt8(int i) {
        return NestedScrollSource.m37063equalsimpl0(i, NestedScrollSource.Companion.m37068getDragWNlRxjI()) ^ true ? 1 : 0;
    }

    /* access modifiers changed from: private */
    public static final float toViewVelocity(float f) {
        return f * -1.0f;
    }
}
