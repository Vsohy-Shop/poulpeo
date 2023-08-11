package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.semantics.Role;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.p002ui.state.ToggleableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,228:1\n135#2:229\n135#2:230\n146#2:231\n135#2:232\n135#2:233\n146#2:234\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n59#1:229\n108#1:230\n107#1:231\n156#1:232\n208#1:233\n207#1:234\n*E\n"})
/* compiled from: Toggleable.kt */
public final class ToggleableKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: toggleable-O2vRcR0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.Modifier m33591toggleableO2vRcR0(androidx.compose.p002ui.Modifier r8, boolean r9, androidx.compose.foundation.interaction.MutableInteractionSource r10, androidx.compose.foundation.Indication r11, boolean r12, androidx.compose.p002ui.semantics.Role r13, kotlin.jvm.functions.Function1<? super java.lang.Boolean, p336ef.C11921v> r14) {
        /*
            java.lang.String r0 = "$this$toggleable"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            boolean r0 = androidx.compose.p002ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r0 == 0) goto L_0x0022
            androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0026
        L_0x0022:
            kotlin.jvm.functions.Function1 r0 = androidx.compose.p002ui.platform.InspectableValueKt.getNoInspectorInfo()
        L_0x0026:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.ui.state.ToggleableState r2 = androidx.compose.p002ui.state.ToggleableStateKt.ToggleableState(r9)
            androidx.compose.foundation.selection.ToggleableKt$toggleable$4$1 r7 = new androidx.compose.foundation.selection.ToggleableKt$toggleable$4$1
            r7.<init>(r14, r9)
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            androidx.compose.ui.Modifier r9 = m33595triStateToggleableO2vRcR0(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.Modifier r8 = androidx.compose.p002ui.platform.InspectableValueKt.inspectableWrapper(r8, r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.selection.ToggleableKt.m33591toggleableO2vRcR0(androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.Indication, boolean, androidx.compose.ui.semantics.Role, kotlin.jvm.functions.Function1):androidx.compose.ui.Modifier");
    }

    /* renamed from: toggleable-O2vRcR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33592toggleableO2vRcR0$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, Role role, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 16) != 0) {
            role = null;
        }
        return m33591toggleableO2vRcR0(modifier, z, mutableInteractionSource, indication, z3, role, function1);
    }

    /* renamed from: toggleable-XHw0xAI  reason: not valid java name */
    public static final Modifier m33593toggleableXHw0xAI(Modifier modifier, boolean z, boolean z2, Role role, Function1<? super Boolean, C11921v> function1) {
        Function1 function12;
        C12775o.m28639i(modifier, "$this$toggleable");
        C12775o.m28639i(function1, "onValueChange");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function12 = new ToggleableKt$toggleableXHw0xAI$$inlined$debugInspectorInfo$1(z, z2, role, function1);
        } else {
            function12 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function12, new ToggleableKt$toggleable$2(z, z2, role, function1));
    }

    /* renamed from: toggleable-XHw0xAI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33594toggleableXHw0xAI$default(Modifier modifier, boolean z, boolean z2, Role role, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return m33593toggleableXHw0xAI(modifier, z, z2, role, function1);
    }

    /* renamed from: triStateToggleable-O2vRcR0  reason: not valid java name */
    public static final Modifier m33595triStateToggleableO2vRcR0(Modifier modifier, ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, Role role, C13074a<C11921v> aVar) {
        Function1<InspectorInfo, C11921v> function1;
        Modifier modifier2 = modifier;
        ToggleableState toggleableState2 = toggleableState;
        C12775o.m28639i(modifier2, "$this$triStateToggleable");
        C12775o.m28639i(toggleableState2, "state");
        C12775o.m28639i(mutableInteractionSource, "interactionSource");
        C12775o.m28639i(aVar, "onClick");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0598x99d816ae(toggleableState, z, role, mutableInteractionSource, indication, aVar);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return InspectableValueKt.inspectableWrapper(modifier2, function1, SemanticsModifierKt.semantics$default(ClickableKt.m32979clickableO2vRcR0$default(Modifier.Companion, mutableInteractionSource, indication, z, (String) null, role, aVar, 8, (Object) null), false, new ToggleableKt$triStateToggleable$4$1(toggleableState2), 1, (Object) null));
    }

    /* renamed from: triStateToggleable-O2vRcR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33596triStateToggleableO2vRcR0$default(Modifier modifier, ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, Role role, C13074a aVar, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            role = null;
        }
        return m33595triStateToggleableO2vRcR0(modifier, toggleableState, mutableInteractionSource, indication, z2, role, aVar);
    }

    /* renamed from: triStateToggleable-XHw0xAI  reason: not valid java name */
    public static final Modifier m33597triStateToggleableXHw0xAI(Modifier modifier, ToggleableState toggleableState, boolean z, Role role, C13074a<C11921v> aVar) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$triStateToggleable");
        C12775o.m28639i(toggleableState, "state");
        C12775o.m28639i(aVar, "onClick");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0599xe307cea3(toggleableState, z, role, aVar);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new ToggleableKt$triStateToggleable$2(toggleableState, z, role, aVar));
    }

    /* renamed from: triStateToggleable-XHw0xAI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33598triStateToggleableXHw0xAI$default(Modifier modifier, ToggleableState toggleableState, boolean z, Role role, C13074a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return m33597triStateToggleableXHw0xAI(modifier, toggleableState, z, role, aVar);
    }
}
