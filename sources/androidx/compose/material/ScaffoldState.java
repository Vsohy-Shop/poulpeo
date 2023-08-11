package androidx.compose.material;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;

@Stable
/* compiled from: Scaffold.kt */
public final class ScaffoldState {
    public static final int $stable = 0;
    private final DrawerState drawerState;
    private final SnackbarHostState snackbarHostState;

    public ScaffoldState(DrawerState drawerState2, SnackbarHostState snackbarHostState2) {
        C12775o.m28639i(drawerState2, "drawerState");
        C12775o.m28639i(snackbarHostState2, "snackbarHostState");
        this.drawerState = drawerState2;
        this.snackbarHostState = snackbarHostState2;
    }

    public final DrawerState getDrawerState() {
        return this.drawerState;
    }

    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }
}
