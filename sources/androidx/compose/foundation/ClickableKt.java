package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.key.Key;
import androidx.compose.p002ui.input.key.KeyInputModifierKt;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.semantics.Role;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p466yf.C13995l0;
import p466yf.C13999m0;

@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,565:1\n135#2:566\n135#2:567\n135#2:568\n135#2:569\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n86#1:566\n198#1:567\n243#1:568\n395#1:569\n*E\n"})
/* compiled from: Clickable.kt */
public final class ClickableKt {
    @Composable
    public static final void PressedInteractionSourceDisposableEffect(MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState, Map<Key, PressInteraction.Press> map, Composer composer, int i) {
        C12775o.m28639i(mutableInteractionSource, "interactionSource");
        C12775o.m28639i(mutableState, "pressedInteraction");
        C12775o.m28639i(map, "currentKeyPressInteractions");
        Composer startRestartGroup = composer.startRestartGroup(1297229208);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1297229208, i, -1, "androidx.compose.foundation.PressedInteractionSourceDisposableEffect (Clickable.kt:409)");
        }
        EffectsKt.DisposableEffect((Object) mutableInteractionSource, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new ClickableKt$PressedInteractionSourceDisposableEffect$1(mutableState, map, mutableInteractionSource), startRestartGroup, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ClickableKt$PressedInteractionSourceDisposableEffect$2(mutableInteractionSource, mutableState, map, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: clickable-O2vRcR0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.Modifier m32978clickableO2vRcR0(androidx.compose.p002ui.Modifier r9, androidx.compose.foundation.interaction.MutableInteractionSource r10, androidx.compose.foundation.Indication r11, boolean r12, java.lang.String r13, androidx.compose.p002ui.semantics.Role r14, p404of.C13074a<p336ef.C11921v> r15) {
        /*
            java.lang.String r0 = "$this$clickable"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            boolean r0 = androidx.compose.p002ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r0 == 0) goto L_0x0022
            androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r11
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0026
        L_0x0022:
            kotlin.jvm.functions.Function1 r0 = androidx.compose.p002ui.platform.InspectableValueKt.getNoInspectorInfo()
        L_0x0026:
            androidx.compose.foundation.ClickableKt$clickable$4 r8 = new androidx.compose.foundation.ClickableKt$clickable$4
            r1 = r8
            r2 = r15
            r3 = r12
            r4 = r10
            r5 = r11
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.Modifier r9 = androidx.compose.p002ui.ComposedModifierKt.composed(r9, r0, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt.m32978clickableO2vRcR0(androidx.compose.ui.Modifier, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.Indication, boolean, java.lang.String, androidx.compose.ui.semantics.Role, of.a):androidx.compose.ui.Modifier");
    }

    /* renamed from: clickable-O2vRcR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m32979clickableO2vRcR0$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, C13074a aVar, int i, Object obj) {
        String str2;
        Role role2;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i & 16) != 0) {
            role2 = null;
        } else {
            role2 = role;
        }
        return m32978clickableO2vRcR0(modifier, mutableInteractionSource, indication, z2, str2, role2, aVar);
    }

    /* renamed from: clickable-XHw0xAI  reason: not valid java name */
    public static final Modifier m32980clickableXHw0xAI(Modifier modifier, boolean z, String str, Role role, C13074a<C11921v> aVar) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$clickable");
        C12775o.m28639i(aVar, "onClick");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1(z, str, role, aVar);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new ClickableKt$clickable$2(z, str, role, aVar));
    }

    /* renamed from: clickable-XHw0xAI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m32981clickableXHw0xAI$default(Modifier modifier, boolean z, String str, Role role, C13074a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return m32980clickableXHw0xAI(modifier, z, str, role, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.foundation.ExperimentalFoundationApi
    /* renamed from: combinedClickable-XVZzFYc  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.Modifier m32982combinedClickableXVZzFYc(androidx.compose.p002ui.Modifier r15, androidx.compose.foundation.interaction.MutableInteractionSource r16, androidx.compose.foundation.Indication r17, boolean r18, java.lang.String r19, androidx.compose.p002ui.semantics.Role r20, java.lang.String r21, p404of.C13074a<p336ef.C11921v> r22, p404of.C13074a<p336ef.C11921v> r23, p404of.C13074a<p336ef.C11921v> r24) {
        /*
            r0 = r15
            java.lang.String r1 = "$this$combinedClickable"
            kotlin.jvm.internal.C12775o.m28639i(r15, r1)
            java.lang.String r1 = "interactionSource"
            r12 = r16
            kotlin.jvm.internal.C12775o.m28639i(r12, r1)
            java.lang.String r1 = "onClick"
            r13 = r24
            kotlin.jvm.internal.C12775o.m28639i(r13, r1)
            boolean r1 = androidx.compose.p002ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r1 == 0) goto L_0x0033
            androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r24
            r7 = r23
            r8 = r22
            r9 = r21
            r10 = r17
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0037
        L_0x0033:
            kotlin.jvm.functions.Function1 r1 = androidx.compose.p002ui.platform.InspectableValueKt.getNoInspectorInfo()
        L_0x0037:
            androidx.compose.foundation.ClickableKt$combinedClickable$4 r14 = new androidx.compose.foundation.ClickableKt$combinedClickable$4
            r2 = r14
            r3 = r24
            r4 = r22
            r5 = r23
            r6 = r18
            r7 = r16
            r8 = r17
            r9 = r19
            r10 = r20
            r11 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.ComposedModifierKt.composed(r15, r1, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt.m32982combinedClickableXVZzFYc(androidx.compose.ui.Modifier, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.Indication, boolean, java.lang.String, androidx.compose.ui.semantics.Role, java.lang.String, of.a, of.a, of.a):androidx.compose.ui.Modifier");
    }

    /* renamed from: combinedClickable-XVZzFYc$default  reason: not valid java name */
    public static /* synthetic */ Modifier m32983combinedClickableXVZzFYc$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, String str2, C13074a aVar, C13074a aVar2, C13074a aVar3, int i, Object obj) {
        boolean z2;
        String str3;
        Role role2;
        String str4;
        C13074a aVar4;
        C13074a aVar5;
        int i2 = i;
        if ((i2 & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i2 & 8) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i2 & 16) != 0) {
            role2 = null;
        } else {
            role2 = role;
        }
        if ((i2 & 32) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i2 & 64) != 0) {
            aVar4 = null;
        } else {
            aVar4 = aVar;
        }
        if ((i2 & 128) != 0) {
            aVar5 = null;
        } else {
            aVar5 = aVar2;
        }
        return m32982combinedClickableXVZzFYc(modifier, mutableInteractionSource, indication, z2, str3, role2, str4, aVar4, aVar5, aVar3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.foundation.ExperimentalFoundationApi
    /* renamed from: combinedClickable-cJG_KMw  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.Modifier m32984combinedClickablecJG_KMw(androidx.compose.p002ui.Modifier r12, boolean r13, java.lang.String r14, androidx.compose.p002ui.semantics.Role r15, java.lang.String r16, p404of.C13074a<p336ef.C11921v> r17, p404of.C13074a<p336ef.C11921v> r18, p404of.C13074a<p336ef.C11921v> r19) {
        /*
            r0 = r12
            java.lang.String r1 = "$this$combinedClickable"
            kotlin.jvm.internal.C12775o.m28639i(r12, r1)
            java.lang.String r1 = "onClick"
            r10 = r19
            kotlin.jvm.internal.C12775o.m28639i(r10, r1)
            boolean r1 = androidx.compose.p002ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r1 == 0) goto L_0x0025
            androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r19
            r7 = r18
            r8 = r17
            r9 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0029
        L_0x0025:
            kotlin.jvm.functions.Function1 r1 = androidx.compose.p002ui.platform.InspectableValueKt.getNoInspectorInfo()
        L_0x0029:
            androidx.compose.foundation.ClickableKt$combinedClickable$2 r11 = new androidx.compose.foundation.ClickableKt$combinedClickable$2
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.ComposedModifierKt.composed(r12, r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt.m32984combinedClickablecJG_KMw(androidx.compose.ui.Modifier, boolean, java.lang.String, androidx.compose.ui.semantics.Role, java.lang.String, of.a, of.a, of.a):androidx.compose.ui.Modifier");
    }

    /* renamed from: combinedClickable-cJG_KMw$default  reason: not valid java name */
    public static /* synthetic */ Modifier m32985combinedClickablecJG_KMw$default(Modifier modifier, boolean z, String str, Role role, String str2, C13074a aVar, C13074a aVar2, C13074a aVar3, int i, Object obj) {
        boolean z2;
        String str3;
        Role role2;
        String str4;
        C13074a aVar4;
        C13074a aVar5;
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i & 2) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i & 4) != 0) {
            role2 = null;
        } else {
            role2 = role;
        }
        if ((i & 8) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i & 16) != 0) {
            aVar4 = null;
        } else {
            aVar4 = aVar;
        }
        if ((i & 32) != 0) {
            aVar5 = null;
        } else {
            aVar5 = aVar2;
        }
        return m32984combinedClickablecJG_KMw(modifier, z2, str3, role2, str4, aVar4, aVar5, aVar3);
    }

    /* renamed from: genericClickableWithoutGesture-bdNGguI  reason: not valid java name */
    public static final Modifier m32986genericClickableWithoutGesturebdNGguI(Modifier modifier, Modifier modifier2, MutableInteractionSource mutableInteractionSource, Indication indication, C13995l0 l0Var, Map<Key, PressInteraction.Press> map, State<Offset> state, boolean z, String str, Role role, String str2, C13074a<C11921v> aVar, C13074a<C11921v> aVar2) {
        Modifier modifier3 = modifier2;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        boolean z2 = z;
        Modifier modifier4 = modifier;
        C12775o.m28639i(modifier, "$this$genericClickableWithoutGesture");
        C12775o.m28639i(modifier2, "gestureModifiers");
        C12775o.m28639i(mutableInteractionSource2, "interactionSource");
        C12775o.m28639i(l0Var, "indicationScope");
        C12775o.m28639i(map, "currentKeyPressInteractions");
        C12775o.m28639i(state, "keyClickOffset");
        C12775o.m28639i(aVar2, "onClick");
        return FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(m497x602ad71b(genericClickableWithoutGesture_bdNGguI$clickSemantics(modifier, role, str, aVar, str2, z, aVar2), z, map, state, l0Var, aVar2, mutableInteractionSource), mutableInteractionSource2, indication), mutableInteractionSource2, z2), z2, mutableInteractionSource2).then(modifier2);
    }

    /* renamed from: genericClickableWithoutGesture-bdNGguI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m32987genericClickableWithoutGesturebdNGguI$default(Modifier modifier, Modifier modifier2, MutableInteractionSource mutableInteractionSource, Indication indication, C13995l0 l0Var, Map map, State state, boolean z, String str, Role role, String str2, C13074a aVar, C13074a aVar2, int i, Object obj) {
        boolean z2;
        String str3;
        Role role2;
        String str4;
        C13074a aVar3;
        int i2 = i;
        if ((i2 & 64) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i2 & 128) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i2 & 256) != 0) {
            role2 = null;
        } else {
            role2 = role;
        }
        if ((i2 & 512) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i2 & 1024) != 0) {
            aVar3 = null;
        } else {
            aVar3 = aVar;
        }
        return m32986genericClickableWithoutGesturebdNGguI(modifier, modifier2, mutableInteractionSource, indication, l0Var, map, state, z2, str3, role2, str4, aVar3, aVar2);
    }

    private static final Modifier genericClickableWithoutGesture_bdNGguI$clickSemantics(Modifier modifier, Role role, String str, C13074a<C11921v> aVar, String str2, boolean z, C13074a<C11921v> aVar2) {
        return SemanticsModifierKt.semantics(modifier, true, new ClickableKt$genericClickableWithoutGesture$clickSemantics$1(role, str, aVar, str2, z, aVar2));
    }

    /* renamed from: genericClickableWithoutGesture_bdNGguI$detectPressAndClickFromKey */
    private static final Modifier m497x602ad71b(Modifier modifier, boolean z, Map<Key, PressInteraction.Press> map, State<Offset> state, C13995l0 l0Var, C13074a<C11921v> aVar, MutableInteractionSource mutableInteractionSource) {
        return KeyInputModifierKt.onKeyEvent(modifier, new C0362x6b176470(z, map, state, l0Var, aVar, mutableInteractionSource));
    }

    /* renamed from: handlePressInteraction-EPk0efs  reason: not valid java name */
    public static final Object m32988handlePressInteractionEPk0efs(PressGestureScope pressGestureScope, long j, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState, State<? extends C13074a<Boolean>> state, C12074d<? super C11921v> dVar) {
        Object e = C13999m0.m32451e(new ClickableKt$handlePressInteraction$2(pressGestureScope, j, mutableInteractionSource, mutableState, state, (C12074d<? super ClickableKt$handlePressInteraction$2>) null), dVar);
        if (e == C12150d.m26492c()) {
            return e;
        }
        return C11921v.f18618a;
    }
}
