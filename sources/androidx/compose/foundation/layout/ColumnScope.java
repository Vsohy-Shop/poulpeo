package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.Measured;
import androidx.compose.p002ui.layout.VerticalAlignmentLine;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;

@Immutable
@LayoutScopeMarker
/* compiled from: Column.kt */
public interface ColumnScope {

    /* compiled from: Column.kt */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Modifier weight$default(ColumnScope columnScope, Modifier modifier, float f, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return columnScope.weight(modifier, f, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
    }

    @Stable
    Modifier align(Modifier modifier, Alignment.Horizontal horizontal);

    @Stable
    Modifier alignBy(Modifier modifier, VerticalAlignmentLine verticalAlignmentLine);

    @Stable
    Modifier alignBy(Modifier modifier, Function1<? super Measured, Integer> function1);

    @Stable
    Modifier weight(Modifier modifier, float f, boolean z);
}
