package androidx.compose.material;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;

@ExperimentalMaterialApi
@Stable
/* compiled from: BottomSheetScaffold.kt */
public final class BottomSheetScaffoldState {
    public static final int $stable = 0;
    private final BottomSheetState bottomSheetState;
    private final DrawerState drawerState;
    private final SnackbarHostState snackbarHostState;

    public BottomSheetScaffoldState(DrawerState drawerState2, BottomSheetState bottomSheetState2, SnackbarHostState snackbarHostState2) {
        C12775o.m28639i(drawerState2, "drawerState");
        C12775o.m28639i(bottomSheetState2, "bottomSheetState");
        C12775o.m28639i(snackbarHostState2, "snackbarHostState");
        this.drawerState = drawerState2;
        this.bottomSheetState = bottomSheetState2;
        this.snackbarHostState = snackbarHostState2;
    }

    public final BottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    public final DrawerState getDrawerState() {
        return this.drawerState;
    }

    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }
}
