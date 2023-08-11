package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.input.CommitTextCommand;
import androidx.compose.p002ui.text.input.EditCommand;
import androidx.compose.p002ui.text.input.OffsetMapping;
import androidx.compose.p002ui.text.input.SetSelectionCommand;
import androidx.compose.p002ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n+ 2 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n74#2,5:433\n80#2:439\n74#2,7:440\n1#3:438\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n*L\n408#1:433,5\n408#1:439\n412#1:440,7\n*E\n"})
/* compiled from: TextPreparedSelection.kt */
public final class TextFieldPreparedSelection extends BaseTextPreparedSelection<TextFieldPreparedSelection> {
    private final TextFieldValue currentValue;
    private final TextLayoutResultProxy layoutResultProxy;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState textPreparedSelectionState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldValue, (i & 2) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, textLayoutResultProxy, (i & 8) != 0 ? new TextPreparedSelectionState() : textPreparedSelectionState);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r2 == null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int jumpByPagesOffset(androidx.compose.foundation.text.TextLayoutResultProxy r6, int r7) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r6.getInnerTextFieldCoordinates()
            if (r0 == 0) goto L_0x0015
            androidx.compose.ui.layout.LayoutCoordinates r1 = r6.getDecorationBoxCoordinates()
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.p002ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
        L_0x0013:
            if (r2 != 0) goto L_0x001b
        L_0x0015:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.p002ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L_0x001b:
            androidx.compose.ui.text.input.OffsetMapping r0 = r5.getOffsetMapping()
            androidx.compose.ui.text.input.TextFieldValue r1 = r5.currentValue
            long r3 = r1.m38194getSelectiond9O1mEE()
            int r1 = androidx.compose.p002ui.text.TextRange.m37970getEndimpl(r3)
            int r0 = r0.originalToTransformed(r1)
            androidx.compose.ui.text.TextLayoutResult r1 = r6.getValue()
            androidx.compose.ui.geometry.Rect r0 = r1.getCursorRect(r0)
            float r1 = r0.getLeft()
            float r0 = r0.getTop()
            long r2 = r2.m35455getSizeNHjbRc()
            float r2 = androidx.compose.p002ui.geometry.Size.m35488getHeightimpl(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r0 = r0 + r2
            androidx.compose.ui.text.input.OffsetMapping r7 = r5.getOffsetMapping()
            androidx.compose.ui.text.TextLayoutResult r6 = r6.getValue()
            long r0 = androidx.compose.p002ui.geometry.OffsetKt.Offset(r1, r0)
            int r6 = r6.m37947getOffsetForPositionk4lQ0M(r0)
            int r6 = r7.transformedToOriginal(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldPreparedSelection.jumpByPagesOffset(androidx.compose.foundation.text.TextLayoutResultProxy, int):int");
    }

    public final List<EditCommand> deleteIfSelectedOr(Function1<? super TextFieldPreparedSelection, ? extends EditCommand> function1) {
        C12775o.m28639i(function1, "or");
        if (TextRange.m37969getCollapsedimpl(m33752getSelectiond9O1mEE())) {
            EditCommand editCommand = (EditCommand) function1.invoke(this);
            if (editCommand != null) {
                return C12723v.m28509d(editCommand);
            }
            return null;
        }
        return C12726w.m28527n(new CommitTextCommand("", 0), new SetSelectionCommand(TextRange.m37973getMinimpl(m33752getSelectiond9O1mEE()), TextRange.m37973getMinimpl(m33752getSelectiond9O1mEE())));
    }

    public final TextFieldValue getCurrentValue() {
        return this.currentValue;
    }

    public final TextLayoutResultProxy getLayoutResultProxy() {
        return this.layoutResultProxy;
    }

    public final TextFieldValue getValue() {
        return TextFieldValue.m38189copy3r_uNRQ$default(this.currentValue, getAnnotatedString(), m33752getSelectiond9O1mEE(), (TextRange) null, 4, (Object) null);
    }

    public final TextFieldPreparedSelection moveCursorDownByPage() {
        boolean z;
        TextLayoutResultProxy textLayoutResultProxy;
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, 1));
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final TextFieldPreparedSelection moveCursorUpByPage() {
        boolean z;
        TextLayoutResultProxy textLayoutResultProxy;
        if (getText$foundation_release().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, -1));
        }
        C12775o.m28637g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState textPreparedSelectionState) {
        super(textFieldValue.getAnnotatedString(), textFieldValue.m38194getSelectiond9O1mEE(), textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, offsetMapping, textPreparedSelectionState, (DefaultConstructorMarker) null);
        C12775o.m28639i(textFieldValue, "currentValue");
        C12775o.m28639i(offsetMapping, "offsetMapping");
        C12775o.m28639i(textPreparedSelectionState, "state");
        this.currentValue = textFieldValue;
        this.layoutResultProxy = textLayoutResultProxy;
    }
}
