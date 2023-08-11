package com.rmn.p324ui.views.listview;

import java.util.HashMap;
import java.util.Map;
import p311bd.C10932b;

/* renamed from: com.rmn.ui.views.listview.c */
/* compiled from: BaseListViewMessageBundle */
public class C11654c {

    /* renamed from: a */
    private Map<C10932b, String> f18127a = new HashMap();

    /* renamed from: a */
    public final String mo47899a(C10932b bVar, String str) {
        if (bVar == null) {
            throw new IllegalArgumentException();
        } else if (!this.f18127a.containsKey(bVar)) {
            return str;
        } else {
            return this.f18127a.get(bVar);
        }
    }

    /* renamed from: b */
    public final void mo47900b(C10932b bVar, String str) {
        if (bVar == null) {
            throw new IllegalArgumentException();
        } else if (str == null || str.equals("")) {
            this.f18127a.remove(bVar);
        } else {
            this.f18127a.put(bVar, str);
        }
    }
}
