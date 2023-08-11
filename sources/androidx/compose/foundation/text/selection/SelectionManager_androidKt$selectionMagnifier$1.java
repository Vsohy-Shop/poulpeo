package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.android.kt\nandroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,69:1\n76#2:70\n25#3:71\n50#3:78\n49#3:79\n1114#4,6:72\n1114#4,6:80\n76#5:86\n102#5,2:87\n*S KotlinDebug\n*F\n+ 1 SelectionManager.android.kt\nandroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1\n*L\n49#1:70\n50#1:71\n55#1:78\n55#1:79\n50#1:72,6\n55#1:80,6\n50#1:86\n50#1:87,2\n*E\n"})
/* compiled from: SelectionManager.android.kt */
final class SelectionManager_androidKt$selectionMagnifier$1 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ SelectionManager $manager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectionManager_androidKt$selectionMagnifier$1(SelectionManager selectionManager) {
        super(3);
        this.$manager = selectionManager;
    }

    /* access modifiers changed from: private */
    public static final long invoke$lambda$1(MutableState<IntSize> mutableState) {
        return mutableState.getValue().m38632unboximpl();
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<IntSize> mutableState, long j) {
        mutableState.setValue(IntSize.m38620boximpl(j));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(-1914520728);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1914520728, i, -1, "androidx.compose.foundation.text.selection.selectionMagnifier.<anonymous> (SelectionManager.android.kt:47)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m38620boximpl(IntSize.Companion.m38633getZeroYbymL2g()), (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState = (MutableState) rememberedValue;
        final SelectionManager selectionManager = this.$manager;
        C06661 r2 = new C13074a<Offset>() {
            public /* bridge */ /* synthetic */ Object invoke() {
                return Offset.m35411boximpl(m33824invokeF1C5BW0());
            }

            /* renamed from: invoke-F1C5BW0  reason: not valid java name */
            public final long m33824invokeF1C5BW0() {
                return SelectionManagerKt.m33821calculateSelectionMagnifierCenterAndroidO0kMr_c(selectionManager, SelectionManager_androidKt$selectionMagnifier$1.invoke$lambda$1(mutableState));
            }
        };
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed((Object) mutableState) | composer.changed((Object) density);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SelectionManager_androidKt$selectionMagnifier$1$2$1(density, mutableState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier animatedSelectionMagnifier = SelectionMagnifierKt.animatedSelectionMagnifier(modifier, r2, (Function1) rememberedValue2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animatedSelectionMagnifier;
    }
}
