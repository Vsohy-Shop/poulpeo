package androidx.compose.material3;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: NavigationDrawer.kt */
final class DrawerState$Companion$Saver$1 extends C12777p implements C13088o<SaverScope, DrawerState, DrawerValue> {
    public static final DrawerState$Companion$Saver$1 INSTANCE = new DrawerState$Companion$Saver$1();

    DrawerState$Companion$Saver$1() {
        super(2);
    }

    public final DrawerValue invoke(SaverScope saverScope, DrawerState drawerState) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(drawerState, "it");
        return drawerState.getCurrentValue();
    }
}
