package androidx.compose.p002ui.graphics;

import android.graphics.Shader;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(31)
/* renamed from: androidx.compose.ui.graphics.TileModeVerificationHelper */
/* compiled from: AndroidTileMode.android.kt */
final class TileModeVerificationHelper {
    public static final TileModeVerificationHelper INSTANCE = new TileModeVerificationHelper();

    private TileModeVerificationHelper() {
    }

    @DoNotInline
    /* renamed from: getComposeTileModeDecal-3opZhB0  reason: not valid java name */
    public final int m36079getComposeTileModeDecal3opZhB0() {
        return TileMode.Companion.m36076getDecal3opZhB0();
    }

    @DoNotInline
    public final Shader.TileMode getFrameworkTileModeDecal() {
        return Shader.TileMode.DECAL;
    }
}
