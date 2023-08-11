package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.platform.InspectableValueKt */
/* compiled from: InspectableValue.kt */
public final class InspectableValueKt {
    private static final Function1<InspectorInfo, C11921v> NoInspectorInfo = InspectableValueKt$NoInspectorInfo$1.INSTANCE;
    private static boolean isDebugInspectorInfoEnabled;

    public static final Function1<InspectorInfo, C11921v> debugInspectorInfo(Function1<? super InspectorInfo, C11921v> function1) {
        C12775o.m28639i(function1, "definitions");
        if (isDebugInspectorInfoEnabled()) {
            return new InspectableValueKt$debugInspectorInfo$1(function1);
        }
        return getNoInspectorInfo();
    }

    public static final Function1<InspectorInfo, C11921v> getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    public static final Modifier inspectable(Modifier modifier, Function1<? super InspectorInfo, C11921v> function1, Function1<? super Modifier, ? extends Modifier> function12) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "inspectorInfo");
        C12775o.m28639i(function12, "factory");
        return inspectableWrapper(modifier, function1, (Modifier) function12.invoke(Modifier.Companion));
    }

    public static final Modifier inspectableWrapper(Modifier modifier, Function1<? super InspectorInfo, C11921v> function1, Modifier modifier2) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "inspectorInfo");
        C12775o.m28639i(modifier2, "wrapped");
        InspectableModifier inspectableModifier = new InspectableModifier(function1);
        return modifier.then(inspectableModifier).then(modifier2).then(inspectableModifier.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z) {
        isDebugInspectorInfoEnabled = z;
    }
}
