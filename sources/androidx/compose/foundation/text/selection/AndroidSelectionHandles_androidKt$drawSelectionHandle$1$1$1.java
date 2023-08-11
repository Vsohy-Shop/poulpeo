package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.draw.CacheDrawScope;
import androidx.compose.p002ui.draw.DrawResult;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawContext;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: AndroidSelectionHandles.android.kt */
final class AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1 extends C12777p implements Function1<CacheDrawScope, DrawResult> {
    final /* synthetic */ ResolvedTextDirection $direction;
    final /* synthetic */ long $handleColor;
    final /* synthetic */ boolean $handlesCrossed;
    final /* synthetic */ boolean $isStartHandle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1(long j, boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        super(1);
        this.$handleColor = j;
        this.$isStartHandle = z;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z2;
    }

    public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
        C12775o.m28639i(cacheDrawScope, "$this$drawWithCache");
        final ImageBitmap createHandleImage = AndroidSelectionHandles_androidKt.createHandleImage(cacheDrawScope, Size.m35491getWidthimpl(cacheDrawScope.m35329getSizeNHjbRc()) / 2.0f);
        final ColorFilter r6 = ColorFilter.Companion.m35712tintxETnrds$default(ColorFilter.Companion, this.$handleColor, 0, 2, (Object) null);
        final boolean z = this.$isStartHandle;
        final ResolvedTextDirection resolvedTextDirection = this.$direction;
        final boolean z2 = this.$handlesCrossed;
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, C11921v>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C11921v.f18618a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                C12775o.m28639i(contentDrawScope, "$this$onDrawWithContent");
                contentDrawScope.drawContent();
                if (AndroidSelectionHandles_androidKt.isLeft(z, resolvedTextDirection, z2)) {
                    ImageBitmap imageBitmap = createHandleImage;
                    ColorFilter colorFilter = r6;
                    long r0 = contentDrawScope.m36273getCenterF1C5BW0();
                    DrawContext drawContext = contentDrawScope.getDrawContext();
                    long r12 = drawContext.m36217getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    drawContext.getTransform().m36333scale0AR0LA0(-1.0f, 1.0f, r0);
                    DrawScope.m36240drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0, 0.0f, (DrawStyle) null, colorFilter, 0, 46, (Object) null);
                    drawContext.getCanvas().restore();
                    drawContext.m36218setSizeuvyYCjk(r12);
                    return;
                }
                DrawScope.m36240drawImagegbVJVH8$default(contentDrawScope, createHandleImage, 0, 0.0f, (DrawStyle) null, r6, 0, 46, (Object) null);
            }
        });
    }
}
