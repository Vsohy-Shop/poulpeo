package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/Colors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,337:1\n76#2:338\n102#2,2:339\n76#2:341\n102#2,2:342\n76#2:344\n102#2,2:345\n76#2:347\n102#2,2:348\n76#2:350\n102#2,2:351\n76#2:353\n102#2,2:354\n76#2:356\n102#2,2:357\n76#2:359\n102#2,2:360\n76#2:362\n102#2,2:363\n76#2:365\n102#2,2:366\n76#2:368\n102#2,2:369\n76#2:371\n102#2,2:372\n76#2:374\n102#2,2:375\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/Colors\n*L\n82#1:338\n82#1:339,2\n84#1:341\n84#1:342,2\n86#1:344\n86#1:345,2\n88#1:347\n88#1:348,2\n90#1:350\n90#1:351,2\n92#1:353\n92#1:354,2\n94#1:356\n94#1:357,2\n96#1:359\n96#1:360,2\n98#1:362\n98#1:363,2\n100#1:365\n100#1:366,2\n102#1:368\n102#1:369,2\n104#1:371\n104#1:372,2\n106#1:374\n106#1:375,2\n*E\n"})
@Stable
/* compiled from: Colors.kt */
public final class Colors {
    public static final int $stable = 0;
    private final MutableState background$delegate;
    private final MutableState error$delegate;
    private final MutableState isLight$delegate;
    private final MutableState onBackground$delegate;
    private final MutableState onError$delegate;
    private final MutableState onPrimary$delegate;
    private final MutableState onSecondary$delegate;
    private final MutableState onSurface$delegate;
    private final MutableState primary$delegate;
    private final MutableState primaryVariant$delegate;
    private final MutableState secondary$delegate;
    private final MutableState secondaryVariant$delegate;
    private final MutableState surface$delegate;

    public /* synthetic */ Colors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, z);
    }

    /* renamed from: copy-pvPzIIM$default  reason: not valid java name */
    public static /* synthetic */ Colors m33943copypvPzIIM$default(Colors colors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z, int i, Object obj) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        boolean z2;
        int i2 = i;
        if ((i2 & 1) != 0) {
            j13 = colors.m33952getPrimary0d7_KjU();
        } else {
            j13 = j;
        }
        if ((i2 & 2) != 0) {
            j14 = colors.m33953getPrimaryVariant0d7_KjU();
        } else {
            j14 = j2;
        }
        if ((i2 & 4) != 0) {
            j15 = colors.m33954getSecondary0d7_KjU();
        } else {
            j15 = j3;
        }
        if ((i2 & 8) != 0) {
            j16 = colors.m33955getSecondaryVariant0d7_KjU();
        } else {
            j16 = j4;
        }
        if ((i2 & 16) != 0) {
            j17 = colors.m33945getBackground0d7_KjU();
        } else {
            j17 = j5;
        }
        if ((i2 & 32) != 0) {
            j18 = colors.m33956getSurface0d7_KjU();
        } else {
            j18 = j6;
        }
        if ((i2 & 64) != 0) {
            j19 = colors.m33946getError0d7_KjU();
        } else {
            j19 = j7;
        }
        if ((i2 & 128) != 0) {
            j20 = colors.m33949getOnPrimary0d7_KjU();
        } else {
            j20 = j8;
        }
        long j25 = j20;
        if ((i2 & 256) != 0) {
            j21 = colors.m33950getOnSecondary0d7_KjU();
        } else {
            j21 = j9;
        }
        long j26 = j21;
        if ((i2 & 512) != 0) {
            j22 = colors.m33947getOnBackground0d7_KjU();
        } else {
            j22 = j10;
        }
        long j27 = j22;
        if ((i2 & 1024) != 0) {
            j23 = colors.m33951getOnSurface0d7_KjU();
        } else {
            j23 = j11;
        }
        long j28 = j23;
        if ((i2 & 2048) != 0) {
            j24 = colors.m33948getOnError0d7_KjU();
        } else {
            j24 = j12;
        }
        if ((i2 & 4096) != 0) {
            z2 = colors.isLight();
        } else {
            z2 = z;
        }
        return colors.m33944copypvPzIIM(j13, j14, j15, j16, j17, j18, j19, j25, j26, j27, j28, j24, z2);
    }

    /* renamed from: copy-pvPzIIM  reason: not valid java name */
    public final Colors m33944copypvPzIIM(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, z, (DefaultConstructorMarker) null);
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m33945getBackground0d7_KjU() {
        return ((Color) this.background$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getError-0d7_KjU  reason: not valid java name */
    public final long m33946getError0d7_KjU() {
        return ((Color) this.error$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOnBackground-0d7_KjU  reason: not valid java name */
    public final long m33947getOnBackground0d7_KjU() {
        return ((Color) this.onBackground$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOnError-0d7_KjU  reason: not valid java name */
    public final long m33948getOnError0d7_KjU() {
        return ((Color) this.onError$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOnPrimary-0d7_KjU  reason: not valid java name */
    public final long m33949getOnPrimary0d7_KjU() {
        return ((Color) this.onPrimary$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOnSecondary-0d7_KjU  reason: not valid java name */
    public final long m33950getOnSecondary0d7_KjU() {
        return ((Color) this.onSecondary$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOnSurface-0d7_KjU  reason: not valid java name */
    public final long m33951getOnSurface0d7_KjU() {
        return ((Color) this.onSurface$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getPrimary-0d7_KjU  reason: not valid java name */
    public final long m33952getPrimary0d7_KjU() {
        return ((Color) this.primary$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getPrimaryVariant-0d7_KjU  reason: not valid java name */
    public final long m33953getPrimaryVariant0d7_KjU() {
        return ((Color) this.primaryVariant$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getSecondary-0d7_KjU  reason: not valid java name */
    public final long m33954getSecondary0d7_KjU() {
        return ((Color) this.secondary$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getSecondaryVariant-0d7_KjU  reason: not valid java name */
    public final long m33955getSecondaryVariant0d7_KjU() {
        return ((Color) this.secondaryVariant$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getSurface-0d7_KjU  reason: not valid java name */
    public final long m33956getSurface0d7_KjU() {
        return ((Color) this.surface$delegate.getValue()).m35681unboximpl();
    }

    public final boolean isLight() {
        return ((Boolean) this.isLight$delegate.getValue()).booleanValue();
    }

    /* renamed from: setBackground-8_81llA$material_release  reason: not valid java name */
    public final void m33957setBackground8_81llA$material_release(long j) {
        this.background$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setError-8_81llA$material_release  reason: not valid java name */
    public final void m33958setError8_81llA$material_release(long j) {
        this.error$delegate.setValue(Color.m35661boximpl(j));
    }

    public final void setLight$material_release(boolean z) {
        this.isLight$delegate.setValue(Boolean.valueOf(z));
    }

    /* renamed from: setOnBackground-8_81llA$material_release  reason: not valid java name */
    public final void m33959setOnBackground8_81llA$material_release(long j) {
        this.onBackground$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setOnError-8_81llA$material_release  reason: not valid java name */
    public final void m33960setOnError8_81llA$material_release(long j) {
        this.onError$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setOnPrimary-8_81llA$material_release  reason: not valid java name */
    public final void m33961setOnPrimary8_81llA$material_release(long j) {
        this.onPrimary$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setOnSecondary-8_81llA$material_release  reason: not valid java name */
    public final void m33962setOnSecondary8_81llA$material_release(long j) {
        this.onSecondary$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setOnSurface-8_81llA$material_release  reason: not valid java name */
    public final void m33963setOnSurface8_81llA$material_release(long j) {
        this.onSurface$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setPrimary-8_81llA$material_release  reason: not valid java name */
    public final void m33964setPrimary8_81llA$material_release(long j) {
        this.primary$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setPrimaryVariant-8_81llA$material_release  reason: not valid java name */
    public final void m33965setPrimaryVariant8_81llA$material_release(long j) {
        this.primaryVariant$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setSecondary-8_81llA$material_release  reason: not valid java name */
    public final void m33966setSecondary8_81llA$material_release(long j) {
        this.secondary$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setSecondaryVariant-8_81llA$material_release  reason: not valid java name */
    public final void m33967setSecondaryVariant8_81llA$material_release(long j) {
        this.secondaryVariant$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setSurface-8_81llA$material_release  reason: not valid java name */
    public final void m33968setSurface8_81llA$material_release(long j) {
        this.surface$delegate.setValue(Color.m35661boximpl(j));
    }

    public String toString() {
        return "Colors(primary=" + Color.m35679toStringimpl(m33952getPrimary0d7_KjU()) + ", primaryVariant=" + Color.m35679toStringimpl(m33953getPrimaryVariant0d7_KjU()) + ", secondary=" + Color.m35679toStringimpl(m33954getSecondary0d7_KjU()) + ", secondaryVariant=" + Color.m35679toStringimpl(m33955getSecondaryVariant0d7_KjU()) + ", background=" + Color.m35679toStringimpl(m33945getBackground0d7_KjU()) + ", surface=" + Color.m35679toStringimpl(m33956getSurface0d7_KjU()) + ", error=" + Color.m35679toStringimpl(m33946getError0d7_KjU()) + ", onPrimary=" + Color.m35679toStringimpl(m33949getOnPrimary0d7_KjU()) + ", onSecondary=" + Color.m35679toStringimpl(m33950getOnSecondary0d7_KjU()) + ", onBackground=" + Color.m35679toStringimpl(m33947getOnBackground0d7_KjU()) + ", onSurface=" + Color.m35679toStringimpl(m33951getOnSurface0d7_KjU()) + ", onError=" + Color.m35679toStringimpl(m33948getOnError0d7_KjU()) + ", isLight=" + isLight() + ')';
    }

    private Colors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        this.primary$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j), SnapshotStateKt.structuralEqualityPolicy());
        this.primaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j2), SnapshotStateKt.structuralEqualityPolicy());
        this.secondary$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j3), SnapshotStateKt.structuralEqualityPolicy());
        this.secondaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j4), SnapshotStateKt.structuralEqualityPolicy());
        this.background$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j5), SnapshotStateKt.structuralEqualityPolicy());
        this.surface$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j6), SnapshotStateKt.structuralEqualityPolicy());
        this.error$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j7), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j8), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondary$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j9), SnapshotStateKt.structuralEqualityPolicy());
        this.onBackground$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.onError$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.isLight$delegate = SnapshotStateKt.mutableStateOf(Boolean.valueOf(z), SnapshotStateKt.structuralEqualityPolicy());
    }
}
