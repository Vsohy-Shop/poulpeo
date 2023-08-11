package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.p002ui.draw.CacheDrawScope;
import androidx.compose.p002ui.draw.DrawResult;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawContext;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.graphics.drawscope.DrawTransform;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: AndroidCursorHandle.android.kt */
final class AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1 extends C12777p implements Function1<CacheDrawScope, DrawResult> {
    final /* synthetic */ long $handleColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1(long j) {
        super(1);
        this.$handleColor = j;
    }

    public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
        C12775o.m28639i(cacheDrawScope, "$this$drawWithCache");
        final float r0 = Size.m35491getWidthimpl(cacheDrawScope.m35329getSizeNHjbRc()) / 2.0f;
        final ImageBitmap createHandleImage = AndroidSelectionHandles_androidKt.createHandleImage(cacheDrawScope, r0);
        final ColorFilter r2 = ColorFilter.Companion.m35712tintxETnrds$default(ColorFilter.Companion, this.$handleColor, 0, 2, (Object) null);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, C11921v>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C11921v.f18618a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                C12775o.m28639i(contentDrawScope, "$this$onDrawWithContent");
                contentDrawScope.drawContent();
                float f = r0;
                ImageBitmap imageBitmap = createHandleImage;
                ColorFilter colorFilter = r2;
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long r12 = drawContext.m36217getSizeNHjbRc();
                drawContext.getCanvas().save();
                DrawTransform transform = drawContext.getTransform();
                DrawTransform.translate$default(transform, f, 0.0f, 2, (Object) null);
                transform.m36332rotateUv8p0NA(45.0f, Offset.Companion.m35438getZeroF1C5BW0());
                DrawScope.m36240drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0, 0.0f, (DrawStyle) null, colorFilter, 0, 46, (Object) null);
                drawContext.getCanvas().restore();
                drawContext.m36218setSizeuvyYCjk(r12);
            }
        });
    }
}
