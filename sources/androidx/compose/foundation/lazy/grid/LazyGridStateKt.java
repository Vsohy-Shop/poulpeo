package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,460:1\n50#2:461\n49#2:462\n1114#3,6:463\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridStateKt\n*L\n62#1:461\n62#1:462\n62#1:463,6\n*E\n"})
/* compiled from: LazyGridState.kt */
public final class LazyGridStateKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: of.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.lazy.grid.LazyGridState rememberLazyGridState(int r10, int r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            r0 = 29186956(0x1bd5b8c, float:6.9559E-38)
            r12.startReplaceableGroup(r0)
            r1 = r14 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000c
            r10 = r2
        L_0x000c:
            r14 = r14 & 2
            if (r14 == 0) goto L_0x0011
            r11 = r2
        L_0x0011:
            boolean r14 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r14 == 0) goto L_0x001d
            r14 = -1
            java.lang.String r1 = "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:57)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r13, r14, r1)
        L_0x001d:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            androidx.compose.foundation.lazy.grid.LazyGridState$Companion r13 = androidx.compose.foundation.lazy.grid.LazyGridState.Companion
            androidx.compose.runtime.saveable.Saver r4 = r13.getSaver()
            r5 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r12.startReplaceableGroup(r0)
            boolean r13 = r12.changed((java.lang.Object) r13)
            boolean r14 = r12.changed((java.lang.Object) r14)
            r13 = r13 | r14
            java.lang.Object r14 = r12.rememberedValue()
            if (r13 != 0) goto L_0x004b
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r13 = r13.getEmpty()
            if (r14 != r13) goto L_0x0053
        L_0x004b:
            androidx.compose.foundation.lazy.grid.LazyGridStateKt$rememberLazyGridState$1$1 r14 = new androidx.compose.foundation.lazy.grid.LazyGridStateKt$rememberLazyGridState$1$1
            r14.<init>(r10, r11)
            r12.updateRememberedValue(r14)
        L_0x0053:
            r12.endReplaceableGroup()
            r6 = r14
            of.a r6 = (p404of.C13074a) r6
            r8 = 72
            r9 = 4
            r7 = r12
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r3, r4, (java.lang.String) r5, r6, (androidx.compose.runtime.Composer) r7, (int) r8, (int) r9)
            androidx.compose.foundation.lazy.grid.LazyGridState r10 = (androidx.compose.foundation.lazy.grid.LazyGridState) r10
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x006c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x006c:
            r12.endReplaceableGroup()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridStateKt.rememberLazyGridState(int, int, androidx.compose.runtime.Composer, int, int):androidx.compose.foundation.lazy.grid.LazyGridState");
    }
}