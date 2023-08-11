package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.C6922c;
import com.google.firebase.remoteconfig.internal.C7034d;
import com.google.firebase.remoteconfig.internal.C7044j;
import com.google.firebase.remoteconfig.internal.C7047l;
import com.google.firebase.remoteconfig.internal.C7048m;
import com.google.firebase.remoteconfig.internal.C7050n;
import com.google.firebase.remoteconfig.internal.C7051o;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p113h8.C8030b;
import p124i8.C8213d;
import p172n6.C8930b;
import p192p6.C9063a;
import p224s8.C9580d;
import p224s8.C9581e;
import p276x5.C10410i;
import p286y4.C10671e;
import p286y4.C10674h;

/* renamed from: com.google.firebase.remoteconfig.c */
/* compiled from: RemoteConfigComponent */
public class C7030c {

    /* renamed from: j */
    private static final C10671e f9401j = C10674h.m22680c();

    /* renamed from: k */
    private static final Random f9402k = new Random();
    @GuardedBy("this")

    /* renamed from: a */
    private final Map<String, C7028a> f9403a;

    /* renamed from: b */
    private final Context f9404b;

    /* renamed from: c */
    private final ExecutorService f9405c;

    /* renamed from: d */
    private final C6922c f9406d;

    /* renamed from: e */
    private final C8213d f9407e;

    /* renamed from: f */
    private final C8930b f9408f;
    @Nullable

    /* renamed from: g */
    private final C8030b<C9063a> f9409g;

    /* renamed from: h */
    private final String f9410h;
    @GuardedBy("this")

    /* renamed from: i */
    private Map<String, String> f9411i;

    C7030c(Context context, C6922c cVar, C8213d dVar, C8930b bVar, C8030b<C9063a> bVar2) {
        this(context, Executors.newCachedThreadPool(), cVar, dVar, bVar, bVar2, true);
    }

    /* renamed from: d */
    private C7034d m12471d(String str, String str2) {
        return C7034d.m12499h(Executors.newCachedThreadPool(), C7050n.m12577c(this.f9404b, String.format("%s_%s_%s_%s.json", new Object[]{"frc", this.f9410h, str, str2})));
    }

    /* renamed from: h */
    private C7047l m12472h(C7034d dVar, C7034d dVar2) {
        return new C7047l(this.f9405c, dVar, dVar2);
    }

    @VisibleForTesting
    /* renamed from: i */
    static C7048m m12473i(Context context, String str, String str2) {
        return new C7048m(context.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", str, str2, "settings"}), 0));
    }

    @Nullable
    /* renamed from: j */
    private static C7051o m12474j(C6922c cVar, String str, C8030b<C9063a> bVar) {
        if (!m12476l(cVar) || !str.equals("firebase")) {
            return null;
        }
        return new C7051o(bVar);
    }

    /* renamed from: k */
    private static boolean m12475k(C6922c cVar, String str) {
        if (!str.equals("firebase") || !m12476l(cVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private static boolean m12476l(C6922c cVar) {
        return cVar.mo39768j().equals("[DEFAULT]");
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ C9063a m12477m() {
        return null;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: b */
    public synchronized C7028a mo40026b(C6922c cVar, String str, C8213d dVar, C8930b bVar, Executor executor, C7034d dVar2, C7034d dVar3, C7034d dVar4, C7044j jVar, C7047l lVar, C7048m mVar) {
        C7028a aVar;
        C8930b bVar2;
        String str2 = str;
        synchronized (this) {
            if (!this.f9403a.containsKey(str2)) {
                Context context = this.f9404b;
                if (m12475k(cVar, str)) {
                    bVar2 = bVar;
                } else {
                    bVar2 = null;
                }
                C7028a aVar2 = new C7028a(context, cVar, dVar, bVar2, executor, dVar2, dVar3, dVar4, jVar, lVar, mVar);
                aVar2.mo40023m();
                this.f9403a.put(str2, aVar2);
            }
            aVar = this.f9403a.get(str2);
        }
        return aVar;
    }

    @VisibleForTesting
    /* renamed from: c */
    public synchronized C7028a mo40027c(String str) {
        C7034d d;
        C7034d d2;
        C7034d d3;
        C7048m i;
        C7047l h;
        d = m12471d(str, "fetch");
        d2 = m12471d(str, "activate");
        d3 = m12471d(str, "defaults");
        i = m12473i(this.f9404b, this.f9410h, str);
        h = m12472h(d2, d3);
        C7051o j = m12474j(this.f9406d, str, this.f9409g);
        if (j != null) {
            h.mo40060b(new C9580d(j));
        }
        return mo40026b(this.f9406d, str, this.f9407e, this.f9408f, this.f9405c, d, d2, d3, mo40029f(str, d, i), h, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C7028a mo40028e() {
        return mo40027c("firebase");
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: f */
    public synchronized C7044j mo40029f(String str, C7034d dVar, C7048m mVar) {
        C8213d dVar2;
        C8030b<C9063a> bVar;
        dVar2 = this.f9407e;
        if (m12476l(this.f9406d)) {
            bVar = this.f9409g;
        } else {
            new C9581e
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0012: CONSTRUCTOR  (r0v7 ? I:s8.e) =  call: s8.e.<init>():void type: CONSTRUCTOR in method: com.google.firebase.remoteconfig.c.f(java.lang.String, com.google.firebase.remoteconfig.internal.d, com.google.firebase.remoteconfig.internal.m):com.google.firebase.remoteconfig.internal.j, dex: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v7 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 38 more
                */
            /*
                this = this;
                monitor-enter(r11)
                com.google.firebase.remoteconfig.internal.j r10 = new com.google.firebase.remoteconfig.internal.j     // Catch:{ all -> 0x0034 }
                i8.d r1 = r11.f9407e     // Catch:{ all -> 0x0034 }
                com.google.firebase.c r0 = r11.f9406d     // Catch:{ all -> 0x0034 }
                boolean r0 = m12476l(r0)     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                h8.b<p6.a> r0 = r11.f9409g     // Catch:{ all -> 0x0034 }
                goto L_0x0015
            L_0x0010:
                s8.e r0 = new s8.e     // Catch:{ all -> 0x0034 }
                r0.<init>()     // Catch:{ all -> 0x0034 }
            L_0x0015:
                r2 = r0
                java.util.concurrent.ExecutorService r3 = r11.f9405c     // Catch:{ all -> 0x0034 }
                y4.e r4 = f9401j     // Catch:{ all -> 0x0034 }
                java.util.Random r5 = f9402k     // Catch:{ all -> 0x0034 }
                com.google.firebase.c r0 = r11.f9406d     // Catch:{ all -> 0x0034 }
                com.google.firebase.h r0 = r0.mo39769k()     // Catch:{ all -> 0x0034 }
                java.lang.String r0 = r0.mo39784b()     // Catch:{ all -> 0x0034 }
                com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient r7 = r11.mo40030g(r0, r12, r14)     // Catch:{ all -> 0x0034 }
                java.util.Map<java.lang.String, java.lang.String> r9 = r11.f9411i     // Catch:{ all -> 0x0034 }
                r0 = r10
                r6 = r13
                r8 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0034 }
                monitor-exit(r11)
                return r10
            L_0x0034:
                r12 = move-exception
                monitor-exit(r11)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.C7030c.mo40029f(java.lang.String, com.google.firebase.remoteconfig.internal.d, com.google.firebase.remoteconfig.internal.m):com.google.firebase.remoteconfig.internal.j");
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        /* renamed from: g */
        public ConfigFetchHttpClient mo40030g(String str, String str2, C7048m mVar) {
            return new ConfigFetchHttpClient(this.f9404b, this.f9406d.mo39769k().mo39785c(), str, str2, mVar.mo40063b(), mVar.mo40063b());
        }

        @VisibleForTesting
        protected C7030c(Context context, ExecutorService executorService, C6922c cVar, C8213d dVar, C8930b bVar, C8030b<C9063a> bVar2, boolean z) {
            this.f9403a = new HashMap();
            this.f9411i = new HashMap();
            this.f9404b = context;
            this.f9405c = executorService;
            this.f9406d = cVar;
            this.f9407e = dVar;
            this.f9408f = bVar;
            this.f9409g = bVar2;
            this.f9410h = cVar.mo39769k().mo39785c();
            if (z) {
                C10410i.m21829c(executorService, new C7029b(this));
            }
        }
    }
