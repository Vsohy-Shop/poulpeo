package androidx.compose.p002ui.text.input;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.text.input.ImeOptions */
/* compiled from: ImeOptions.kt */
public final class ImeOptions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final ImeOptions Default = new ImeOptions(false, 0, false, 0, 0, 31, (DefaultConstructorMarker) null);
    private final boolean autoCorrect;
    private final int capitalization;
    private final int imeAction;
    private final int keyboardType;
    private final boolean singleLine;

    /* renamed from: androidx.compose.ui.text.input.ImeOptions$Companion */
    /* compiled from: ImeOptions.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ImeOptions getDefault() {
            return ImeOptions.Default;
        }
    }

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, z2, i2, i3);
    }

    /* renamed from: copy-uxg59PA$default  reason: not valid java name */
    public static /* synthetic */ ImeOptions m38142copyuxg59PA$default(ImeOptions imeOptions, boolean z, int i, boolean z2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = imeOptions.singleLine;
        }
        if ((i4 & 2) != 0) {
            i = imeOptions.capitalization;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            z2 = imeOptions.autoCorrect;
        }
        boolean z3 = z2;
        if ((i4 & 8) != 0) {
            i2 = imeOptions.keyboardType;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = imeOptions.imeAction;
        }
        return imeOptions.m38143copyuxg59PA(z, i5, z3, i6, i3);
    }

    /* renamed from: copy-uxg59PA  reason: not valid java name */
    public final ImeOptions m38143copyuxg59PA(boolean z, int i, boolean z2, int i2, int i3) {
        return new ImeOptions(z, i, z2, i2, i3, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) obj;
        if (this.singleLine == imeOptions.singleLine && KeyboardCapitalization.m38152equalsimpl0(this.capitalization, imeOptions.capitalization) && this.autoCorrect == imeOptions.autoCorrect && KeyboardType.m38167equalsimpl0(this.keyboardType, imeOptions.keyboardType) && ImeAction.m38122equalsimpl0(this.imeAction, imeOptions.imeAction)) {
            return true;
        }
        return false;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: getCapitalization-IUNYP9k  reason: not valid java name */
    public final int m38144getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    /* renamed from: getImeAction-eUduSuo  reason: not valid java name */
    public final int m38145getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getKeyboardType-PjHm6EE  reason: not valid java name */
    public final int m38146getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.singleLine) * 31) + KeyboardCapitalization.m38153hashCodeimpl(this.capitalization)) * 31) + Boolean.hashCode(this.autoCorrect)) * 31) + KeyboardType.m38168hashCodeimpl(this.keyboardType)) * 31) + ImeAction.m38123hashCodeimpl(this.imeAction);
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + KeyboardCapitalization.m38154toStringimpl(this.capitalization) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + KeyboardType.m38169toStringimpl(this.keyboardType) + ", imeAction=" + ImeAction.m38124toStringimpl(this.imeAction) + ')';
    }

    private ImeOptions(boolean z, int i, boolean z2, int i2, int i3) {
        this.singleLine = z;
        this.capitalization = i;
        this.autoCorrect = z2;
        this.keyboardType = i2;
        this.imeAction = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? KeyboardCapitalization.Companion.m38161getNoneIUNYP9k() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? KeyboardType.Companion.m38187getTextPjHm6EE() : i2, (i4 & 16) != 0 ? ImeAction.Companion.m38134getDefaulteUduSuo() : i3, (DefaultConstructorMarker) null);
    }
}
