package androidx.compose.material3;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: AppBar.kt */
final class TopAppBarState$Companion$Saver$1 extends C12777p implements C13088o<SaverScope, TopAppBarState, List<? extends Float>> {
    public static final TopAppBarState$Companion$Saver$1 INSTANCE = new TopAppBarState$Companion$Saver$1();

    TopAppBarState$Companion$Saver$1() {
        super(2);
    }

    public final List<Float> invoke(SaverScope saverScope, TopAppBarState topAppBarState) {
        C12775o.m28639i(saverScope, "$this$listSaver");
        C12775o.m28639i(topAppBarState, "it");
        return C12726w.m28527n(Float.valueOf(topAppBarState.getHeightOffsetLimit()), Float.valueOf(topAppBarState.getHeightOffset()), Float.valueOf(topAppBarState.getContentOffset()));
    }
}
