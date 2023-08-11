package androidx.activity;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt$reportWhenComplete$1\n*L\n1#1,192:1\n*E\n"})
@C12739f(mo50609c = "androidx.activity.FullyDrawnReporterKt", mo50610f = "FullyDrawnReporter.kt", mo50611l = {188}, mo50612m = "reportWhenComplete")
/* compiled from: FullyDrawnReporter.kt */
final class FullyDrawnReporterKt$reportWhenComplete$1 extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    FullyDrawnReporterKt$reportWhenComplete$1(C12074d<? super FullyDrawnReporterKt$reportWhenComplete$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FullyDrawnReporterKt.reportWhenComplete((FullyDrawnReporter) null, (Function1<? super C12074d<? super C11921v>, ? extends Object>) null, this);
    }
}
