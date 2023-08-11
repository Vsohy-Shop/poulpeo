package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.ClipKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.p002ui.text.input.TransformedText;
import androidx.compose.p002ui.text.input.VisualTransformation;
import androidx.compose.p002ui.unit.Density;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,369:1\n135#2:370\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n60#1:370\n*E\n"})
/* compiled from: TextFieldScroll.kt */
public final class TextFieldScrollKt {

    /* compiled from: TextFieldScroll.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.foundation.gestures.Orientation[] r0 = androidx.compose.foundation.gestures.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldScrollKt.WhenMappings.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final Rect getCursorRectInScroller(Density density, int i, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z, int i2) {
        Rect rect;
        float f;
        float f2;
        if (textLayoutResult == null || (rect = textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(i))) == null) {
            rect = Rect.Companion.getZero();
        }
        Rect rect2 = rect;
        int r7 = density.m38443roundToPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
        if (z) {
            f = (((float) i2) - rect2.getLeft()) - ((float) r7);
        } else {
            f = rect2.getLeft();
        }
        float f3 = f;
        if (z) {
            f2 = ((float) i2) - rect2.getLeft();
        } else {
            f2 = rect2.getLeft() + ((float) r7);
        }
        return Rect.copy$default(rect2, f3, 0.0f, f2, 0.0f, 10, (Object) null);
    }

    public static final Modifier textFieldScroll(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, C13074a<TextLayoutResultProxy> aVar) {
        Modifier modifier2;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(textFieldScrollerPosition, "scrollerPosition");
        C12775o.m28639i(textFieldValue, "textFieldValue");
        C12775o.m28639i(visualTransformation, "visualTransformation");
        C12775o.m28639i(aVar, "textLayoutResultProvider");
        Orientation orientation = textFieldScrollerPosition.getOrientation();
        int r1 = textFieldScrollerPosition.m33726getOffsetToFollow5zctL8(textFieldValue.m38194getSelectiond9O1mEE());
        textFieldScrollerPosition.m33728setPreviousSelection5zctL8(textFieldValue.m38194getSelectiond9O1mEE());
        TransformedText filterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation, textFieldValue.getAnnotatedString());
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            modifier2 = new VerticalScrollLayoutModifier(textFieldScrollerPosition, r1, filterWithValidation, aVar);
        } else if (i == 2) {
            modifier2 = new HorizontalScrollLayoutModifier(textFieldScrollerPosition, r1, filterWithValidation, aVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return ClipKt.clipToBounds(modifier).then(modifier2);
    }

    public static final Modifier textFieldScrollable(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(textFieldScrollerPosition, "scrollerPosition");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0645x23ef3b2b(textFieldScrollerPosition, mutableInteractionSource, z);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new TextFieldScrollKt$textFieldScrollable$2(textFieldScrollerPosition, z, mutableInteractionSource));
    }

    public static /* synthetic */ Modifier textFieldScrollable$default(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            mutableInteractionSource = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return textFieldScrollable(modifier, textFieldScrollerPosition, mutableInteractionSource, z);
    }
}
