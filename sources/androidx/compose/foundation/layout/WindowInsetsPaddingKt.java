package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.modifier.ModifierLocalKt;
import androidx.compose.p002ui.modifier.ProvidableModifierLocal;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,305:1\n135#2:306\n135#2:307\n135#2:308\n135#2:309\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n57#1:306\n75#1:307\n102#1:308\n126#1:309\n*E\n"})
/* compiled from: WindowInsetsPadding.kt */
public final class WindowInsetsPaddingKt {
    private static final ProvidableModifierLocal<WindowInsets> ModifierLocalConsumedWindowInsets = ModifierLocalKt.modifierLocalOf(WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1.INSTANCE);

    @Stable
    public static final Modifier consumeWindowInsets(Modifier modifier, WindowInsets windowInsets) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(windowInsets, "insets");
        return modifier.then(new UnionInsetsConsumingModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new C0477x7feb0d2a(windowInsets) : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    @ExperimentalLayoutApi
    public static final Modifier consumedWindowInsets(Modifier modifier, WindowInsets windowInsets) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(windowInsets, "insets");
        return consumeWindowInsets(modifier, windowInsets);
    }

    public static final ProvidableModifierLocal<WindowInsets> getModifierLocalConsumedWindowInsets() {
        return ModifierLocalConsumedWindowInsets;
    }

    @Stable
    public static final Modifier onConsumedWindowInsetsChanged(Modifier modifier, Function1<? super WindowInsets, C11921v> function1) {
        Function1 function12;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "block");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function12 = new C0479xe0c3dfaf(function1);
        } else {
            function12 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new ConsumedInsetsModifier(function1, function12));
    }

    @Stable
    public static final Modifier windowInsetsPadding(Modifier modifier, WindowInsets windowInsets) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(windowInsets, "insets");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0480x6f3b7473(windowInsets);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new InsetsPaddingModifier(windowInsets, function1));
    }

    @Stable
    @ExperimentalLayoutApi
    public static final Modifier withConsumedWindowInsets(Modifier modifier, Function1<? super WindowInsets, C11921v> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "block");
        return onConsumedWindowInsetsChanged(modifier, function1);
    }

    @Stable
    @ExperimentalLayoutApi
    public static final Modifier consumedWindowInsets(Modifier modifier, PaddingValues paddingValues) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(paddingValues, "paddingValues");
        return consumeWindowInsets(modifier, paddingValues);
    }

    @Stable
    @ExperimentalLayoutApi
    public static final Modifier consumeWindowInsets(Modifier modifier, PaddingValues paddingValues) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(paddingValues, "paddingValues");
        return modifier.then(new PaddingValuesConsumingModifier(paddingValues, InspectableValueKt.isDebugInspectorInfoEnabled() ? new C0478x7feb0d2b(paddingValues) : InspectableValueKt.getNoInspectorInfo()));
    }
}
