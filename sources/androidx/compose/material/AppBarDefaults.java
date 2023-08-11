package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,547:1\n154#2:548\n154#2:549\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n*L\n250#1:548\n255#1:549\n*E\n"})
/* compiled from: AppBar.kt */
public final class AppBarDefaults {
    public static final int $stable = 0;
    private static final float BottomAppBarElevation = C1232Dp.m38468constructorimpl((float) 8);
    private static final PaddingValues ContentPadding = PaddingKt.m33265PaddingValuesa9UjIt4$default(AppBarKt.AppBarHorizontalPadding, 0.0f, AppBarKt.AppBarHorizontalPadding, 0.0f, 10, (Object) null);
    public static final AppBarDefaults INSTANCE = new AppBarDefaults();
    private static final float TopAppBarElevation = C1232Dp.m38468constructorimpl((float) 4);

    private AppBarDefaults() {
    }

    /* renamed from: getBottomAppBarElevation-D9Ej5fM  reason: not valid java name */
    public final float m33873getBottomAppBarElevationD9Ej5fM() {
        return BottomAppBarElevation;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getTopAppBarElevation-D9Ej5fM  reason: not valid java name */
    public final float m33874getTopAppBarElevationD9Ej5fM() {
        return TopAppBarElevation;
    }
}
