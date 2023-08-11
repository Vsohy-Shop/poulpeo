package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.Measured;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: RowColumnImpl.kt */
public abstract class AlignmentLineProvider {

    @StabilityInferred(parameters = 0)
    /* compiled from: RowColumnImpl.kt */
    public static final class Block extends AlignmentLineProvider {
        public static final int $stable = 0;
        private final Function1<Measured, Integer> lineProviderBlock;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Block(Function1<? super Measured, Integer> function1) {
            super((DefaultConstructorMarker) null);
            C12775o.m28639i(function1, "lineProviderBlock");
            this.lineProviderBlock = function1;
        }

        public static /* synthetic */ Block copy$default(Block block, Function1<Measured, Integer> function1, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = block.lineProviderBlock;
            }
            return block.copy(function1);
        }

        public int calculateAlignmentLinePosition(Placeable placeable) {
            C12775o.m28639i(placeable, "placeable");
            return this.lineProviderBlock.invoke(placeable).intValue();
        }

        public final Function1<Measured, Integer> component1() {
            return this.lineProviderBlock;
        }

        public final Block copy(Function1<? super Measured, Integer> function1) {
            C12775o.m28639i(function1, "lineProviderBlock");
            return new Block(function1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Block) && C12775o.m28634d(this.lineProviderBlock, ((Block) obj).lineProviderBlock)) {
                return true;
            }
            return false;
        }

        public final Function1<Measured, Integer> getLineProviderBlock() {
            return this.lineProviderBlock;
        }

        public int hashCode() {
            return this.lineProviderBlock.hashCode();
        }

        public String toString() {
            return "Block(lineProviderBlock=" + this.lineProviderBlock + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: RowColumnImpl.kt */
    public static final class Value extends AlignmentLineProvider {
        public static final int $stable = 0;
        private final AlignmentLine alignmentLine;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Value(AlignmentLine alignmentLine2) {
            super((DefaultConstructorMarker) null);
            C12775o.m28639i(alignmentLine2, "alignmentLine");
            this.alignmentLine = alignmentLine2;
        }

        public static /* synthetic */ Value copy$default(Value value, AlignmentLine alignmentLine2, int i, Object obj) {
            if ((i & 1) != 0) {
                alignmentLine2 = value.alignmentLine;
            }
            return value.copy(alignmentLine2);
        }

        public int calculateAlignmentLinePosition(Placeable placeable) {
            C12775o.m28639i(placeable, "placeable");
            return placeable.get(this.alignmentLine);
        }

        public final AlignmentLine component1() {
            return this.alignmentLine;
        }

        public final Value copy(AlignmentLine alignmentLine2) {
            C12775o.m28639i(alignmentLine2, "alignmentLine");
            return new Value(alignmentLine2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Value) && C12775o.m28634d(this.alignmentLine, ((Value) obj).alignmentLine)) {
                return true;
            }
            return false;
        }

        public final AlignmentLine getAlignmentLine() {
            return this.alignmentLine;
        }

        public int hashCode() {
            return this.alignmentLine.hashCode();
        }

        public String toString() {
            return "Value(alignmentLine=" + this.alignmentLine + ')';
        }
    }

    private AlignmentLineProvider() {
    }

    public /* synthetic */ AlignmentLineProvider(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int calculateAlignmentLinePosition(Placeable placeable);
}
