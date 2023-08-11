package androidx.compose.material;

import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: TextField.kt */
final class TextFieldMeasurePolicy$maxIntrinsicWidth$1 extends C12777p implements C13088o<IntrinsicMeasurable, Integer, Integer> {
    public static final TextFieldMeasurePolicy$maxIntrinsicWidth$1 INSTANCE = new TextFieldMeasurePolicy$maxIntrinsicWidth$1();

    TextFieldMeasurePolicy$maxIntrinsicWidth$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
    }

    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasurable, "intrinsicMeasurable");
        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i));
    }
}
