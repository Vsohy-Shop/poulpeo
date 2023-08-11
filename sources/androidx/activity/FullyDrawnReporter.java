package androidx.activity;

import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,192:1\n1#2:193\n1855#3,2:194\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n157#1:194,2\n*E\n"})
/* compiled from: FullyDrawnReporter.kt */
public final class FullyDrawnReporter {
    private final Executor executor;
    private final Object lock = new Object();
    @GuardedBy("lock")
    private final List<C13074a<C11921v>> onReportCallbacks = new ArrayList();
    private final C13074a<C11921v> reportFullyDrawn;
    @GuardedBy("lock")
    private boolean reportPosted;
    private final Runnable reportRunnable = new C0115j(this);
    @GuardedBy("lock")
    private boolean reportedFullyDrawn;
    @GuardedBy("lock")
    private int reporterCount;

    public FullyDrawnReporter(Executor executor2, C13074a<C11921v> aVar) {
        C12775o.m28639i(executor2, "executor");
        C12775o.m28639i(aVar, "reportFullyDrawn");
        this.executor = executor2;
        this.reportFullyDrawn = aVar;
    }

    private final void postWhenReportersAreDone() {
        if (!this.reportPosted && this.reporterCount == 0) {
            this.reportPosted = true;
            this.executor.execute(this.reportRunnable);
        }
    }

    /* access modifiers changed from: private */
    public static final void reportRunnable$lambda$2(FullyDrawnReporter fullyDrawnReporter) {
        C12775o.m28639i(fullyDrawnReporter, "this$0");
        synchronized (fullyDrawnReporter.lock) {
            fullyDrawnReporter.reportPosted = false;
            if (fullyDrawnReporter.reporterCount == 0 && !fullyDrawnReporter.reportedFullyDrawn) {
                fullyDrawnReporter.reportFullyDrawn.invoke();
                fullyDrawnReporter.fullyDrawnReported();
            }
            C11921v vVar = C11921v.f18618a;
        }
    }

    public final void addOnReportDrawnListener(C13074a<C11921v> aVar) {
        boolean z;
        C12775o.m28639i(aVar, "callback");
        synchronized (this.lock) {
            if (this.reportedFullyDrawn) {
                z = true;
            } else {
                this.onReportCallbacks.add(aVar);
                z = false;
            }
        }
        if (z) {
            aVar.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn) {
                this.reporterCount++;
            }
            C11921v vVar = C11921v.f18618a;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void fullyDrawnReported() {
        synchronized (this.lock) {
            this.reportedFullyDrawn = true;
            for (C13074a invoke : this.onReportCallbacks) {
                invoke.invoke();
            }
            this.onReportCallbacks.clear();
            C11921v vVar = C11921v.f18618a;
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z;
        synchronized (this.lock) {
            z = this.reportedFullyDrawn;
        }
        return z;
    }

    public final void removeOnReportDrawnListener(C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "callback");
        synchronized (this.lock) {
            this.onReportCallbacks.remove(aVar);
            C11921v vVar = C11921v.f18618a;
        }
    }

    public final void removeReporter() {
        boolean z;
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn) {
                int i = this.reporterCount;
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.reporterCount = i - 1;
                    postWhenReportersAreDone();
                } else {
                    throw new IllegalStateException("removeReporter() called when all reporters have already been removed.".toString());
                }
            }
            C11921v vVar = C11921v.f18618a;
        }
    }
}
