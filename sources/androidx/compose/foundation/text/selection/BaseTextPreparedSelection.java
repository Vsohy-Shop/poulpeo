package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.TextRangeKt;
import androidx.compose.p002ui.text.input.OffsetMapping;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n73#1,8:433\n73#1,8:441\n73#1,8:449\n73#1,8:457\n73#1,8:465\n73#1,8:473\n73#1,8:481\n73#1,8:489\n73#1,8:497\n73#1,8:505\n73#1,8:513\n73#1,8:521\n73#1,6:529\n80#1:536\n73#1,8:537\n73#1,8:545\n73#1,8:553\n74#1,7:561\n74#1,7:568\n73#1,8:575\n73#1,8:583\n73#1,8:591\n73#1,8:599\n74#1,7:607\n1#2:535\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n*L\n91#1:433,8\n95#1:441,8\n99#1:449,8\n107#1:457,8\n118#1:465,8\n134#1:473,8\n158#1:481,8\n163#1:489,8\n168#1:497,8\n172#1:505,8\n176#1:513,8\n184#1:521,8\n194#1:529,6\n194#1:536\n200#1:537,8\n204#1:545,8\n208#1:553,8\n212#1:561,7\n216#1:568,7\n222#1:575,8\n228#1:583,8\n232#1:591,8\n240#1:599,8\n249#1:607,7\n*E\n"})
/* compiled from: TextPreparedSelection.kt */
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int NoCharacterFound = -1;
    private AnnotatedString annotatedString;
    private final TextLayoutResult layoutResult;
    private final OffsetMapping offsetMapping;
    private final long originalSelection;
    private final AnnotatedString originalText;
    private long selection;
    private final TextPreparedSelectionState state;

    /* compiled from: TextPreparedSelection.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BaseTextPreparedSelection(AnnotatedString annotatedString2, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping2, TextPreparedSelectionState textPreparedSelectionState, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString2, j, textLayoutResult, offsetMapping2, textPreparedSelectionState);
    }

    public static /* synthetic */ BaseTextPreparedSelection apply$default(BaseTextPreparedSelection baseTextPreparedSelection, Object obj, boolean z, Function1 function1, int i, Object obj2) {
        if (obj2 == null) {
            boolean z2 = true;
            if ((i & 1) != 0) {
                z = true;
            }
            C12775o.m28639i(function1, "block");
            if (z) {
                baseTextPreparedSelection.getState().resetCachedX();
            }
            if (baseTextPreparedSelection.getText$foundation_release().length() <= 0) {
                z2 = false;
            }
            if (z2) {
                function1.invoke(obj);
            }
            C12775o.m28637g(obj, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
            return (BaseTextPreparedSelection) obj;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
    }

    private final int charOffset(int i) {
        return C13537l.m30882i(i, getText$foundation_release().length() - 1);
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i), true));
    }

    static /* synthetic */ int getLineEndByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = baseTextPreparedSelection.transformedMaxOffset();
            }
            return baseTextPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i)));
    }

    static /* synthetic */ int getLineStartByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = baseTextPreparedSelection.transformedMinOffset();
            }
            return baseTextPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        while (i < this.originalText.length()) {
            long r0 = textLayoutResult.m37949getWordBoundaryjx7JFs(charOffset(i));
            if (TextRange.m37970getEndimpl(r0) > i) {
                return this.offsetMapping.transformedToOriginal(TextRange.m37970getEndimpl(r0));
            }
            i++;
        }
        return this.originalText.length();
    }

    static /* synthetic */ int getNextWordOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = baseTextPreparedSelection.transformedEndOffset();
            }
            return baseTextPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
    }

    private final int getParagraphEnd() {
        return StringHelpersKt.findParagraphEnd(getText$foundation_release(), TextRange.m37972getMaximpl(this.selection));
    }

    private final int getParagraphStart() {
        return StringHelpersKt.findParagraphStart(getText$foundation_release(), TextRange.m37973getMinimpl(this.selection));
    }

    private final int getPrevWordOffset(TextLayoutResult textLayoutResult, int i) {
        while (i > 0) {
            long r0 = textLayoutResult.m37949getWordBoundaryjx7JFs(charOffset(i));
            if (TextRange.m37975getStartimpl(r0) < i) {
                return this.offsetMapping.transformedToOriginal(TextRange.m37975getStartimpl(r0));
            }
            i--;
        }
        return 0;
    }

    static /* synthetic */ int getPrevWordOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = baseTextPreparedSelection.transformedEndOffset();
            }
            return baseTextPreparedSelection.getPrevWordOffset(textLayoutResult, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
    }

    private final boolean isLtr() {
        ResolvedTextDirection resolvedTextDirection;
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            resolvedTextDirection = textLayoutResult.getParagraphDirection(transformedEndOffset());
        } else {
            resolvedTextDirection = null;
        }
        if (resolvedTextDirection != ResolvedTextDirection.Rtl) {
            return true;
        }
        return false;
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i) {
        int transformedEndOffset = transformedEndOffset();
        if (this.state.getCachedX() == null) {
            this.state.setCachedX(Float.valueOf(textLayoutResult.getCursorRect(transformedEndOffset).getLeft()));
        }
        int lineForOffset = textLayoutResult.getLineForOffset(transformedEndOffset) + i;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return getText$foundation_release().length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - ((float) 1);
        Float cachedX = this.state.getCachedX();
        C12775o.m28636f(cachedX);
        float floatValue = cachedX.floatValue();
        if ((isLtr() && floatValue >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && floatValue <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return this.offsetMapping.transformedToOriginal(textLayoutResult.m37947getOffsetForPositionk4lQ0M(OffsetKt.Offset(cachedX.floatValue(), lineBottom)));
    }

    private final T moveCursorNext() {
        boolean z;
        int nextCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (nextCharacterIndex = getNextCharacterIndex()) != -1) {
            setCursor(nextCharacterIndex);
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorNextByWord() {
        boolean z;
        Integer nextWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (nextWordOffset = getNextWordOffset()) != null) {
            setCursor(nextWordOffset.intValue());
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorPrev() {
        boolean z;
        int precedingCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (precedingCharacterIndex = getPrecedingCharacterIndex()) != -1) {
            setCursor(precedingCharacterIndex);
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorPrevByWord() {
        boolean z;
        Integer previousWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (previousWordOffset = getPreviousWordOffset()) != null) {
            setCursor(previousWordOffset.intValue());
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int transformedEndOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m37970getEndimpl(this.selection));
    }

    private final int transformedMaxOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m37972getMaximpl(this.selection));
    }

    private final int transformedMinOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m37973getMinimpl(this.selection));
    }

    /* access modifiers changed from: protected */
    public final <U> T apply(U u, boolean z, Function1<? super U, C11921v> function1) {
        boolean z2;
        C12775o.m28639i(function1, "block");
        if (z) {
            getState().resetCachedX();
        }
        if (getText$foundation_release().length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            function1.invoke(u);
        }
        C12775o.m28637g(u, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (BaseTextPreparedSelection) u;
    }

    public final T collapseLeftOr(Function1<? super T, C11921v> function1) {
        boolean z;
        C12775o.m28639i(function1, "or");
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (TextRange.m37969getCollapsedimpl(this.selection)) {
                C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                function1.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m37973getMinimpl(this.selection));
            } else {
                setCursor(TextRange.m37972getMaximpl(this.selection));
            }
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T collapseRightOr(Function1<? super T, C11921v> function1) {
        boolean z;
        C12775o.m28639i(function1, "or");
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (TextRange.m37969getCollapsedimpl(this.selection)) {
                C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                function1.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m37972getMaximpl(this.selection));
            } else {
                setCursor(TextRange.m37973getMinimpl(this.selection));
            }
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T deselect() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setCursor(TextRange.m37970getEndimpl(this.selection));
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    public final Integer getLineEndByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, (Object) null));
        }
        return null;
    }

    public final Integer getLineStartByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, (Object) null));
        }
        return null;
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.annotatedString.getText(), TextRange.m37970getEndimpl(this.selection));
    }

    public final Integer getNextWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, (Object) null));
        }
        return null;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    /* renamed from: getOriginalSelection-d9O1mEE  reason: not valid java name */
    public final long m33751getOriginalSelectiond9O1mEE() {
        return this.originalSelection;
    }

    public final AnnotatedString getOriginalText() {
        return this.originalText;
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.annotatedString.getText(), TextRange.m37970getEndimpl(this.selection));
    }

    public final Integer getPreviousWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getPrevWordOffset$default(this, textLayoutResult, 0, 1, (Object) null));
        }
        return null;
    }

    /* renamed from: getSelection-d9O1mEE  reason: not valid java name */
    public final long m33752getSelectiond9O1mEE() {
        return this.selection;
    }

    public final TextPreparedSelectionState getState() {
        return this.state;
    }

    public final String getText$foundation_release() {
        return this.annotatedString.getText();
    }

    public final T moveCursorDownByLine() {
        boolean z;
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, 1));
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorLeft() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (isLtr()) {
                moveCursorPrev();
            } else {
                moveCursorNext();
            }
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorLeftByWord() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (isLtr()) {
                moveCursorPrevByWord();
            } else {
                moveCursorNextByWord();
            }
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorNextByParagraph() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setCursor(getParagraphEnd());
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorPrevByParagraph() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setCursor(getParagraphStart());
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorRight() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (isLtr()) {
                moveCursorNext();
            } else {
                moveCursorPrev();
            }
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorRightByWord() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (isLtr()) {
                moveCursorNextByWord();
            } else {
                moveCursorPrevByWord();
            }
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToEnd() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setCursor(getText$foundation_release().length());
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToHome() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setCursor(0);
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToLineEnd() {
        boolean z;
        Integer lineEndByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (lineEndByOffset = getLineEndByOffset()) != null) {
            setCursor(lineEndByOffset.intValue());
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToLineLeftSide() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (isLtr()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToLineRightSide() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (isLtr()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToLineStart() {
        boolean z;
        Integer lineStartByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (lineStartByOffset = getLineStartByOffset()) != null) {
            setCursor(lineStartByOffset.intValue());
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorUpByLine() {
        boolean z;
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, -1));
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T selectAll() {
        boolean z;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setSelection(0, getText$foundation_release().length());
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T selectMovement() {
        boolean z;
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.selection = TextRangeKt.TextRange(TextRange.m37975getStartimpl(this.originalSelection), TextRange.m37970getEndimpl(this.selection));
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void setAnnotatedString(AnnotatedString annotatedString2) {
        C12775o.m28639i(annotatedString2, "<set-?>");
        this.annotatedString = annotatedString2;
    }

    /* access modifiers changed from: protected */
    public final void setCursor(int i) {
        setSelection(i, i);
    }

    /* access modifiers changed from: protected */
    public final void setSelection(int i, int i2) {
        this.selection = TextRangeKt.TextRange(i, i2);
    }

    /* renamed from: setSelection-5zc-tL8  reason: not valid java name */
    public final void m33753setSelection5zctL8(long j) {
        this.selection = j;
    }

    private BaseTextPreparedSelection(AnnotatedString annotatedString2, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping2, TextPreparedSelectionState textPreparedSelectionState) {
        this.originalText = annotatedString2;
        this.originalSelection = j;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = offsetMapping2;
        this.state = textPreparedSelectionState;
        this.selection = j;
        this.annotatedString = annotatedString2;
    }
}
