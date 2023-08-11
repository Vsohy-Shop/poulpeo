package com.google.android.play.core.assetpacks;

import java.io.File;
import p037b6.C2895b0;
import p037b6.C2900e;

/* renamed from: com.google.android.play.core.assetpacks.p0 */
final class C6753p0 {

    /* renamed from: f */
    private static final C2900e f8774f = new C2900e("ExtractChunkTaskHandler");

    /* renamed from: a */
    private final byte[] f8775a = new byte[8192];

    /* renamed from: b */
    private final C6792z f8776b;

    /* renamed from: c */
    private final C2895b0<C6697b3> f8777c;

    /* renamed from: d */
    private final C2895b0<C6768t> f8778d;

    /* renamed from: e */
    private final C6777v0 f8779e;

    C6753p0(C6792z zVar, C2895b0<C6697b3> b0Var, C2895b0<C6768t> b0Var2, C6777v0 v0Var) {
        this.f8776b = zVar;
        this.f8777c = b0Var;
        this.f8778d = b0Var2;
        this.f8779e = v0Var;
    }

    /* renamed from: b */
    private final File m11500b(C6749o0 o0Var) {
        File c = this.f8776b.mo39382c(o0Var.f8700b, o0Var.f8754c, o0Var.f8755d, o0Var.f8756e);
        if (!c.exists()) {
            c.mkdirs();
        }
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0180 A[Catch:{ all -> 0x032f, all -> 0x0335, IOException -> 0x033b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a5 A[Catch:{ all -> 0x032f, all -> 0x0335, IOException -> 0x033b }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d9 A[Catch:{ all -> 0x032f, all -> 0x0335, IOException -> 0x033b }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0294 A[SYNTHETIC, Splitter:B:93:0x0294] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39349a(com.google.android.play.core.assetpacks.C6749o0 r23) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            com.google.android.play.core.assetpacks.i2 r0 = new com.google.android.play.core.assetpacks.i2
            com.google.android.play.core.assetpacks.z r4 = r1.f8776b
            java.lang.String r5 = r2.f8700b
            int r6 = r2.f8754c
            long r7 = r2.f8755d
            java.lang.String r9 = r2.f8756e
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r9)
            com.google.android.play.core.assetpacks.z r10 = r1.f8776b
            java.lang.String r11 = r2.f8700b
            int r12 = r2.f8754c
            long r13 = r2.f8755d
            java.lang.String r15 = r2.f8756e
            java.io.File r3 = r10.mo39401y(r11, r12, r13, r15)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x002b
            r3.mkdirs()
        L_0x002b:
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            java.io.InputStream r3 = r2.f8762k     // Catch:{ IOException -> 0x033b }
            int r4 = r2.f8757f     // Catch:{ IOException -> 0x033b }
            if (r4 == r13) goto L_0x0037
            r15 = r3
            goto L_0x0040
        L_0x0037:
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x033b }
            byte[] r5 = r1.f8775a     // Catch:{ IOException -> 0x033b }
            int r5 = r5.length     // Catch:{ IOException -> 0x033b }
            r4.<init>(r3, r5)     // Catch:{ IOException -> 0x033b }
            r15 = r4
        L_0x0040:
            int r3 = r2.f8758g     // Catch:{ all -> 0x032f }
            if (r3 <= 0) goto L_0x017d
            com.google.android.play.core.assetpacks.h2 r3 = r0.mo39302a()     // Catch:{ all -> 0x032f }
            int r4 = r3.mo39292e()     // Catch:{ all -> 0x032f }
            int r5 = r2.f8758g     // Catch:{ all -> 0x032f }
            int r6 = r5 + -1
            if (r4 != r6) goto L_0x015d
            int r4 = r3.mo39288a()     // Catch:{ all -> 0x032f }
            r16 = 0
            if (r4 == r13) goto L_0x00d9
            if (r4 == r12) goto L_0x009c
            if (r4 != r11) goto L_0x0082
            b6.e r4 = f8774f     // Catch:{ all -> 0x032f }
            java.lang.String r5 = "Resuming central directory from last chunk."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r4.mo28421c(r5, r6)     // Catch:{ all -> 0x032f }
            long r3 = r3.mo39290c()     // Catch:{ all -> 0x032f }
            r0.mo39305d(r15, r3)     // Catch:{ all -> 0x032f }
            boolean r3 = r23.mo39336a()     // Catch:{ all -> 0x032f }
            if (r3 == 0) goto L_0x0078
        L_0x0074:
            r4 = r16
            goto L_0x017e
        L_0x0078:
            com.google.android.play.core.assetpacks.r0 r0 = new com.google.android.play.core.assetpacks.r0     // Catch:{ all -> 0x032f }
            java.lang.String r3 = "Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB."
            int r4 = r2.f8699a     // Catch:{ all -> 0x032f }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x0082:
            com.google.android.play.core.assetpacks.r0 r0 = new com.google.android.play.core.assetpacks.r0     // Catch:{ all -> 0x032f }
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ all -> 0x032f }
            int r3 = r3.mo39288a()     // Catch:{ all -> 0x032f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x032f }
            r4[r14] = r3     // Catch:{ all -> 0x032f }
            java.lang.String r3 = "Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s."
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x032f }
            int r4 = r2.f8699a     // Catch:{ all -> 0x032f }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x009c:
            b6.e r3 = f8774f     // Catch:{ all -> 0x032f }
            java.lang.String r4 = "Resuming zip entry from last chunk during local file header."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r3.mo28421c(r4, r5)     // Catch:{ all -> 0x032f }
            com.google.android.play.core.assetpacks.z r3 = r1.f8776b     // Catch:{ all -> 0x032f }
            java.lang.String r4 = r2.f8700b     // Catch:{ all -> 0x032f }
            int r5 = r2.f8754c     // Catch:{ all -> 0x032f }
            long r6 = r2.f8755d     // Catch:{ all -> 0x032f }
            java.lang.String r8 = r2.f8756e     // Catch:{ all -> 0x032f }
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r21 = r8
            java.io.File r3 = r16.mo39395s(r17, r18, r19, r21)     // Catch:{ all -> 0x032f }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x032f }
            if (r4 == 0) goto L_0x00cf
            java.io.SequenceInputStream r4 = new java.io.SequenceInputStream     // Catch:{ all -> 0x032f }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x032f }
            r5.<init>(r3)     // Catch:{ all -> 0x032f }
            r4.<init>(r5, r15)     // Catch:{ all -> 0x032f }
            goto L_0x017e
        L_0x00cf:
            com.google.android.play.core.assetpacks.r0 r0 = new com.google.android.play.core.assetpacks.r0     // Catch:{ all -> 0x032f }
            java.lang.String r3 = "Checkpoint extension file not found."
            int r4 = r2.f8699a     // Catch:{ all -> 0x032f }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x00d9:
            b6.e r4 = f8774f     // Catch:{ all -> 0x032f }
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x032f }
            java.lang.String r6 = r3.mo39289b()     // Catch:{ all -> 0x032f }
            r5[r14] = r6     // Catch:{ all -> 0x032f }
            java.lang.String r6 = "Resuming zip entry from last chunk during file %s."
            r4.mo28421c(r6, r5)     // Catch:{ all -> 0x032f }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x032f }
            java.lang.String r5 = r3.mo39289b()     // Catch:{ all -> 0x032f }
            r4.<init>(r5)     // Catch:{ all -> 0x032f }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x032f }
            if (r5 == 0) goto L_0x0153
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x032f }
            java.lang.String r6 = "rw"
            r5.<init>(r4, r6)     // Catch:{ all -> 0x032f }
            long r6 = r3.mo39290c()     // Catch:{ all -> 0x032f }
            r5.seek(r6)     // Catch:{ all -> 0x032f }
            long r6 = r3.mo39291d()     // Catch:{ all -> 0x032f }
        L_0x0109:
            byte[] r3 = r1.f8775a     // Catch:{ all -> 0x032f }
            int r3 = r3.length     // Catch:{ all -> 0x032f }
            long r8 = (long) r3     // Catch:{ all -> 0x032f }
            long r8 = java.lang.Math.min(r6, r8)     // Catch:{ all -> 0x032f }
            int r3 = (int) r8     // Catch:{ all -> 0x032f }
            byte[] r8 = r1.f8775a     // Catch:{ all -> 0x032f }
            int r8 = r15.read(r8, r14, r3)     // Catch:{ all -> 0x032f }
            int r8 = java.lang.Math.max(r8, r14)     // Catch:{ all -> 0x032f }
            if (r8 <= 0) goto L_0x0123
            byte[] r9 = r1.f8775a     // Catch:{ all -> 0x032f }
            r5.write(r9, r14, r8)     // Catch:{ all -> 0x032f }
        L_0x0123:
            long r10 = (long) r8     // Catch:{ all -> 0x032f }
            long r9 = r6 - r10
            r6 = 0
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0132
            if (r8 > 0) goto L_0x012f
            goto L_0x0132
        L_0x012f:
            r6 = r9
            r11 = 3
            goto L_0x0109
        L_0x0132:
            long r6 = r5.length()     // Catch:{ all -> 0x032f }
            r5.close()     // Catch:{ all -> 0x032f }
            if (r8 == r3) goto L_0x017d
            b6.e r3 = f8774f     // Catch:{ all -> 0x032f }
            java.lang.String r5 = "Chunk has ended while resuming the previous chunks file content."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r3.mo28421c(r5, r8)     // Catch:{ all -> 0x032f }
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x032f }
            int r11 = r2.f8758g     // Catch:{ all -> 0x032f }
            r3 = r0
            r5 = r6
            r7 = r9
            r9 = r11
            r3.mo39306e(r4, r5, r7, r9)     // Catch:{ all -> 0x032f }
            goto L_0x0074
        L_0x0153:
            com.google.android.play.core.assetpacks.r0 r0 = new com.google.android.play.core.assetpacks.r0     // Catch:{ all -> 0x032f }
            java.lang.String r3 = "Partial file specified in checkpoint does not exist. Corrupt directory."
            int r4 = r2.f8699a     // Catch:{ all -> 0x032f }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x015d:
            com.google.android.play.core.assetpacks.r0 r0 = new com.google.android.play.core.assetpacks.r0     // Catch:{ all -> 0x032f }
            java.lang.String r4 = "Trying to resume with chunk number %s when previously processed chunk was number %s."
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x032f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x032f }
            r6[r14] = r5     // Catch:{ all -> 0x032f }
            int r3 = r3.mo39292e()     // Catch:{ all -> 0x032f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x032f }
            r6[r13] = r3     // Catch:{ all -> 0x032f }
            java.lang.String r3 = java.lang.String.format(r4, r6)     // Catch:{ all -> 0x032f }
            int r4 = r2.f8699a     // Catch:{ all -> 0x032f }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x017d:
            r4 = r15
        L_0x017e:
            if (r4 == 0) goto L_0x028b
            com.google.android.play.core.assetpacks.i0 r3 = new com.google.android.play.core.assetpacks.i0     // Catch:{ all -> 0x032f }
            r3.<init>(r4)     // Catch:{ all -> 0x032f }
            java.io.File r5 = r22.m11500b(r23)     // Catch:{ all -> 0x032f }
        L_0x0189:
            com.google.android.play.core.assetpacks.o2 r6 = r3.mo39298b()     // Catch:{ all -> 0x032f }
            boolean r7 = r6.mo39344g()     // Catch:{ all -> 0x032f }
            if (r7 != 0) goto L_0x01e0
            boolean r7 = r3.mo39296A()     // Catch:{ all -> 0x032f }
            if (r7 != 0) goto L_0x01e0
            boolean r7 = r6.mo39339c()     // Catch:{ all -> 0x032f }
            if (r7 == 0) goto L_0x01d9
            boolean r7 = r6.mo39338b()     // Catch:{ all -> 0x032f }
            if (r7 != 0) goto L_0x01d9
            byte[] r7 = r6.mo39347i()     // Catch:{ all -> 0x032f }
            r0.mo39307f(r7)     // Catch:{ all -> 0x032f }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x032f }
            java.lang.String r8 = r6.mo39340d()     // Catch:{ all -> 0x032f }
            r7.<init>(r5, r8)     // Catch:{ all -> 0x032f }
            java.io.File r8 = r7.getParentFile()     // Catch:{ all -> 0x032f }
            r8.mkdirs()     // Catch:{ all -> 0x032f }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x032f }
            r8.<init>(r7)     // Catch:{ all -> 0x032f }
            byte[] r7 = r1.f8775a     // Catch:{ all -> 0x032f }
            int r7 = r3.read(r7)     // Catch:{ all -> 0x032f }
        L_0x01c7:
            if (r7 <= 0) goto L_0x01d5
            byte[] r9 = r1.f8775a     // Catch:{ all -> 0x032f }
            r8.write(r9, r14, r7)     // Catch:{ all -> 0x032f }
            byte[] r7 = r1.f8775a     // Catch:{ all -> 0x032f }
            int r7 = r3.read(r7)     // Catch:{ all -> 0x032f }
            goto L_0x01c7
        L_0x01d5:
            r8.close()     // Catch:{ all -> 0x032f }
            goto L_0x01e0
        L_0x01d9:
            byte[] r7 = r6.mo39347i()     // Catch:{ all -> 0x032f }
            r0.mo39309h(r7, r3)     // Catch:{ all -> 0x032f }
        L_0x01e0:
            boolean r7 = r3.mo39299k()     // Catch:{ all -> 0x032f }
            if (r7 != 0) goto L_0x01ec
            boolean r7 = r3.mo39296A()     // Catch:{ all -> 0x032f }
            if (r7 == 0) goto L_0x0189
        L_0x01ec:
            boolean r5 = r3.mo39296A()     // Catch:{ all -> 0x032f }
            if (r5 == 0) goto L_0x0202
            b6.e r5 = f8774f     // Catch:{ all -> 0x032f }
            java.lang.String r7 = "Writing central directory metadata."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r5.mo28421c(r7, r8)     // Catch:{ all -> 0x032f }
            byte[] r5 = r6.mo39347i()     // Catch:{ all -> 0x032f }
            r0.mo39309h(r5, r4)     // Catch:{ all -> 0x032f }
        L_0x0202:
            boolean r4 = r23.mo39336a()     // Catch:{ all -> 0x032f }
            if (r4 != 0) goto L_0x028b
            boolean r4 = r6.mo39344g()     // Catch:{ all -> 0x032f }
            if (r4 == 0) goto L_0x0221
            b6.e r3 = f8774f     // Catch:{ all -> 0x032f }
            java.lang.String r4 = "Writing slice checkpoint for partial local file header."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r3.mo28421c(r4, r5)     // Catch:{ all -> 0x032f }
            byte[] r3 = r6.mo39347i()     // Catch:{ all -> 0x032f }
            int r4 = r2.f8758g     // Catch:{ all -> 0x032f }
            r0.mo39308g(r3, r4)     // Catch:{ all -> 0x032f }
            goto L_0x028b
        L_0x0221:
            boolean r4 = r3.mo39296A()     // Catch:{ all -> 0x032f }
            if (r4 == 0) goto L_0x0236
            b6.e r3 = f8774f     // Catch:{ all -> 0x032f }
            java.lang.String r4 = "Writing slice checkpoint for central directory."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r3.mo28421c(r4, r5)     // Catch:{ all -> 0x032f }
            int r3 = r2.f8758g     // Catch:{ all -> 0x032f }
            r0.mo39303b(r3)     // Catch:{ all -> 0x032f }
            goto L_0x028b
        L_0x0236:
            int r4 = r6.mo39343f()     // Catch:{ all -> 0x032f }
            if (r4 != 0) goto L_0x026c
            b6.e r4 = f8774f     // Catch:{ all -> 0x032f }
            java.lang.String r5 = "Writing slice checkpoint for partial file."
            java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r4.mo28421c(r5, r7)     // Catch:{ all -> 0x032f }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x032f }
            java.io.File r5 = r22.m11500b(r23)     // Catch:{ all -> 0x032f }
            java.lang.String r7 = r6.mo39340d()     // Catch:{ all -> 0x032f }
            r4.<init>(r5, r7)     // Catch:{ all -> 0x032f }
            long r5 = r6.mo39341e()     // Catch:{ all -> 0x032f }
            long r7 = r3.mo39297G()     // Catch:{ all -> 0x032f }
            long r5 = r5 - r7
            long r7 = r4.length()     // Catch:{ all -> 0x032f }
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0264
            goto L_0x027d
        L_0x0264:
            com.google.android.play.core.assetpacks.r0 r0 = new com.google.android.play.core.assetpacks.r0     // Catch:{ all -> 0x032f }
            java.lang.String r3 = "Partial file is of unexpected size."
            r0.<init>(r3)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x026c:
            b6.e r4 = f8774f     // Catch:{ all -> 0x032f }
            java.lang.String r5 = "Writing slice checkpoint for partial unextractable file."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r4.mo28421c(r5, r6)     // Catch:{ all -> 0x032f }
            java.io.File r4 = r0.mo39310i()     // Catch:{ all -> 0x032f }
            long r5 = r4.length()     // Catch:{ all -> 0x032f }
        L_0x027d:
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x032f }
            long r7 = r3.mo39297G()     // Catch:{ all -> 0x032f }
            int r9 = r2.f8758g     // Catch:{ all -> 0x032f }
            r3 = r0
            r3.mo39306e(r4, r5, r7, r9)     // Catch:{ all -> 0x032f }
        L_0x028b:
            r15.close()     // Catch:{ IOException -> 0x033b }
            boolean r3 = r23.mo39336a()
            if (r3 == 0) goto L_0x02b4
            int r3 = r2.f8758g     // Catch:{ IOException -> 0x029a }
            r0.mo39311j(r3)     // Catch:{ IOException -> 0x029a }
            goto L_0x02b4
        L_0x029a:
            r0 = move-exception
            b6.e r3 = f8774f
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "Writing extraction finished checkpoint failed with %s."
            r3.mo28423e(r5, r4)
            com.google.android.play.core.assetpacks.r0 r3 = new com.google.android.play.core.assetpacks.r0
            java.lang.String r4 = "Writing extraction finished checkpoint failed."
            int r2 = r2.f8699a
            r3.<init>(r4, r0, r2)
            throw r3
        L_0x02b4:
            b6.e r0 = f8774f
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r2.f8758g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r14] = r4
            java.lang.String r4 = r2.f8756e
            r3[r13] = r4
            java.lang.String r4 = r2.f8700b
            r3[r12] = r4
            int r4 = r2.f8699a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = "Extraction finished for chunk %s of slice %s of pack %s of session %s."
            r0.mo28424f(r4, r3)
            b6.b0<com.google.android.play.core.assetpacks.b3> r0 = r1.f8777c
            java.lang.Object r0 = r0.mo28418a()
            com.google.android.play.core.assetpacks.b3 r0 = (com.google.android.play.core.assetpacks.C6697b3) r0
            int r3 = r2.f8699a
            java.lang.String r4 = r2.f8700b
            java.lang.String r5 = r2.f8756e
            int r6 = r2.f8758g
            r0.mo39273c(r3, r4, r5, r6)
            java.io.InputStream r0 = r2.f8762k     // Catch:{ IOException -> 0x02f0 }
            r0.close()     // Catch:{ IOException -> 0x02f0 }
            goto L_0x030a
        L_0x02f0:
            b6.e r0 = f8774f
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r2.f8758g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r14] = r3
            java.lang.String r3 = r2.f8756e
            r4[r13] = r3
            java.lang.String r3 = r2.f8700b
            r4[r12] = r3
            java.lang.String r3 = "Could not close file for chunk %s of slice %s of pack %s."
            r0.mo28425g(r3, r4)
        L_0x030a:
            int r0 = r2.f8761j
            r3 = 3
            if (r0 != r3) goto L_0x032e
            b6.b0<com.google.android.play.core.assetpacks.t> r0 = r1.f8778d
            java.lang.Object r0 = r0.mo28418a()
            com.google.android.play.core.assetpacks.t r0 = (com.google.android.play.core.assetpacks.C6768t) r0
            java.lang.String r3 = r2.f8700b
            long r7 = r2.f8760i
            r4 = 3
            r5 = 0
            com.google.android.play.core.assetpacks.v0 r6 = r1.f8779e
            double r9 = r6.mo39375a(r3, r2)
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            com.google.android.play.core.assetpacks.AssetPackState r2 = com.google.android.play.core.assetpacks.AssetPackState.m11323b(r2, r3, r4, r5, r7, r9)
            r0.mo39365h(r2)
        L_0x032e:
            return
        L_0x032f:
            r0 = move-exception
            r3 = r0
            r15.close()     // Catch:{ all -> 0x0335 }
            goto L_0x033a
        L_0x0335:
            r0 = move-exception
            r4 = r0
            p037b6.C2893a0.m2299a(r3, r4)     // Catch:{ IOException -> 0x033b }
        L_0x033a:
            throw r3     // Catch:{ IOException -> 0x033b }
        L_0x033b:
            r0 = move-exception
            b6.e r3 = f8774f
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "IOException during extraction %s."
            r3.mo28423e(r5, r4)
            com.google.android.play.core.assetpacks.r0 r3 = new com.google.android.play.core.assetpacks.r0
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r2.f8758g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r14] = r5
            java.lang.String r5 = r2.f8756e
            r4[r13] = r5
            java.lang.String r5 = r2.f8700b
            r4[r12] = r5
            int r5 = r2.f8699a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = "Error extracting chunk %s of slice %s of pack %s of session %s."
            java.lang.String r4 = java.lang.String.format(r5, r4)
            int r2 = r2.f8699a
            r3.<init>(r4, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C6753p0.mo39349a(com.google.android.play.core.assetpacks.o0):void");
    }
}
