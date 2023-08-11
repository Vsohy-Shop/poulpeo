package androidx.compose.runtime.saveable;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,200:1\n76#2:201\n83#3,3:202\n1114#4,6:205\n*S KotlinDebug\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n*L\n81#1:201\n83#1:202,3\n83#1:205,6\n*E\n"})
/* compiled from: RememberSaveable.kt */
public final class RememberSaveableKt {
    private static final int MaxSupportedRadix = 36;

    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(Saver<T, ? extends Object> saver) {
        C12775o.m28637g(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new RememberSaveableKt$mutableStateSaver$1$1(saver), new RememberSaveableKt$mutableStateSaver$1$2(saver));
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [of.a<? extends T>, of.a, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.compose.runtime.Composable
    /* renamed from: rememberSaveable  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m35308rememberSaveable(java.lang.Object[] r5, androidx.compose.runtime.saveable.Saver<T, ? extends java.lang.Object> r6, java.lang.String r7, p404of.C13074a<? extends T> r8, androidx.compose.runtime.Composer r9, int r10, int r11) {
        /*
            java.lang.String r0 = "inputs"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            java.lang.String r0 = "init"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            r0 = 441892779(0x1a56bfab, float:4.440899E-23)
            r9.startReplaceableGroup(r0)
            r1 = r11 & 2
            if (r1 == 0) goto L_0x0018
            androidx.compose.runtime.saveable.Saver r6 = androidx.compose.runtime.saveable.SaverKt.autoSaver()
        L_0x0018:
            r11 = r11 & 4
            r1 = 0
            if (r11 == 0) goto L_0x001e
            r7 = r1
        L_0x001e:
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x002a
            r11 = -1
            java.lang.String r2 = "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:65)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r11, r2)
        L_0x002a:
            r10 = 1059366469(0x3f24a645, float:0.6431621)
            r9.startReplaceableGroup(r10)
            r10 = 0
            if (r7 == 0) goto L_0x003c
            int r11 = r7.length()
            if (r11 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r11 = r10
            goto L_0x003d
        L_0x003c:
            r11 = 1
        L_0x003d:
            if (r11 != 0) goto L_0x0040
            goto L_0x0053
        L_0x0040:
            int r7 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(r9, r10)
            int r11 = MaxSupportedRadix
            int r11 = p454wf.C13724b.m31415a(r11)
            java.lang.String r7 = java.lang.Integer.toString(r7, r11)
            java.lang.String r11 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.C12775o.m28638h(r7, r11)
        L_0x0053:
            r9.endReplaceableGroup()
            java.lang.String r11 = "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>"
            kotlin.jvm.internal.C12775o.m28637g(r6, r11)
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.runtime.saveable.SaveableStateRegistryKt.getLocalSaveableStateRegistry()
            java.lang.Object r11 = r9.consume(r11)
            androidx.compose.runtime.saveable.SaveableStateRegistry r11 = (androidx.compose.runtime.saveable.SaveableStateRegistry) r11
            int r0 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            r0 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r9.startReplaceableGroup(r0)
            int r0 = r5.length
            r2 = r10
            r3 = r2
        L_0x0073:
            if (r2 >= r0) goto L_0x007f
            r4 = r5[r2]
            boolean r4 = r9.changed((java.lang.Object) r4)
            r3 = r3 | r4
            int r2 = r2 + 1
            goto L_0x0073
        L_0x007f:
            java.lang.Object r5 = r9.rememberedValue()
            if (r3 != 0) goto L_0x008d
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r5 != r0) goto L_0x00a4
        L_0x008d:
            if (r11 == 0) goto L_0x0099
            java.lang.Object r5 = r11.consumeRestored(r7)
            if (r5 == 0) goto L_0x0099
            java.lang.Object r1 = r6.restore(r5)
        L_0x0099:
            if (r1 != 0) goto L_0x00a0
            java.lang.Object r5 = r8.invoke()
            goto L_0x00a1
        L_0x00a0:
            r5 = r1
        L_0x00a1:
            r9.updateRememberedValue(r5)
        L_0x00a4:
            r9.endReplaceableGroup()
            if (r11 == 0) goto L_0x00b9
            androidx.compose.runtime.State r6 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r6, r9, r10)
            androidx.compose.runtime.State r8 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r5, r9, r10)
            androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1 r0 = new androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1
            r0.<init>(r11, r7, r6, r8)
            androidx.compose.runtime.EffectsKt.DisposableEffect(r11, r7, r0, r9, r10)
        L_0x00b9:
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L_0x00c2
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00c2:
            r9.endReplaceableGroup()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.RememberSaveableKt.m35308rememberSaveable(java.lang.Object[], androidx.compose.runtime.saveable.Saver, java.lang.String, of.a, androidx.compose.runtime.Composer, int, int):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final void requireCanBeSaved(SaveableStateRegistry saveableStateRegistry, Object obj) {
        String str;
        if (obj != null && !saveableStateRegistry.canBeSaved(obj)) {
            if (obj instanceof SnapshotMutableState) {
                SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
                if (snapshotMutableState.getPolicy() == SnapshotStateKt.neverEqualPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.structuralEqualityPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.referentialEqualityPolicy()) {
                    str = "MutableState containing " + snapshotMutableState.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
            }
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [androidx.compose.runtime.saveable.Saver, androidx.compose.runtime.saveable.Saver<T, ? extends java.lang.Object>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> androidx.compose.runtime.MutableState<T> rememberSaveable(java.lang.Object[] r8, androidx.compose.runtime.saveable.Saver<T, ? extends java.lang.Object> r9, java.lang.String r10, p404of.C13074a<? extends androidx.compose.runtime.MutableState<T>> r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            java.lang.String r0 = "inputs"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "stateSaver"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "init"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = -202053668(0xfffffffff3f4e7dc, float:-3.8806857E31)
            r12.startReplaceableGroup(r0)
            r14 = r14 & 4
            if (r14 == 0) goto L_0x001a
            r10 = 0
        L_0x001a:
            r3 = r10
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x0027
            r10 = -1
            java.lang.String r14 = "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:136)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r13, r10, r14)
        L_0x0027:
            int r10 = r8.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r10)
            androidx.compose.runtime.saveable.Saver r2 = mutableStateSaver(r9)
            r8 = r13 & 896(0x380, float:1.256E-42)
            r8 = r8 | 8
            r9 = r13 & 7168(0x1c00, float:1.0045E-41)
            r6 = r8 | r9
            r7 = 0
            r4 = r11
            r5 = r12
            java.lang.Object r8 = rememberSaveable((java.lang.Object[]) r1, r2, (java.lang.String) r3, r4, (androidx.compose.runtime.Composer) r5, (int) r6, (int) r7)
            androidx.compose.runtime.MutableState r8 = (androidx.compose.runtime.MutableState) r8
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r9 == 0) goto L_0x004a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x004a:
            r12.endReplaceableGroup()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(java.lang.Object[], androidx.compose.runtime.saveable.Saver, java.lang.String, of.a, androidx.compose.runtime.Composer, int, int):androidx.compose.runtime.MutableState");
    }
}
