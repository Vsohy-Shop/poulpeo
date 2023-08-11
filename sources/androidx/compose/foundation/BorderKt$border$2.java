package androidx.compose.foundation;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.CacheDrawScope;
import androidx.compose.p002ui.draw.DrawModifierKt;
import androidx.compose.p002ui.draw.DrawResult;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Outline;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.node.Ref;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$border$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,459:1\n25#2:460\n1114#3,6:461\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$border$2\n*L\n98#1:460\n98#1:461,6\n*E\n"})
/* compiled from: Border.kt */
final class BorderKt$border$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Brush $brush;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ float $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BorderKt$border$2(float f, Shape shape, Brush brush) {
        super(3);
        this.$width = f;
        this.$shape = shape;
        this.$brush = brush;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(-1498088849);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1498088849, i, -1, "androidx.compose.foundation.border.<anonymous> (Border.kt:93)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Ref();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final Ref ref = (Ref) rememberedValue;
        Modifier.Companion companion = Modifier.Companion;
        final float f = this.$width;
        final Shape shape = this.$shape;
        final Brush brush = this.$brush;
        Modifier then = modifier.then(DrawModifierKt.drawWithCache(companion, new Function1<CacheDrawScope, DrawResult>() {
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                C12775o.m28639i(cacheDrawScope, "$this$drawWithCache");
                if (!(cacheDrawScope.m38449toPx0680j_4(f) >= 0.0f && Size.m35490getMinDimensionimpl(cacheDrawScope.m35329getSizeNHjbRc()) > 0.0f)) {
                    return BorderKt.drawContentWithoutBorder(cacheDrawScope);
                }
                float f = (float) 2;
                float min = Math.min(C1232Dp.m38473equalsimpl0(f, C1232Dp.Companion.m38486getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil((double) cacheDrawScope.m38449toPx0680j_4(f)), (float) Math.ceil((double) (Size.m35490getMinDimensionimpl(cacheDrawScope.m35329getSizeNHjbRc()) / f)));
                float f2 = min / f;
                long Offset = OffsetKt.Offset(f2, f2);
                long Size = SizeKt.Size(Size.m35491getWidthimpl(cacheDrawScope.m35329getSizeNHjbRc()) - min, Size.m35488getHeightimpl(cacheDrawScope.m35329getSizeNHjbRc()) - min);
                boolean z = f * min > Size.m35490getMinDimensionimpl(cacheDrawScope.m35329getSizeNHjbRc());
                Outline r1 = shape.m36025createOutlinePq9zytI(cacheDrawScope.m35329getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                if (r1 instanceof Outline.Generic) {
                    return BorderKt.drawGenericBorder(cacheDrawScope, ref, brush, (Outline.Generic) r1, z, min);
                } else if (r1 instanceof Outline.Rounded) {
                    return BorderKt.m32971drawRoundRectBorderSYlcjDY(cacheDrawScope, ref, brush, (Outline.Rounded) r1, Offset, Size, z, min);
                } else if (r1 instanceof Outline.Rectangle) {
                    return BorderKt.m32970drawRectBorderNsqcLGU(cacheDrawScope, brush, Offset, Size, z, min);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
