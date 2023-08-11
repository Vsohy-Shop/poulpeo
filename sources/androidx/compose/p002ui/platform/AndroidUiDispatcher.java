package androidx.compose.p002ui.platform;

import android.os.Handler;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.C12699k;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12079g;
import p466yf.C13971h0;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n34#2:192\n34#2:193\n34#2:194\n34#2:195\n34#2:196\n34#2:197\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n*L\n73#1:192\n89#1:193\n99#1:194\n115#1:195\n125#1:196\n137#1:197\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher */
/* compiled from: AndroidUiDispatcher.android.kt */
public final class AndroidUiDispatcher extends C13971h0 {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Lazy<C12079g> Main$delegate = C11901h.m25690b(AndroidUiDispatcher$Companion$Main$2.INSTANCE);
    /* access modifiers changed from: private */
    public static final ThreadLocal<C12079g> currentThread = new AndroidUiDispatcher$Companion$currentThread$1();
    private final Choreographer choreographer;
    private final AndroidUiDispatcher$dispatchCallback$1 dispatchCallback;
    private final MonotonicFrameClock frameClock;
    /* access modifiers changed from: private */
    public final Handler handler;
    /* access modifiers changed from: private */
    public final Object lock;
    /* access modifiers changed from: private */
    public boolean scheduledFrameDispatch;
    private boolean scheduledTrampolineDispatch;
    private List<Choreographer.FrameCallback> spareToRunOnFrame;
    /* access modifiers changed from: private */
    public List<Choreographer.FrameCallback> toRunOnFrame;
    private final C12699k<Runnable> toRunTrampolined;

    /* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$Companion */
    /* compiled from: AndroidUiDispatcher.android.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C12079g getCurrentThread() {
            if (AndroidUiDispatcher_androidKt.isMainThread()) {
                return getMain();
            }
            C12079g gVar = (C12079g) AndroidUiDispatcher.currentThread.get();
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        public final C12079g getMain() {
            return (C12079g) AndroidUiDispatcher.Main$delegate.getValue();
        }
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer2, Handler handler2, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer2, handler2);
    }

    private final Runnable nextTask() {
        Runnable v;
        synchronized (this.lock) {
            v = this.toRunTrampolined.mo50587v();
        }
        return v;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r0 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r1 >= r0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        r2.get(r1).doFrame(r5);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r2.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void performFrameDispatch(long r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.lock
            monitor-enter(r0)
            boolean r1 = r4.scheduledFrameDispatch     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            r1 = 0
            r4.scheduledFrameDispatch = r1     // Catch:{ all -> 0x002b }
            java.util.List<android.view.Choreographer$FrameCallback> r2 = r4.toRunOnFrame     // Catch:{ all -> 0x002b }
            java.util.List<android.view.Choreographer$FrameCallback> r3 = r4.spareToRunOnFrame     // Catch:{ all -> 0x002b }
            r4.toRunOnFrame = r3     // Catch:{ all -> 0x002b }
            r4.spareToRunOnFrame = r2     // Catch:{ all -> 0x002b }
            monitor-exit(r0)
            int r0 = r2.size()
        L_0x0019:
            if (r1 >= r0) goto L_0x0027
            java.lang.Object r3 = r2.get(r1)
            android.view.Choreographer$FrameCallback r3 = (android.view.Choreographer.FrameCallback) r3
            r3.doFrame(r5)
            int r1 = r1 + 1
            goto L_0x0019
        L_0x0027:
            r2.clear()
            return
        L_0x002b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AndroidUiDispatcher.performFrameDispatch(long):void");
    }

    /* access modifiers changed from: private */
    public final void performTrampolineDispatch() {
        boolean z;
        do {
            Runnable nextTask = nextTask();
            while (nextTask != null) {
                nextTask.run();
                nextTask = nextTask();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    public void dispatch(C12079g gVar, Runnable runnable) {
        C12775o.m28639i(gVar, "context");
        C12775o.m28639i(runnable, "block");
        synchronized (this.lock) {
            this.toRunTrampolined.addLast(runnable);
            if (!this.scheduledTrampolineDispatch) {
                this.scheduledTrampolineDispatch = true;
                this.handler.post(this.dispatchCallback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
            }
            C11921v vVar = C11921v.f18618a;
        }
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    public final MonotonicFrameClock getFrameClock() {
        return this.frameClock;
    }

    public final void postFrameCallback$ui_release(Choreographer.FrameCallback frameCallback) {
        C12775o.m28639i(frameCallback, "callback");
        synchronized (this.lock) {
            this.toRunOnFrame.add(frameCallback);
            if (!this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = true;
                this.choreographer.postFrameCallback(this.dispatchCallback);
            }
            C11921v vVar = C11921v.f18618a;
        }
    }

    public final void removeFrameCallback$ui_release(Choreographer.FrameCallback frameCallback) {
        C12775o.m28639i(frameCallback, "callback");
        synchronized (this.lock) {
            this.toRunOnFrame.remove(frameCallback);
        }
    }

    private AndroidUiDispatcher(Choreographer choreographer2, Handler handler2) {
        this.choreographer = choreographer2;
        this.handler = handler2;
        this.lock = new Object();
        this.toRunTrampolined = new C12699k<>();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new AndroidUiDispatcher$dispatchCallback$1(this);
        this.frameClock = new AndroidUiFrameClock(choreographer2);
    }
}
