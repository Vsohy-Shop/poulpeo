package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,111:1\n25#2:112\n25#2:119\n1114#3,6:113\n1114#3,6:120\n76#4:126\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n*L\n80#1:112\n81#1:119\n80#1:113,6\n81#1:120,6\n80#1:126\n*E\n"})
/* compiled from: SelectionMagnifier.kt */
public final class SelectionMagnifierKt {
    /* access modifiers changed from: private */
    public static final SpringSpec<Offset> MagnifierSpringSpec;
    /* access modifiers changed from: private */
    public static final long OffsetDisplacementThreshold;
    /* access modifiers changed from: private */
    public static final AnimationVector2D UnspecifiedAnimationVector2D = new AnimationVector2D(Float.NaN, Float.NaN);
    /* access modifiers changed from: private */
    public static final TwoWayConverter<Offset, AnimationVector2D> UnspecifiedSafeOffsetVectorConverter = VectorConvertersKt.TwoWayConverter(SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1.INSTANCE, SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2.INSTANCE);

    static {
        long Offset = OffsetKt.Offset(0.01f, 0.01f);
        OffsetDisplacementThreshold = Offset;
        MagnifierSpringSpec = new SpringSpec(0.0f, 0.0f, Offset.m35411boximpl(Offset), 3, (DefaultConstructorMarker) null);
    }

    public static final Modifier animatedSelectionMagnifier(Modifier modifier, C13074a<Offset> aVar, Function1<? super C13074a<Offset>, ? extends Modifier> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(aVar, "magnifierCenter");
        C12775o.m28639i(function1, "platformMagnifier");
        return ComposedModifierKt.composed$default(modifier, (Function1) null, new SelectionMagnifierKt$animatedSelectionMagnifier$1(aVar, function1), 1, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [of.a<androidx.compose.ui.geometry.Offset>, of.a] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.State<androidx.compose.p002ui.geometry.Offset> rememberAnimatedMagnifierPosition(p404of.C13074a<androidx.compose.p002ui.geometry.Offset> r4, androidx.compose.runtime.Composer r5, int r6) {
        /*
            r0 = -1589795249(0xffffffffa13da64f, float:-6.42558E-19)
            r5.startReplaceableGroup(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r6, r1, r2)
        L_0x0012:
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.startReplaceableGroup(r6)
            java.lang.Object r0 = r5.rememberedValue()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r1.getEmpty()
            if (r0 != r2) goto L_0x002b
            androidx.compose.runtime.State r0 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(r4)
            r5.updateRememberedValue(r0)
        L_0x002b:
            r5.endReplaceableGroup()
            androidx.compose.runtime.State r0 = (androidx.compose.runtime.State) r0
            r5.startReplaceableGroup(r6)
            java.lang.Object r4 = r5.rememberedValue()
            java.lang.Object r6 = r1.getEmpty()
            if (r4 != r6) goto L_0x0059
            androidx.compose.animation.core.Animatable r4 = new androidx.compose.animation.core.Animatable
            long r1 = rememberAnimatedMagnifierPosition$lambda$1(r0)
            androidx.compose.ui.geometry.Offset r6 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r1)
            androidx.compose.animation.core.TwoWayConverter r1 = UnspecifiedSafeOffsetVectorConverter
            long r2 = OffsetDisplacementThreshold
            androidx.compose.ui.geometry.Offset r2 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r2)
            r4.<init>(r6, r1, r2)
            r5.updateRememberedValue(r4)
        L_0x0059:
            r5.endReplaceableGroup()
            androidx.compose.animation.core.Animatable r4 = (androidx.compose.animation.core.Animatable) r4
            ef.v r6 = p336ef.C11921v.f18618a
            androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 r1 = new androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1
            r2 = 0
            r1.<init>(r0, r4, r2)
            r0 = 70
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r6, (p404of.C13088o<? super p466yf.C13995l0, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r1, (androidx.compose.runtime.Composer) r5, (int) r0)
            androidx.compose.runtime.State r4 = r4.asState()
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L_0x0078
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0078:
            r5.endReplaceableGroup()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionMagnifierKt.rememberAnimatedMagnifierPosition(of.a, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    /* access modifiers changed from: private */
    public static final long rememberAnimatedMagnifierPosition$lambda$1(State<Offset> state) {
        return state.getValue().m35432unboximpl();
    }
}
