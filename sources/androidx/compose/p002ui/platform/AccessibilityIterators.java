package androidx.compose.p002ui.platform;

import android.graphics.Rect;
import androidx.compose.p002ui.semantics.SemanticsNode;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.platform.AccessibilityIterators */
/* compiled from: AccessibilityIterators.android.kt */
public final class AccessibilityIterators {

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.AccessibilityIterators$AbstractTextSegmentIterator */
    /* compiled from: AccessibilityIterators.android.kt */
    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {
        public static final int $stable = 8;
        private final int[] segment = new int[2];
        protected String text;

        /* access modifiers changed from: protected */
        public final int[] getRange(int i, int i2) {
            if (i < 0 || i2 < 0 || i == i2) {
                return null;
            }
            int[] iArr = this.segment;
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }

        /* access modifiers changed from: protected */
        public final String getText() {
            String str = this.text;
            if (str != null) {
                return str;
            }
            C12775o.m28656z("text");
            return null;
        }

        public void initialize(String str) {
            C12775o.m28639i(str, "text");
            setText(str);
        }

        /* access modifiers changed from: protected */
        public final void setText(String str) {
            C12775o.m28639i(str, "<set-?>");
            this.text = str;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.AccessibilityIterators$CharacterTextSegmentIterator */
    /* compiled from: AccessibilityIterators.android.kt */
    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static CharacterTextSegmentIterator instance;
        private BreakIterator impl;

        /* renamed from: androidx.compose.ui.platform.AccessibilityIterators$CharacterTextSegmentIterator$Companion */
        /* compiled from: AccessibilityIterators.android.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CharacterTextSegmentIterator getInstance(Locale locale) {
                C12775o.m28639i(locale, "locale");
                if (CharacterTextSegmentIterator.instance == null) {
                    CharacterTextSegmentIterator.instance = new CharacterTextSegmentIterator(locale, (DefaultConstructorMarker) null);
                }
                CharacterTextSegmentIterator access$getInstance$cp = CharacterTextSegmentIterator.instance;
                C12775o.m28637g(access$getInstance$cp, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return access$getInstance$cp;
            }
        }

        public /* synthetic */ CharacterTextSegmentIterator(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }

        private final void onLocaleChanged(Locale locale) {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
            C12775o.m28638h(characterInstance, "getCharacterInstance(locale)");
            this.impl = characterInstance;
        }

        public int[] following(int i) {
            int length = getText().length();
            if (length <= 0 || i >= length) {
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    C12775o.m28656z("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i)) {
                    BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        C12775o.m28656z("impl");
                        breakIterator2 = null;
                    }
                    i = breakIterator2.following(i);
                } else {
                    BreakIterator breakIterator3 = this.impl;
                    if (breakIterator3 == null) {
                        C12775o.m28656z("impl");
                        breakIterator3 = null;
                    }
                    int following = breakIterator3.following(i);
                    if (following == -1) {
                        return null;
                    }
                    return getRange(i, following);
                }
            } while (i != -1);
            return null;
        }

        public void initialize(String str) {
            C12775o.m28639i(str, "text");
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                C12775o.m28656z("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        public int[] preceding(int i) {
            int length = getText().length();
            if (length <= 0 || i <= 0) {
                return null;
            }
            if (i > length) {
                i = length;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    C12775o.m28656z("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i)) {
                    BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        C12775o.m28656z("impl");
                        breakIterator2 = null;
                    }
                    i = breakIterator2.preceding(i);
                } else {
                    BreakIterator breakIterator3 = this.impl;
                    if (breakIterator3 == null) {
                        C12775o.m28656z("impl");
                        breakIterator3 = null;
                    }
                    int preceding = breakIterator3.preceding(i);
                    if (preceding == -1) {
                        return null;
                    }
                    return getRange(preceding, i);
                }
            } while (i != -1);
            return null;
        }

        private CharacterTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.AccessibilityIterators$LineTextSegmentIterator */
    /* compiled from: AccessibilityIterators.android.kt */
    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        /* access modifiers changed from: private */
        public static LineTextSegmentIterator lineInstance;
        private TextLayoutResult layoutResult;

        /* renamed from: androidx.compose.ui.platform.AccessibilityIterators$LineTextSegmentIterator$Companion */
        /* compiled from: AccessibilityIterators.android.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final LineTextSegmentIterator getInstance() {
                if (LineTextSegmentIterator.lineInstance == null) {
                    LineTextSegmentIterator.lineInstance = new LineTextSegmentIterator((DefaultConstructorMarker) null);
                }
                LineTextSegmentIterator access$getLineInstance$cp = LineTextSegmentIterator.lineInstance;
                C12775o.m28637g(access$getLineInstance$cp, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return access$getLineInstance$cp;
            }
        }

        public /* synthetic */ LineTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int getLineEdgeIndex(int i, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                C12775o.m28656z("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                C12775o.m28656z("layoutResult");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.getParagraphDirection(lineStart)) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    C12775o.m28656z("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i);
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                C12775o.m28656z("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult5, i, false, 2, (Object) null) - 1;
        }

        public int[] following(int i) {
            int i2;
            if (getText().length() <= 0 || i >= getText().length()) {
                return null;
            }
            if (i < 0) {
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    C12775o.m28656z("layoutResult");
                    textLayoutResult = null;
                }
                i2 = textLayoutResult.getLineForOffset(0);
            } else {
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    C12775o.m28656z("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(i);
                if (getLineEdgeIndex(lineForOffset, DirectionStart) == i) {
                    i2 = lineForOffset;
                } else {
                    i2 = lineForOffset + 1;
                }
            }
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                C12775o.m28656z("layoutResult");
                textLayoutResult3 = null;
            }
            if (i2 >= textLayoutResult3.getLineCount()) {
                return null;
            }
            return getRange(getLineEdgeIndex(i2, DirectionStart), getLineEdgeIndex(i2, DirectionEnd) + 1);
        }

        public final void initialize(String str, TextLayoutResult textLayoutResult) {
            C12775o.m28639i(str, "text");
            C12775o.m28639i(textLayoutResult, "layoutResult");
            setText(str);
            this.layoutResult = textLayoutResult;
        }

        public int[] preceding(int i) {
            int i2;
            if (getText().length() <= 0 || i <= 0) {
                return null;
            }
            if (i > getText().length()) {
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    C12775o.m28656z("layoutResult");
                    textLayoutResult = null;
                }
                i2 = textLayoutResult.getLineForOffset(getText().length());
            } else {
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    C12775o.m28656z("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(i);
                if (getLineEdgeIndex(lineForOffset, DirectionEnd) + 1 == i) {
                    i2 = lineForOffset;
                } else {
                    i2 = lineForOffset - 1;
                }
            }
            if (i2 < 0) {
                return null;
            }
            return getRange(getLineEdgeIndex(i2, DirectionStart), getLineEdgeIndex(i2, DirectionEnd) + 1);
        }

        private LineTextSegmentIterator() {
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.AccessibilityIterators$PageTextSegmentIterator */
    /* compiled from: AccessibilityIterators.android.kt */
    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        /* access modifiers changed from: private */
        public static PageTextSegmentIterator pageInstance;
        private TextLayoutResult layoutResult;
        private SemanticsNode node;
        private Rect tempRect;

        /* renamed from: androidx.compose.ui.platform.AccessibilityIterators$PageTextSegmentIterator$Companion */
        /* compiled from: AccessibilityIterators.android.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PageTextSegmentIterator getInstance() {
                if (PageTextSegmentIterator.pageInstance == null) {
                    PageTextSegmentIterator.pageInstance = new PageTextSegmentIterator((DefaultConstructorMarker) null);
                }
                PageTextSegmentIterator access$getPageInstance$cp = PageTextSegmentIterator.pageInstance;
                C12775o.m28637g(access$getPageInstance$cp, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return access$getPageInstance$cp;
            }
        }

        public /* synthetic */ PageTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int getLineEdgeIndex(int i, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                C12775o.m28656z("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                C12775o.m28656z("layoutResult");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.getParagraphDirection(lineStart)) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    C12775o.m28656z("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i);
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                C12775o.m28656z("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult5, i, false, 2, (Object) null) - 1;
        }

        public int[] following(int i) {
            int i2;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || i >= getText().length()) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    C12775o.m28656z("node");
                    semanticsNode = null;
                }
                int c = C13265c.m30134c(semanticsNode.getBoundsInRoot().getHeight());
                int d = C13537l.m30877d(0, i);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    C12775o.m28656z("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(d);
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    C12775o.m28656z("layoutResult");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) + ((float) c);
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    C12775o.m28656z("layoutResult");
                    textLayoutResult4 = null;
                }
                TextLayoutResult textLayoutResult5 = this.layoutResult;
                if (textLayoutResult5 == null) {
                    C12775o.m28656z("layoutResult");
                    textLayoutResult5 = null;
                }
                if (lineTop < textLayoutResult4.getLineTop(textLayoutResult5.getLineCount() - 1)) {
                    TextLayoutResult textLayoutResult6 = this.layoutResult;
                    if (textLayoutResult6 == null) {
                        C12775o.m28656z("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult6;
                    }
                    i2 = textLayoutResult.getLineForVerticalPosition(lineTop);
                } else {
                    TextLayoutResult textLayoutResult7 = this.layoutResult;
                    if (textLayoutResult7 == null) {
                        C12775o.m28656z("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult7;
                    }
                    i2 = textLayoutResult.getLineCount();
                }
                return getRange(d, getLineEdgeIndex(i2 - 1, DirectionEnd) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        public final void initialize(String str, TextLayoutResult textLayoutResult, SemanticsNode semanticsNode) {
            C12775o.m28639i(str, "text");
            C12775o.m28639i(textLayoutResult, "layoutResult");
            C12775o.m28639i(semanticsNode, "node");
            setText(str);
            this.layoutResult = textLayoutResult;
            this.node = semanticsNode;
        }

        public int[] preceding(int i) {
            int i2;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || i <= 0) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    C12775o.m28656z("node");
                    semanticsNode = null;
                }
                int c = C13265c.m30134c(semanticsNode.getBoundsInRoot().getHeight());
                int i3 = C13537l.m30882i(getText().length(), i);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    C12775o.m28656z("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(i3);
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    C12775o.m28656z("layoutResult");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) - ((float) c);
                if (lineTop > 0.0f) {
                    TextLayoutResult textLayoutResult4 = this.layoutResult;
                    if (textLayoutResult4 == null) {
                        C12775o.m28656z("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult4;
                    }
                    i2 = textLayoutResult.getLineForVerticalPosition(lineTop);
                } else {
                    i2 = 0;
                }
                if (i3 == getText().length() && i2 < lineForOffset) {
                    i2++;
                }
                return getRange(getLineEdgeIndex(i2, DirectionStart), i3);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        private PageTextSegmentIterator() {
            this.tempRect = new Rect();
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.AccessibilityIterators$ParagraphTextSegmentIterator */
    /* compiled from: AccessibilityIterators.android.kt */
    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static ParagraphTextSegmentIterator instance;

        /* renamed from: androidx.compose.ui.platform.AccessibilityIterators$ParagraphTextSegmentIterator$Companion */
        /* compiled from: AccessibilityIterators.android.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ParagraphTextSegmentIterator getInstance() {
                if (ParagraphTextSegmentIterator.instance == null) {
                    ParagraphTextSegmentIterator.instance = new ParagraphTextSegmentIterator((DefaultConstructorMarker) null);
                }
                ParagraphTextSegmentIterator access$getInstance$cp = ParagraphTextSegmentIterator.instance;
                C12775o.m28637g(access$getInstance$cp, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return access$getInstance$cp;
            }
        }

        public /* synthetic */ ParagraphTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isEndBoundary(int i) {
            if (i <= 0 || getText().charAt(i - 1) == 10 || (i != getText().length() && getText().charAt(i) != 10)) {
                return false;
            }
            return true;
        }

        private final boolean isStartBoundary(int i) {
            if (getText().charAt(i) == 10 || (i != 0 && getText().charAt(i - 1) != 10)) {
                return false;
            }
            return true;
        }

        public int[] following(int i) {
            int length = getText().length();
            if (length <= 0 || i >= length) {
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            while (i < length && getText().charAt(i) == 10 && !isStartBoundary(i)) {
                i++;
            }
            if (i >= length) {
                return null;
            }
            int i2 = i + 1;
            while (i2 < length && !isEndBoundary(i2)) {
                i2++;
            }
            return getRange(i, i2);
        }

        public int[] preceding(int i) {
            int length = getText().length();
            if (length <= 0 || i <= 0) {
                return null;
            }
            if (i > length) {
                i = length;
            }
            while (i > 0 && getText().charAt(i - 1) == 10 && !isEndBoundary(i)) {
                i--;
            }
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            while (i2 > 0 && !isStartBoundary(i2)) {
                i2--;
            }
            return getRange(i2, i);
        }

        private ParagraphTextSegmentIterator() {
        }
    }

    /* renamed from: androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator */
    /* compiled from: AccessibilityIterators.android.kt */
    public interface TextSegmentIterator {
        int[] following(int i);

        int[] preceding(int i);
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.AccessibilityIterators$WordTextSegmentIterator */
    /* compiled from: AccessibilityIterators.android.kt */
    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static WordTextSegmentIterator instance;
        private BreakIterator impl;

        /* renamed from: androidx.compose.ui.platform.AccessibilityIterators$WordTextSegmentIterator$Companion */
        /* compiled from: AccessibilityIterators.android.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final WordTextSegmentIterator getInstance(Locale locale) {
                C12775o.m28639i(locale, "locale");
                if (WordTextSegmentIterator.instance == null) {
                    WordTextSegmentIterator.instance = new WordTextSegmentIterator(locale, (DefaultConstructorMarker) null);
                }
                WordTextSegmentIterator access$getInstance$cp = WordTextSegmentIterator.instance;
                C12775o.m28637g(access$getInstance$cp, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return access$getInstance$cp;
            }
        }

        public /* synthetic */ WordTextSegmentIterator(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }

        private final boolean isEndBoundary(int i) {
            if (i <= 0 || !isLetterOrDigit(i - 1) || (i != getText().length() && isLetterOrDigit(i))) {
                return false;
            }
            return true;
        }

        private final boolean isLetterOrDigit(int i) {
            if (i < 0 || i >= getText().length()) {
                return false;
            }
            return Character.isLetterOrDigit(getText().codePointAt(i));
        }

        private final boolean isStartBoundary(int i) {
            if (!isLetterOrDigit(i) || (i != 0 && isLetterOrDigit(i - 1))) {
                return false;
            }
            return true;
        }

        private final void onLocaleChanged(Locale locale) {
            BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
            C12775o.m28638h(wordInstance, "getWordInstance(locale)");
            this.impl = wordInstance;
        }

        public int[] following(int i) {
            if (getText().length() <= 0 || i >= getText().length()) {
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            while (!isLetterOrDigit(i) && !isStartBoundary(i)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    C12775o.m28656z("impl");
                    breakIterator = null;
                }
                i = breakIterator.following(i);
                if (i == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                C12775o.m28656z("impl");
                breakIterator2 = null;
            }
            int following = breakIterator2.following(i);
            if (following == -1 || !isEndBoundary(following)) {
                return null;
            }
            return getRange(i, following);
        }

        public void initialize(String str) {
            C12775o.m28639i(str, "text");
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                C12775o.m28656z("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        public int[] preceding(int i) {
            int length = getText().length();
            if (length <= 0 || i <= 0) {
                return null;
            }
            if (i > length) {
                i = length;
            }
            while (i > 0 && !isLetterOrDigit(i - 1) && !isEndBoundary(i)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    C12775o.m28656z("impl");
                    breakIterator = null;
                }
                i = breakIterator.preceding(i);
                if (i == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                C12775o.m28656z("impl");
                breakIterator2 = null;
            }
            int preceding = breakIterator2.preceding(i);
            if (preceding == -1 || !isStartBoundary(preceding)) {
                return null;
            }
            return getRange(preceding, i);
        }

        private WordTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }
    }
}
