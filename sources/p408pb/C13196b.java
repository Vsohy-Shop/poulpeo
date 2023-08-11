package p408pb;

/* renamed from: pb.b */
/* compiled from: SpanExtensions.kt */
public final class C13196b {
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a0 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m29948a(p367jc.C12612a r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.util.List r11 = r11.mo50339a()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x000f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r11.next()
            r1 = r0
            jc.a$a r1 = (p367jc.C12612a.C12613a) r1
            java.lang.String r1 = r1.mo50347a()
            java.lang.String r2 = "style"
            boolean r1 = kotlin.jvm.internal.C12775o.m28634d(r1, r2)
            if (r1 == 0) goto L_0x000f
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            jc.a$a r0 = (p367jc.C12612a.C12613a) r0
            r11 = 0
            if (r0 == 0) goto L_0x0151
            java.lang.String r1 = r0.mo50348b()
            if (r1 != 0) goto L_0x0037
            goto L_0x0151
        L_0x0037:
            java.lang.String r0 = ";"
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            java.util.List r0 = p454wf.C13755w.m31594t0(r1, r2, r3, r4, r5, r6)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0050:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto L_0x0069
            java.lang.Object r2 = r0.next()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = p454wf.C13754v.m31532t(r4)
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0050
            r1.add(r2)
            goto L_0x0050
        L_0x0069:
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r4 = kotlin.collections.C12728x.m28544v(r1, r2)
            r0.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0078:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0097
            java.lang.Object r4 = r1.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r4 = ":"
            java.lang.String[] r6 = new java.lang.String[]{r4}
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.util.List r4 = p454wf.C13755w.m31594t0(r5, r6, r7, r8, r9, r10)
            r0.add(r4)
            goto L_0x0078
        L_0x0097:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00a0:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00e7
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.util.List r5 = (java.util.List) r5
            int r6 = r5.size()
            r7 = 2
            if (r6 != r7) goto L_0x00e0
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L_0x00c5
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00c5
        L_0x00c3:
            r5 = r3
            goto L_0x00dc
        L_0x00c5:
            java.util.Iterator r5 = r5.iterator()
        L_0x00c9:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00c3
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = p454wf.C13754v.m31532t(r6)
            if (r6 == 0) goto L_0x00c9
            r5 = r11
        L_0x00dc:
            if (r5 == 0) goto L_0x00e0
            r5 = r3
            goto L_0x00e1
        L_0x00e0:
            r5 = r11
        L_0x00e1:
            if (r5 == 0) goto L_0x00a0
            r1.add(r4)
            goto L_0x00a0
        L_0x00e7:
            int r0 = kotlin.collections.C12728x.m28544v(r1, r2)
            int r0 = kotlin.collections.C12714q0.m28413d(r0)
            r2 = 16
            int r0 = p436tf.C13537l.m30877d(r0, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        L_0x00fe:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0136
            java.lang.Object r1 = r0.next()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = kotlin.collections.C12686e0.m28221Z(r1)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = p454wf.C13755w.m31561N0(r4)
            java.lang.String r4 = r4.toString()
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = p454wf.C13755w.m31561N0(r1)
            java.lang.String r1 = r1.toString()
            ef.l r1 = p336ef.C11915r.m25707a(r4, r1)
            java.lang.Object r4 = r1.mo49111c()
            java.lang.Object r1 = r1.mo49112d()
            r2.put(r4, r1)
            goto L_0x00fe
        L_0x0136:
            java.lang.String r0 = "text-decoration"
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r1 = "underline"
            boolean r0 = kotlin.jvm.internal.C12775o.m28634d(r0, r1)
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = "text-decoration-line"
            java.lang.Object r0 = r2.get(r0)
            boolean r0 = kotlin.jvm.internal.C12775o.m28634d(r0, r1)
            if (r0 == 0) goto L_0x0151
        L_0x0150:
            r11 = r3
        L_0x0151:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p408pb.C13196b.m29948a(jc.a):boolean");
    }
}
