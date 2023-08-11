package androidx.compose.foundation;

import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.modifier.ModifierLocalKt;
import androidx.compose.p002ui.modifier.ProvidableModifierLocal;
import androidx.compose.p002ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nFocusedBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,123:1\n135#2:124\n*S KotlinDebug\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsKt\n*L\n50#1:124\n*E\n"})
/* compiled from: FocusedBounds.kt */
public final class FocusedBoundsKt {
    private static final ProvidableModifierLocal<Function1<LayoutCoordinates, C11921v>> ModifierLocalFocusedBoundsObserver = ModifierLocalKt.modifierLocalOf(FocusedBoundsKt$ModifierLocalFocusedBoundsObserver$1.INSTANCE);

    public static final ProvidableModifierLocal<Function1<LayoutCoordinates, C11921v>> getModifierLocalFocusedBoundsObserver() {
        return ModifierLocalFocusedBoundsObserver;
    }

    @ExperimentalFoundationApi
    public static final Modifier onFocusedBoundsChanged(Modifier modifier, Function1<? super LayoutCoordinates, C11921v> function1) {
        Function1 function12;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "onPositioned");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function12 = new C0373x5a20c36e(function1);
        } else {
            function12 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function12, new FocusedBoundsKt$onFocusedBoundsChanged$2(function1));
    }

    public static /* synthetic */ void getModifierLocalFocusedBoundsObserver$annotations() {
    }
}
