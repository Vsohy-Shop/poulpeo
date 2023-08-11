package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,643:1\n135#2:644\n135#2:645\n135#2:646\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt\n*L\n233#1:644\n280#1:645\n326#1:646\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt */
/* compiled from: SuspendingPointerInputFilter.kt */
public final class SuspendingPointerInputFilterKt {
    /* access modifiers changed from: private */
    public static final PointerEvent EmptyPointerEvent = new PointerEvent(C12726w.m28524k());
    private static final String PointerInputModifierNoParamError = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";

    public static final Modifier pointerInput(Modifier modifier, C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(oVar, "block");
        throw new IllegalStateException(PointerInputModifierNoParamError.toString());
    }

    public static final Modifier pointerInput(Modifier modifier, Object obj, C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(oVar, "block");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new C1042x56256fb5(obj, oVar) : InspectableValueKt.getNoInspectorInfo(), new SuspendingPointerInputFilterKt$pointerInput$2(obj, oVar));
    }

    public static final Modifier pointerInput(Modifier modifier, Object obj, Object obj2, C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(oVar, "block");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new C1043x56256fb6(obj, obj2, oVar) : InspectableValueKt.getNoInspectorInfo(), new SuspendingPointerInputFilterKt$pointerInput$4(obj, obj2, oVar));
    }

    public static final Modifier pointerInput(Modifier modifier, Object[] objArr, C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(objArr, "keys");
        C12775o.m28639i(oVar, "block");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new C1044x56256fb7(objArr, oVar) : InspectableValueKt.getNoInspectorInfo(), new SuspendingPointerInputFilterKt$pointerInput$6(objArr, oVar));
    }
}
