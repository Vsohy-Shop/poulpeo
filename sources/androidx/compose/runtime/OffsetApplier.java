package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,288:1\n4513#2,5:289\n4513#2,5:294\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n*L\n263#1:289,5\n286#1:294,5\n*E\n"})
/* compiled from: Applier.kt */
public final class OffsetApplier<N> implements Applier<N> {
    private final Applier<N> applier;
    private int nesting;
    private final int offset;

    public OffsetApplier(Applier<N> applier2, int i) {
        C12775o.m28639i(applier2, "applier");
        this.applier = applier2;
        this.offset = i;
    }

    public void clear() {
        ComposerKt.composeRuntimeError("Clear is not valid on OffsetApplier".toString());
        throw new KotlinNothingValueException();
    }

    public void down(N n) {
        this.nesting++;
        this.applier.down(n);
    }

    public N getCurrent() {
        return this.applier.getCurrent();
    }

    public void insertBottomUp(int i, N n) {
        int i2;
        Applier<N> applier2 = this.applier;
        if (this.nesting == 0) {
            i2 = this.offset;
        } else {
            i2 = 0;
        }
        applier2.insertBottomUp(i + i2, n);
    }

    public void insertTopDown(int i, N n) {
        int i2;
        Applier<N> applier2 = this.applier;
        if (this.nesting == 0) {
            i2 = this.offset;
        } else {
            i2 = 0;
        }
        applier2.insertTopDown(i + i2, n);
    }

    public void move(int i, int i2, int i3) {
        int i4;
        if (this.nesting == 0) {
            i4 = this.offset;
        } else {
            i4 = 0;
        }
        this.applier.move(i + i4, i2 + i4, i3);
    }

    public void remove(int i, int i2) {
        int i3;
        Applier<N> applier2 = this.applier;
        if (this.nesting == 0) {
            i3 = this.offset;
        } else {
            i3 = 0;
        }
        applier2.remove(i + i3, i2);
    }

    /* renamed from: up */
    public void mo10550up() {
        boolean z;
        int i = this.nesting;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.nesting = i - 1;
            this.applier.mo10550up();
            return;
        }
        ComposerKt.composeRuntimeError("OffsetApplier up called with no corresponding down".toString());
        throw new KotlinNothingValueException();
    }
}
