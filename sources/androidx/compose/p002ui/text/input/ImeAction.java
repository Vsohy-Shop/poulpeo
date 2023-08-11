package androidx.compose.p002ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.input.ImeAction */
/* compiled from: ImeAction.kt */
public final class ImeAction {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Default = m38120constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Done = m38120constructorimpl(7);
    /* access modifiers changed from: private */

    /* renamed from: Go */
    public static final int f380Go = m38120constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int Next = m38120constructorimpl(6);
    /* access modifiers changed from: private */
    public static final int None = m38120constructorimpl(0);
    /* access modifiers changed from: private */
    public static final int Previous = m38120constructorimpl(5);
    /* access modifiers changed from: private */
    public static final int Search = m38120constructorimpl(3);
    /* access modifiers changed from: private */
    public static final int Send = m38120constructorimpl(4);
    private final int value;

    private /* synthetic */ ImeAction(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ImeAction m38119boximpl(int i) {
        return new ImeAction(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38121equalsimpl(int i, Object obj) {
        if ((obj instanceof ImeAction) && i == ((ImeAction) obj).m38125unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38122equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38123hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38124toStringimpl(int i) {
        if (m38122equalsimpl0(i, None)) {
            return "None";
        }
        if (m38122equalsimpl0(i, Default)) {
            return "Default";
        }
        if (m38122equalsimpl0(i, f380Go)) {
            return "Go";
        }
        if (m38122equalsimpl0(i, Search)) {
            return "Search";
        }
        if (m38122equalsimpl0(i, Send)) {
            return "Send";
        }
        if (m38122equalsimpl0(i, Previous)) {
            return "Previous";
        }
        if (m38122equalsimpl0(i, Next)) {
            return "Next";
        }
        if (m38122equalsimpl0(i, Done)) {
            return "Done";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m38121equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m38123hashCodeimpl(this.value);
    }

    public String toString() {
        return m38124toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m38125unboximpl() {
        return this.value;
    }

    /* renamed from: androidx.compose.ui.text.input.ImeAction$Companion */
    /* compiled from: ImeAction.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDefault-eUduSuo  reason: not valid java name */
        public final int m38134getDefaulteUduSuo() {
            return ImeAction.Default;
        }

        /* renamed from: getDone-eUduSuo  reason: not valid java name */
        public final int m38135getDoneeUduSuo() {
            return ImeAction.Done;
        }

        /* renamed from: getGo-eUduSuo  reason: not valid java name */
        public final int m38136getGoeUduSuo() {
            return ImeAction.f380Go;
        }

        /* renamed from: getNext-eUduSuo  reason: not valid java name */
        public final int m38137getNexteUduSuo() {
            return ImeAction.Next;
        }

        /* renamed from: getNone-eUduSuo  reason: not valid java name */
        public final int m38138getNoneeUduSuo() {
            return ImeAction.None;
        }

        /* renamed from: getPrevious-eUduSuo  reason: not valid java name */
        public final int m38139getPreviouseUduSuo() {
            return ImeAction.Previous;
        }

        /* renamed from: getSearch-eUduSuo  reason: not valid java name */
        public final int m38140getSearcheUduSuo() {
            return ImeAction.Search;
        }

        /* renamed from: getSend-eUduSuo  reason: not valid java name */
        public final int m38141getSendeUduSuo() {
            return ImeAction.Send;
        }

        @Stable
        /* renamed from: getDefault-eUduSuo$annotations  reason: not valid java name */
        public static /* synthetic */ void m38126getDefaulteUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getDone-eUduSuo$annotations  reason: not valid java name */
        public static /* synthetic */ void m38127getDoneeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getGo-eUduSuo$annotations  reason: not valid java name */
        public static /* synthetic */ void m38128getGoeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getNext-eUduSuo$annotations  reason: not valid java name */
        public static /* synthetic */ void m38129getNexteUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getNone-eUduSuo$annotations  reason: not valid java name */
        public static /* synthetic */ void m38130getNoneeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getPrevious-eUduSuo$annotations  reason: not valid java name */
        public static /* synthetic */ void m38131getPreviouseUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getSearch-eUduSuo$annotations  reason: not valid java name */
        public static /* synthetic */ void m38132getSearcheUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getSend-eUduSuo$annotations  reason: not valid java name */
        public static /* synthetic */ void m38133getSendeUduSuo$annotations() {
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m38120constructorimpl(int i) {
        return i;
    }
}
