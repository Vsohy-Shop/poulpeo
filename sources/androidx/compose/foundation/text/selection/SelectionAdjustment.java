package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.TextRangeKt;
import kotlin.jvm.functions.Function1;

/* compiled from: SelectionAdjustment.kt */
public interface SelectionAdjustment {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: SelectionAdjustment.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final SelectionAdjustment Character = new SelectionAdjustment$Companion$Character$1();
        private static final SelectionAdjustment CharacterWithWordAccelerate = new SelectionAdjustment$Companion$CharacterWithWordAccelerate$1();
        private static final SelectionAdjustment None = new SelectionAdjustment$Companion$None$1();
        private static final SelectionAdjustment Paragraph = new SelectionAdjustment$Companion$Paragraph$1();
        private static final SelectionAdjustment Word = new SelectionAdjustment$Companion$Word$1();

        private Companion() {
        }

        /* access modifiers changed from: private */
        /* renamed from: adjustByBoundary--Dv-ylE  reason: not valid java name */
        public final long m33774adjustByBoundaryDvylE(TextLayoutResult textLayoutResult, long j, Function1<? super Integer, TextRange> function1) {
            boolean z;
            int i;
            int i2;
            if (textLayoutResult.getLayoutInput().getText().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return TextRange.Companion.m37980getZerod9O1mEE();
            }
            int Q = C13755w.m31565Q(textLayoutResult.getLayoutInput().getText());
            long r2 = function1.invoke(Integer.valueOf(C13537l.m30886m(TextRange.m37975getStartimpl(j), 0, Q))).m37979unboximpl();
            long r0 = function1.invoke(Integer.valueOf(C13537l.m30886m(TextRange.m37970getEndimpl(j), 0, Q))).m37979unboximpl();
            if (TextRange.m37974getReversedimpl(j)) {
                i = TextRange.m37970getEndimpl(r2);
            } else {
                i = TextRange.m37975getStartimpl(r2);
            }
            if (TextRange.m37974getReversedimpl(j)) {
                i2 = TextRange.m37975getStartimpl(r0);
            } else {
                i2 = TextRange.m37970getEndimpl(r0);
            }
            return TextRangeKt.TextRange(i, i2);
        }

        public final SelectionAdjustment getCharacter() {
            return Character;
        }

        public final SelectionAdjustment getCharacterWithWordAccelerate() {
            return CharacterWithWordAccelerate;
        }

        public final SelectionAdjustment getNone() {
            return None;
        }

        public final SelectionAdjustment getParagraph() {
            return Paragraph;
        }

        public final SelectionAdjustment getWord() {
            return Word;
        }
    }

    /* renamed from: adjust-ZXO7KMw  reason: not valid java name */
    long m33772adjustZXO7KMw(TextLayoutResult textLayoutResult, long j, int i, boolean z, TextRange textRange);
}
