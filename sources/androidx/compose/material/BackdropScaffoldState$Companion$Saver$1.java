package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: BackdropScaffold.kt */
final class BackdropScaffoldState$Companion$Saver$1 extends C12777p implements C13088o<SaverScope, BackdropScaffoldState, BackdropValue> {
    public static final BackdropScaffoldState$Companion$Saver$1 INSTANCE = new BackdropScaffoldState$Companion$Saver$1();

    BackdropScaffoldState$Companion$Saver$1() {
        super(2);
    }

    public final BackdropValue invoke(SaverScope saverScope, BackdropScaffoldState backdropScaffoldState) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(backdropScaffoldState, "it");
        return (BackdropValue) backdropScaffoldState.getCurrentValue();
    }
}
