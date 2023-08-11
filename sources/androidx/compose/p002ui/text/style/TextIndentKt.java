package androidx.compose.p002ui.text.style;

import androidx.compose.p002ui.text.SpanStyleKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.style.TextIndentKt */
/* compiled from: TextIndent.kt */
public final class TextIndentKt {
    public static final TextIndent lerp(TextIndent textIndent, TextIndent textIndent2, float f) {
        C12775o.m28639i(textIndent, "start");
        C12775o.m28639i(textIndent2, "stop");
        return new TextIndent(SpanStyleKt.m37940lerpTextUnitInheritableC3pnCVY(textIndent.m38372getFirstLineXSAIIZE(), textIndent2.m38372getFirstLineXSAIIZE(), f), SpanStyleKt.m37940lerpTextUnitInheritableC3pnCVY(textIndent.m38373getRestLineXSAIIZE(), textIndent2.m38373getRestLineXSAIIZE(), f), (DefaultConstructorMarker) null);
    }
}
