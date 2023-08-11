package androidx.compose.foundation;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: Scroll.kt */
final class ScrollState$Companion$Saver$1 extends C12777p implements C13088o<SaverScope, ScrollState, Integer> {
    public static final ScrollState$Companion$Saver$1 INSTANCE = new ScrollState$Companion$Saver$1();

    ScrollState$Companion$Saver$1() {
        super(2);
    }

    public final Integer invoke(SaverScope saverScope, ScrollState scrollState) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(scrollState, "it");
        return Integer.valueOf(scrollState.getValue());
    }
}
