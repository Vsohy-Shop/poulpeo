package androidx.activity;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import p336ef.C11921v;
import p355hf.C12074d;

/* compiled from: FullyDrawnReporter.kt */
public final class FullyDrawnReporterKt {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object reportWhenComplete(androidx.activity.FullyDrawnReporter r4, kotlin.jvm.functions.Function1<? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object> r5, p355hf.C12074d<? super p336ef.C11921v> r6) {
        /*
            boolean r0 = r6 instanceof androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = (androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = new androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.L$0
            androidx.activity.FullyDrawnReporter r4 = (androidx.activity.FullyDrawnReporter) r4
            p336ef.C11910n.m25701b(r6)     // Catch:{ all -> 0x005b }
            goto L_0x004f
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            p336ef.C11910n.m25701b(r6)
            r4.addReporter()
            boolean r6 = r4.isFullyDrawnReported()
            if (r6 == 0) goto L_0x0044
            ef.v r4 = p336ef.C11921v.f18618a
            return r4
        L_0x0044:
            r0.L$0 = r4     // Catch:{ all -> 0x005b }
            r0.label = r3     // Catch:{ all -> 0x005b }
            java.lang.Object r5 = r5.invoke(r0)     // Catch:{ all -> 0x005b }
            if (r5 != r1) goto L_0x004f
            return r1
        L_0x004f:
            kotlin.jvm.internal.C12773m.m28629b(r3)
            r4.removeReporter()
            kotlin.jvm.internal.C12773m.m28628a(r3)
            ef.v r4 = p336ef.C11921v.f18618a
            return r4
        L_0x005b:
            r5 = move-exception
            kotlin.jvm.internal.C12773m.m28629b(r3)
            r4.removeReporter()
            kotlin.jvm.internal.C12773m.m28628a(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.FullyDrawnReporterKt.reportWhenComplete(androidx.activity.FullyDrawnReporter, kotlin.jvm.functions.Function1, hf.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    private static final Object reportWhenComplete$$forInline(FullyDrawnReporter fullyDrawnReporter, Function1<? super C12074d<? super C11921v>, ? extends Object> function1, C12074d<? super C11921v> dVar) {
        fullyDrawnReporter.addReporter();
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return C11921v.f18618a;
        }
        try {
            function1.invoke(dVar);
            C12773m.m28629b(1);
            fullyDrawnReporter.removeReporter();
            C12773m.m28628a(1);
            return C11921v.f18618a;
        } catch (Throwable th) {
            C12773m.m28629b(1);
            fullyDrawnReporter.removeReporter();
            C12773m.m28628a(1);
            throw th;
        }
    }
}
