package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p037b6.C2928s;
import p287y5.C10688b;

/* renamed from: com.google.android.play.core.assetpacks.c0 */
final class C6699c0 extends C2928s {

    /* renamed from: b */
    private final File f8582b;

    /* renamed from: c */
    private final File f8583c;

    /* renamed from: d */
    private final NavigableMap<Long, File> f8584d = new TreeMap();

    C6699c0(File file, File file2) {
        this.f8582b = file;
        this.f8583c = file2;
        List<File> a = C6735k2.m11447a(file, file2);
        if (!a.isEmpty()) {
            int size = a.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                File file3 = a.get(i);
                this.f8584d.put(Long.valueOf(j), file3);
                j += file3.length();
            }
            return;
        }
        throw new C6761r0(String.format("Virtualized slice archive empty for %s, %s", new Object[]{file, file2}));
    }

    /* renamed from: k */
    private final InputStream m11354k(long j, Long l) {
        FileInputStream fileInputStream = new FileInputStream(this.f8584d.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new C6761r0(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l}));
    }

    /* renamed from: a */
    public final long mo28468a() {
        Map.Entry<Long, File> lastEntry = this.f8584d.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final InputStream mo28469b(long j, long j2) {
        if (j < 0 || j2 < 0) {
            throw new C6761r0(String.format("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j3 = j + j2;
        if (j3 <= mo28468a()) {
            Long floorKey = this.f8584d.floorKey(Long.valueOf(j));
            Long floorKey2 = this.f8584d.floorKey(Long.valueOf(j3));
            if (floorKey.equals(floorKey2)) {
                return new C6694b0(m11354k(j, floorKey), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m11354k(j, floorKey));
            Collection<File> values = this.f8584d.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new C10688b(Collections.enumeration(values)));
            }
            arrayList.add(new C6694b0(new FileInputStream(this.f8584d.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new C6761r0(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(mo28468a()), Long.valueOf(j3)}));
    }

    public final void close() {
    }
}
