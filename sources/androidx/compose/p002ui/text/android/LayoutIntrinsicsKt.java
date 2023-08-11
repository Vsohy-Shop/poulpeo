package androidx.compose.p002ui.text.android;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import androidx.compose.p002ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.p002ui.text.android.style.LetterSpacingSpanPx;
import java.text.BreakIterator;
import java.util.PriorityQueue;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;

@SourceDebugExtension({"SMAP\nLayoutIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutIntrinsics.kt\nandroidx/compose/ui/text/android/LayoutIntrinsicsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1855#2,2:172\n*S KotlinDebug\n*F\n+ 1 LayoutIntrinsics.kt\nandroidx/compose/ui/text/android/LayoutIntrinsicsKt\n*L\n142#1:172,2\n*E\n"})
/* renamed from: androidx.compose.ui.text.android.LayoutIntrinsicsKt */
/* compiled from: LayoutIntrinsics.kt */
public final class LayoutIntrinsicsKt {
    public static final float minIntrinsicWidth(CharSequence charSequence, TextPaint textPaint) {
        C12775o.m28639i(charSequence, "text");
        C12775o.m28639i(textPaint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        int i = 0;
        lineInstance.setText(new CharSequenceCharacterIterator(charSequence, 0, charSequence.length()));
        PriorityQueue<C11906l> priorityQueue = new PriorityQueue<>(10, new C1197a());
        int next = lineInstance.next();
        while (true) {
            int i2 = i;
            i = next;
            int i3 = i2;
            if (i == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C11906l(Integer.valueOf(i3), Integer.valueOf(i)));
            } else {
                C11906l lVar = (C11906l) priorityQueue.peek();
                if (lVar != null && ((Number) lVar.mo49112d()).intValue() - ((Number) lVar.mo49111c()).intValue() < i - i3) {
                    priorityQueue.poll();
                    priorityQueue.add(new C11906l(Integer.valueOf(i3), Integer.valueOf(i)));
                }
            }
            next = lineInstance.next();
        }
        float f = 0.0f;
        for (C11906l lVar2 : priorityQueue) {
            f = Math.max(f, Layout.getDesiredWidth(charSequence, ((Number) lVar2.mo49109a()).intValue(), ((Number) lVar2.mo49110b()).intValue(), textPaint));
        }
        return f;
    }

    /* access modifiers changed from: private */
    public static final int minIntrinsicWidth$lambda$0(C11906l lVar, C11906l lVar2) {
        return (((Number) lVar.mo49112d()).intValue() - ((Number) lVar.mo49111c()).intValue()) - (((Number) lVar2.mo49112d()).intValue() - ((Number) lVar2.mo49111c()).intValue());
    }

    /* access modifiers changed from: private */
    public static final boolean shouldIncreaseMaxIntrinsic(float f, CharSequence charSequence, TextPaint textPaint) {
        boolean z;
        boolean z2;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (SpannedExtensionsKt.hasSpan(spanned, LetterSpacingSpanPx.class) || SpannedExtensionsKt.hasSpan(spanned, LetterSpacingSpanEm.class)) {
                    return true;
                }
            }
            if (textPaint.getLetterSpacing() == 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return true;
            }
        }
        return false;
    }
}
