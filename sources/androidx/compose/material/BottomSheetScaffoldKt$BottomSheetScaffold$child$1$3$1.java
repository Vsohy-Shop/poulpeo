package androidx.compose.material;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: BottomSheetScaffold.kt */
final class BottomSheetScaffoldKt$BottomSheetScaffold$child$1$3$1 extends C12777p implements C13074a<Float> {
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BottomSheetScaffoldKt$BottomSheetScaffold$child$1$3$1(BottomSheetScaffoldState bottomSheetScaffoldState) {
        super(0);
        this.$scaffoldState = bottomSheetScaffoldState;
    }

    public final Float invoke() {
        return Float.valueOf(this.$scaffoldState.getBottomSheetState().requireOffset());
    }
}
