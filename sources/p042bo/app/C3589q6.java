package p042bo.app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import org.json.JSONObject;

/* renamed from: bo.app.q6 */
public abstract class C3589q6 extends C3515o6 {

    /* renamed from: h */
    private Map<String, String> f2427h = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C3589q6(JSONObject jSONObject) {
        super(jSONObject);
        C12775o.m28639i(jSONObject, "json");
    }

    /* renamed from: a */
    public void mo28654a(Map<String, String> map) {
        C12775o.m28639i(map, "remoteAssetToLocalAssetPaths");
        this.f2427h = new HashMap(map);
    }

    public abstract /* synthetic */ Object forJsonPut();

    /* renamed from: y */
    public Map<String, String> mo29545y() {
        return C12716r0.m28427r(this.f2427h);
    }
}
