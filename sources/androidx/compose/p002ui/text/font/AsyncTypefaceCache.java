package androidx.compose.p002ui.text.font;

import androidx.compose.p002ui.text.caches.LruCache;
import androidx.compose.p002ui.text.caches.SimpleArrayMap;
import androidx.compose.p002ui.text.platform.Synchronization_jvmKt;
import androidx.compose.p002ui.text.platform.SynchronizedObject;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,427:1\n24#2:428\n24#2:429\n24#2:430\n24#2:431\n24#2:432\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n*L\n365#1:428\n376#1:429\n388#1:430\n395#1:431\n416#1:432\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
public final class AsyncTypefaceCache {
    private final Object PermanentFailure = AsyncTypefaceResult.m38017constructorimpl((Object) null);
    /* access modifiers changed from: private */
    public final SynchronizedObject cacheLock = Synchronization_jvmKt.createSynchronizedObject();
    /* access modifiers changed from: private */
    public final SimpleArrayMap<Key, AsyncTypefaceResult> permanentCache = new SimpleArrayMap<>(0, 1, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final LruCache<Key, AsyncTypefaceResult> resultCache = new LruCache<>(16);

    /* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$Key */
    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    public static final class Key {
        private final Font font;
        private final Object loaderKey;

        public Key(Font font2, Object obj) {
            C12775o.m28639i(font2, "font");
            this.font = font2;
            this.loaderKey = obj;
        }

        public static /* synthetic */ Key copy$default(Key key, Font font2, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                font2 = key.font;
            }
            if ((i & 2) != 0) {
                obj = key.loaderKey;
            }
            return key.copy(font2, obj);
        }

        public final Font component1() {
            return this.font;
        }

        public final Object component2() {
            return this.loaderKey;
        }

        public final Key copy(Font font2, Object obj) {
            C12775o.m28639i(font2, "font");
            return new Key(font2, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            if (C12775o.m28634d(this.font, key.font) && C12775o.m28634d(this.loaderKey, key.loaderKey)) {
                return true;
            }
            return false;
        }

        public final Font getFont() {
            return this.font;
        }

        public final Object getLoaderKey() {
            return this.loaderKey;
        }

        public int hashCode() {
            int i;
            int hashCode = this.font.hashCode() * 31;
            Object obj = this.loaderKey;
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }
    }

    public static /* synthetic */ void put$default(AsyncTypefaceCache asyncTypefaceCache, Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        asyncTypefaceCache.put(font, platformFontLoader, obj, z);
    }

    /* renamed from: get-1ASDuI8  reason: not valid java name */
    public final AsyncTypefaceResult m38015get1ASDuI8(Font font, PlatformFontLoader platformFontLoader) {
        AsyncTypefaceResult asyncTypefaceResult;
        C12775o.m28639i(font, "font");
        C12775o.m28639i(platformFontLoader, "platformFontLoader");
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            asyncTypefaceResult = this.resultCache.get(key);
            if (asyncTypefaceResult == null) {
                asyncTypefaceResult = this.permanentCache.get(key);
            }
        }
        return asyncTypefaceResult;
    }

    public final void put(Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z) {
        C12775o.m28639i(font, "font");
        C12775o.m28639i(platformFontLoader, "platformFontLoader");
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            if (obj == null) {
                try {
                    AsyncTypefaceResult put = this.permanentCache.put(key, AsyncTypefaceResult.m38016boximpl(this.PermanentFailure));
                } catch (Throwable th) {
                    throw th;
                }
            } else if (z) {
                AsyncTypefaceResult put2 = this.permanentCache.put(key, AsyncTypefaceResult.m38016boximpl(AsyncTypefaceResult.m38017constructorimpl(obj)));
            } else {
                AsyncTypefaceResult put3 = this.resultCache.put(key, AsyncTypefaceResult.m38016boximpl(AsyncTypefaceResult.m38017constructorimpl(obj)));
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public final java.lang.Object runCached(androidx.compose.p002ui.text.font.Font r6, androidx.compose.p002ui.text.font.PlatformFontLoader r7, boolean r8, kotlin.jvm.functions.Function1<? super p355hf.C12074d<java.lang.Object>, ? extends java.lang.Object> r9, p355hf.C12074d<java.lang.Object> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.p002ui.text.font.AsyncTypefaceCache$runCached$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = (androidx.compose.p002ui.text.font.AsyncTypefaceCache$runCached$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r5, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            boolean r8 = r0.Z$0
            java.lang.Object r6 = r0.L$1
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r6 = (androidx.compose.p002ui.text.font.AsyncTypefaceCache.Key) r6
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.text.font.AsyncTypefaceCache r7 = (androidx.compose.p002ui.text.font.AsyncTypefaceCache) r7
            p336ef.C11910n.m25701b(r10)
            goto L_0x007a
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            p336ef.C11910n.m25701b(r10)
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r10 = new androidx.compose.ui.text.font.AsyncTypefaceCache$Key
            java.lang.Object r7 = r7.getCacheKey()
            r10.<init>(r6, r7)
            androidx.compose.ui.text.platform.SynchronizedObject r6 = r5.cacheLock
            monitor-enter(r6)
            androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r5.resultCache     // Catch:{ all -> 0x00b0 }
            java.lang.Object r7 = r7.get(r10)     // Catch:{ all -> 0x00b0 }
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = (androidx.compose.p002ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r7     // Catch:{ all -> 0x00b0 }
            if (r7 != 0) goto L_0x005c
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r5.permanentCache     // Catch:{ all -> 0x00b0 }
            java.lang.Object r7 = r7.get(r10)     // Catch:{ all -> 0x00b0 }
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = (androidx.compose.p002ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r7     // Catch:{ all -> 0x00b0 }
        L_0x005c:
            if (r7 == 0) goto L_0x0064
            java.lang.Object r7 = r7.m38023unboximpl()     // Catch:{ all -> 0x00b0 }
            monitor-exit(r6)
            return r7
        L_0x0064:
            ef.v r7 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x00b0 }
            monitor-exit(r6)
            r0.L$0 = r5
            r0.L$1 = r10
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L_0x007a:
            androidx.compose.ui.text.platform.SynchronizedObject r9 = r7.cacheLock
            monitor-enter(r9)
            if (r10 != 0) goto L_0x008d
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r8 = r7.permanentCache     // Catch:{ all -> 0x008b }
            java.lang.Object r7 = r7.PermanentFailure     // Catch:{ all -> 0x008b }
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = androidx.compose.p002ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m38016boximpl(r7)     // Catch:{ all -> 0x008b }
            r8.put(r6, r7)     // Catch:{ all -> 0x008b }
            goto L_0x00aa
        L_0x008b:
            r6 = move-exception
            goto L_0x00ae
        L_0x008d:
            if (r8 == 0) goto L_0x009d
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r7.permanentCache     // Catch:{ all -> 0x008b }
            java.lang.Object r8 = androidx.compose.p002ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m38017constructorimpl(r10)     // Catch:{ all -> 0x008b }
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r8 = androidx.compose.p002ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m38016boximpl(r8)     // Catch:{ all -> 0x008b }
            r7.put(r6, r8)     // Catch:{ all -> 0x008b }
            goto L_0x00aa
        L_0x009d:
            androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r7.resultCache     // Catch:{ all -> 0x008b }
            java.lang.Object r8 = androidx.compose.p002ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m38017constructorimpl(r10)     // Catch:{ all -> 0x008b }
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r8 = androidx.compose.p002ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m38016boximpl(r8)     // Catch:{ all -> 0x008b }
            r7.put(r6, r8)     // Catch:{ all -> 0x008b }
        L_0x00aa:
            ef.v r6 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x008b }
            monitor-exit(r9)
            return r10
        L_0x00ae:
            monitor-exit(r9)
            throw r6
        L_0x00b0:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.font.AsyncTypefaceCache.runCached(androidx.compose.ui.text.font.Font, androidx.compose.ui.text.font.PlatformFontLoader, boolean, kotlin.jvm.functions.Function1, hf.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object runCachedBlocking(androidx.compose.p002ui.text.font.Font r11, androidx.compose.p002ui.text.font.PlatformFontLoader r12, p404of.C13074a<? extends java.lang.Object> r13) {
        /*
            r10 = this;
            java.lang.String r0 = "font"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.lang.String r0 = "platformFontLoader"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            androidx.compose.ui.text.platform.SynchronizedObject r0 = r10.cacheLock
            monitor-enter(r0)
            r1 = 1
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r2 = new androidx.compose.ui.text.font.AsyncTypefaceCache$Key     // Catch:{ all -> 0x005d }
            java.lang.Object r3 = r12.getCacheKey()     // Catch:{ all -> 0x005d }
            r2.<init>(r11, r3)     // Catch:{ all -> 0x005d }
            androidx.compose.ui.text.caches.LruCache r3 = r10.resultCache     // Catch:{ all -> 0x005d }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x005d }
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r3 = (androidx.compose.p002ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r3     // Catch:{ all -> 0x005d }
            if (r3 != 0) goto L_0x0035
            androidx.compose.ui.text.caches.SimpleArrayMap r3 = r10.permanentCache     // Catch:{ all -> 0x005d }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x005d }
            r3 = r2
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r3 = (androidx.compose.p002ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r3     // Catch:{ all -> 0x005d }
        L_0x0035:
            if (r3 == 0) goto L_0x0044
            java.lang.Object r11 = r3.m38023unboximpl()     // Catch:{ all -> 0x005d }
            r12 = 2
            kotlin.jvm.internal.C12773m.m28629b(r12)
            monitor-exit(r0)
            kotlin.jvm.internal.C12773m.m28628a(r12)
            return r11
        L_0x0044:
            ef.v r2 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x005d }
            kotlin.jvm.internal.C12773m.m28629b(r1)
            monitor-exit(r0)
            kotlin.jvm.internal.C12773m.m28628a(r1)
            java.lang.Object r13 = r13.invoke()
            r7 = 0
            r8 = 8
            r9 = 0
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            put$default(r3, r4, r5, r6, r7, r8, r9)
            return r13
        L_0x005d:
            r11 = move-exception
            kotlin.jvm.internal.C12773m.m28629b(r1)
            monitor-exit(r0)
            kotlin.jvm.internal.C12773m.m28628a(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.font.AsyncTypefaceCache.runCachedBlocking(androidx.compose.ui.text.font.Font, androidx.compose.ui.text.font.PlatformFontLoader, of.a):java.lang.Object");
    }

    /* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult */
    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    public static final class AsyncTypefaceResult {
        private final Object result;

        private /* synthetic */ AsyncTypefaceResult(Object obj) {
            this.result = obj;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ AsyncTypefaceResult m38016boximpl(Object obj) {
            return new AsyncTypefaceResult(obj);
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m38018equalsimpl(Object obj, Object obj2) {
            if ((obj2 instanceof AsyncTypefaceResult) && C12775o.m28634d(obj, ((AsyncTypefaceResult) obj2).m38023unboximpl())) {
                return true;
            }
            return false;
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m38019equalsimpl0(Object obj, Object obj2) {
            return C12775o.m28634d(obj, obj2);
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m38020hashCodeimpl(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* renamed from: isPermanentFailure-impl  reason: not valid java name */
        public static final boolean m38021isPermanentFailureimpl(Object obj) {
            if (obj == null) {
                return true;
            }
            return false;
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m38022toStringimpl(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return m38018equalsimpl(this.result, obj);
        }

        public final Object getResult() {
            return this.result;
        }

        public int hashCode() {
            return m38020hashCodeimpl(this.result);
        }

        public String toString() {
            return m38022toStringimpl(this.result);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ Object m38023unboximpl() {
            return this.result;
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static Object m38017constructorimpl(Object obj) {
            return obj;
        }
    }
}
