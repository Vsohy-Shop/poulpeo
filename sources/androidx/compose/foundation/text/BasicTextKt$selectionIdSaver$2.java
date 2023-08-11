package androidx.compose.foundation.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: BasicText.kt */
final class BasicTextKt$selectionIdSaver$2 extends C12777p implements Function1<Long, Long> {
    public static final BasicTextKt$selectionIdSaver$2 INSTANCE = new BasicTextKt$selectionIdSaver$2();

    BasicTextKt$selectionIdSaver$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }

    public final Long invoke(long j) {
        return Long.valueOf(j);
    }
}
