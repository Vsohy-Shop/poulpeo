package androidx.compose.p002ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.Placeholder;
import androidx.compose.p002ui.text.PlaceholderVerticalAlign;
import androidx.compose.p002ui.text.android.style.PlaceholderSpan;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitType;
import androidx.emoji2.text.EmojiSpan;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPlaceholderExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n33#2,6:94\n13579#3,2:100\n*S KotlinDebug\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n*L\n35#1:94,6\n48#1:100,2\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.extensions.PlaceholderExtensions_androidKt */
/* compiled from: PlaceholderExtensions.android.kt */
public final class PlaceholderExtensions_androidKt {
    /* renamed from: getSpanUnit--R2X_6o  reason: not valid java name */
    private static final int m38219getSpanUnitR2X_6o(long j) {
        long r3 = TextUnit.m38648getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m38677equalsimpl0(r3, companion.m38682getSpUIouoOA())) {
            return 0;
        }
        if (TextUnitType.m38677equalsimpl0(r3, companion.m38681getEmUIouoOA())) {
            return 1;
        }
        return 2;
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg  reason: not valid java name */
    private static final int m38221getSpanVerticalAligndo9XGg(int i) {
        PlaceholderVerticalAlign.Companion companion = PlaceholderVerticalAlign.Companion;
        if (PlaceholderVerticalAlign.m37903equalsimpl0(i, companion.m37907getAboveBaselineJ6kI3mc())) {
            return 0;
        }
        if (PlaceholderVerticalAlign.m37903equalsimpl0(i, companion.m37913getTopJ6kI3mc())) {
            return 1;
        }
        if (PlaceholderVerticalAlign.m37903equalsimpl0(i, companion.m37908getBottomJ6kI3mc())) {
            return 2;
        }
        if (PlaceholderVerticalAlign.m37903equalsimpl0(i, companion.m37909getCenterJ6kI3mc())) {
            return 3;
        }
        if (PlaceholderVerticalAlign.m37903equalsimpl0(i, companion.m37912getTextTopJ6kI3mc())) {
            return 4;
        }
        if (PlaceholderVerticalAlign.m37903equalsimpl0(i, companion.m37910getTextBottomJ6kI3mc())) {
            return 5;
        }
        if (PlaceholderVerticalAlign.m37903equalsimpl0(i, companion.m37911getTextCenterJ6kI3mc())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    private static final void setPlaceholder(Spannable spannable, Placeholder placeholder, int i, int i2, Density density) {
        Object[] spans = spannable.getSpans(i, i2, EmojiSpan.class);
        C12775o.m28638h(spans, "getSpans(start, end, EmojiSpan::class.java)");
        for (Object obj : spans) {
            spannable.removeSpan((EmojiSpan) obj);
        }
        SpannableExtensions_androidKt.setSpan(spannable, new PlaceholderSpan(TextUnit.m38649getValueimpl(placeholder.m37899getWidthXSAIIZE()), m38219getSpanUnitR2X_6o(placeholder.m37899getWidthXSAIIZE()), TextUnit.m38649getValueimpl(placeholder.m37897getHeightXSAIIZE()), m38219getSpanUnitR2X_6o(placeholder.m37897getHeightXSAIIZE()), density.getFontScale() * density.getDensity(), m38221getSpanVerticalAligndo9XGg(placeholder.m37898getPlaceholderVerticalAlignJ6kI3mc())), i, i2);
    }

    public static final void setPlaceholders(Spannable spannable, List<AnnotatedString.Range<Placeholder>> list, Density density) {
        C12775o.m28639i(spannable, "<this>");
        C12775o.m28639i(list, "placeholders");
        C12775o.m28639i(density, "density");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range range = list.get(i);
            setPlaceholder(spannable, (Placeholder) range.component1(), range.component2(), range.component3(), density);
        }
    }

    /* renamed from: getSpanUnit--R2X_6o$annotations  reason: not valid java name */
    private static /* synthetic */ void m38220getSpanUnitR2X_6o$annotations(long j) {
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg$annotations  reason: not valid java name */
    private static /* synthetic */ void m38222getSpanVerticalAligndo9XGg$annotations(int i) {
    }
}
