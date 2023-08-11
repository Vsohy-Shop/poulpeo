package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.TextRangeKt;
import androidx.compose.p002ui.unit.IntSize;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,297:1\n1#2:298\n*E\n"})
/* compiled from: MultiWidgetSelectionDelegate.kt */
public final class MultiWidgetSelectionDelegate implements Selectable {
    private int _previousLastVisibleOffset = -1;
    private TextLayoutResult _previousTextLayoutResult;
    private final C13074a<LayoutCoordinates> coordinatesCallback;
    private final C13074a<TextLayoutResult> layoutResultCallback;
    private final long selectableId;

    public MultiWidgetSelectionDelegate(long j, C13074a<? extends LayoutCoordinates> aVar, C13074a<TextLayoutResult> aVar2) {
        C12775o.m28639i(aVar, "coordinatesCallback");
        C12775o.m28639i(aVar2, "layoutResultCallback");
        this.selectableId = j;
        this.coordinatesCallback = aVar;
        this.layoutResultCallback = aVar2;
    }

    private final synchronized int getLastVisibleOffset(TextLayoutResult textLayoutResult) {
        int i;
        if (this._previousTextLayoutResult != textLayoutResult) {
            if (textLayoutResult.getDidOverflowHeight()) {
                if (!textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                    i = C13537l.m30882i(textLayoutResult.getLineForVerticalPosition((float) IntSize.m38627getHeightimpl(textLayoutResult.m37948getSizeYbymL2g())), textLayoutResult.getLineCount() - 1);
                    while (textLayoutResult.getLineTop(i) >= ((float) IntSize.m38627getHeightimpl(textLayoutResult.m37948getSizeYbymL2g()))) {
                        i--;
                    }
                    this._previousLastVisibleOffset = textLayoutResult.getLineEnd(i, true);
                    this._previousTextLayoutResult = textLayoutResult;
                }
            }
            i = textLayoutResult.getLineCount() - 1;
            this._previousLastVisibleOffset = textLayoutResult.getLineEnd(i, true);
            this._previousTextLayoutResult = textLayoutResult;
        }
        return this._previousLastVisibleOffset;
    }

    public Rect getBoundingBox(int i) {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return Rect.Companion.getZero();
        }
        int length = invoke.getLayoutInput().getText().length();
        if (length < 1) {
            return Rect.Companion.getZero();
        }
        return invoke.getBoundingBox(C13537l.m30886m(i, 0, length - 1));
    }

    /* renamed from: getHandlePosition-dBAh8RU  reason: not valid java name */
    public long m33759getHandlePositiondBAh8RU(Selection selection, boolean z) {
        Selection.AnchorInfo anchorInfo;
        C12775o.m28639i(selection, "selection");
        if ((z && selection.getStart().getSelectableId() != getSelectableId()) || (!z && selection.getEnd().getSelectableId() != getSelectableId())) {
            return Offset.Companion.m35438getZeroF1C5BW0();
        }
        if (getLayoutCoordinates() == null) {
            return Offset.Companion.m35438getZeroF1C5BW0();
        }
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return Offset.Companion.m35438getZeroF1C5BW0();
        }
        if (z) {
            anchorInfo = selection.getStart();
        } else {
            anchorInfo = selection.getEnd();
        }
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(invoke, C13537l.m30886m(anchorInfo.getOffset(), 0, getLastVisibleOffset(invoke)), z, selection.getHandlesCrossed());
    }

    public LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates invoke = this.coordinatesCallback.invoke();
        if (invoke == null || !invoke.isAttached()) {
            return null;
        }
        return invoke;
    }

    /* renamed from: getRangeOfLineContaining--jx7JFs  reason: not valid java name */
    public long m33760getRangeOfLineContainingjx7JFs(int i) {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return TextRange.Companion.m37980getZerod9O1mEE();
        }
        int lastVisibleOffset = getLastVisibleOffset(invoke);
        if (lastVisibleOffset < 1) {
            return TextRange.Companion.m37980getZerod9O1mEE();
        }
        int lineForOffset = invoke.getLineForOffset(C13537l.m30886m(i, 0, lastVisibleOffset - 1));
        return TextRangeKt.TextRange(invoke.getLineStart(lineForOffset), invoke.getLineEnd(lineForOffset, true));
    }

    public Selection getSelectAllSelection() {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return null;
        }
        return MultiWidgetSelectionDelegateKt.m33763getAssembledSelectionInfovJH6DeI(TextRangeKt.TextRange(0, invoke.getLayoutInput().getText().length()), false, getSelectableId(), invoke);
    }

    public long getSelectableId() {
        return this.selectableId;
    }

    public AnnotatedString getText() {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return new AnnotatedString("", (List) null, (List) null, 6, (DefaultConstructorMarker) null);
        }
        return invoke.getLayoutInput().getText();
    }

    /* renamed from: updateSelection-qCDeeow  reason: not valid java name */
    public C11906l<Selection, Boolean> m33761updateSelectionqCDeeow(long j, long j2, Offset offset, boolean z, LayoutCoordinates layoutCoordinates, SelectionAdjustment selectionAdjustment, Selection selection) {
        boolean z2;
        Offset offset2;
        LayoutCoordinates layoutCoordinates2 = layoutCoordinates;
        C12775o.m28639i(layoutCoordinates2, "containerLayoutCoordinates");
        C12775o.m28639i(selectionAdjustment, "adjustment");
        if (selection == null || (getSelectableId() == selection.getStart().getSelectableId() && getSelectableId() == selection.getEnd().getSelectableId())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            LayoutCoordinates layoutCoordinates3 = getLayoutCoordinates();
            if (layoutCoordinates3 == null) {
                return new C11906l<>(null, Boolean.FALSE);
            }
            TextLayoutResult invoke = this.layoutResultCallback.invoke();
            if (invoke == null) {
                return new C11906l<>(null, Boolean.FALSE);
            }
            long r0 = layoutCoordinates2.m37342localPositionOfR5De75A(layoutCoordinates3, Offset.Companion.m35438getZeroF1C5BW0());
            long r4 = Offset.m35426minusMKHz9U(j, r0);
            long r6 = Offset.m35426minusMKHz9U(j2, r0);
            if (offset != null) {
                offset2 = Offset.m35411boximpl(Offset.m35426minusMKHz9U(offset.m35432unboximpl(), r0));
            } else {
                offset2 = null;
            }
            return MultiWidgetSelectionDelegateKt.m33765getTextSelectionInfoyM0VcXU(invoke, r4, r6, offset2, getSelectableId(), selectionAdjustment, selection, z);
        }
        throw new IllegalArgumentException("The given previousSelection doesn't belong to this selectable.".toString());
    }

    public int getLastVisibleOffset() {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return 0;
        }
        return getLastVisibleOffset(invoke);
    }
}
