package androidx.compose.p002ui.text.style;

import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.text.style.TextIndent */
/* compiled from: TextIndent.kt */
public final class TextIndent {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final TextIndent None = new TextIndent(0, 0, 3, (DefaultConstructorMarker) null);
    private final long firstLine;
    private final long restLine;

    public /* synthetic */ TextIndent(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: copy-NB67dxo$default  reason: not valid java name */
    public static /* synthetic */ TextIndent m38370copyNB67dxo$default(TextIndent textIndent, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = textIndent.firstLine;
        }
        if ((i & 2) != 0) {
            j2 = textIndent.restLine;
        }
        return textIndent.m38371copyNB67dxo(j, j2);
    }

    /* renamed from: copy-NB67dxo  reason: not valid java name */
    public final TextIndent m38371copyNB67dxo(long j, long j2) {
        return new TextIndent(j, j2, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) obj;
        if (TextUnit.m38646equalsimpl0(this.firstLine, textIndent.firstLine) && TextUnit.m38646equalsimpl0(this.restLine, textIndent.restLine)) {
            return true;
        }
        return false;
    }

    /* renamed from: getFirstLine-XSAIIZE  reason: not valid java name */
    public final long m38372getFirstLineXSAIIZE() {
        return this.firstLine;
    }

    /* renamed from: getRestLine-XSAIIZE  reason: not valid java name */
    public final long m38373getRestLineXSAIIZE() {
        return this.restLine;
    }

    public int hashCode() {
        return (TextUnit.m38650hashCodeimpl(this.firstLine) * 31) + TextUnit.m38650hashCodeimpl(this.restLine);
    }

    public String toString() {
        return "TextIndent(firstLine=" + TextUnit.m38656toStringimpl(this.firstLine) + ", restLine=" + TextUnit.m38656toStringimpl(this.restLine) + ')';
    }

    private TextIndent(long j, long j2) {
        this.firstLine = j;
        this.restLine = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextIndent(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TextUnitKt.getSp(0) : j, (i & 2) != 0 ? TextUnitKt.getSp(0) : j2, (DefaultConstructorMarker) null);
    }

    /* renamed from: androidx.compose.ui.text.style.TextIndent$Companion */
    /* compiled from: TextIndent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextIndent getNone() {
            return TextIndent.None;
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }
    }
}
