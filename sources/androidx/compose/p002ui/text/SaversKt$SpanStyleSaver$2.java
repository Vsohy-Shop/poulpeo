package androidx.compose.p002ui.text;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$SpanStyleSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n55#2,2:428\n70#2:431\n70#2:433\n70#2:435\n55#2,2:437\n55#2,2:440\n55#2,2:443\n55#2,2:446\n55#2,2:449\n55#2,2:452\n55#2,2:455\n1#3:424\n1#3:427\n1#3:430\n1#3:432\n1#3:434\n1#3:436\n1#3:439\n1#3:442\n1#3:445\n1#3:448\n1#3:451\n1#3:454\n1#3:457\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$SpanStyleSaver$2\n*L\n243#1:422,2\n244#1:425,2\n245#1:428,2\n246#1:431\n247#1:433\n249#1:435\n250#1:437,2\n251#1:440,2\n252#1:443,2\n253#1:446,2\n254#1:449,2\n255#1:452,2\n256#1:455,2\n243#1:424\n244#1:427\n245#1:430\n246#1:432\n247#1:434\n249#1:436\n250#1:439\n251#1:442\n252#1:445\n253#1:448\n254#1:451\n255#1:454\n256#1:457\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2 */
/* compiled from: Savers.kt */
final class SaversKt$SpanStyleSaver$2 extends C12777p implements Function1<Object, SpanStyle> {
    public static final SaversKt$SpanStyleSaver$2 INSTANCE = new SaversKt$SpanStyleSaver$2();

    SaversKt$SpanStyleSaver$2() {
        super(1);
    }

    public final SpanStyle invoke(Object obj) {
        Color color;
        TextUnit textUnit;
        FontWeight fontWeight;
        TextUnit textUnit2;
        BaselineShift baselineShift;
        TextGeometricTransform textGeometricTransform;
        LocaleList localeList;
        Color color2;
        TextDecoration textDecoration;
        Shadow shadow;
        Object obj2 = obj;
        C12775o.m28639i(obj2, "it");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        Color.Companion companion = Color.Companion;
        Saver<Color, Object> saver = SaversKt.getSaver(companion);
        Boolean bool = Boolean.FALSE;
        if (!C12775o.m28634d(obj3, bool) && obj3 != null) {
            color = saver.restore(obj3);
        } else {
            color = null;
        }
        C12775o.m28636f(color);
        long r7 = color.m35681unboximpl();
        Object obj4 = list.get(1);
        TextUnit.Companion companion2 = TextUnit.Companion;
        Saver<TextUnit, Object> saver2 = SaversKt.getSaver(companion2);
        if (!C12775o.m28634d(obj4, bool) && obj4 != null) {
            textUnit = saver2.restore(obj4);
        } else {
            textUnit = null;
        }
        C12775o.m28636f(textUnit);
        long r9 = textUnit.m38658unboximpl();
        Object obj5 = list.get(2);
        Saver<FontWeight, Object> saver3 = SaversKt.getSaver(FontWeight.Companion);
        if (!C12775o.m28634d(obj5, bool) && obj5 != null) {
            fontWeight = saver3.restore(obj5);
        } else {
            fontWeight = null;
        }
        Object obj6 = list.get(3);
        FontStyle fontStyle = obj6 != null ? (FontStyle) obj6 : null;
        Object obj7 = list.get(4);
        FontSynthesis fontSynthesis = obj7 != null ? (FontSynthesis) obj7 : null;
        Object obj8 = list.get(6);
        String str = obj8 != null ? (String) obj8 : null;
        Object obj9 = list.get(7);
        Saver<TextUnit, Object> saver4 = SaversKt.getSaver(companion2);
        if (!C12775o.m28634d(obj9, bool) && obj9 != null) {
            textUnit2 = saver4.restore(obj9);
        } else {
            textUnit2 = null;
        }
        C12775o.m28636f(textUnit2);
        long r16 = textUnit2.m38658unboximpl();
        Object obj10 = list.get(8);
        Saver<BaselineShift, Object> saver5 = SaversKt.getSaver(BaselineShift.Companion);
        if (!C12775o.m28634d(obj10, bool) && obj10 != null) {
            baselineShift = saver5.restore(obj10);
        } else {
            baselineShift = null;
        }
        Object obj11 = list.get(9);
        Saver<TextGeometricTransform, Object> saver6 = SaversKt.getSaver(TextGeometricTransform.Companion);
        if (!C12775o.m28634d(obj11, bool) && obj11 != null) {
            textGeometricTransform = saver6.restore(obj11);
        } else {
            textGeometricTransform = null;
        }
        Object obj12 = list.get(10);
        Saver<LocaleList, Object> saver7 = SaversKt.getSaver(LocaleList.Companion);
        if (!C12775o.m28634d(obj12, bool) && obj12 != null) {
            localeList = saver7.restore(obj12);
        } else {
            localeList = null;
        }
        Object obj13 = list.get(11);
        Saver<Color, Object> saver8 = SaversKt.getSaver(companion);
        if (!C12775o.m28634d(obj13, bool) && obj13 != null) {
            color2 = saver8.restore(obj13);
        } else {
            color2 = null;
        }
        C12775o.m28636f(color2);
        long r24 = color2.m35681unboximpl();
        Object obj14 = list.get(12);
        Saver<TextDecoration, Object> saver9 = SaversKt.getSaver(TextDecoration.Companion);
        if (!C12775o.m28634d(obj14, bool) && obj14 != null) {
            textDecoration = saver9.restore(obj14);
        } else {
            textDecoration = null;
        }
        Object obj15 = list.get(13);
        Saver<Shadow, Object> saver10 = SaversKt.getSaver(Shadow.Companion);
        if (!C12775o.m28634d(obj15, bool) && obj15 != null) {
            shadow = saver10.restore(obj15);
        } else {
            shadow = null;
        }
        return new SpanStyle(r7, r9, fontWeight, fontStyle, fontSynthesis, (FontFamily) null, str, r16, baselineShift, textGeometricTransform, localeList, r24, textDecoration, shadow, 32, (DefaultConstructorMarker) null);
    }
}
