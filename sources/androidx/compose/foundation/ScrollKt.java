package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.p002ui.Modifier;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,410:1\n36#2:411\n1114#3,6:412\n135#4:418\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n*L\n72#1:411\n72#1:412,6\n317#1:418\n*E\n"})
/* compiled from: Scroll.kt */
public final class ScrollKt {
    public static final Modifier horizontalScroll(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(scrollState, "state");
        return scroll(modifier, scrollState, z2, flingBehavior, z, false);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            flingBehavior = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return horizontalScroll(modifier, scrollState, z, flingBehavior, z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: of.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.ScrollState rememberScrollState(int r10, androidx.compose.runtime.Composer r11, int r12, int r13) {
        /*
            r0 = -1464256199(0xffffffffa8b93939, float:-2.0563942E-14)
            r11.startReplaceableGroup(r0)
            r13 = r13 & 1
            r1 = 0
            if (r13 == 0) goto L_0x000c
            r10 = r1
        L_0x000c:
            boolean r13 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r13 == 0) goto L_0x0018
            r13 = -1
            java.lang.String r2 = "androidx.compose.foundation.rememberScrollState (Scroll.kt:70)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r12, r13, r2)
        L_0x0018:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            androidx.compose.foundation.ScrollState$Companion r12 = androidx.compose.foundation.ScrollState.Companion
            androidx.compose.runtime.saveable.Saver r4 = r12.getSaver()
            r5 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r13 = 1157296644(0x44faf204, float:2007.563)
            r11.startReplaceableGroup(r13)
            boolean r12 = r11.changed((java.lang.Object) r12)
            java.lang.Object r13 = r11.rememberedValue()
            if (r12 != 0) goto L_0x003d
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r12 = r12.getEmpty()
            if (r13 != r12) goto L_0x0045
        L_0x003d:
            androidx.compose.foundation.ScrollKt$rememberScrollState$1$1 r13 = new androidx.compose.foundation.ScrollKt$rememberScrollState$1$1
            r13.<init>(r10)
            r11.updateRememberedValue(r13)
        L_0x0045:
            r11.endReplaceableGroup()
            r6 = r13
            of.a r6 = (p404of.C13074a) r6
            r8 = 72
            r9 = 4
            r7 = r11
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r3, r4, (java.lang.String) r5, r6, (androidx.compose.runtime.Composer) r7, (int) r8, (int) r9)
            androidx.compose.foundation.ScrollState r10 = (androidx.compose.foundation.ScrollState) r10
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x005e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x005e:
            r11.endReplaceableGroup()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ScrollKt.rememberScrollState(int, androidx.compose.runtime.Composer, int, int):androidx.compose.foundation.ScrollState");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final androidx.compose.p002ui.Modifier scroll(androidx.compose.p002ui.Modifier r8, androidx.compose.foundation.ScrollState r9, boolean r10, androidx.compose.foundation.gestures.FlingBehavior r11, boolean r12, boolean r13) {
        /*
            boolean r0 = androidx.compose.p002ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r0 == 0) goto L_0x0012
            androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0016
        L_0x0012:
            kotlin.jvm.functions.Function1 r0 = androidx.compose.p002ui.platform.InspectableValueKt.getNoInspectorInfo()
        L_0x0016:
            androidx.compose.foundation.ScrollKt$scroll$2 r7 = new androidx.compose.foundation.ScrollKt$scroll$2
            r1 = r7
            r2 = r13
            r3 = r10
            r4 = r9
            r5 = r12
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            androidx.compose.ui.Modifier r8 = androidx.compose.p002ui.ComposedModifierKt.composed(r8, r0, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ScrollKt.scroll(androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, boolean):androidx.compose.ui.Modifier");
    }

    public static final Modifier verticalScroll(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(scrollState, "state");
        return scroll(modifier, scrollState, z2, flingBehavior, z, true);
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            flingBehavior = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return verticalScroll(modifier, scrollState, z, flingBehavior, z2);
    }
}
