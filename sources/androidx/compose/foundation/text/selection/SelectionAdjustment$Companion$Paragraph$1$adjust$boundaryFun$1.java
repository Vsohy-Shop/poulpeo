package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.p002ui.text.TextRange;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12771l;

/* compiled from: SelectionAdjustment.kt */
/* synthetic */ class SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1 extends C12771l implements Function1<Integer, TextRange> {
    SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1(Object obj) {
        super(1, obj, StringHelpersKt.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return TextRange.m37963boximpl(m33779invokejx7JFs(((Number) obj).intValue()));
    }

    /* renamed from: invoke--jx7JFs  reason: not valid java name */
    public final long m33779invokejx7JFs(int i) {
        return StringHelpersKt.getParagraphBoundary((CharSequence) this.receiver, i);
    }
}
