package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.input.ImeAction;
import androidx.compose.p002ui.text.input.ImeOptions;
import androidx.compose.p002ui.text.input.KeyboardCapitalization;
import androidx.compose.p002ui.text.input.KeyboardType;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: KeyboardOptions.kt */
public final class KeyboardOptions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final KeyboardOptions Default = new KeyboardOptions(0, false, 0, 0, 15, (DefaultConstructorMarker) null);
    private final boolean autoCorrect;
    private final int capitalization;
    private final int imeAction;
    private final int keyboardType;

    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, i2, i3);
    }

    /* renamed from: copy-3m2b7yw$default  reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m33663copy3m2b7yw$default(KeyboardOptions keyboardOptions, int i, boolean z, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = keyboardOptions.capitalization;
        }
        if ((i4 & 2) != 0) {
            z = keyboardOptions.autoCorrect;
        }
        if ((i4 & 4) != 0) {
            i2 = keyboardOptions.keyboardType;
        }
        if ((i4 & 8) != 0) {
            i3 = keyboardOptions.imeAction;
        }
        return keyboardOptions.m33664copy3m2b7yw(i, z, i2, i3);
    }

    public static /* synthetic */ ImeOptions toImeOptions$foundation_release$default(KeyboardOptions keyboardOptions, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ImeOptions.Companion.getDefault().getSingleLine();
        }
        return keyboardOptions.toImeOptions$foundation_release(z);
    }

    /* renamed from: copy-3m2b7yw  reason: not valid java name */
    public final KeyboardOptions m33664copy3m2b7yw(int i, boolean z, int i2, int i3) {
        return new KeyboardOptions(i, z, i2, i3, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) obj;
        if (KeyboardCapitalization.m38152equalsimpl0(this.capitalization, keyboardOptions.capitalization) && this.autoCorrect == keyboardOptions.autoCorrect && KeyboardType.m38167equalsimpl0(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.m38122equalsimpl0(this.imeAction, keyboardOptions.imeAction)) {
            return true;
        }
        return false;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: getCapitalization-IUNYP9k  reason: not valid java name */
    public final int m33665getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    /* renamed from: getImeAction-eUduSuo  reason: not valid java name */
    public final int m33666getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getKeyboardType-PjHm6EE  reason: not valid java name */
    public final int m33667getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    public int hashCode() {
        return (((((KeyboardCapitalization.m38153hashCodeimpl(this.capitalization) * 31) + Boolean.hashCode(this.autoCorrect)) * 31) + KeyboardType.m38168hashCodeimpl(this.keyboardType)) * 31) + ImeAction.m38123hashCodeimpl(this.imeAction);
    }

    public final ImeOptions toImeOptions$foundation_release(boolean z) {
        return new ImeOptions(z, this.capitalization, this.autoCorrect, this.keyboardType, this.imeAction, (DefaultConstructorMarker) null);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + KeyboardCapitalization.m38154toStringimpl(this.capitalization) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + KeyboardType.m38169toStringimpl(this.keyboardType) + ", imeAction=" + ImeAction.m38124toStringimpl(this.imeAction) + ')';
    }

    private KeyboardOptions(int i, boolean z, int i2, int i3) {
        this.capitalization = i;
        this.autoCorrect = z;
        this.keyboardType = i2;
        this.imeAction = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? KeyboardCapitalization.Companion.m38161getNoneIUNYP9k() : i, (i4 & 2) != 0 ? true : z, (i4 & 4) != 0 ? KeyboardType.Companion.m38187getTextPjHm6EE() : i2, (i4 & 8) != 0 ? ImeAction.Companion.m38134getDefaulteUduSuo() : i3, (DefaultConstructorMarker) null);
    }

    /* compiled from: KeyboardOptions.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KeyboardOptions getDefault() {
            return KeyboardOptions.Default;
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }
    }
}
