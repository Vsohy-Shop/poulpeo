package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.semantics.Role;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nSelectable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,134:1\n135#2:135\n135#2:136\n146#2:137\n*S KotlinDebug\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n61#1:135\n114#1:136\n113#1:137\n*E\n"})
/* compiled from: Selectable.kt */
public final class SelectableKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: selectable-O2vRcR0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.Modifier m33587selectableO2vRcR0(androidx.compose.p002ui.Modifier r13, boolean r14, androidx.compose.foundation.interaction.MutableInteractionSource r15, androidx.compose.foundation.Indication r16, boolean r17, androidx.compose.p002ui.semantics.Role r18, p404of.C13074a<p336ef.C11921v> r19) {
        /*
            r0 = r13
            java.lang.String r1 = "$this$selectable"
            kotlin.jvm.internal.C12775o.m28639i(r13, r1)
            java.lang.String r1 = "interactionSource"
            r9 = r15
            kotlin.jvm.internal.C12775o.m28639i(r15, r1)
            java.lang.String r1 = "onClick"
            r10 = r19
            kotlin.jvm.internal.C12775o.m28639i(r10, r1)
            boolean r1 = androidx.compose.p002ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r1 == 0) goto L_0x002a
            androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x002e
        L_0x002a:
            kotlin.jvm.functions.Function1 r1 = androidx.compose.p002ui.platform.InspectableValueKt.getNoInspectorInfo()
        L_0x002e:
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            r6 = 0
            r11 = 8
            r12 = 0
            r3 = r15
            r4 = r16
            r5 = r17
            r7 = r18
            r8 = r19
            r9 = r11
            r10 = r12
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.ClickableKt.m32979clickableO2vRcR0$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.foundation.selection.SelectableKt$selectable$4$1 r3 = new androidx.compose.foundation.selection.SelectableKt$selectable$4$1
            r4 = r14
            r3.<init>(r14)
            r4 = 1
            r5 = 0
            r6 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.p002ui.semantics.SemanticsModifierKt.semantics$default(r2, r6, r3, r4, r5)
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.platform.InspectableValueKt.inspectableWrapper(r13, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.selection.SelectableKt.m33587selectableO2vRcR0(androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.Indication, boolean, androidx.compose.ui.semantics.Role, of.a):androidx.compose.ui.Modifier");
    }

    /* renamed from: selectable-O2vRcR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33588selectableO2vRcR0$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, Role role, C13074a aVar, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 16) != 0) {
            role = null;
        }
        return m33587selectableO2vRcR0(modifier, z, mutableInteractionSource, indication, z3, role, aVar);
    }

    /* renamed from: selectable-XHw0xAI  reason: not valid java name */
    public static final Modifier m33589selectableXHw0xAI(Modifier modifier, boolean z, boolean z2, Role role, C13074a<C11921v> aVar) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$selectable");
        C12775o.m28639i(aVar, "onClick");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new SelectableKt$selectableXHw0xAI$$inlined$debugInspectorInfo$1(z, z2, role, aVar);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new SelectableKt$selectable$2(z, z2, role, aVar));
    }

    /* renamed from: selectable-XHw0xAI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33590selectableXHw0xAI$default(Modifier modifier, boolean z, boolean z2, Role role, C13074a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return m33589selectableXHw0xAI(modifier, z, z2, role, aVar);
    }
}
