package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p002ui.focus.FocusRequester;
import androidx.compose.p002ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.TextRangeKt;
import androidx.compose.p002ui.text.input.CommitTextCommand;
import androidx.compose.p002ui.text.input.DeleteAllCommand;
import androidx.compose.p002ui.text.input.ImeOptions;
import androidx.compose.p002ui.text.input.OffsetMapping;
import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.p002ui.text.input.TextInputSession;
import androidx.compose.p002ui.text.input.TransformedText;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13089p;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$semanticsModifier$1 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ boolean $isPassword;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TransformedText $transformedText;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$semanticsModifier$1(ImeOptions imeOptions, TransformedText transformedText, TextFieldValue textFieldValue, boolean z, boolean z2, boolean z3, TextFieldState textFieldState, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, FocusRequester focusRequester) {
        super(1);
        this.$imeOptions = imeOptions;
        this.$transformedText = transformedText;
        this.$value = textFieldValue;
        this.$enabled = z;
        this.$isPassword = z2;
        this.$readOnly = z3;
        this.$state = textFieldState;
        this.$offsetMapping = offsetMapping;
        this.$manager = textFieldSelectionManager;
        this.$focusRequester = focusRequester;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }

    public final void invoke(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.m37826setImeAction4L7nppU(semanticsPropertyReceiver, this.$imeOptions.m38145getImeActioneUduSuo());
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, this.$transformedText.getText());
        SemanticsPropertiesKt.m37829setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, this.$value.m38194getSelectiond9O1mEE());
        if (!this.$enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (this.$isPassword) {
            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        final TextFieldState textFieldState = this.$state;
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, (String) null, new Function1<List<TextLayoutResult>, Boolean>() {
            public final Boolean invoke(List<TextLayoutResult> list) {
                boolean z;
                C12775o.m28639i(list, "it");
                if (textFieldState.getLayoutResult() != null) {
                    TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                    C12775o.m28636f(layoutResult);
                    list.add(layoutResult.getValue());
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, 1, (Object) null);
        final TextFieldState textFieldState2 = this.$state;
        SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, (String) null, new Function1<AnnotatedString, Boolean>() {
            public final Boolean invoke(AnnotatedString annotatedString) {
                C11921v vVar;
                C12775o.m28639i(annotatedString, "text");
                TextInputSession inputSession = textFieldState2.getInputSession();
                if (inputSession != null) {
                    TextFieldState textFieldState = textFieldState2;
                    TextFieldDelegate.Companion.onEditCommand$foundation_release(C12726w.m28527n(new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1)), textFieldState.getProcessor(), textFieldState.getOnValueChange(), inputSession);
                    vVar = C11921v.f18618a;
                } else {
                    vVar = null;
                }
                if (vVar == null) {
                    textFieldState2.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                }
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
        final OffsetMapping offsetMapping = this.$offsetMapping;
        final boolean z = this.$enabled;
        final TextFieldValue textFieldValue = this.$value;
        final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
        final TextFieldState textFieldState3 = this.$state;
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, (String) null, new C13089p<Integer, Integer, Boolean, Boolean>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }

            public final Boolean invoke(int i, int i2, boolean z) {
                if (!z) {
                    i = offsetMapping.transformedToOriginal(i);
                }
                if (!z) {
                    i2 = offsetMapping.transformedToOriginal(i2);
                }
                boolean z2 = false;
                if (z && !(i == TextRange.m37975getStartimpl(textFieldValue.m38194getSelectiond9O1mEE()) && i2 == TextRange.m37970getEndimpl(textFieldValue.m38194getSelectiond9O1mEE()))) {
                    if (C13537l.m30882i(i, i2) < 0 || C13537l.m30877d(i, i2) > textFieldValue.getAnnotatedString().length()) {
                        textFieldSelectionManager.exitSelectionMode$foundation_release();
                    } else {
                        if (z || i == i2) {
                            textFieldSelectionManager.exitSelectionMode$foundation_release();
                        } else {
                            textFieldSelectionManager.enterSelectionMode$foundation_release();
                        }
                        textFieldState3.getOnValueChange().invoke(new TextFieldValue(textFieldValue.getAnnotatedString(), TextRangeKt.TextRange(i, i2), (TextRange) null, 4, (DefaultConstructorMarker) null));
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            }
        }, 1, (Object) null);
        final TextFieldState textFieldState4 = this.$state;
        final FocusRequester focusRequester = this.$focusRequester;
        final boolean z2 = this.$readOnly;
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, (String) null, new C13074a<Boolean>() {
            public final Boolean invoke() {
                CoreTextFieldKt.tapToFocus(textFieldState4, focusRequester, !z2);
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
        final TextFieldSelectionManager textFieldSelectionManager2 = this.$manager;
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, (String) null, new C13074a<Boolean>() {
            public final Boolean invoke() {
                textFieldSelectionManager2.enterSelectionMode$foundation_release();
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
        if (!TextRange.m37969getCollapsedimpl(this.$value.m38194getSelectiond9O1mEE()) && !this.$isPassword) {
            final TextFieldSelectionManager textFieldSelectionManager3 = this.$manager;
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, (String) null, new C13074a<Boolean>() {
                public final Boolean invoke() {
                    TextFieldSelectionManager.copy$foundation_release$default(textFieldSelectionManager3, false, 1, (Object) null);
                    return Boolean.TRUE;
                }
            }, 1, (Object) null);
            if (this.$enabled && !this.$readOnly) {
                final TextFieldSelectionManager textFieldSelectionManager4 = this.$manager;
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, (String) null, new C13074a<Boolean>() {
                    public final Boolean invoke() {
                        textFieldSelectionManager4.cut$foundation_release();
                        return Boolean.TRUE;
                    }
                }, 1, (Object) null);
            }
        }
        if (this.$enabled && !this.$readOnly) {
            final TextFieldSelectionManager textFieldSelectionManager5 = this.$manager;
            SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, (String) null, new C13074a<Boolean>() {
                public final Boolean invoke() {
                    textFieldSelectionManager5.paste$foundation_release();
                    return Boolean.TRUE;
                }
            }, 1, (Object) null);
        }
    }
}
