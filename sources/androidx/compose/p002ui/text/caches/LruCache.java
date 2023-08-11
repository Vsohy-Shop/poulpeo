package androidx.compose.p002ui.text.caches;

import androidx.compose.p002ui.text.platform.Synchronization_jvmKt;
import androidx.compose.p002ui.text.platform.SynchronizedObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,352:1\n349#1:353\n349#1:362\n349#1:364\n349#1:366\n349#1:368\n349#1:370\n349#1:372\n24#2:354\n24#2:356\n24#2:357\n24#2:358\n24#2:359\n24#2:360\n24#2:361\n24#2:363\n24#2:365\n24#2:367\n24#2:369\n24#2:371\n24#2:373\n24#2:374\n24#2:375\n24#2:376\n1#3:355\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n*L\n41#1:353\n296#1:362\n302#1:364\n308#1:366\n313#1:368\n318#1:370\n323#1:372\n41#1:354\n72#1:356\n87#1:357\n105#1:358\n143#1:359\n177#1:360\n219#1:361\n296#1:363\n302#1:365\n308#1:367\n313#1:369\n318#1:371\n323#1:373\n330#1:374\n340#1:375\n349#1:376\n*E\n"})
/* renamed from: androidx.compose.ui.text.caches.LruCache */
/* compiled from: LruCache.kt */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashSet<K> keySet;
    private final HashMap<K, V> map;
    private int maxSize;
    private int missCount;
    /* access modifiers changed from: private */
    public final SynchronizedObject monitor = Synchronization_jvmKt.createSynchronizedObject();
    private int putCount;
    private int size;

    public LruCache(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.maxSize = i;
            this.map = new HashMap<>(0, 0.75f);
            this.keySet = new LinkedHashSet<>();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    private final int safeSizeOf(K k, V v) {
        boolean z;
        int sizeOf = sizeOf(k, v);
        if (sizeOf >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return sizeOf;
        }
        throw new IllegalStateException(("Negative size: " + k + '=' + v).toString());
    }

    /* access modifiers changed from: protected */
    public V create(K k) {
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this.monitor) {
            i = this.createCount;
        }
        return i;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.monitor) {
            i = this.evictionCount;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r0 = create(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r2 = r5.monitor;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r5.createCount++;
        r3 = r5.map.put(r6, r0);
        r5.keySet.remove(r6);
        r5.keySet.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r3 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        r5.map.put(r6, r3);
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r5.size = size() + safeSizeOf(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        r3 = p336ef.C11921v.f18618a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r1 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        entryRemoved(false, r6, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        trimToSize(r5.maxSize);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(K r6) {
        /*
            r5 = this;
            androidx.compose.ui.text.platform.SynchronizedObject r0 = r5.monitor
            monitor-enter(r0)
            java.util.HashMap<K, V> r1 = r5.map     // Catch:{ all -> 0x006c }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x001d
            java.util.LinkedHashSet<K> r2 = r5.keySet     // Catch:{ all -> 0x006c }
            r2.remove(r6)     // Catch:{ all -> 0x006c }
            java.util.LinkedHashSet<K> r2 = r5.keySet     // Catch:{ all -> 0x006c }
            r2.add(r6)     // Catch:{ all -> 0x006c }
            int r6 = r5.hitCount     // Catch:{ all -> 0x006c }
            int r6 = r6 + 1
            r5.hitCount = r6     // Catch:{ all -> 0x006c }
            monitor-exit(r0)
            return r1
        L_0x001d:
            int r2 = r5.missCount     // Catch:{ all -> 0x006c }
            int r2 = r2 + 1
            r5.missCount = r2     // Catch:{ all -> 0x006c }
            monitor-exit(r0)
            java.lang.Object r0 = r5.create(r6)
            if (r0 != 0) goto L_0x002c
            r6 = 0
            return r6
        L_0x002c:
            androidx.compose.ui.text.platform.SynchronizedObject r2 = r5.monitor
            monitor-enter(r2)
            int r3 = r5.createCount     // Catch:{ all -> 0x0069 }
            int r3 = r3 + 1
            r5.createCount = r3     // Catch:{ all -> 0x0069 }
            java.util.HashMap<K, V> r3 = r5.map     // Catch:{ all -> 0x0069 }
            java.lang.Object r3 = r3.put(r6, r0)     // Catch:{ all -> 0x0069 }
            java.util.LinkedHashSet<K> r4 = r5.keySet     // Catch:{ all -> 0x0069 }
            r4.remove(r6)     // Catch:{ all -> 0x0069 }
            java.util.LinkedHashSet<K> r4 = r5.keySet     // Catch:{ all -> 0x0069 }
            r4.add(r6)     // Catch:{ all -> 0x0069 }
            if (r3 == 0) goto L_0x004e
            java.util.HashMap<K, V> r1 = r5.map     // Catch:{ all -> 0x0069 }
            r1.put(r6, r3)     // Catch:{ all -> 0x0069 }
            r1 = r3
            goto L_0x0059
        L_0x004e:
            int r3 = r5.size()     // Catch:{ all -> 0x0069 }
            int r4 = r5.safeSizeOf(r6, r0)     // Catch:{ all -> 0x0069 }
            int r3 = r3 + r4
            r5.size = r3     // Catch:{ all -> 0x0069 }
        L_0x0059:
            ef.v r3 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0069 }
            monitor-exit(r2)
            if (r1 == 0) goto L_0x0063
            r2 = 0
            r5.entryRemoved(r2, r6, r0, r1)
            return r1
        L_0x0063:
            int r6 = r5.maxSize
            r5.trimToSize(r6)
            return r0
        L_0x0069:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        L_0x006c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.caches.LruCache.get(java.lang.Object):java.lang.Object");
    }

    public final int hitCount() {
        int i;
        synchronized (this.monitor) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.monitor) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.monitor) {
            i = this.missCount;
        }
        return i;
    }

    public final V put(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw null;
        }
        synchronized (this.monitor) {
            this.putCount++;
            this.size = size() + safeSizeOf(k, v);
            put = this.map.put(k, v);
            if (put != null) {
                this.size = size() - safeSizeOf(k, put);
            }
            if (this.keySet.contains(k)) {
                this.keySet.remove(k);
            }
            this.keySet.add(k);
        }
        if (put != null) {
            entryRemoved(false, k, put, v);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final int putCount() {
        int i;
        synchronized (this.monitor) {
            i = this.putCount;
        }
        return i;
    }

    public final V remove(K k) {
        V remove;
        k.getClass();
        synchronized (this.monitor) {
            remove = this.map.remove(k);
            this.keySet.remove(k);
            if (remove != null) {
                this.size = size() - safeSizeOf(k, remove);
            }
            C11921v vVar = C11921v.f18618a;
        }
        if (remove != null) {
            entryRemoved(false, k, remove, (V) null);
        }
        return remove;
    }

    public void resize(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            synchronized (this.monitor) {
                this.maxSize = i;
                C11921v vVar = C11921v.f18618a;
            }
            trimToSize(i);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public final int size() {
        int i;
        synchronized (this.monitor) {
            i = this.size;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public int sizeOf(K k, V v) {
        return 1;
    }

    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.monitor) {
            linkedHashMap = new LinkedHashMap();
            Iterator<K> it = this.keySet.iterator();
            while (it.hasNext()) {
                K next = it.next();
                V v = this.map.get(next);
                C12775o.m28636f(v);
                linkedHashMap.put(next, v);
            }
        }
        return linkedHashMap;
    }

    public final <R> R synchronizedValue$ui_text_release(C13074a<? extends R> aVar) {
        R invoke;
        C12775o.m28639i(aVar, "block");
        synchronized (this.monitor) {
            try {
                invoke = aVar.invoke();
                C12773m.m28629b(1);
            } catch (Throwable th) {
                C12773m.m28629b(1);
                C12773m.m28628a(1);
                throw th;
            }
        }
        C12773m.m28628a(1);
        return invoke;
    }

    public String toString() {
        int i;
        String str;
        synchronized (this.monitor) {
            int i2 = this.hitCount;
            int i3 = this.missCount + i2;
            if (i3 != 0) {
                i = (i2 * 100) / i3;
            } else {
                i = 0;
            }
            str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + i + "%]";
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void trimToSize(int r8) {
        /*
            r7 = this;
        L_0x0000:
            androidx.compose.ui.text.platform.SynchronizedObject r0 = r7.monitor
            monitor-enter(r0)
            int r1 = r7.size()     // Catch:{ all -> 0x0091 }
            if (r1 < 0) goto L_0x0089
            java.util.HashMap<K, V> r1 = r7.map     // Catch:{ all -> 0x0091 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r1 == 0) goto L_0x0017
            int r1 = r7.size()     // Catch:{ all -> 0x0091 }
            if (r1 != 0) goto L_0x0089
        L_0x0017:
            java.util.HashMap<K, V> r1 = r7.map     // Catch:{ all -> 0x0091 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0091 }
            java.util.LinkedHashSet<K> r2 = r7.keySet     // Catch:{ all -> 0x0091 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r1 != r2) goto L_0x0089
            int r1 = r7.size()     // Catch:{ all -> 0x0091 }
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L_0x0074
            java.util.HashMap<K, V> r1 = r7.map     // Catch:{ all -> 0x0091 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r1 != 0) goto L_0x0074
            java.util.LinkedHashSet<K> r1 = r7.keySet     // Catch:{ all -> 0x0091 }
            java.lang.Object r1 = kotlin.collections.C12686e0.m28220Y(r1)     // Catch:{ all -> 0x0091 }
            java.util.HashMap<K, V> r4 = r7.map     // Catch:{ all -> 0x0091 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x006c
            java.util.HashMap<K, V> r5 = r7.map     // Catch:{ all -> 0x0091 }
            java.util.Map r5 = kotlin.jvm.internal.C12772l0.m28612d(r5)     // Catch:{ all -> 0x0091 }
            r5.remove(r1)     // Catch:{ all -> 0x0091 }
            java.util.LinkedHashSet<K> r5 = r7.keySet     // Catch:{ all -> 0x0091 }
            java.util.Collection r5 = kotlin.jvm.internal.C12772l0.m28609a(r5)     // Catch:{ all -> 0x0091 }
            r5.remove(r1)     // Catch:{ all -> 0x0091 }
            int r5 = r7.size()     // Catch:{ all -> 0x0091 }
            kotlin.jvm.internal.C12775o.m28636f(r1)     // Catch:{ all -> 0x0091 }
            kotlin.jvm.internal.C12775o.m28636f(r4)     // Catch:{ all -> 0x0091 }
            int r6 = r7.safeSizeOf(r1, r4)     // Catch:{ all -> 0x0091 }
            int r5 = r5 - r6
            r7.size = r5     // Catch:{ all -> 0x0091 }
            int r5 = r7.evictionCount     // Catch:{ all -> 0x0091 }
            int r5 = r5 + r2
            r7.evictionCount = r5     // Catch:{ all -> 0x0091 }
            goto L_0x0076
        L_0x006c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch:{ all -> 0x0091 }
            throw r8     // Catch:{ all -> 0x0091 }
        L_0x0074:
            r1 = r3
            r4 = r1
        L_0x0076:
            ef.v r5 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0091 }
            monitor-exit(r0)
            if (r1 != 0) goto L_0x007e
            if (r4 != 0) goto L_0x007e
            return
        L_0x007e:
            kotlin.jvm.internal.C12775o.m28636f(r1)
            kotlin.jvm.internal.C12775o.m28636f(r4)
            r7.entryRemoved(r2, r1, r4, r3)
            goto L_0x0000
        L_0x0089:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch:{ all -> 0x0091 }
            throw r8     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.caches.LruCache.trimToSize(int):void");
    }

    /* access modifiers changed from: protected */
    public void entryRemoved(boolean z, K k, V v, V v2) {
    }
}
