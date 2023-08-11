package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,227:1\n135#2:228\n135#2:230\n135#2:232\n135#2:233\n155#3:229\n155#3:231\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n*L\n55#1:228\n83#1:230\n114#1:232\n145#1:233\n50#1:229\n78#1:231\n*E\n"})
/* compiled from: Offset.kt */
public final class OffsetKt {
    public static final Modifier absoluteOffset(Modifier modifier, Function1<? super Density, IntOffset> function1) {
        Function1 function12;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "offset");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function12 = new OffsetKt$absoluteOffset$$inlined$debugInspectorInfo$1(function1);
        } else {
            function12 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new OffsetPxModifier(function1, false, function12));
    }

    @Stable
    /* renamed from: absoluteOffset-VpY3zN4  reason: not valid java name */
    public static final Modifier m33252absoluteOffsetVpY3zN4(Modifier modifier, float f, float f2) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$absoluteOffset");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new OffsetKt$absoluteOffsetVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new OffsetModifier(f, f2, false, function1, (DefaultConstructorMarker) null));
    }

    /* renamed from: absoluteOffset-VpY3zN4$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33253absoluteOffsetVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C1232Dp.m38468constructorimpl((float) 0);
        }
        return m33252absoluteOffsetVpY3zN4(modifier, f, f2);
    }

    public static final Modifier offset(Modifier modifier, Function1<? super Density, IntOffset> function1) {
        Function1 function12;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "offset");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function12 = new OffsetKt$offset$$inlined$debugInspectorInfo$1(function1);
        } else {
            function12 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new OffsetPxModifier(function1, true, function12));
    }

    @Stable
    /* renamed from: offset-VpY3zN4  reason: not valid java name */
    public static final Modifier m33254offsetVpY3zN4(Modifier modifier, float f, float f2) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$offset");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new OffsetKt$offsetVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new OffsetModifier(f, f2, true, function1, (DefaultConstructorMarker) null));
    }

    /* renamed from: offset-VpY3zN4$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33255offsetVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C1232Dp.m38468constructorimpl((float) 0);
        }
        return m33254offsetVpY3zN4(modifier, f, f2);
    }
}
