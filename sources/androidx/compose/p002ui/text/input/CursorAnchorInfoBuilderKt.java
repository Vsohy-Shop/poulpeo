package androidx.compose.p002ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.input.CursorAnchorInfoBuilderKt */
/* compiled from: CursorAnchorInfoBuilder.kt */
public final class CursorAnchorInfoBuilderKt {
    public static final CursorAnchorInfo build(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, TextLayoutResult textLayoutResult, Matrix matrix) {
        int i;
        C12775o.m28639i(builder, "<this>");
        C12775o.m28639i(textFieldValue, "textFieldValue");
        C12775o.m28639i(textLayoutResult, "textLayoutResult");
        C12775o.m28639i(matrix, "matrix");
        builder.reset();
        builder.setMatrix(matrix);
        int r5 = TextRange.m37973getMinimpl(textFieldValue.m38194getSelectiond9O1mEE());
        builder.setSelectionRange(r5, TextRange.m37972getMaximpl(textFieldValue.m38194getSelectiond9O1mEE()));
        setInsertionMarker(builder, r5, textLayoutResult);
        TextRange r4 = textFieldValue.m38193getCompositionMzsxiRA();
        int i2 = -1;
        if (r4 != null) {
            i = TextRange.m37973getMinimpl(r4.m37979unboximpl());
        } else {
            i = -1;
        }
        TextRange r0 = textFieldValue.m38193getCompositionMzsxiRA();
        if (r0 != null) {
            i2 = TextRange.m37972getMaximpl(r0.m37979unboximpl());
        }
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            builder.setComposingText(i, textFieldValue.getText().subSequence(i, i2));
        }
        CursorAnchorInfo build = builder.build();
        C12775o.m28638h(build, "build()");
        return build;
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i, TextLayoutResult textLayoutResult) {
        boolean z;
        if (i < 0) {
            return builder;
        }
        Rect cursorRect = textLayoutResult.getCursorRect(i);
        int i2 = 0;
        if (textLayoutResult.getBidiRunDirection(i) == ResolvedTextDirection.Rtl) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 4;
        }
        builder.setInsertionMarkerLocation(cursorRect.getLeft(), cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), i2);
        return builder;
    }
}
