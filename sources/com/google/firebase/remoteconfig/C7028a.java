package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.C6922c;
import com.google.firebase.abt.AbtException;
import com.google.firebase.remoteconfig.internal.C7034d;
import com.google.firebase.remoteconfig.internal.C7037e;
import com.google.firebase.remoteconfig.internal.C7044j;
import com.google.firebase.remoteconfig.internal.C7047l;
import com.google.firebase.remoteconfig.internal.C7048m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p124i8.C8213d;
import p172n6.C8930b;
import p224s8.C9577a;
import p224s8.C9578b;
import p224s8.C9579c;
import p276x5.C10410i;

/* renamed from: com.google.firebase.remoteconfig.a */
/* compiled from: FirebaseRemoteConfig */
public class C7028a {

    /* renamed from: l */
    public static final byte[] f9388l = new byte[0];

    /* renamed from: a */
    private final Context f9389a;

    /* renamed from: b */
    private final C6922c f9390b;
    @Nullable

    /* renamed from: c */
    private final C8930b f9391c;

    /* renamed from: d */
    private final Executor f9392d;

    /* renamed from: e */
    private final C7034d f9393e;

    /* renamed from: f */
    private final C7034d f9394f;

    /* renamed from: g */
    private final C7034d f9395g;

    /* renamed from: h */
    private final C7044j f9396h;

    /* renamed from: i */
    private final C7047l f9397i;

    /* renamed from: j */
    private final C7048m f9398j;

    /* renamed from: k */
    private final C8213d f9399k;

    C7028a(Context context, C6922c cVar, C8213d dVar, @Nullable C8930b bVar, Executor executor, C7034d dVar2, C7034d dVar3, C7034d dVar4, C7044j jVar, C7047l lVar, C7048m mVar) {
        this.f9389a = context;
        this.f9390b = cVar;
        this.f9399k = dVar;
        this.f9391c = bVar;
        this.f9392d = executor;
        this.f9393e = dVar2;
        this.f9394f = dVar3;
        this.f9395g = dVar4;
        this.f9396h = jVar;
        this.f9397i = lVar;
        this.f9398j = mVar;
    }

    @NonNull
    /* renamed from: f */
    public static C7028a m12458f() {
        return m12459g(C6922c.m12057i());
    }

    @NonNull
    /* renamed from: g */
    public static C7028a m12459g(@NonNull C6922c cVar) {
        return ((C7030c) cVar.mo39765g(C7030c.class)).mo40028e();
    }

    /* renamed from: i */
    private static boolean m12460i(C7037e eVar, @Nullable C7037e eVar2) {
        if (eVar2 == null || !eVar.mo40045e().equals(eVar2.mo40045e())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Task m12461j(Task task, Task task2, Task task3) {
        if (!task.mo35465p() || task.mo35461l() == null) {
            return C10410i.m21831e(Boolean.FALSE);
        }
        C7037e eVar = (C7037e) task.mo35461l();
        if (!task2.mo35465p() || m12460i(eVar, (C7037e) task2.mo35461l())) {
            return this.f9394f.mo40039k(eVar).mo35457h(this.f9392d, new C9579c(this));
        }
        return C10410i.m21831e(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public boolean m12463l(Task<C7037e> task) {
        if (!task.mo35465p()) {
            return false;
        }
        this.f9393e.mo40035d();
        if (task.mo35461l() != null) {
            mo40024o(task.mo35461l().mo40043c());
            return true;
        }
        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
        return true;
    }

    @VisibleForTesting
    /* renamed from: n */
    static List<Map<String, String>> m12464n(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: d */
    public Task<Boolean> mo40020d() {
        Task<C7037e> e = this.f9393e.mo40036e();
        Task<C7037e> e2 = this.f9394f.mo40036e();
        return C10410i.m21835i(e, e2).mo35459j(this.f9392d, new C9578b(this, e, e2));
    }

    @NonNull
    /* renamed from: e */
    public Task<Void> mo40021e(long j) {
        return this.f9396h.mo40055h(j).mo35467r(new C9577a());
    }

    @NonNull
    /* renamed from: h */
    public String mo40022h(@NonNull String str) {
        return this.f9397i.mo40061e(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo40023m() {
        this.f9394f.mo40036e();
        this.f9395g.mo40036e();
        this.f9393e.mo40036e();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: o */
    public void mo40024o(@NonNull JSONArray jSONArray) {
        if (this.f9391c != null) {
            try {
                this.f9391c.mo43071k(m12464n(jSONArray));
            } catch (JSONException e) {
                Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e);
            } catch (AbtException e2) {
                Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e2);
            }
        }
    }
}
