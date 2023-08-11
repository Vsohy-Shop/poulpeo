package androidx.compose.foundation.text;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.RectKt;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.Paint;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.SpanStyle;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextPainter;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.TextRangeKt;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.input.EditCommand;
import androidx.compose.p002ui.text.input.EditProcessor;
import androidx.compose.p002ui.text.input.ImeAction;
import androidx.compose.p002ui.text.input.ImeOptions;
import androidx.compose.p002ui.text.input.OffsetMapping;
import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.p002ui.text.input.TextInputService;
import androidx.compose.p002ui.text.input.TextInputSession;
import androidx.compose.p002ui.text.input.TransformedText;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import p336ef.C11914q;
import p336ef.C11921v;

/* compiled from: TextFieldDelegate.kt */
public final class TextFieldDelegate {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* compiled from: TextFieldDelegate.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: layout-_EkL_-Y$foundation_release$default  reason: not valid java name */
        public static /* synthetic */ C11914q m33715layout_EkL_Y$foundation_release$default(Companion companion, TextDelegate textDelegate, long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i, Object obj) {
            if ((i & 8) != 0) {
                textLayoutResult = null;
            }
            return companion.m33717layout_EkL_Y$foundation_release(textDelegate, j, layoutDirection, textLayoutResult);
        }

        /* renamed from: applyCompositionDecoration-72CqOWE  reason: not valid java name */
        public final TransformedText m33716applyCompositionDecoration72CqOWE(long j, TransformedText transformedText) {
            C12775o.m28639i(transformedText, "transformed");
            AnnotatedString.Builder builder = new AnnotatedString.Builder(transformedText.getText());
            builder.addStyle(new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, TextDecoration.Companion.getUnderline(), (Shadow) null, 12287, (DefaultConstructorMarker) null), transformedText.getOffsetMapping().originalToTransformed(TextRange.m37975getStartimpl(j)), transformedText.getOffsetMapping().originalToTransformed(TextRange.m37970getEndimpl(j)));
            return new TransformedText(builder.toAnnotatedString(), transformedText.getOffsetMapping());
        }

        public final void draw$foundation_release(Canvas canvas, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint paint) {
            int originalToTransformed;
            int originalToTransformed2;
            C12775o.m28639i(canvas, "canvas");
            C12775o.m28639i(textFieldValue, "value");
            C12775o.m28639i(offsetMapping, "offsetMapping");
            C12775o.m28639i(textLayoutResult, "textLayoutResult");
            C12775o.m28639i(paint, "selectionPaint");
            if (!TextRange.m37969getCollapsedimpl(textFieldValue.m38194getSelectiond9O1mEE()) && (originalToTransformed = offsetMapping.originalToTransformed(TextRange.m37973getMinimpl(textFieldValue.m38194getSelectiond9O1mEE()))) != (originalToTransformed2 = offsetMapping.originalToTransformed(TextRange.m37972getMaximpl(textFieldValue.m38194getSelectiond9O1mEE())))) {
                canvas.drawPath(textLayoutResult.getPathForRange(originalToTransformed, originalToTransformed2), paint);
            }
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        /* renamed from: layout-_EkL_-Y$foundation_release  reason: not valid java name */
        public final C11914q<Integer, Integer, TextLayoutResult> m33717layout_EkL_Y$foundation_release(TextDelegate textDelegate, long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
            C12775o.m28639i(textDelegate, "textDelegate");
            C12775o.m28639i(layoutDirection, "layoutDirection");
            TextLayoutResult r2 = textDelegate.m33709layoutNN6EwU(j, layoutDirection, textLayoutResult);
            return new C11914q<>(Integer.valueOf(IntSize.m38628getWidthimpl(r2.m37948getSizeYbymL2g())), Integer.valueOf(IntSize.m38627getHeightimpl(r2.m37948getSizeYbymL2g())), r2);
        }

        public final void notifyFocusedRect$foundation_release(TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, TextInputSession textInputSession, boolean z, OffsetMapping offsetMapping) {
            Rect rect;
            C12775o.m28639i(textFieldValue, "value");
            C12775o.m28639i(textDelegate, "textDelegate");
            C12775o.m28639i(textLayoutResult, "textLayoutResult");
            C12775o.m28639i(layoutCoordinates, "layoutCoordinates");
            C12775o.m28639i(textInputSession, "textInputSession");
            C12775o.m28639i(offsetMapping, "offsetMapping");
            if (z) {
                int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m37972getMaximpl(textFieldValue.m38194getSelectiond9O1mEE()));
                if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
                    rect = textLayoutResult.getBoundingBox(originalToTransformed);
                } else if (originalToTransformed != 0) {
                    rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
                } else {
                    rect = new Rect(0.0f, 0.0f, 1.0f, (float) IntSize.m38627getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), (String) null, 0, 24, (Object) null)));
                }
                long r9 = layoutCoordinates.m37343localToRootMKHz9U(OffsetKt.Offset(rect.getLeft(), rect.getTop()));
                textInputSession.notifyFocusedRect(RectKt.m35462Recttz77jQw(OffsetKt.Offset(Offset.m35422getXimpl(r9), Offset.m35423getYimpl(r9)), SizeKt.Size(rect.getWidth(), rect.getHeight())));
            }
        }

        public final void onBlur$foundation_release(TextInputSession textInputSession, EditProcessor editProcessor, Function1<? super TextFieldValue, C11921v> function1) {
            C12775o.m28639i(textInputSession, "textInputSession");
            C12775o.m28639i(editProcessor, "editProcessor");
            C12775o.m28639i(function1, "onValueChange");
            function1.invoke(TextFieldValue.m38189copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, 0, (TextRange) null, 3, (Object) null));
            textInputSession.dispose();
        }

        public final void onEditCommand$foundation_release(List<? extends EditCommand> list, EditProcessor editProcessor, Function1<? super TextFieldValue, C11921v> function1, TextInputSession textInputSession) {
            C12775o.m28639i(list, "ops");
            C12775o.m28639i(editProcessor, "editProcessor");
            C12775o.m28639i(function1, "onValueChange");
            TextFieldValue apply = editProcessor.apply(list);
            if (textInputSession != null) {
                textInputSession.updateState((TextFieldValue) null, apply);
            }
            function1.invoke(apply);
        }

        public final TextInputSession onFocus$foundation_release(TextInputService textInputService, TextFieldValue textFieldValue, EditProcessor editProcessor, ImeOptions imeOptions, Function1<? super TextFieldValue, C11921v> function1, Function1<? super ImeAction, C11921v> function12) {
            C12775o.m28639i(textInputService, "textInputService");
            C12775o.m28639i(textFieldValue, "value");
            C12775o.m28639i(editProcessor, "editProcessor");
            C12775o.m28639i(imeOptions, "imeOptions");
            C12775o.m28639i(function1, "onValueChange");
            C12775o.m28639i(function12, "onImeActionPerformed");
            return restartInput$foundation_release(textInputService, textFieldValue, editProcessor, imeOptions, function1, function12);
        }

        public final TextInputSession restartInput$foundation_release(TextInputService textInputService, TextFieldValue textFieldValue, EditProcessor editProcessor, ImeOptions imeOptions, Function1<? super TextFieldValue, C11921v> function1, Function1<? super ImeAction, C11921v> function12) {
            C12775o.m28639i(textInputService, "textInputService");
            C12775o.m28639i(textFieldValue, "value");
            C12775o.m28639i(editProcessor, "editProcessor");
            C12775o.m28639i(imeOptions, "imeOptions");
            C12775o.m28639i(function1, "onValueChange");
            C12775o.m28639i(function12, "onImeActionPerformed");
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            T startInput = textInputService.startInput(textFieldValue, imeOptions, new TextFieldDelegate$Companion$restartInput$1(editProcessor, function1, ref$ObjectRef), function12);
            ref$ObjectRef.f20403b = startInput;
            return startInput;
        }

        /* renamed from: setCursorOffset-ULxng0E$foundation_release  reason: not valid java name */
        public final void m33718setCursorOffsetULxng0E$foundation_release(long j, TextLayoutResultProxy textLayoutResultProxy, EditProcessor editProcessor, OffsetMapping offsetMapping, Function1<? super TextFieldValue, C11921v> function1) {
            C12775o.m28639i(textLayoutResultProxy, "textLayoutResult");
            C12775o.m28639i(editProcessor, "editProcessor");
            C12775o.m28639i(offsetMapping, "offsetMapping");
            C12775o.m28639i(function1, "onValueChange");
            function1.invoke(TextFieldValue.m38189copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, TextRangeKt.TextRange(offsetMapping.transformedToOriginal(TextLayoutResultProxy.m33738getOffsetForPosition3MmeM6k$default(textLayoutResultProxy, j, false, 2, (Object) null))), (TextRange) null, 5, (Object) null));
        }
    }

    public static final void draw$foundation_release(Canvas canvas, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint paint) {
        Companion.draw$foundation_release(canvas, textFieldValue, offsetMapping, textLayoutResult, paint);
    }

    /* renamed from: layout-_EkL_-Y$foundation_release  reason: not valid java name */
    public static final C11914q<Integer, Integer, TextLayoutResult> m33713layout_EkL_Y$foundation_release(TextDelegate textDelegate, long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
        return Companion.m33717layout_EkL_Y$foundation_release(textDelegate, j, layoutDirection, textLayoutResult);
    }

    public static final void notifyFocusedRect$foundation_release(TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, TextInputSession textInputSession, boolean z, OffsetMapping offsetMapping) {
        Companion.notifyFocusedRect$foundation_release(textFieldValue, textDelegate, textLayoutResult, layoutCoordinates, textInputSession, z, offsetMapping);
    }

    public static final void onBlur$foundation_release(TextInputSession textInputSession, EditProcessor editProcessor, Function1<? super TextFieldValue, C11921v> function1) {
        Companion.onBlur$foundation_release(textInputSession, editProcessor, function1);
    }

    public static final void onEditCommand$foundation_release(List<? extends EditCommand> list, EditProcessor editProcessor, Function1<? super TextFieldValue, C11921v> function1, TextInputSession textInputSession) {
        Companion.onEditCommand$foundation_release(list, editProcessor, function1, textInputSession);
    }

    public static final TextInputSession onFocus$foundation_release(TextInputService textInputService, TextFieldValue textFieldValue, EditProcessor editProcessor, ImeOptions imeOptions, Function1<? super TextFieldValue, C11921v> function1, Function1<? super ImeAction, C11921v> function12) {
        return Companion.onFocus$foundation_release(textInputService, textFieldValue, editProcessor, imeOptions, function1, function12);
    }

    public static final TextInputSession restartInput$foundation_release(TextInputService textInputService, TextFieldValue textFieldValue, EditProcessor editProcessor, ImeOptions imeOptions, Function1<? super TextFieldValue, C11921v> function1, Function1<? super ImeAction, C11921v> function12) {
        return Companion.restartInput$foundation_release(textInputService, textFieldValue, editProcessor, imeOptions, function1, function12);
    }

    /* renamed from: setCursorOffset-ULxng0E$foundation_release  reason: not valid java name */
    public static final void m33714setCursorOffsetULxng0E$foundation_release(long j, TextLayoutResultProxy textLayoutResultProxy, EditProcessor editProcessor, OffsetMapping offsetMapping, Function1<? super TextFieldValue, C11921v> function1) {
        Companion.m33718setCursorOffsetULxng0E$foundation_release(j, textLayoutResultProxy, editProcessor, offsetMapping, function1);
    }
}
