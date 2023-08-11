package androidx.compose.material3;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Stable
/* compiled from: ColorScheme.kt */
public final class ColorScheme {
    private final MutableState background$delegate;
    private final MutableState error$delegate;
    private final MutableState errorContainer$delegate;
    private final MutableState inverseOnSurface$delegate;
    private final MutableState inversePrimary$delegate;
    private final MutableState inverseSurface$delegate;
    private final MutableState onBackground$delegate;
    private final MutableState onError$delegate;
    private final MutableState onErrorContainer$delegate;
    private final MutableState onPrimary$delegate;
    private final MutableState onPrimaryContainer$delegate;
    private final MutableState onSecondary$delegate;
    private final MutableState onSecondaryContainer$delegate;
    private final MutableState onSurface$delegate;
    private final MutableState onSurfaceVariant$delegate;
    private final MutableState onTertiary$delegate;
    private final MutableState onTertiaryContainer$delegate;
    private final MutableState outline$delegate;
    private final MutableState outlineVariant$delegate;
    private final MutableState primary$delegate;
    private final MutableState primaryContainer$delegate;
    private final MutableState scrim$delegate;
    private final MutableState secondary$delegate;
    private final MutableState secondaryContainer$delegate;
    private final MutableState surface$delegate;
    private final MutableState surfaceTint$delegate;
    private final MutableState surfaceVariant$delegate;
    private final MutableState tertiary$delegate;
    private final MutableState tertiaryContainer$delegate;

    public /* synthetic */ ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29);
    }

    /* renamed from: copy-G1PFc-w$default  reason: not valid java name */
    public static /* synthetic */ ColorScheme m34297copyG1PFcw$default(ColorScheme colorScheme, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        int i2 = i;
        return colorScheme.m34298copyG1PFcw((i2 & 1) != 0 ? colorScheme.m34318getPrimary0d7_KjU() : j, (i2 & 2) != 0 ? colorScheme.m34308getOnPrimary0d7_KjU() : j2, (i2 & 4) != 0 ? colorScheme.m34319getPrimaryContainer0d7_KjU() : j3, (i2 & 8) != 0 ? colorScheme.m34309getOnPrimaryContainer0d7_KjU() : j4, (i2 & 16) != 0 ? colorScheme.m34303getInversePrimary0d7_KjU() : j5, (i2 & 32) != 0 ? colorScheme.m34321getSecondary0d7_KjU() : j6, (i2 & 64) != 0 ? colorScheme.m34310getOnSecondary0d7_KjU() : j7, (i2 & 128) != 0 ? colorScheme.m34322getSecondaryContainer0d7_KjU() : j8, (i2 & 256) != 0 ? colorScheme.m34311getOnSecondaryContainer0d7_KjU() : j9, (i2 & 512) != 0 ? colorScheme.m34326getTertiary0d7_KjU() : j10, (i2 & 1024) != 0 ? colorScheme.m34314getOnTertiary0d7_KjU() : j11, (i2 & 2048) != 0 ? colorScheme.m34327getTertiaryContainer0d7_KjU() : j12, (i2 & 4096) != 0 ? colorScheme.m34315getOnTertiaryContainer0d7_KjU() : j13, (i2 & 8192) != 0 ? colorScheme.m34299getBackground0d7_KjU() : j14, (i2 & 16384) != 0 ? colorScheme.m34305getOnBackground0d7_KjU() : j15, (i2 & 32768) != 0 ? colorScheme.m34323getSurface0d7_KjU() : j16, (i2 & 65536) != 0 ? colorScheme.m34312getOnSurface0d7_KjU() : j17, (i2 & 131072) != 0 ? colorScheme.m34325getSurfaceVariant0d7_KjU() : j18, (i2 & 262144) != 0 ? colorScheme.m34313getOnSurfaceVariant0d7_KjU() : j19, (i2 & 524288) != 0 ? colorScheme.m34324getSurfaceTint0d7_KjU() : j20, (i2 & 1048576) != 0 ? colorScheme.m34304getInverseSurface0d7_KjU() : j21, (i2 & 2097152) != 0 ? colorScheme.m34302getInverseOnSurface0d7_KjU() : j22, (i2 & 4194304) != 0 ? colorScheme.m34300getError0d7_KjU() : j23, (i2 & 8388608) != 0 ? colorScheme.m34306getOnError0d7_KjU() : j24, (i2 & 16777216) != 0 ? colorScheme.m34301getErrorContainer0d7_KjU() : j25, (i2 & 33554432) != 0 ? colorScheme.m34307getOnErrorContainer0d7_KjU() : j26, (i2 & 67108864) != 0 ? colorScheme.m34316getOutline0d7_KjU() : j27, (i2 & 134217728) != 0 ? colorScheme.m34317getOutlineVariant0d7_KjU() : j28, (i2 & 268435456) != 0 ? colorScheme.m34320getScrim0d7_KjU() : j29);
    }

    /* renamed from: copy-G1PFc-w  reason: not valid java name */
    public final ColorScheme m34298copyG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, (DefaultConstructorMarker) null);
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m34299getBackground0d7_KjU() {
        return ((Color) this.background$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getError-0d7_KjU  reason: not valid java name */
    public final long m34300getError0d7_KjU() {
        return ((Color) this.error$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getErrorContainer-0d7_KjU  reason: not valid java name */
    public final long m34301getErrorContainer0d7_KjU() {
        return ((Color) this.errorContainer$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getInverseOnSurface-0d7_KjU  reason: not valid java name */
    public final long m34302getInverseOnSurface0d7_KjU() {
        return ((Color) this.inverseOnSurface$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getInversePrimary-0d7_KjU  reason: not valid java name */
    public final long m34303getInversePrimary0d7_KjU() {
        return ((Color) this.inversePrimary$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getInverseSurface-0d7_KjU  reason: not valid java name */
    public final long m34304getInverseSurface0d7_KjU() {
        return ((Color) this.inverseSurface$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOnBackground-0d7_KjU  reason: not valid java name */
    public final long m34305getOnBackground0d7_KjU() {
        return ((Color) this.onBackground$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOnError-0d7_KjU  reason: not valid java name */
    public final long m34306getOnError0d7_KjU() {
        return ((Color) this.onError$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOnErrorContainer-0d7_KjU  reason: not valid java name */
    public final long m34307getOnErrorContainer0d7_KjU() {
        return ((Color) this.onErrorContainer$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOnPrimary-0d7_KjU  reason: not valid java name */
    public final long m34308getOnPrimary0d7_KjU() {
        return ((Color) this.onPrimary$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOnPrimaryContainer-0d7_KjU  reason: not valid java name */
    public final long m34309getOnPrimaryContainer0d7_KjU() {
        return ((Color) this.onPrimaryContainer$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOnSecondary-0d7_KjU  reason: not valid java name */
    public final long m34310getOnSecondary0d7_KjU() {
        return ((Color) this.onSecondary$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOnSecondaryContainer-0d7_KjU  reason: not valid java name */
    public final long m34311getOnSecondaryContainer0d7_KjU() {
        return ((Color) this.onSecondaryContainer$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOnSurface-0d7_KjU  reason: not valid java name */
    public final long m34312getOnSurface0d7_KjU() {
        return ((Color) this.onSurface$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOnSurfaceVariant-0d7_KjU  reason: not valid java name */
    public final long m34313getOnSurfaceVariant0d7_KjU() {
        return ((Color) this.onSurfaceVariant$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOnTertiary-0d7_KjU  reason: not valid java name */
    public final long m34314getOnTertiary0d7_KjU() {
        return ((Color) this.onTertiary$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOnTertiaryContainer-0d7_KjU  reason: not valid java name */
    public final long m34315getOnTertiaryContainer0d7_KjU() {
        return ((Color) this.onTertiaryContainer$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOutline-0d7_KjU  reason: not valid java name */
    public final long m34316getOutline0d7_KjU() {
        return ((Color) this.outline$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getOutlineVariant-0d7_KjU  reason: not valid java name */
    public final long m34317getOutlineVariant0d7_KjU() {
        return ((Color) this.outlineVariant$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getPrimary-0d7_KjU  reason: not valid java name */
    public final long m34318getPrimary0d7_KjU() {
        return ((Color) this.primary$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getPrimaryContainer-0d7_KjU  reason: not valid java name */
    public final long m34319getPrimaryContainer0d7_KjU() {
        return ((Color) this.primaryContainer$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getScrim-0d7_KjU  reason: not valid java name */
    public final long m34320getScrim0d7_KjU() {
        return ((Color) this.scrim$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getSecondary-0d7_KjU  reason: not valid java name */
    public final long m34321getSecondary0d7_KjU() {
        return ((Color) this.secondary$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getSecondaryContainer-0d7_KjU  reason: not valid java name */
    public final long m34322getSecondaryContainer0d7_KjU() {
        return ((Color) this.secondaryContainer$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getSurface-0d7_KjU  reason: not valid java name */
    public final long m34323getSurface0d7_KjU() {
        return ((Color) this.surface$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getSurfaceTint-0d7_KjU  reason: not valid java name */
    public final long m34324getSurfaceTint0d7_KjU() {
        return ((Color) this.surfaceTint$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getSurfaceVariant-0d7_KjU  reason: not valid java name */
    public final long m34325getSurfaceVariant0d7_KjU() {
        return ((Color) this.surfaceVariant$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getTertiary-0d7_KjU  reason: not valid java name */
    public final long m34326getTertiary0d7_KjU() {
        return ((Color) this.tertiary$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: getTertiaryContainer-0d7_KjU  reason: not valid java name */
    public final long m34327getTertiaryContainer0d7_KjU() {
        return ((Color) this.tertiaryContainer$delegate.getValue()).m35681unboximpl();
    }

    /* renamed from: setBackground-8_81llA$material3_release  reason: not valid java name */
    public final void m34328setBackground8_81llA$material3_release(long j) {
        this.background$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setError-8_81llA$material3_release  reason: not valid java name */
    public final void m34329setError8_81llA$material3_release(long j) {
        this.error$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setErrorContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m34330setErrorContainer8_81llA$material3_release(long j) {
        this.errorContainer$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setInverseOnSurface-8_81llA$material3_release  reason: not valid java name */
    public final void m34331setInverseOnSurface8_81llA$material3_release(long j) {
        this.inverseOnSurface$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setInversePrimary-8_81llA$material3_release  reason: not valid java name */
    public final void m34332setInversePrimary8_81llA$material3_release(long j) {
        this.inversePrimary$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setInverseSurface-8_81llA$material3_release  reason: not valid java name */
    public final void m34333setInverseSurface8_81llA$material3_release(long j) {
        this.inverseSurface$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setOnBackground-8_81llA$material3_release  reason: not valid java name */
    public final void m34334setOnBackground8_81llA$material3_release(long j) {
        this.onBackground$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setOnError-8_81llA$material3_release  reason: not valid java name */
    public final void m34335setOnError8_81llA$material3_release(long j) {
        this.onError$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setOnErrorContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m34336setOnErrorContainer8_81llA$material3_release(long j) {
        this.onErrorContainer$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setOnPrimary-8_81llA$material3_release  reason: not valid java name */
    public final void m34337setOnPrimary8_81llA$material3_release(long j) {
        this.onPrimary$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setOnPrimaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m34338setOnPrimaryContainer8_81llA$material3_release(long j) {
        this.onPrimaryContainer$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setOnSecondary-8_81llA$material3_release  reason: not valid java name */
    public final void m34339setOnSecondary8_81llA$material3_release(long j) {
        this.onSecondary$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setOnSecondaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m34340setOnSecondaryContainer8_81llA$material3_release(long j) {
        this.onSecondaryContainer$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setOnSurface-8_81llA$material3_release  reason: not valid java name */
    public final void m34341setOnSurface8_81llA$material3_release(long j) {
        this.onSurface$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setOnSurfaceVariant-8_81llA$material3_release  reason: not valid java name */
    public final void m34342setOnSurfaceVariant8_81llA$material3_release(long j) {
        this.onSurfaceVariant$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setOnTertiary-8_81llA$material3_release  reason: not valid java name */
    public final void m34343setOnTertiary8_81llA$material3_release(long j) {
        this.onTertiary$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setOnTertiaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m34344setOnTertiaryContainer8_81llA$material3_release(long j) {
        this.onTertiaryContainer$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setOutline-8_81llA$material3_release  reason: not valid java name */
    public final void m34345setOutline8_81llA$material3_release(long j) {
        this.outline$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setOutlineVariant-8_81llA$material3_release  reason: not valid java name */
    public final void m34346setOutlineVariant8_81llA$material3_release(long j) {
        this.outlineVariant$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setPrimary-8_81llA$material3_release  reason: not valid java name */
    public final void m34347setPrimary8_81llA$material3_release(long j) {
        this.primary$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setPrimaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m34348setPrimaryContainer8_81llA$material3_release(long j) {
        this.primaryContainer$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setScrim-8_81llA$material3_release  reason: not valid java name */
    public final void m34349setScrim8_81llA$material3_release(long j) {
        this.scrim$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setSecondary-8_81llA$material3_release  reason: not valid java name */
    public final void m34350setSecondary8_81llA$material3_release(long j) {
        this.secondary$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setSecondaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m34351setSecondaryContainer8_81llA$material3_release(long j) {
        this.secondaryContainer$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setSurface-8_81llA$material3_release  reason: not valid java name */
    public final void m34352setSurface8_81llA$material3_release(long j) {
        this.surface$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setSurfaceTint-8_81llA$material3_release  reason: not valid java name */
    public final void m34353setSurfaceTint8_81llA$material3_release(long j) {
        this.surfaceTint$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setSurfaceVariant-8_81llA$material3_release  reason: not valid java name */
    public final void m34354setSurfaceVariant8_81llA$material3_release(long j) {
        this.surfaceVariant$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setTertiary-8_81llA$material3_release  reason: not valid java name */
    public final void m34355setTertiary8_81llA$material3_release(long j) {
        this.tertiary$delegate.setValue(Color.m35661boximpl(j));
    }

    /* renamed from: setTertiaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m34356setTertiaryContainer8_81llA$material3_release(long j) {
        this.tertiaryContainer$delegate.setValue(Color.m35661boximpl(j));
    }

    public String toString() {
        return "ColorScheme(primary=" + Color.m35679toStringimpl(m34318getPrimary0d7_KjU()) + "onPrimary=" + Color.m35679toStringimpl(m34308getOnPrimary0d7_KjU()) + "primaryContainer=" + Color.m35679toStringimpl(m34319getPrimaryContainer0d7_KjU()) + "onPrimaryContainer=" + Color.m35679toStringimpl(m34309getOnPrimaryContainer0d7_KjU()) + "inversePrimary=" + Color.m35679toStringimpl(m34303getInversePrimary0d7_KjU()) + "secondary=" + Color.m35679toStringimpl(m34321getSecondary0d7_KjU()) + "onSecondary=" + Color.m35679toStringimpl(m34310getOnSecondary0d7_KjU()) + "secondaryContainer=" + Color.m35679toStringimpl(m34322getSecondaryContainer0d7_KjU()) + "onSecondaryContainer=" + Color.m35679toStringimpl(m34311getOnSecondaryContainer0d7_KjU()) + "tertiary=" + Color.m35679toStringimpl(m34326getTertiary0d7_KjU()) + "onTertiary=" + Color.m35679toStringimpl(m34314getOnTertiary0d7_KjU()) + "tertiaryContainer=" + Color.m35679toStringimpl(m34327getTertiaryContainer0d7_KjU()) + "onTertiaryContainer=" + Color.m35679toStringimpl(m34315getOnTertiaryContainer0d7_KjU()) + "background=" + Color.m35679toStringimpl(m34299getBackground0d7_KjU()) + "onBackground=" + Color.m35679toStringimpl(m34305getOnBackground0d7_KjU()) + "surface=" + Color.m35679toStringimpl(m34323getSurface0d7_KjU()) + "onSurface=" + Color.m35679toStringimpl(m34312getOnSurface0d7_KjU()) + "surfaceVariant=" + Color.m35679toStringimpl(m34325getSurfaceVariant0d7_KjU()) + "onSurfaceVariant=" + Color.m35679toStringimpl(m34313getOnSurfaceVariant0d7_KjU()) + "surfaceTint=" + Color.m35679toStringimpl(m34324getSurfaceTint0d7_KjU()) + "inverseSurface=" + Color.m35679toStringimpl(m34304getInverseSurface0d7_KjU()) + "inverseOnSurface=" + Color.m35679toStringimpl(m34302getInverseOnSurface0d7_KjU()) + "error=" + Color.m35679toStringimpl(m34300getError0d7_KjU()) + "onError=" + Color.m35679toStringimpl(m34306getOnError0d7_KjU()) + "errorContainer=" + Color.m35679toStringimpl(m34301getErrorContainer0d7_KjU()) + "onErrorContainer=" + Color.m35679toStringimpl(m34307getOnErrorContainer0d7_KjU()) + "outline=" + Color.m35679toStringimpl(m34316getOutline0d7_KjU()) + "outlineVariant=" + Color.m35679toStringimpl(m34317getOutlineVariant0d7_KjU()) + "scrim=" + Color.m35679toStringimpl(m34320getScrim0d7_KjU()) + ')';
    }

    private ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        this.primary$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j2), SnapshotStateKt.structuralEqualityPolicy());
        this.primaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j3), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j4), SnapshotStateKt.structuralEqualityPolicy());
        this.inversePrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j5), SnapshotStateKt.structuralEqualityPolicy());
        this.secondary$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j6), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondary$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j7), SnapshotStateKt.structuralEqualityPolicy());
        this.secondaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j8), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j9), SnapshotStateKt.structuralEqualityPolicy());
        this.tertiary$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.onTertiary$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.tertiaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.onTertiaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j13), SnapshotStateKt.structuralEqualityPolicy());
        this.background$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j14), SnapshotStateKt.structuralEqualityPolicy());
        this.onBackground$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j15), SnapshotStateKt.structuralEqualityPolicy());
        this.surface$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j16), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j17), SnapshotStateKt.structuralEqualityPolicy());
        this.surfaceVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j18), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurfaceVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j19), SnapshotStateKt.structuralEqualityPolicy());
        this.surfaceTint$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j20), SnapshotStateKt.structuralEqualityPolicy());
        this.inverseSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j21), SnapshotStateKt.structuralEqualityPolicy());
        this.inverseOnSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j22), SnapshotStateKt.structuralEqualityPolicy());
        this.error$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j23), SnapshotStateKt.structuralEqualityPolicy());
        this.onError$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j24), SnapshotStateKt.structuralEqualityPolicy());
        this.errorContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j25), SnapshotStateKt.structuralEqualityPolicy());
        this.onErrorContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j26), SnapshotStateKt.structuralEqualityPolicy());
        this.outline$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j27), SnapshotStateKt.structuralEqualityPolicy());
        this.outlineVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j28), SnapshotStateKt.structuralEqualityPolicy());
        this.scrim$delegate = SnapshotStateKt.mutableStateOf(Color.m35661boximpl(j29), SnapshotStateKt.structuralEqualityPolicy());
    }
}
