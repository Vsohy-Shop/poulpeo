package androidx.compose.p002ui.text;

import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitKt;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nPlaceholder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeholder.kt\nandroidx/compose/ui/text/Placeholder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/* renamed from: androidx.compose.ui.text.Placeholder */
/* compiled from: Placeholder.kt */
public final class Placeholder {
    public static final int $stable = 0;
    private final long height;
    private final int placeholderVerticalAlign;
    private final long width;

    public /* synthetic */ Placeholder(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i);
    }

    /* renamed from: copy-K8Q-__8$default  reason: not valid java name */
    public static /* synthetic */ Placeholder m37895copyK8Q__8$default(Placeholder placeholder, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = placeholder.width;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = placeholder.height;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = placeholder.placeholderVerticalAlign;
        }
        return placeholder.m37896copyK8Q__8(j3, j4, i);
    }

    /* renamed from: copy-K8Q-__8  reason: not valid java name */
    public final Placeholder m37896copyK8Q__8(long j, long j2, int i) {
        return new Placeholder(j, j2, i, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        if (TextUnit.m38646equalsimpl0(this.width, placeholder.width) && TextUnit.m38646equalsimpl0(this.height, placeholder.height) && PlaceholderVerticalAlign.m37903equalsimpl0(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign)) {
            return true;
        }
        return false;
    }

    /* renamed from: getHeight-XSAIIZE  reason: not valid java name */
    public final long m37897getHeightXSAIIZE() {
        return this.height;
    }

    /* renamed from: getPlaceholderVerticalAlign-J6kI3mc  reason: not valid java name */
    public final int m37898getPlaceholderVerticalAlignJ6kI3mc() {
        return this.placeholderVerticalAlign;
    }

    /* renamed from: getWidth-XSAIIZE  reason: not valid java name */
    public final long m37899getWidthXSAIIZE() {
        return this.width;
    }

    public int hashCode() {
        return (((TextUnit.m38650hashCodeimpl(this.width) * 31) + TextUnit.m38650hashCodeimpl(this.height)) * 31) + PlaceholderVerticalAlign.m37904hashCodeimpl(this.placeholderVerticalAlign);
    }

    public String toString() {
        return "Placeholder(width=" + TextUnit.m38656toStringimpl(this.width) + ", height=" + TextUnit.m38656toStringimpl(this.height) + ", placeholderVerticalAlign=" + PlaceholderVerticalAlign.m37905toStringimpl(this.placeholderVerticalAlign) + ')';
    }

    private Placeholder(long j, long j2, int i) {
        this.width = j;
        this.height = j2;
        this.placeholderVerticalAlign = i;
        if (!(!TextUnitKt.m38667isUnspecifiedR2X_6o(j))) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
        } else if (!(!TextUnitKt.m38667isUnspecifiedR2X_6o(j2))) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
        }
    }
}
