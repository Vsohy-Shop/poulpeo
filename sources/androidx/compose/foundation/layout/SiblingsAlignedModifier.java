package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineProvider;
import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.Measured;
import androidx.compose.p002ui.layout.ParentDataModifier;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* compiled from: RowColumnImpl.kt */
public abstract class SiblingsAlignedModifier extends InspectorValueInfo implements ParentDataModifier {

    /* compiled from: RowColumnImpl.kt */
    public static final class WithAlignmentLine extends SiblingsAlignedModifier {
        private final AlignmentLine alignmentLine;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public WithAlignmentLine(AlignmentLine alignmentLine2, Function1<? super InspectorInfo, C11921v> function1) {
            super(function1, (DefaultConstructorMarker) null);
            C12775o.m28639i(alignmentLine2, "alignmentLine");
            C12775o.m28639i(function1, "inspectorInfo");
            this.alignmentLine = alignmentLine2;
        }

        public boolean equals(Object obj) {
            WithAlignmentLine withAlignmentLine;
            if (this == obj) {
                return true;
            }
            if (obj instanceof WithAlignmentLine) {
                withAlignmentLine = (WithAlignmentLine) obj;
            } else {
                withAlignmentLine = null;
            }
            if (withAlignmentLine == null) {
                return false;
            }
            return C12775o.m28634d(this.alignmentLine, withAlignmentLine.alignmentLine);
        }

        public final AlignmentLine getAlignmentLine() {
            return this.alignmentLine;
        }

        public int hashCode() {
            return this.alignmentLine.hashCode();
        }

        public Object modifyParentData(Density density, Object obj) {
            RowColumnParentData rowColumnParentData;
            C12775o.m28639i(density, "<this>");
            if (obj instanceof RowColumnParentData) {
                rowColumnParentData = (RowColumnParentData) obj;
            } else {
                rowColumnParentData = null;
            }
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, (CrossAxisAlignment) null, 7, (DefaultConstructorMarker) null);
            }
            rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.Relative$foundation_layout_release(new AlignmentLineProvider.Value(this.alignmentLine)));
            return rowColumnParentData;
        }

        public String toString() {
            return "WithAlignmentLine(line=" + this.alignmentLine + ')';
        }
    }

    /* compiled from: RowColumnImpl.kt */
    public static final class WithAlignmentLineBlock extends SiblingsAlignedModifier {
        private final Function1<Measured, Integer> block;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public WithAlignmentLineBlock(Function1<? super Measured, Integer> function1, Function1<? super InspectorInfo, C11921v> function12) {
            super(function12, (DefaultConstructorMarker) null);
            C12775o.m28639i(function1, "block");
            C12775o.m28639i(function12, "inspectorInfo");
            this.block = function1;
        }

        public boolean equals(Object obj) {
            WithAlignmentLineBlock withAlignmentLineBlock;
            if (this == obj) {
                return true;
            }
            if (obj instanceof WithAlignmentLineBlock) {
                withAlignmentLineBlock = (WithAlignmentLineBlock) obj;
            } else {
                withAlignmentLineBlock = null;
            }
            if (withAlignmentLineBlock == null) {
                return false;
            }
            return C12775o.m28634d(this.block, withAlignmentLineBlock.block);
        }

        public final Function1<Measured, Integer> getBlock() {
            return this.block;
        }

        public int hashCode() {
            return this.block.hashCode();
        }

        public Object modifyParentData(Density density, Object obj) {
            RowColumnParentData rowColumnParentData;
            C12775o.m28639i(density, "<this>");
            if (obj instanceof RowColumnParentData) {
                rowColumnParentData = (RowColumnParentData) obj;
            } else {
                rowColumnParentData = null;
            }
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, (CrossAxisAlignment) null, 7, (DefaultConstructorMarker) null);
            }
            rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.Relative$foundation_layout_release(new AlignmentLineProvider.Block(this.block)));
            return rowColumnParentData;
        }

        public String toString() {
            return "WithAlignmentLineBlock(block=" + this.block + ')';
        }
    }

    public /* synthetic */ SiblingsAlignedModifier(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }

    public abstract Object modifyParentData(Density density, Object obj);

    private SiblingsAlignedModifier(Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
    }
}
