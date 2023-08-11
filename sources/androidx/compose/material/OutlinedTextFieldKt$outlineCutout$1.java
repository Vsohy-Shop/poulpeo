package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.ClipOp;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawContext;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt$outlineCutout$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,981:1\n221#2:982\n261#2,11:983\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt$outlineCutout$1\n*L\n963#1:982\n963#1:983,11\n*E\n"})
/* compiled from: OutlinedTextField.kt */
final class OutlinedTextFieldKt$outlineCutout$1 extends C12777p implements Function1<ContentDrawScope, C11921v> {
    final /* synthetic */ long $labelSize;
    final /* synthetic */ PaddingValues $paddingValues;

    /* compiled from: OutlinedTextField.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OutlinedTextFieldKt$outlineCutout$1(long j, PaddingValues paddingValues) {
        super(1);
        this.$labelSize = j;
        this.$paddingValues = paddingValues;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(ContentDrawScope contentDrawScope) {
        float f;
        C12775o.m28639i(contentDrawScope, "$this$drawWithContent");
        float r0 = Size.m35491getWidthimpl(this.$labelSize);
        if (r0 > 0.0f) {
            float r2 = contentDrawScope.m38449toPx0680j_4(OutlinedTextFieldKt.OutlinedTextFieldInnerPadding);
            float r3 = contentDrawScope.m38449toPx0680j_4(this.$paddingValues.m33279calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - r2;
            float f2 = (float) 2;
            float f3 = r0 + r3 + (r2 * f2);
            LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            if (iArr[layoutDirection.ordinal()] == 1) {
                f = Size.m35491getWidthimpl(contentDrawScope.m36274getSizeNHjbRc()) - f3;
            } else {
                f = C13537l.m30876c(r3, 0.0f);
            }
            float f4 = f;
            if (iArr[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                f3 = Size.m35491getWidthimpl(contentDrawScope.m36274getSizeNHjbRc()) - C13537l.m30876c(r3, 0.0f);
            }
            float f5 = f3;
            float r02 = Size.m35488getHeightimpl(this.$labelSize);
            float f6 = (-r02) / f2;
            float f7 = r02 / f2;
            int r12 = ClipOp.Companion.m35659getDifferencertfAjoo();
            DrawContext drawContext = contentDrawScope.getDrawContext();
            long r1 = drawContext.m36217getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().m36329clipRectN_I0leg(f4, f6, f5, f7, r12);
            contentDrawScope.drawContent();
            drawContext.getCanvas().restore();
            drawContext.m36218setSizeuvyYCjk(r1);
            return;
        }
        contentDrawScope.drawContent();
    }
}
