package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.style.Hyphens;
import androidx.compose.p002ui.text.style.LineBreak;
import androidx.compose.p002ui.text.style.LineHeightStyle;
import androidx.compose.p002ui.text.style.TextAlign;
import androidx.compose.p002ui.text.style.TextDirection;
import androidx.compose.p002ui.text.style.TextIndent;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.runtime.saveable.Saver;
import com.rmn.api.p322v2.main.oauth.OAuthErrorCodes;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n70#2:424\n55#2,2:426\n55#2,2:429\n1#3:423\n1#3:425\n1#3:428\n1#3:431\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n*L\n213#1:422\n214#1:424\n215#1:426,2\n216#1:429,2\n213#1:423\n214#1:425\n215#1:428\n216#1:431\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2 */
/* compiled from: Savers.kt */
final class SaversKt$ParagraphStyleSaver$2 extends C12777p implements Function1<Object, ParagraphStyle> {
    public static final SaversKt$ParagraphStyleSaver$2 INSTANCE = new SaversKt$ParagraphStyleSaver$2();

    SaversKt$ParagraphStyleSaver$2() {
        super(1);
    }

    public final ParagraphStyle invoke(Object obj) {
        TextUnit textUnit;
        TextIndent textIndent;
        C12775o.m28639i(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextAlign textAlign = obj2 != null ? (TextAlign) obj2 : null;
        Object obj3 = list.get(1);
        TextDirection textDirection = obj3 != null ? (TextDirection) obj3 : null;
        Object obj4 = list.get(2);
        Saver<TextUnit, Object> saver = SaversKt.getSaver(TextUnit.Companion);
        Boolean bool = Boolean.FALSE;
        if (!C12775o.m28634d(obj4, bool) && obj4 != null) {
            textUnit = saver.restore(obj4);
        } else {
            textUnit = null;
        }
        C12775o.m28636f(textUnit);
        long r6 = textUnit.m38658unboximpl();
        Object obj5 = list.get(3);
        Saver<TextIndent, Object> saver2 = SaversKt.getSaver(TextIndent.Companion);
        if (!C12775o.m28634d(obj5, bool) && obj5 != null) {
            textIndent = saver2.restore(obj5);
        } else {
            textIndent = null;
        }
        return new ParagraphStyle(textAlign, textDirection, r6, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (int) OAuthErrorCodes.ERR_OAUTH_HEADERS, (DefaultConstructorMarker) null);
    }
}
