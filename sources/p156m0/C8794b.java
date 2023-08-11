package p156m0;

import android.net.Uri;
import com.appboy.enums.Channel;
import com.appboy.models.cards.Card;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p069e0.C7358a;
import p069e0.C7360c;
import p069e0.C7416r;
import p156m0.C8781a;
import p166n0.C8846d;
import p166n0.C8865o;
import p336ef.C11906l;

/* renamed from: m0.b */
/* compiled from: BrazeActionUtils.kt */
public final class C8794b {

    /* renamed from: m0.b$a */
    /* compiled from: BrazeActionUtils.kt */
    public /* synthetic */ class C8795a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12750a;

        static {
            int[] iArr = new int[C8781a.C8782a.values().length];
            iArr[C8781a.C8782a.CONTAINER.ordinal()] = 1;
            f12750a = iArr;
        }
    }

    /* renamed from: a */
    public static final boolean m17807a(C7358a aVar) {
        C12775o.m28639i(aVar, "<this>");
        return m17810d(C8781a.C8782a.REQUEST_PUSH_PERMISSION, m17812f(aVar));
    }

    /* renamed from: b */
    public static final boolean m17808b(Card card) {
        C12775o.m28639i(card, "<this>");
        if (card.getUrl() != null) {
            return m17810d(C8781a.C8782a.INVALID, C12723v.m28509d(Uri.parse(card.getUrl())));
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m17809c(C7358a aVar) {
        C12775o.m28639i(aVar, "<this>");
        return m17810d(C8781a.C8782a.INVALID, m17812f(aVar));
    }

    /* renamed from: d */
    public static final boolean m17810d(C8781a.C8782a aVar, List<? extends Uri> list) {
        boolean z;
        JSONObject jSONObject;
        C12775o.m28639i(aVar, "actionType");
        C12775o.m28639i(list, "uriList");
        ArrayList<Uri> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (C8781a.f12718a.mo42940d((Uri) next)) {
                arrayList.add(next);
            }
        }
        ArrayList<JSONObject> arrayList2 = new ArrayList<>(C12728x.m28544v(arrayList, 10));
        for (Uri c : arrayList) {
            C11906l c2 = C8781a.f12718a.mo42939c(c);
            if (c2 == null) {
                jSONObject = null;
            } else {
                jSONObject = (JSONObject) c2.mo49112d();
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            arrayList2.add(jSONObject);
        }
        ArrayList<C8781a.C8782a> arrayList3 = new ArrayList<>();
        for (JSONObject e : arrayList2) {
            boolean unused = C12669b0.m28178B(arrayList3, m17811e(e));
        }
        if (arrayList3.isEmpty()) {
            return false;
        }
        for (C8781a.C8782a aVar2 : arrayList3) {
            if (aVar2 == aVar) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final /* synthetic */ List m17811e(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "json");
        ArrayList arrayList = new ArrayList();
        C8865o oVar = new C8865o(jSONObject, (Channel) null, 2, (DefaultConstructorMarker) null);
        C8781a.C8782a b = C8781a.f12718a.mo42938b(oVar);
        if (C8795a.f12750a[b.ordinal()] == 1) {
            Iterator c = C8846d.f12814b.mo42978c(oVar);
            while (c.hasNext()) {
                arrayList.addAll(m17811e((JSONObject) c.next()));
            }
        } else {
            arrayList.add(b);
        }
        return arrayList;
    }

    /* renamed from: f */
    public static final /* synthetic */ List m17812f(C7358a aVar) {
        if (aVar == null) {
            return C12726w.m28524k();
        }
        ArrayList arrayList = new ArrayList();
        Uri d0 = aVar.mo40960d0();
        if (d0 != null) {
            arrayList.add(d0);
        }
        if (aVar instanceof C7360c) {
            ArrayList arrayList2 = new ArrayList();
            for (C7416r d02 : ((C7360c) aVar).mo40975R()) {
                Uri d03 = d02.mo41061d0();
                if (d03 != null) {
                    arrayList2.add(d03);
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }
}
