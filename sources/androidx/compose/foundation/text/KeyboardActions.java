package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

@Stable
/* compiled from: KeyboardActions.kt */
public final class KeyboardActions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final KeyboardActions Default = new KeyboardActions((Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, 63, (DefaultConstructorMarker) null);
    private final Function1<KeyboardActionScope, C11921v> onDone;
    private final Function1<KeyboardActionScope, C11921v> onGo;
    private final Function1<KeyboardActionScope, C11921v> onNext;
    private final Function1<KeyboardActionScope, C11921v> onPrevious;
    private final Function1<KeyboardActionScope, C11921v> onSearch;
    private final Function1<KeyboardActionScope, C11921v> onSend;

    public KeyboardActions() {
        this((Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, 63, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardActions)) {
            return false;
        }
        KeyboardActions keyboardActions = (KeyboardActions) obj;
        if (!C12775o.m28634d(this.onDone, keyboardActions.onDone) || !C12775o.m28634d(this.onGo, keyboardActions.onGo) || !C12775o.m28634d(this.onNext, keyboardActions.onNext) || !C12775o.m28634d(this.onPrevious, keyboardActions.onPrevious) || !C12775o.m28634d(this.onSearch, keyboardActions.onSearch) || !C12775o.m28634d(this.onSend, keyboardActions.onSend)) {
            return false;
        }
        return true;
    }

    public final Function1<KeyboardActionScope, C11921v> getOnDone() {
        return this.onDone;
    }

    public final Function1<KeyboardActionScope, C11921v> getOnGo() {
        return this.onGo;
    }

    public final Function1<KeyboardActionScope, C11921v> getOnNext() {
        return this.onNext;
    }

    public final Function1<KeyboardActionScope, C11921v> getOnPrevious() {
        return this.onPrevious;
    }

    public final Function1<KeyboardActionScope, C11921v> getOnSearch() {
        return this.onSearch;
    }

    public final Function1<KeyboardActionScope, C11921v> getOnSend() {
        return this.onSend;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Function1<KeyboardActionScope, C11921v> function1 = this.onDone;
        int i6 = 0;
        if (function1 != null) {
            i = function1.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        Function1<KeyboardActionScope, C11921v> function12 = this.onGo;
        if (function12 != null) {
            i2 = function12.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        Function1<KeyboardActionScope, C11921v> function13 = this.onNext;
        if (function13 != null) {
            i3 = function13.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        Function1<KeyboardActionScope, C11921v> function14 = this.onPrevious;
        if (function14 != null) {
            i4 = function14.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        Function1<KeyboardActionScope, C11921v> function15 = this.onSearch;
        if (function15 != null) {
            i5 = function15.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        Function1<KeyboardActionScope, C11921v> function16 = this.onSend;
        if (function16 != null) {
            i6 = function16.hashCode();
        }
        return i11 + i6;
    }

    public KeyboardActions(Function1<? super KeyboardActionScope, C11921v> function1, Function1<? super KeyboardActionScope, C11921v> function12, Function1<? super KeyboardActionScope, C11921v> function13, Function1<? super KeyboardActionScope, C11921v> function14, Function1<? super KeyboardActionScope, C11921v> function15, Function1<? super KeyboardActionScope, C11921v> function16) {
        this.onDone = function1;
        this.onGo = function12;
        this.onNext = function13;
        this.onPrevious = function14;
        this.onSearch = function15;
        this.onSend = function16;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ KeyboardActions(kotlin.jvm.functions.Function1 r6, kotlin.jvm.functions.Function1 r7, kotlin.jvm.functions.Function1 r8, kotlin.jvm.functions.Function1 r9, kotlin.jvm.functions.Function1 r10, kotlin.jvm.functions.Function1 r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.KeyboardActions.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* compiled from: KeyboardActions.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KeyboardActions getDefault() {
            return KeyboardActions.Default;
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }
    }
}
