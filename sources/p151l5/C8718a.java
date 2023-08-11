package p151l5;

import androidx.core.app.NotificationCompat;
import p153l7.C8746b;
import p153l7.C8749c;
import p153l7.C8750d;
import p204q8.C9325a;

/* renamed from: l5.a */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
final class C8718a implements C8749c<C9325a> {

    /* renamed from: a */
    static final C8718a f12533a = new C8718a();

    /* renamed from: b */
    private static final C8746b f12534b;

    /* renamed from: c */
    private static final C8746b f12535c;

    /* renamed from: d */
    private static final C8746b f12536d;

    /* renamed from: e */
    private static final C8746b f12537e;

    /* renamed from: f */
    private static final C8746b f12538f;

    /* renamed from: g */
    private static final C8746b f12539g;

    /* renamed from: h */
    private static final C8746b f12540h;

    /* renamed from: i */
    private static final C8746b f12541i;

    /* renamed from: j */
    private static final C8746b f12542j;

    /* renamed from: k */
    private static final C8746b f12543k;

    /* renamed from: l */
    private static final C8746b f12544l;

    /* renamed from: m */
    private static final C8746b f12545m;

    /* renamed from: n */
    private static final C8746b f12546n;

    /* renamed from: o */
    private static final C8746b f12547o;

    /* renamed from: p */
    private static final C8746b f12548p;

    static {
        C8746b.C8748b a = C8746b.m17693a("projectNumber");
        C8732o oVar = new C8732o();
        oVar.mo42861a(1);
        f12534b = a.mo42892b(oVar.mo42862b()).mo42891a();
        C8746b.C8748b a2 = C8746b.m17693a("messageId");
        C8732o oVar2 = new C8732o();
        oVar2.mo42861a(2);
        f12535c = a2.mo42892b(oVar2.mo42862b()).mo42891a();
        C8746b.C8748b a3 = C8746b.m17693a("instanceId");
        C8732o oVar3 = new C8732o();
        oVar3.mo42861a(3);
        f12536d = a3.mo42892b(oVar3.mo42862b()).mo42891a();
        C8746b.C8748b a4 = C8746b.m17693a("messageType");
        C8732o oVar4 = new C8732o();
        oVar4.mo42861a(4);
        f12537e = a4.mo42892b(oVar4.mo42862b()).mo42891a();
        C8746b.C8748b a5 = C8746b.m17693a("sdkPlatform");
        C8732o oVar5 = new C8732o();
        oVar5.mo42861a(5);
        f12538f = a5.mo42892b(oVar5.mo42862b()).mo42891a();
        C8746b.C8748b a6 = C8746b.m17693a("packageName");
        C8732o oVar6 = new C8732o();
        oVar6.mo42861a(6);
        f12539g = a6.mo42892b(oVar6.mo42862b()).mo42891a();
        C8746b.C8748b a7 = C8746b.m17693a("collapseKey");
        C8732o oVar7 = new C8732o();
        oVar7.mo42861a(7);
        f12540h = a7.mo42892b(oVar7.mo42862b()).mo42891a();
        C8746b.C8748b a8 = C8746b.m17693a("priority");
        C8732o oVar8 = new C8732o();
        oVar8.mo42861a(8);
        f12541i = a8.mo42892b(oVar8.mo42862b()).mo42891a();
        C8746b.C8748b a9 = C8746b.m17693a("ttl");
        C8732o oVar9 = new C8732o();
        oVar9.mo42861a(9);
        f12542j = a9.mo42892b(oVar9.mo42862b()).mo42891a();
        C8746b.C8748b a10 = C8746b.m17693a("topic");
        C8732o oVar10 = new C8732o();
        oVar10.mo42861a(10);
        f12543k = a10.mo42892b(oVar10.mo42862b()).mo42891a();
        C8746b.C8748b a11 = C8746b.m17693a("bulkId");
        C8732o oVar11 = new C8732o();
        oVar11.mo42861a(11);
        f12544l = a11.mo42892b(oVar11.mo42862b()).mo42891a();
        C8746b.C8748b a12 = C8746b.m17693a(NotificationCompat.CATEGORY_EVENT);
        C8732o oVar12 = new C8732o();
        oVar12.mo42861a(12);
        f12545m = a12.mo42892b(oVar12.mo42862b()).mo42891a();
        C8746b.C8748b a13 = C8746b.m17693a("analyticsLabel");
        C8732o oVar13 = new C8732o();
        oVar13.mo42861a(13);
        f12546n = a13.mo42892b(oVar13.mo42862b()).mo42891a();
        C8746b.C8748b a14 = C8746b.m17693a("campaignId");
        C8732o oVar14 = new C8732o();
        oVar14.mo42861a(14);
        f12547o = a14.mo42892b(oVar14.mo42862b()).mo42891a();
        C8746b.C8748b a15 = C8746b.m17693a("composerLabel");
        C8732o oVar15 = new C8732o();
        oVar15.mo42861a(15);
        f12548p = a15.mo42892b(oVar15.mo42862b()).mo42891a();
    }

    private C8718a() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42340a(Object obj, Object obj2) {
        C9325a aVar = (C9325a) obj;
        C8750d dVar = (C8750d) obj2;
        dVar.mo42869b(f12534b, aVar.mo43626l());
        dVar.mo42873f(f12535c, aVar.mo43622h());
        dVar.mo42873f(f12536d, aVar.mo43621g());
        dVar.mo42873f(f12537e, aVar.mo43623i());
        dVar.mo42873f(f12538f, aVar.mo43627m());
        dVar.mo42873f(f12539g, aVar.mo43624j());
        dVar.mo42873f(f12540h, aVar.mo43618d());
        dVar.mo42868a(f12541i, aVar.mo43625k());
        dVar.mo42868a(f12542j, aVar.mo43629o());
        dVar.mo42873f(f12543k, aVar.mo43628n());
        dVar.mo42869b(f12544l, aVar.mo43616b());
        dVar.mo42873f(f12545m, aVar.mo43620f());
        dVar.mo42873f(f12546n, aVar.mo43615a());
        dVar.mo42869b(f12547o, aVar.mo43617c());
        dVar.mo42873f(f12548p, aVar.mo43619e());
    }
}
