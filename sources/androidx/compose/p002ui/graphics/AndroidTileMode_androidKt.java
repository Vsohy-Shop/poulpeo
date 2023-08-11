package androidx.compose.p002ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.p002ui.graphics.TileMode;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.AndroidTileMode_androidKt */
/* compiled from: AndroidTileMode.android.kt */
public final class AndroidTileMode_androidKt {

    /* renamed from: androidx.compose.ui.graphics.AndroidTileMode_androidKt$WhenMappings */
    /* compiled from: AndroidTileMode.android.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                android.graphics.Shader$TileMode[] r0 = android.graphics.Shader.TileMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.AndroidTileMode_androidKt.WhenMappings.<clinit>():void");
        }
    }

    /* renamed from: isSupported-0vamqd0  reason: not valid java name */
    public static final boolean m35566isSupported0vamqd0(int i) {
        if (Build.VERSION.SDK_INT >= 31 || !TileMode.m36071equalsimpl0(i, TileMode.Companion.m36076getDecal3opZhB0())) {
            return true;
        }
        return false;
    }

    /* renamed from: toAndroidTileMode-0vamqd0  reason: not valid java name */
    public static final Shader.TileMode m35567toAndroidTileMode0vamqd0(int i) {
        TileMode.Companion companion = TileMode.Companion;
        if (TileMode.m36071equalsimpl0(i, companion.m36075getClamp3opZhB0())) {
            return Shader.TileMode.CLAMP;
        }
        if (TileMode.m36071equalsimpl0(i, companion.m36078getRepeated3opZhB0())) {
            return Shader.TileMode.REPEAT;
        }
        if (TileMode.m36071equalsimpl0(i, companion.m36077getMirror3opZhB0())) {
            return Shader.TileMode.MIRROR;
        }
        if (!TileMode.m36071equalsimpl0(i, companion.m36076getDecal3opZhB0())) {
            return Shader.TileMode.CLAMP;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal();
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(Shader.TileMode tileMode) {
        C12775o.m28639i(tileMode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[tileMode.ordinal()];
        if (i == 1) {
            return TileMode.Companion.m36075getClamp3opZhB0();
        }
        if (i == 2) {
            return TileMode.Companion.m36077getMirror3opZhB0();
        }
        if (i == 3) {
            return TileMode.Companion.m36078getRepeated3opZhB0();
        }
        if (Build.VERSION.SDK_INT < 31 || tileMode != Shader.TileMode.DECAL) {
            return TileMode.Companion.m36075getClamp3opZhB0();
        }
        return TileModeVerificationHelper.INSTANCE.m36079getComposeTileModeDecal3opZhB0();
    }
}
