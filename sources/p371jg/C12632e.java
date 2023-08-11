package p371jg;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12755d0;
import kotlin.jvm.internal.C12762g0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.p406ws.WebSocketProtocol;
import okio.C13130e;
import okio.C13141i;
import okio.C13158p0;
import p336ef.C11915r;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nzip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 zip.kt\nokio/internal/ZipKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,459:1\n1045#2:460\n*S KotlinDebug\n*F\n+ 1 zip.kt\nokio/internal/ZipKt\n*L\n156#1:460\n*E\n"})
/* renamed from: jg.e */
/* compiled from: zip.kt */
public final class C12632e {

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 zip.kt\nokio/internal/ZipKt\n*L\n1#1,328:1\n156#2:329\n*E\n"})
    /* renamed from: jg.e$a */
    /* compiled from: Comparisons.kt */
    public static final class C12633a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C12019b.m26106c(((C12631d) t).mo50381a(), ((C12631d) t2).mo50381a());
        }
    }

    /* renamed from: jg.e$b */
    /* compiled from: zip.kt */
    static final class C12634b extends C12777p implements C13088o<Integer, Long, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C12755d0 f20294g;

        /* renamed from: h */
        final /* synthetic */ long f20295h;

        /* renamed from: i */
        final /* synthetic */ C12762g0 f20296i;

        /* renamed from: j */
        final /* synthetic */ C13130e f20297j;

        /* renamed from: k */
        final /* synthetic */ C12762g0 f20298k;

        /* renamed from: l */
        final /* synthetic */ C12762g0 f20299l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12634b(C12755d0 d0Var, long j, C12762g0 g0Var, C13130e eVar, C12762g0 g0Var2, C12762g0 g0Var3) {
            super(2);
            this.f20294g = d0Var;
            this.f20295h = j;
            this.f20296i = g0Var;
            this.f20297j = eVar;
            this.f20298k = g0Var2;
            this.f20299l = g0Var3;
        }

        /* renamed from: a */
        public final void mo50390a(int i, long j) {
            long j2;
            if (i == 1) {
                C12755d0 d0Var = this.f20294g;
                if (!d0Var.f20407b) {
                    d0Var.f20407b = true;
                    if (j >= this.f20295h) {
                        C12762g0 g0Var = this.f20296i;
                        long j3 = g0Var.f20418b;
                        if (j3 == 4294967295L) {
                            j3 = this.f20297j.mo52525g0();
                        }
                        g0Var.f20418b = j3;
                        C12762g0 g0Var2 = this.f20298k;
                        long j4 = 0;
                        if (g0Var2.f20418b == 4294967295L) {
                            j2 = this.f20297j.mo52525g0();
                        } else {
                            j2 = 0;
                        }
                        g0Var2.f20418b = j2;
                        C12762g0 g0Var3 = this.f20299l;
                        if (g0Var3.f20418b == 4294967295L) {
                            j4 = this.f20297j.mo52525g0();
                        }
                        g0Var3.f20418b = j4;
                        return;
                    }
                    throw new IOException("bad zip: zip64 extra too short");
                }
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo50390a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return C11921v.f18618a;
        }
    }

    /* renamed from: jg.e$c */
    /* compiled from: zip.kt */
    static final class C12635c extends C12777p implements C13088o<Integer, Long, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C13130e f20300g;

        /* renamed from: h */
        final /* synthetic */ Ref$ObjectRef<Long> f20301h;

        /* renamed from: i */
        final /* synthetic */ Ref$ObjectRef<Long> f20302i;

        /* renamed from: j */
        final /* synthetic */ Ref$ObjectRef<Long> f20303j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12635c(C13130e eVar, Ref$ObjectRef<Long> ref$ObjectRef, Ref$ObjectRef<Long> ref$ObjectRef2, Ref$ObjectRef<Long> ref$ObjectRef3) {
            super(2);
            this.f20300g = eVar;
            this.f20301h = ref$ObjectRef;
            this.f20302i = ref$ObjectRef2;
            this.f20303j = ref$ObjectRef3;
        }

        /* renamed from: a */
        public final void mo50391a(int i, long j) {
            boolean z;
            boolean z2;
            if (i == 21589) {
                long j2 = 1;
                if (j >= 1) {
                    byte readByte = this.f20300g.readByte() & 255;
                    boolean z3 = false;
                    if ((readByte & 1) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((readByte & 2) == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((readByte & 4) == 4) {
                        z3 = true;
                    }
                    C13130e eVar = this.f20300g;
                    if (z) {
                        j2 = 5;
                    }
                    if (z2) {
                        j2 += 4;
                    }
                    if (z3) {
                        j2 += 4;
                    }
                    if (j >= j2) {
                        if (z) {
                            this.f20301h.f20403b = Long.valueOf(((long) eVar.mo52510W()) * 1000);
                        }
                        if (z2) {
                            this.f20302i.f20403b = Long.valueOf(((long) this.f20300g.mo52510W()) * 1000);
                        }
                        if (z3) {
                            this.f20303j.f20403b = Long.valueOf(((long) this.f20300g.mo52510W()) * 1000);
                            return;
                        }
                        return;
                    }
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo50391a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return C11921v.f18618a;
        }
    }

    /* renamed from: a */
    private static final Map<C13158p0, C12631d> m28051a(List<C12631d> list) {
        C13158p0 e = C13158p0.C13159a.m29807e(C13158p0.f20947c, "/", false, 1, (Object) null);
        Map<C13158p0, C12631d> k = C12716r0.m28420k(C11915r.m25707a(e, new C12631d(e, true, (String) null, 0, 0, 0, 0, (Long) null, 0, TypedValues.PositionType.TYPE_CURVE_FIT, (DefaultConstructorMarker) null)));
        for (C12631d dVar : C12686e0.m28243v0(list, new C12633a())) {
            if (k.put(dVar.mo50381a(), dVar) == null) {
                while (true) {
                    C13158p0 g = dVar.mo50381a().mo52688g();
                    if (g == null) {
                        break;
                    }
                    C12631d dVar2 = k.get(g);
                    if (dVar2 != null) {
                        dVar2.mo50382b().add(dVar.mo50381a());
                        break;
                    }
                    C12631d dVar3 = r4;
                    C12631d dVar4 = new C12631d(g, true, (String) null, 0, 0, 0, 0, (Long) null, 0, TypedValues.PositionType.TYPE_CURVE_FIT, (DefaultConstructorMarker) null);
                    C12631d dVar5 = dVar3;
                    k.put(g, dVar5);
                    dVar5.mo50382b().add(dVar.mo50381a());
                    dVar = dVar5;
                }
            }
        }
        return k;
    }

    /* renamed from: b */
    private static final Long m28052b(int i, int i2) {
        if (i2 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        GregorianCalendar gregorianCalendar2 = gregorianCalendar;
        gregorianCalendar2.set(((i >> 9) & 127) + 1980, ((i >> 5) & 15) - 1, i & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (i2 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    /* renamed from: c */
    private static final String m28053c(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        String num = Integer.toString(i, C13724b.m31415a(16));
        C12775o.m28638h(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r10.close();
        r4 = r4 - ((long) 20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (r4 <= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        r4 = okio.C13145j0.m29739d(r3.mo52632V(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (r4.mo52510W() != 117853008) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        r5 = r4.mo52510W();
        r12 = r4.mo52525g0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        if (r4.mo52510W() != 1) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        if (r5 != 0) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r5 = okio.C13145j0.m29739d(r3.mo52632V(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r10 = r5.mo52510W();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        if (r10 != 101075792) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        r8 = m28060j(r5, r8);
        r10 = p336ef.C11921v.f18618a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        p392mf.C12941b.m29245a(r5, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bd, code lost:
        throw new java.io.IOException("bad zip: expected " + m28053c(101075792) + " but was " + m28053c(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00be, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c2, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        p392mf.C12941b.m29245a(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c6, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ce, code lost:
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        r5 = p336ef.C11921v.f18618a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        p392mf.C12941b.m29245a(r4, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d6, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d9, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        p392mf.C12941b.m29245a(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00dd, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00de, code lost:
        r4 = new java.util.ArrayList();
        r5 = okio.C13145j0.m29739d(r3.mo52632V(r8.mo50364a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r12 = r8.mo50366c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f5, code lost:
        if (r6 >= r12) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f7, code lost:
        r10 = m28055e(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0105, code lost:
        if (r10.mo50386f() >= r8.mo50364a()) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0111, code lost:
        if (r2.invoke(r10).booleanValue() == false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0113, code lost:
        r4.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0116, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0121, code lost:
        throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0122, code lost:
        r2 = p336ef.C11921v.f18618a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        p392mf.C12941b.m29245a(r5, (java.lang.Throwable) null);
        r4 = new okio.C13119b1(r0, r1, m28051a(r4), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0130, code lost:
        p392mf.C12941b.m29245a(r3, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0133, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0134, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0135, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0137, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0138, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        p392mf.C12941b.m29245a(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x013c, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        r8 = m28056f(r10);
        r9 = r10.mo52532l((long) r8.mo50365b());
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final okio.C13119b1 m28054d(okio.C13158p0 r18, okio.C13143j r19, kotlin.jvm.functions.Function1<? super p371jg.C12631d, java.lang.Boolean> r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "zipPath"
            kotlin.jvm.internal.C12775o.m28639i(r0, r3)
            java.lang.String r3 = "fileSystem"
            kotlin.jvm.internal.C12775o.m28639i(r1, r3)
            java.lang.String r3 = "predicate"
            kotlin.jvm.internal.C12775o.m28639i(r2, r3)
            okio.h r3 = r1.mo50373n(r0)
            long r4 = r3.size()     // Catch:{ all -> 0x0171 }
            r6 = 22
            long r6 = (long) r6     // Catch:{ all -> 0x0171 }
            long r4 = r4 - r6
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0156
            r8 = 65536(0x10000, double:3.2379E-319)
            long r8 = r4 - r8
            long r8 = java.lang.Math.max(r8, r6)     // Catch:{ all -> 0x0171 }
        L_0x0030:
            okio.y0 r10 = r3.mo52632V(r4)     // Catch:{ all -> 0x0171 }
            okio.e r10 = okio.C13145j0.m29739d(r10)     // Catch:{ all -> 0x0171 }
            int r11 = r10.mo52510W()     // Catch:{ all -> 0x0151 }
            r12 = 101010256(0x6054b50, float:2.506985E-35)
            if (r11 != r12) goto L_0x013d
            jg.a r8 = m28056f(r10)     // Catch:{ all -> 0x0151 }
            int r9 = r8.mo50365b()     // Catch:{ all -> 0x0151 }
            long r11 = (long) r9     // Catch:{ all -> 0x0151 }
            java.lang.String r9 = r10.mo52532l(r11)     // Catch:{ all -> 0x0151 }
            r10.close()     // Catch:{ all -> 0x0171 }
            r10 = 20
            long r10 = (long) r10     // Catch:{ all -> 0x0171 }
            long r4 = r4 - r10
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r11 = 0
            if (r10 <= 0) goto L_0x00de
            okio.y0 r4 = r3.mo52632V(r4)     // Catch:{ all -> 0x0171 }
            okio.e r4 = okio.C13145j0.m29739d(r4)     // Catch:{ all -> 0x0171 }
            int r5 = r4.mo52510W()     // Catch:{ all -> 0x00d5 }
            r10 = 117853008(0x7064b50, float:1.0103172E-34)
            if (r5 != r10) goto L_0x00cf
            int r5 = r4.mo52510W()     // Catch:{ all -> 0x00d5 }
            long r12 = r4.mo52525g0()     // Catch:{ all -> 0x00d5 }
            int r10 = r4.mo52510W()     // Catch:{ all -> 0x00d5 }
            r14 = 1
            if (r10 != r14) goto L_0x00c7
            if (r5 != 0) goto L_0x00c7
            okio.y0 r5 = r3.mo52632V(r12)     // Catch:{ all -> 0x00d5 }
            okio.e r5 = okio.C13145j0.m29739d(r5)     // Catch:{ all -> 0x00d5 }
            int r10 = r5.mo52510W()     // Catch:{ all -> 0x00be }
            r12 = 101075792(0x6064b50, float:2.525793E-35)
            if (r10 != r12) goto L_0x0097
            jg.a r8 = m28060j(r5, r8)     // Catch:{ all -> 0x00be }
            ef.v r10 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x00be }
            p392mf.C12941b.m29245a(r5, r11)     // Catch:{ all -> 0x00d5 }
            goto L_0x00cf
        L_0x0097:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00be }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            r1.<init>()     // Catch:{ all -> 0x00be }
            java.lang.String r2 = "bad zip: expected "
            r1.append(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r2 = m28053c(r12)     // Catch:{ all -> 0x00be }
            r1.append(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r2 = " but was "
            r1.append(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r2 = m28053c(r10)     // Catch:{ all -> 0x00be }
            r1.append(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00be }
            r0.<init>(r1)     // Catch:{ all -> 0x00be }
            throw r0     // Catch:{ all -> 0x00be }
        L_0x00be:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r0 = move-exception
            r2 = r0
            p392mf.C12941b.m29245a(r5, r1)     // Catch:{ all -> 0x00d5 }
            throw r2     // Catch:{ all -> 0x00d5 }
        L_0x00c7:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = "unsupported zip: spanned"
            r0.<init>(r1)     // Catch:{ all -> 0x00d5 }
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00cf:
            ef.v r5 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x00d5 }
            p392mf.C12941b.m29245a(r4, r11)     // Catch:{ all -> 0x0171 }
            goto L_0x00de
        L_0x00d5:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r0 = move-exception
            r2 = r0
            p392mf.C12941b.m29245a(r4, r1)     // Catch:{ all -> 0x0171 }
            throw r2     // Catch:{ all -> 0x0171 }
        L_0x00de:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0171 }
            r4.<init>()     // Catch:{ all -> 0x0171 }
            long r12 = r8.mo50364a()     // Catch:{ all -> 0x0171 }
            okio.y0 r5 = r3.mo52632V(r12)     // Catch:{ all -> 0x0171 }
            okio.e r5 = okio.C13145j0.m29739d(r5)     // Catch:{ all -> 0x0171 }
            long r12 = r8.mo50366c()     // Catch:{ all -> 0x0134 }
        L_0x00f3:
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L_0x0122
            jg.d r10 = m28055e(r5)     // Catch:{ all -> 0x0134 }
            long r14 = r10.mo50386f()     // Catch:{ all -> 0x0134 }
            long r16 = r8.mo50364a()     // Catch:{ all -> 0x0134 }
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x011a
            java.lang.Object r14 = r2.invoke(r10)     // Catch:{ all -> 0x0134 }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x0134 }
            boolean r14 = r14.booleanValue()     // Catch:{ all -> 0x0134 }
            if (r14 == 0) goto L_0x0116
            r4.add(r10)     // Catch:{ all -> 0x0134 }
        L_0x0116:
            r14 = 1
            long r6 = r6 + r14
            goto L_0x00f3
        L_0x011a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0134 }
            java.lang.String r1 = "bad zip: local file header offset >= central directory offset"
            r0.<init>(r1)     // Catch:{ all -> 0x0134 }
            throw r0     // Catch:{ all -> 0x0134 }
        L_0x0122:
            ef.v r2 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0134 }
            p392mf.C12941b.m29245a(r5, r11)     // Catch:{ all -> 0x0171 }
            java.util.Map r2 = m28051a(r4)     // Catch:{ all -> 0x0171 }
            okio.b1 r4 = new okio.b1     // Catch:{ all -> 0x0171 }
            r4.<init>(r0, r1, r2, r9)     // Catch:{ all -> 0x0171 }
            p392mf.C12941b.m29245a(r3, r11)
            return r4
        L_0x0134:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0137 }
        L_0x0137:
            r0 = move-exception
            r2 = r0
            p392mf.C12941b.m29245a(r5, r1)     // Catch:{ all -> 0x0171 }
            throw r2     // Catch:{ all -> 0x0171 }
        L_0x013d:
            r10.close()     // Catch:{ all -> 0x0171 }
            r10 = -1
            long r4 = r4 + r10
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0149
            goto L_0x0030
        L_0x0149:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0171 }
            java.lang.String r1 = "not a zip: end of central directory signature not found"
            r0.<init>(r1)     // Catch:{ all -> 0x0171 }
            throw r0     // Catch:{ all -> 0x0171 }
        L_0x0151:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0171 }
            throw r0     // Catch:{ all -> 0x0171 }
        L_0x0156:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0171 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0171 }
            r1.<init>()     // Catch:{ all -> 0x0171 }
            java.lang.String r2 = "not a zip: size="
            r1.append(r2)     // Catch:{ all -> 0x0171 }
            long r4 = r3.size()     // Catch:{ all -> 0x0171 }
            r1.append(r4)     // Catch:{ all -> 0x0171 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0171 }
            r0.<init>(r1)     // Catch:{ all -> 0x0171 }
            throw r0     // Catch:{ all -> 0x0171 }
        L_0x0171:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0174 }
        L_0x0174:
            r0 = move-exception
            r2 = r0
            p392mf.C12941b.m29245a(r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p371jg.C12632e.m28054d(okio.p0, okio.j, kotlin.jvm.functions.Function1):okio.b1");
    }

    /* renamed from: e */
    public static final C12631d m28055e(C13130e eVar) {
        C12762g0 g0Var;
        long j;
        C13130e eVar2 = eVar;
        C12775o.m28639i(eVar2, "<this>");
        int W = eVar.mo52510W();
        if (W == 33639248) {
            eVar2.skip(4);
            short d0 = eVar.mo52522d0() & 65535;
            if ((d0 & 1) == 0) {
                short d02 = eVar.mo52522d0() & 65535;
                Long b = m28052b(eVar.mo52522d0() & 65535, eVar.mo52522d0() & 65535);
                long W2 = ((long) eVar.mo52510W()) & 4294967295L;
                C12762g0 g0Var2 = new C12762g0();
                g0Var2.f20418b = ((long) eVar.mo52510W()) & 4294967295L;
                C12762g0 g0Var3 = new C12762g0();
                g0Var3.f20418b = ((long) eVar.mo52510W()) & 4294967295L;
                short d03 = eVar.mo52522d0() & 65535;
                short d04 = eVar.mo52522d0() & 65535;
                eVar2.skip(8);
                C12762g0 g0Var4 = new C12762g0();
                g0Var4.f20418b = ((long) eVar.mo52510W()) & 4294967295L;
                String l = eVar2.mo52532l((long) (eVar.mo52522d0() & 65535));
                if (!C13755w.m31550I(l, 0, false, 2, (Object) null)) {
                    if (g0Var3.f20418b == 4294967295L) {
                        j = ((long) 8) + 0;
                        g0Var = g0Var4;
                    } else {
                        g0Var = g0Var4;
                        j = 0;
                    }
                    if (g0Var2.f20418b == 4294967295L) {
                        j += (long) 8;
                    }
                    String str = l;
                    C12762g0 g0Var5 = g0Var;
                    if (g0Var5.f20418b == 4294967295L) {
                        j += (long) 8;
                    }
                    long j2 = j;
                    C12755d0 d0Var = new C12755d0();
                    Long l2 = b;
                    C12634b bVar = r0;
                    long j3 = W2;
                    short s = d02;
                    C12755d0 d0Var2 = d0Var;
                    String str2 = str;
                    C12762g0 g0Var6 = g0Var5;
                    short s2 = d04;
                    C12634b bVar2 = new C12634b(d0Var, j2, g0Var3, eVar, g0Var2, g0Var6);
                    m28057g(eVar2, d03, bVar);
                    if (j2 <= 0 || d0Var2.f20407b) {
                        String str3 = str2;
                        return new C12631d(C13158p0.C13159a.m29807e(C13158p0.f20947c, "/", false, 1, (Object) null).mo52691i(str3), C13754v.m31529q(str3, "/", false, 2, (Object) null), eVar2.mo52532l((long) s2), j3, g0Var2.f20418b, g0Var3.f20418b, s, l2, g0Var6.f20418b);
                    }
                    throw new IOException("bad zip: zip64 extra required but absent");
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + m28053c(d0));
        }
        throw new IOException("bad zip: expected " + m28053c(33639248) + " but was " + m28053c(W));
    }

    /* renamed from: f */
    private static final C12625a m28056f(C13130e eVar) {
        short d0 = eVar.mo52522d0() & 65535;
        short d02 = eVar.mo52522d0() & 65535;
        long d03 = (long) (eVar.mo52522d0() & 65535);
        if (d03 == ((long) (eVar.mo52522d0() & 65535)) && d0 == 0 && d02 == 0) {
            eVar.skip(4);
            return new C12625a(d03, 4294967295L & ((long) eVar.mo52510W()), eVar.mo52522d0() & 65535);
        }
        throw new IOException("unsupported zip: spanned");
    }

    /* renamed from: g */
    private static final void m28057g(C13130e eVar, int i, C13088o<? super Integer, ? super Long, C11921v> oVar) {
        long j = (long) i;
        while (j != 0) {
            if (j >= 4) {
                short d0 = eVar.mo52522d0() & 65535;
                long d02 = ((long) eVar.mo52522d0()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                long j2 = j - ((long) 4);
                if (j2 >= d02) {
                    eVar.mo52533m0(d02);
                    long size = eVar.mo52524f().size();
                    oVar.invoke(Integer.valueOf(d0), Long.valueOf(d02));
                    long size2 = (eVar.mo52524f().size() + d02) - size;
                    int i2 = (size2 > 0 ? 1 : (size2 == 0 ? 0 : -1));
                    if (i2 >= 0) {
                        if (i2 > 0) {
                            eVar.mo52524f().skip(size2);
                        }
                        j = j2 - d02;
                    } else {
                        throw new IOException("unsupported zip: too many bytes processed for " + d0);
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    /* renamed from: h */
    public static final C13141i m28058h(C13130e eVar, C13141i iVar) {
        C12775o.m28639i(eVar, "<this>");
        C12775o.m28639i(iVar, "basicMetadata");
        C13141i i = m28059i(eVar, iVar);
        C12775o.m28636f(i);
        return i;
    }

    /* renamed from: i */
    private static final C13141i m28059i(C13130e eVar, C13141i iVar) {
        T t;
        C13130e eVar2 = eVar;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (iVar != null) {
            t = iVar.mo52636c();
        } else {
            t = null;
        }
        ref$ObjectRef.f20403b = t;
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        int W = eVar.mo52510W();
        if (W == 67324752) {
            eVar2.skip(2);
            short d0 = eVar.mo52522d0() & 65535;
            if ((d0 & 1) == 0) {
                eVar2.skip(18);
                long d02 = ((long) eVar.mo52522d0()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                short d03 = eVar.mo52522d0() & 65535;
                eVar2.skip(d02);
                if (iVar == null) {
                    eVar2.skip((long) d03);
                    return null;
                }
                m28057g(eVar2, d03, new C12635c(eVar2, ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3));
                return new C13141i(iVar.mo52640g(), iVar.mo52639f(), (C13158p0) null, iVar.mo52637d(), (Long) ref$ObjectRef3.f20403b, (Long) ref$ObjectRef.f20403b, (Long) ref$ObjectRef2.f20403b, (Map) null, 128, (DefaultConstructorMarker) null);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + m28053c(d0));
        }
        throw new IOException("bad zip: expected " + m28053c(67324752) + " but was " + m28053c(W));
    }

    /* renamed from: j */
    private static final C12625a m28060j(C13130e eVar, C12625a aVar) {
        eVar.skip(12);
        int W = eVar.mo52510W();
        int W2 = eVar.mo52510W();
        long g0 = eVar.mo52525g0();
        if (g0 == eVar.mo52525g0() && W == 0 && W2 == 0) {
            eVar.skip(8);
            return new C12625a(g0, eVar.mo52525g0(), aVar.mo50365b());
        }
        throw new IOException("unsupported zip: spanned");
    }

    /* renamed from: k */
    public static final void m28061k(C13130e eVar) {
        C12775o.m28639i(eVar, "<this>");
        m28059i(eVar, (C13141i) null);
    }
}
