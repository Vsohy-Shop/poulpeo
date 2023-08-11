package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,217:1\n135#2:218\n135#2:219\n135#2:220\n135#2:221\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n51#1:218\n77#1:219\n101#1:220\n121#1:221\n*E\n"})
/* compiled from: WindowInsetsSize.kt */
public final class WindowInsetsSizeKt {
    @Stable
    public static final Modifier windowInsetsBottomHeight(Modifier modifier, WindowInsets windowInsets) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(windowInsets, "insets");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0505x993d91c4(windowInsets);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new DerivedHeightModifier(windowInsets, function1, WindowInsetsSizeKt$windowInsetsBottomHeight$2.INSTANCE));
    }

    @Stable
    public static final Modifier windowInsetsEndWidth(Modifier modifier, WindowInsets windowInsets) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(windowInsets, "insets");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0506xaf5f9f7d(windowInsets);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new DerivedWidthModifier(windowInsets, function1, WindowInsetsSizeKt$windowInsetsEndWidth$2.INSTANCE));
    }

    @Stable
    public static final Modifier windowInsetsStartWidth(Modifier modifier, WindowInsets windowInsets) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(windowInsets, "insets");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0507x85553816(windowInsets);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new DerivedWidthModifier(windowInsets, function1, WindowInsetsSizeKt$windowInsetsStartWidth$2.INSTANCE));
    }

    @Stable
    public static final Modifier windowInsetsTopHeight(Modifier modifier, WindowInsets windowInsets) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(windowInsets, "insets");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0508x4005a8ba(windowInsets);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new DerivedHeightModifier(windowInsets, function1, WindowInsetsSizeKt$windowInsetsTopHeight$2.INSTANCE));
    }
}
