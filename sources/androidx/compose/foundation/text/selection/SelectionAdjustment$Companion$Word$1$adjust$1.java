package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextRange;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12771l;

/* compiled from: SelectionAdjustment.kt */
/* synthetic */ class SelectionAdjustment$Companion$Word$1$adjust$1 extends C12771l implements Function1<Integer, TextRange> {
    SelectionAdjustment$Companion$Word$1$adjust$1(Object obj) {
        super(1, obj, TextLayoutResult.class, "getWordBoundary", "getWordBoundary--jx7JFs(I)J", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return TextRange.m37963boximpl(m33781invokejx7JFs(((Number) obj).intValue()));
    }

    /* renamed from: invoke--jx7JFs  reason: not valid java name */
    public final long m33781invokejx7JFs(int i) {
        return ((TextLayoutResult) this.receiver).m37949getWordBoundaryjx7JFs(i);
    }
}
