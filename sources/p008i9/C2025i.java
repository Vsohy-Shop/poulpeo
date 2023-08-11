package p008i9;

import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.impl.api.models.submodels.page.SectionRepresentation;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionCampaignsList;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionCashbacksList;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionJumbotron;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionOffersList;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionText;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionTitle;
import java.util.HashMap;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p258v9.C10056a;
import p258v9.C10057b;
import p258v9.C10058c;
import p258v9.C10059d;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: i9.i */
/* compiled from: PageAdapter.kt */
public final class C2025i extends C13867a {

    /* renamed from: w */
    private static final C2026a f586w = new C2026a((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final int f587x = 8;

    /* renamed from: s */
    private final CallManager f588s;

    /* renamed from: t */
    private final C10058c f589t;

    /* renamed from: u */
    private final String f590u;

    /* renamed from: v */
    private final HashMap<Object, Integer> f591v = new HashMap<>();

    /* renamed from: i9.i$a */
    /* compiled from: PageAdapter.kt */
    private static final class C2026a {
        private C2026a() {
        }

        public /* synthetic */ C2026a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: i9.i$b */
    /* compiled from: PageAdapter.kt */
    public /* synthetic */ class C2027b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f592a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f593b;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|(2:1|2)|3|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0021 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002a */
        static {
            /*
                com.rmn.apiclient.impl.api.models.submodels.page.SectionRepresentation$Campaigns[] r0 = com.rmn.apiclient.impl.api.models.submodels.page.SectionRepresentation.Campaigns.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.rmn.apiclient.impl.api.models.submodels.page.SectionRepresentation$Campaigns r2 = com.rmn.apiclient.impl.api.models.submodels.page.SectionRepresentation.Campaigns.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                f592a = r0
                com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode$ShortCode[] r0 = com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode.ShortCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode$ShortCode r2 = com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode.ShortCode.BANNER1     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode$ShortCode r1 = com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode.ShortCode.BANNER2     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode$ShortCode r1 = com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode.ShortCode.FAVORITES     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                f593b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p008i9.C2025i.C2027b.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2025i(C13867a.C13868a aVar, CallManager callManager, C10058c cVar, String str) {
        super(aVar, 0, 2, (DefaultConstructorMarker) null);
        C12775o.m28639i(aVar, "listener");
        C12775o.m28639i(callManager, "callManager");
        C12775o.m28639i(cVar, "pageReload");
        C12775o.m28639i(str, "trackingPageName");
        this.f588s = callManager;
        this.f589t = cVar;
        this.f590u = str;
    }

    public int getItemViewType(int i) {
        int i2;
        int itemViewType = super.getItemViewType(i);
        if (itemViewType != C13867a.f22581i.mo53577d()) {
            return itemViewType;
        }
        Object item = getItem(i);
        if (item instanceof C10059d) {
            return 15;
        }
        if (item instanceof C10057b) {
            return 16;
        }
        if (item instanceof PageSectionCashbacksList) {
            return 10;
        }
        if (item instanceof PageSectionOffersList) {
            return 101;
        }
        if (item instanceof PageSectionCampaignsList) {
            SectionRepresentation.Campaigns campaigns = ((PageSectionCampaignsList) item).representation;
            if (campaigns == null) {
                i2 = -1;
            } else {
                i2 = C2027b.f592a[campaigns.ordinal()];
            }
            if (i2 == 1) {
                return 21;
            }
            return 20;
        } else if (item instanceof PageSectionTitle) {
            return 11;
        } else {
            if (item instanceof PageSectionText) {
                return 111;
            }
            if (item instanceof PageSectionJumbotron) {
                return 112;
            }
            if (item instanceof PageSectionShortCode) {
                int i3 = C2027b.f593b[((PageSectionShortCode) item).getShortCode().ordinal()];
                if (i3 == 1 || i3 == 2) {
                    return 12;
                }
                if (i3 == 3) {
                    return 17;
                }
            } else if (item instanceof C10056a) {
                return 22;
            }
            return 13;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo23225p(int i) {
        if (i == 101) {
            return R.layout.section_list_offer;
        }
        if (i == 111) {
            return R.layout.section_text;
        }
        if (i == 112) {
            return R.layout.section_jumbotron;
        }
        switch (i) {
            case 10:
                break;
            case 11:
                return R.layout.section_title;
            case 12:
                return R.layout.row_home_section_banner_1_cms;
            case 13:
                return R.layout.section_empty;
            default:
                switch (i) {
                    case 15:
                        return R.layout.row_search_section;
                    case 16:
                        return R.layout.view_offers_info_section;
                    case 17:
                        break;
                    default:
                        switch (i) {
                            case 20:
                            case 21:
                                return R.layout.section_list_campaigns;
                            case 22:
                                return R.layout.row_error_section;
                            default:
                                return super.mo23225p(i);
                        }
                }
        }
        return R.layout.section_list_cashback;
    }

    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r0v14, types: [ca.c] */
    /* JADX WARNING: type inference failed for: r15v15 */
    /* JADX WARNING: type inference failed for: r15v16 */
    /* JADX WARNING: type inference failed for: r1v7, types: [ca.b] */
    /* JADX WARNING: type inference failed for: r15v17 */
    /* JADX WARNING: type inference failed for: r15v18 */
    /* JADX WARNING: type inference failed for: r15v19 */
    /* JADX WARNING: type inference failed for: r15v20 */
    /* JADX WARNING: type inference failed for: r15v21 */
    /* JADX WARNING: type inference failed for: r0v15, types: [ba.e] */
    /* JADX WARNING: type inference failed for: r7v1, types: [y9.a] */
    /* JADX WARNING: type inference failed for: r1v8, types: [y9.j] */
    /* JADX WARNING: type inference failed for: r15v22 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p469zc.C14080a mo23226t(android.view.View r14, int r15) {
        /*
            r13 = this;
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = 101(0x65, float:1.42E-43)
            if (r15 == r0) goto L_0x00d2
            r0 = 111(0x6f, float:1.56E-43)
            if (r15 == r0) goto L_0x00b5
            r0 = 112(0x70, float:1.57E-43)
            if (r15 == r0) goto L_0x00ab
            switch(r15) {
                case 10: goto L_0x0098;
                case 11: goto L_0x008e;
                case 12: goto L_0x0082;
                case 13: goto L_0x0078;
                default: goto L_0x0014;
            }
        L_0x0014:
            switch(r15) {
                case 15: goto L_0x006c;
                case 16: goto L_0x0062;
                case 17: goto L_0x0050;
                default: goto L_0x0017;
            }
        L_0x0017:
            switch(r15) {
                case 20: goto L_0x003e;
                case 21: goto L_0x002b;
                case 22: goto L_0x0020;
                default: goto L_0x001a;
            }
        L_0x001a:
            zc.a r14 = super.mo23226t(r14, r15)
            goto L_0x00e4
        L_0x0020:
            aa.b r15 = new aa.b
            yc.a$a r0 = r13.mo53565o()
            r15.<init>(r14, r0)
            goto L_0x00a9
        L_0x002b:
            y9.j r15 = new y9.j
            yc.a$a r3 = r13.mo53565o()
            com.rmn.apiclient.core.data_access.base.call.CallManager r4 = r13.f588s
            v9.c r5 = r13.f589t
            java.lang.String r6 = r13.f590u
            r1 = r15
            r2 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x003e:
            y9.a r15 = new y9.a
            yc.a$a r9 = r13.mo53565o()
            com.rmn.apiclient.core.data_access.base.call.CallManager r10 = r13.f588s
            v9.c r11 = r13.f589t
            java.lang.String r12 = r13.f590u
            r7 = r15
            r8 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x00a9
        L_0x0050:
            ba.e r15 = new ba.e
            yc.a$a r2 = r13.mo53565o()
            com.rmn.apiclient.core.data_access.base.call.CallManager r3 = r13.f588s
            v9.c r4 = r13.f589t
            java.lang.String r5 = r13.f590u
            r0 = r15
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x00a9
        L_0x0062:
            da.b r15 = new da.b
            yc.a$a r0 = r13.mo53565o()
            r15.<init>(r14, r0)
            goto L_0x00a9
        L_0x006c:
            ea.b r15 = new ea.b
            yc.a$a r0 = r13.mo53565o()
            java.lang.String r1 = r13.f590u
            r15.<init>(r14, r0, r1)
            goto L_0x00a9
        L_0x0078:
            z9.a r15 = new z9.a
            yc.a$a r0 = r13.mo53565o()
            r15.<init>(r14, r0)
            goto L_0x00a9
        L_0x0082:
            x9.e r15 = new x9.e
            yc.a$a r0 = r13.mo53565o()
            java.lang.String r1 = r13.f590u
            r15.<init>(r14, r0, r1)
            goto L_0x00a9
        L_0x008e:
            fa.c r15 = new fa.c
            yc.a$a r0 = r13.mo53565o()
            r15.<init>(r14, r0)
            goto L_0x00a9
        L_0x0098:
            ca.b r15 = new ca.b
            yc.a$a r3 = r13.mo53565o()
            com.rmn.apiclient.core.data_access.base.call.CallManager r4 = r13.f588s
            v9.c r5 = r13.f589t
            java.lang.String r6 = r13.f590u
            r1 = r15
            r2 = r14
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x00a9:
            r14 = r15
            goto L_0x00e4
        L_0x00ab:
            fa.a r15 = new fa.a
            yc.a$a r0 = r13.mo53565o()
            r15.<init>(r14, r0)
            goto L_0x00a9
        L_0x00b5:
            fa.b r15 = new fa.b
            androidx.compose.ui.platform.ComposeView r6 = new androidx.compose.ui.platform.ComposeView
            android.content.Context r1 = r14.getContext()
            java.lang.String r14 = "itemView.context"
            kotlin.jvm.internal.C12775o.m28638h(r1, r14)
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            yc.a$a r14 = r13.mo53565o()
            r15.<init>(r6, r14)
            goto L_0x00a9
        L_0x00d2:
            ca.c r15 = new ca.c
            yc.a$a r2 = r13.mo53565o()
            com.rmn.apiclient.core.data_access.base.call.CallManager r3 = r13.f588s
            v9.c r4 = r13.f589t
            java.lang.String r5 = r13.f590u
            r0 = r15
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x00a9
        L_0x00e4:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p008i9.C2025i.mo23226t(android.view.View, int):zc.a");
    }
}
