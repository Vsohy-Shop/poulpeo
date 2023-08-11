package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.b */
public abstract class C6693b {
    /* renamed from: a */
    public static C6693b m11338a(long j, Map<String, AssetPackState> map) {
        return new C6713f0(j, map);
    }

    /* renamed from: b */
    public static C6693b m11339b(Bundle bundle, C6777v0 v0Var) {
        return m11340c(bundle, v0Var, new ArrayList());
    }

    /* renamed from: c */
    public static C6693b m11340c(Bundle bundle, C6777v0 v0Var, List<String> list) {
        return m11341d(bundle, v0Var, list, C6788y.f8904a);
    }

    /* renamed from: d */
    private static C6693b m11341d(Bundle bundle, C6777v0 v0Var, List<String> list, C6780w wVar) {
        Bundle bundle2 = bundle;
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, AssetPackState.m11322a(bundle, str, v0Var, wVar));
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str2 = list.get(i2);
            hashMap.put(str2, AssetPackState.m11323b(str2, 4, 0, 0, 0, 0.0d));
        }
        return m11338a(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    /* renamed from: e */
    public abstract Map<String, AssetPackState> mo39263e();

    /* renamed from: f */
    public abstract long mo39264f();
}
