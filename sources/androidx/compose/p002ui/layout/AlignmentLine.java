package androidx.compose.p002ui.layout;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13088o;

@Immutable
/* renamed from: androidx.compose.ui.layout.AlignmentLine */
/* compiled from: AlignmentLine.kt */
public abstract class AlignmentLine {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int Unspecified = Integer.MIN_VALUE;
    private final C13088o<Integer, Integer, Integer> merger;

    /* renamed from: androidx.compose.ui.layout.AlignmentLine$Companion */
    /* compiled from: AlignmentLine.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AlignmentLine(C13088o oVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar);
    }

    public final C13088o<Integer, Integer, Integer> getMerger$ui_release() {
        return this.merger;
    }

    private AlignmentLine(C13088o<? super Integer, ? super Integer, Integer> oVar) {
        this.merger = oVar;
    }
}
