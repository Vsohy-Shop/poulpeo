package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: BottomSheetScaffold.kt */
final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C13089p<PaddingValues, Composer, Integer, C11921v> $body;
    final /* synthetic */ C13089p<Integer, Composer, Integer, C11921v> $bottomSheet;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ C13074a<Float> $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ BottomSheetState $sheetState;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $snackbarHost;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13089p<? super PaddingValues, ? super Composer, ? super Integer, C11921v> pVar, C13089p<? super Integer, ? super Composer, ? super Integer, C11921v> pVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, float f, int i, C13074a<Float> aVar, BottomSheetState bottomSheetState, int i2) {
        super(2);
        this.$topBar = oVar;
        this.$body = pVar;
        this.$bottomSheet = pVar2;
        this.$floatingActionButton = oVar2;
        this.$snackbarHost = oVar3;
        this.$sheetPeekHeight = f;
        this.$floatingActionButtonPosition = i;
        this.$sheetOffset = aVar;
        this.$sheetState = bottomSheetState;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        BottomSheetScaffoldKt.m33908BottomSheetScaffoldLayoutKCBPh4w(this.$topBar, this.$body, this.$bottomSheet, this.$floatingActionButton, this.$snackbarHost, this.$sheetPeekHeight, this.$floatingActionButtonPosition, this.$sheetOffset, this.$sheetState, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
