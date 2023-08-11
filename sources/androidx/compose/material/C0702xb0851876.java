package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$sheetPlaceable$1 */
/* compiled from: BottomSheetScaffold.kt */
final class C0702xb0851876 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13089p<Integer, Composer, Integer, C11921v> $bottomSheet;
    final /* synthetic */ int $layoutHeight;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0702xb0851876(C13089p<? super Integer, ? super Composer, ? super Integer, C11921v> pVar, int i, int i2) {
        super(2);
        this.$bottomSheet = pVar;
        this.$layoutHeight = i;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2120029209, i, -1, "androidx.compose.material.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:491)");
            }
            this.$bottomSheet.invoke(Integer.valueOf(this.$layoutHeight), composer, Integer.valueOf((this.$$dirty >> 3) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
