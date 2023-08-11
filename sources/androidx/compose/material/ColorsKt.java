package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,337:1\n658#2:338\n646#2:339\n76#3:340\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n*L\n297#1:338\n297#1:339\n297#1:340\n*E\n"})
/* compiled from: Colors.kt */
public final class ColorsKt {
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(ColorsKt$LocalColors$1.INSTANCE);

    /* renamed from: contentColorFor-4WTKRHQ  reason: not valid java name */
    public static final long m33969contentColorFor4WTKRHQ(Colors colors, long j) {
        C12775o.m28639i(colors, "$this$contentColorFor");
        if (Color.m35672equalsimpl0(j, colors.m33952getPrimary0d7_KjU())) {
            return colors.m33949getOnPrimary0d7_KjU();
        }
        if (Color.m35672equalsimpl0(j, colors.m33953getPrimaryVariant0d7_KjU())) {
            return colors.m33949getOnPrimary0d7_KjU();
        }
        if (Color.m35672equalsimpl0(j, colors.m33954getSecondary0d7_KjU())) {
            return colors.m33950getOnSecondary0d7_KjU();
        }
        if (Color.m35672equalsimpl0(j, colors.m33955getSecondaryVariant0d7_KjU())) {
            return colors.m33950getOnSecondary0d7_KjU();
        }
        if (Color.m35672equalsimpl0(j, colors.m33945getBackground0d7_KjU())) {
            return colors.m33947getOnBackground0d7_KjU();
        }
        if (Color.m35672equalsimpl0(j, colors.m33956getSurface0d7_KjU())) {
            return colors.m33951getOnSurface0d7_KjU();
        }
        if (Color.m35672equalsimpl0(j, colors.m33946getError0d7_KjU())) {
            return colors.m33948getOnError0d7_KjU();
        }
        return Color.Companion.m35707getUnspecified0d7_KjU();
    }

    @ReadOnlyComposable
    @Composable
    /* renamed from: contentColorFor-ek8zF_U  reason: not valid java name */
    public static final long m33970contentColorForek8zF_U(long j, Composer composer, int i) {
        boolean z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441849991, i, -1, "androidx.compose.material.contentColorFor (Colors.kt:295)");
        }
        long r3 = m33969contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j);
        if (r3 != Color.Companion.m35707getUnspecified0d7_KjU()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            r3 = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return r3;
    }

    /* renamed from: darkColors-2qZNXz8  reason: not valid java name */
    public static final Colors m33971darkColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, false, (DefaultConstructorMarker) null);
    }

    /* renamed from: darkColors-2qZNXz8$default  reason: not valid java name */
    public static /* synthetic */ Colors m33972darkColors2qZNXz8$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        int i2 = i;
        if ((i2 & 1) != 0) {
            j13 = ColorKt.Color(4290479868L);
        } else {
            j13 = j;
        }
        if ((i2 & 2) != 0) {
            j14 = ColorKt.Color(4281794739L);
        } else {
            j14 = j2;
        }
        if ((i2 & 4) != 0) {
            j15 = ColorKt.Color(4278442694L);
        } else {
            j15 = j3;
        }
        if ((i2 & 8) != 0) {
            j16 = j15;
        } else {
            j16 = j4;
        }
        if ((i2 & 16) != 0) {
            j17 = ColorKt.Color(4279374354L);
        } else {
            j17 = j5;
        }
        if ((i2 & 32) != 0) {
            j18 = ColorKt.Color(4279374354L);
        } else {
            j18 = j6;
        }
        if ((i2 & 64) != 0) {
            j19 = ColorKt.Color(4291782265L);
        } else {
            j19 = j7;
        }
        if ((i2 & 128) != 0) {
            j20 = Color.Companion.m35697getBlack0d7_KjU();
        } else {
            j20 = j8;
        }
        if ((i2 & 256) != 0) {
            j21 = Color.Companion.m35697getBlack0d7_KjU();
        } else {
            j21 = j9;
        }
        if ((i2 & 512) != 0) {
            j22 = Color.Companion.m35708getWhite0d7_KjU();
        } else {
            j22 = j10;
        }
        if ((i2 & 1024) != 0) {
            j23 = Color.Companion.m35708getWhite0d7_KjU();
        } else {
            j23 = j11;
        }
        if ((i2 & 2048) != 0) {
            j24 = Color.Companion.m35697getBlack0d7_KjU();
        } else {
            j24 = j12;
        }
        return m33971darkColors2qZNXz8(j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24);
    }

    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }

    public static final long getPrimarySurface(Colors colors) {
        C12775o.m28639i(colors, "<this>");
        if (colors.isLight()) {
            return colors.m33952getPrimary0d7_KjU();
        }
        return colors.m33956getSurface0d7_KjU();
    }

    /* renamed from: lightColors-2qZNXz8  reason: not valid java name */
    public static final Colors m33973lightColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, (DefaultConstructorMarker) null);
    }

    /* renamed from: lightColors-2qZNXz8$default  reason: not valid java name */
    public static /* synthetic */ Colors m33974lightColors2qZNXz8$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        int i2 = i;
        if ((i2 & 1) != 0) {
            j13 = ColorKt.Color(4284612846L);
        } else {
            j13 = j;
        }
        if ((i2 & 2) != 0) {
            j14 = ColorKt.Color(4281794739L);
        } else {
            j14 = j2;
        }
        if ((i2 & 4) != 0) {
            j15 = ColorKt.Color(4278442694L);
        } else {
            j15 = j3;
        }
        if ((i2 & 8) != 0) {
            j16 = ColorKt.Color(4278290310L);
        } else {
            j16 = j4;
        }
        if ((i2 & 16) != 0) {
            j17 = Color.Companion.m35708getWhite0d7_KjU();
        } else {
            j17 = j5;
        }
        if ((i2 & 32) != 0) {
            j18 = Color.Companion.m35708getWhite0d7_KjU();
        } else {
            j18 = j6;
        }
        if ((i2 & 64) != 0) {
            j19 = ColorKt.Color(4289724448L);
        } else {
            j19 = j7;
        }
        if ((i2 & 128) != 0) {
            j20 = Color.Companion.m35708getWhite0d7_KjU();
        } else {
            j20 = j8;
        }
        long j25 = j20;
        if ((i2 & 256) != 0) {
            j21 = Color.Companion.m35697getBlack0d7_KjU();
        } else {
            j21 = j9;
        }
        long j26 = j21;
        if ((i2 & 512) != 0) {
            j22 = Color.Companion.m35697getBlack0d7_KjU();
        } else {
            j22 = j10;
        }
        long j27 = j22;
        if ((i2 & 1024) != 0) {
            j23 = Color.Companion.m35697getBlack0d7_KjU();
        } else {
            j23 = j11;
        }
        if ((i2 & 2048) != 0) {
            j24 = Color.Companion.m35708getWhite0d7_KjU();
        } else {
            j24 = j12;
        }
        return m33973lightColors2qZNXz8(j13, j14, j15, j16, j17, j18, j19, j25, j26, j27, j23, j24);
    }

    public static final void updateColorsFrom(Colors colors, Colors colors2) {
        C12775o.m28639i(colors, "<this>");
        C12775o.m28639i(colors2, "other");
        colors.m33964setPrimary8_81llA$material_release(colors2.m33952getPrimary0d7_KjU());
        colors.m33965setPrimaryVariant8_81llA$material_release(colors2.m33953getPrimaryVariant0d7_KjU());
        colors.m33966setSecondary8_81llA$material_release(colors2.m33954getSecondary0d7_KjU());
        colors.m33967setSecondaryVariant8_81llA$material_release(colors2.m33955getSecondaryVariant0d7_KjU());
        colors.m33957setBackground8_81llA$material_release(colors2.m33945getBackground0d7_KjU());
        colors.m33968setSurface8_81llA$material_release(colors2.m33956getSurface0d7_KjU());
        colors.m33958setError8_81llA$material_release(colors2.m33946getError0d7_KjU());
        colors.m33961setOnPrimary8_81llA$material_release(colors2.m33949getOnPrimary0d7_KjU());
        colors.m33962setOnSecondary8_81llA$material_release(colors2.m33950getOnSecondary0d7_KjU());
        colors.m33959setOnBackground8_81llA$material_release(colors2.m33947getOnBackground0d7_KjU());
        colors.m33963setOnSurface8_81llA$material_release(colors2.m33951getOnSurface0d7_KjU());
        colors.m33960setOnError8_81llA$material_release(colors2.m33948getOnError0d7_KjU());
        colors.setLight$material_release(colors2.isLight());
    }
}
