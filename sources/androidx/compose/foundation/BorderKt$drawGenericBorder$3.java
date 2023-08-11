package androidx.compose.foundation;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$drawGenericBorder$3\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,459:1\n120#2,4:460\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$drawGenericBorder$3\n*L\n317#1:460,4\n*E\n"})
/* compiled from: Border.kt */
final class BorderKt$drawGenericBorder$3 extends C12777p implements Function1<ContentDrawScope, C11921v> {
    final /* synthetic */ Ref$ObjectRef<ImageBitmap> $cacheImageBitmap;
    final /* synthetic */ ColorFilter $colorFilter;
    final /* synthetic */ Rect $pathBounds;
    final /* synthetic */ long $pathBoundsSize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BorderKt$drawGenericBorder$3(Rect rect, Ref$ObjectRef<ImageBitmap> ref$ObjectRef, long j, ColorFilter colorFilter) {
        super(1);
        this.$pathBounds = rect;
        this.$cacheImageBitmap = ref$ObjectRef;
        this.$pathBoundsSize = j;
        this.$colorFilter = colorFilter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(ContentDrawScope contentDrawScope) {
        C12775o.m28639i(contentDrawScope, "$this$onDrawWithContent");
        contentDrawScope.drawContent();
        float left = this.$pathBounds.getLeft();
        float top = this.$pathBounds.getTop();
        Ref$ObjectRef<ImageBitmap> ref$ObjectRef = this.$cacheImageBitmap;
        long j = this.$pathBoundsSize;
        ColorFilter colorFilter = this.$colorFilter;
        contentDrawScope.getDrawContext().getTransform().translate(left, top);
        DrawScope.m36239drawImageAZ2fEMs$default(contentDrawScope, (ImageBitmap) ref$ObjectRef.f20403b, 0, j, 0, 0, 0.0f, (DrawStyle) null, colorFilter, 0, 0, 890, (Object) null);
        contentDrawScope.getDrawContext().getTransform().translate(-left, -top);
    }
}
