package androidx.compose.p002ui.text.font;

import androidx.compose.p002ui.text.caches.LruCache;
import androidx.compose.p002ui.text.font.TypefaceResult;
import androidx.compose.p002ui.text.platform.Synchronization_jvmKt;
import androidx.compose.p002ui.text.platform.SynchronizedObject;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,248:1\n24#2:249\n24#2:250\n24#2:251\n24#2:252\n24#2:253\n24#2:254\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n*L\n165#1:249\n202#1:250\n219#1:251\n232#1:252\n239#1:253\n245#1:254\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.TypefaceRequestCache */
/* compiled from: FontFamilyResolver.kt */
public final class TypefaceRequestCache {
    private final SynchronizedObject lock = Synchronization_jvmKt.createSynchronizedObject();
    /* access modifiers changed from: private */
    public final LruCache<TypefaceRequest, TypefaceResult> resultCache = new LruCache<>(16);

    public final TypefaceResult get$ui_text_release(TypefaceRequest typefaceRequest) {
        TypefaceResult typefaceResult;
        C12775o.m28639i(typefaceRequest, "typefaceRequest");
        synchronized (this.lock) {
            typefaceResult = this.resultCache.get(typefaceRequest);
        }
        return typefaceResult;
    }

    public final SynchronizedObject getLock$ui_text_release() {
        return this.lock;
    }

    public final int getSize$ui_text_release() {
        int size;
        synchronized (this.lock) {
            size = this.resultCache.size();
        }
        return size;
    }

    public final void preWarmCache(List<TypefaceRequest> list, Function1<? super TypefaceRequest, ? extends TypefaceResult> function1) {
        TypefaceResult typefaceResult;
        C12775o.m28639i(list, "typefaceRequests");
        C12775o.m28639i(function1, "resolveTypeface");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            TypefaceRequest typefaceRequest = list.get(i);
            synchronized (this.lock) {
                typefaceResult = this.resultCache.get(typefaceRequest);
            }
            if (typefaceResult == null) {
                try {
                    TypefaceResult typefaceResult2 = (TypefaceResult) function1.invoke(typefaceRequest);
                    if (!(typefaceResult2 instanceof TypefaceResult.Async)) {
                        synchronized (this.lock) {
                            TypefaceResult put = this.resultCache.put(typefaceRequest, typefaceResult2);
                        }
                    } else {
                        continue;
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Could not load font", e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r5 = (androidx.compose.p002ui.text.font.TypefaceResult) r5.invoke(new androidx.compose.p002ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1(r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r0 = r3.lock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r3.resultCache.get(r4) != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r5.getCacheable() == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r3.resultCache.put(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        r4 = p336ef.C11921v.f18618a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        throw new java.lang.IllegalStateException("Could not load font", r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.State<java.lang.Object> runCached(androidx.compose.p002ui.text.font.TypefaceRequest r4, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.text.font.TypefaceResult, p336ef.C11921v>, ? extends androidx.compose.p002ui.text.font.TypefaceResult> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "typefaceRequest"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            java.lang.String r0 = "resolveTypeface"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            androidx.compose.ui.text.platform.SynchronizedObject r0 = r3.lock
            monitor-enter(r0)
            androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.font.TypefaceRequest, androidx.compose.ui.text.font.TypefaceResult> r1 = r3.resultCache     // Catch:{ all -> 0x0059 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0059 }
            androidx.compose.ui.text.font.TypefaceResult r1 = (androidx.compose.p002ui.text.font.TypefaceResult) r1     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0027
            boolean r2 = r1.getCacheable()     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x001f
            monitor-exit(r0)
            return r1
        L_0x001f:
            androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.font.TypefaceRequest, androidx.compose.ui.text.font.TypefaceResult> r1 = r3.resultCache     // Catch:{ all -> 0x0059 }
            java.lang.Object r1 = r1.remove(r4)     // Catch:{ all -> 0x0059 }
            androidx.compose.ui.text.font.TypefaceResult r1 = (androidx.compose.p002ui.text.font.TypefaceResult) r1     // Catch:{ all -> 0x0059 }
        L_0x0027:
            monitor-exit(r0)
            androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1 r0 = new androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1     // Catch:{ Exception -> 0x0050 }
            r0.<init>(r3, r4)     // Catch:{ Exception -> 0x0050 }
            java.lang.Object r5 = r5.invoke(r0)     // Catch:{ Exception -> 0x0050 }
            androidx.compose.ui.text.font.TypefaceResult r5 = (androidx.compose.p002ui.text.font.TypefaceResult) r5     // Catch:{ Exception -> 0x0050 }
            androidx.compose.ui.text.platform.SynchronizedObject r0 = r3.lock
            monitor-enter(r0)
            androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.font.TypefaceRequest, androidx.compose.ui.text.font.TypefaceResult> r1 = r3.resultCache     // Catch:{ all -> 0x004d }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x0049
            boolean r1 = r5.getCacheable()     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0049
            androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.font.TypefaceRequest, androidx.compose.ui.text.font.TypefaceResult> r1 = r3.resultCache     // Catch:{ all -> 0x004d }
            r1.put(r4, r5)     // Catch:{ all -> 0x004d }
        L_0x0049:
            ef.v r4 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x004d }
            monitor-exit(r0)
            return r5
        L_0x004d:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L_0x0050:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not load font"
            r5.<init>(r0, r4)
            throw r5
        L_0x0059:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.font.TypefaceRequestCache.runCached(androidx.compose.ui.text.font.TypefaceRequest, kotlin.jvm.functions.Function1):androidx.compose.runtime.State");
    }
}
