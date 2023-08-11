package com.rmn.api.p322v2.poulpeo.model;

import android.text.TextUtils;
import com.rmn.api.p322v2.cloud.general.CloudUtil;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.model.HomeSectionMerchant */
public class HomeSectionMerchant extends BaseHomeSection {
    public static final String PINNED_OBJECT_TAG = "pinned_object";
    public static final int SUPER_CLASS_DEPTH = 1;
    private String illustration;
    private BaseMerchant[] merchants;
    private String title;
    private int total_count;

    public HomeSectionMerchant() {
    }

    /* access modifiers changed from: protected */
    public void finishNetworkUnserializing(JSONObject jSONObject) {
        this.illustration = CloudUtil.getFullUrl(this.illustration);
    }

    public String getIllustration() {
        return this.illustration;
    }

    public List<BaseMerchant> getMerchants() {
        BaseMerchant[] baseMerchantArr = this.merchants;
        if (baseMerchantArr == null) {
            return new ArrayList();
        }
        return Arrays.asList(baseMerchantArr);
    }

    public String getTitle() {
        return this.title;
    }

    public int getTotalCount() {
        return this.total_count;
    }

    public boolean hasIllustration() {
        return !TextUtils.isEmpty(this.illustration);
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        ParsingManagerJson.serializeObjectExcludingFields(jSONObject, (Object) this, 1, "merchants");
        String jSONObject2 = jSONObject.toString();
        C13633n.m31159o(this, getClass().getSimpleName() + " serialized :\n" + jSONObject2);
        return jSONObject2;
    }

    public void setMerchants(List<BaseMerchant> list) {
        if (list != null) {
            this.merchants = (BaseMerchant[]) list.toArray(new BaseMerchant[list.size()]);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObjectExcludingFields(ParsingMode.CACHE, new JSONObject(str), (Object) this, 1, "merchants");
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        ParsingManagerJson.unserializeObject(ParsingMode.NETWORK, jSONObject, this, 1);
        finishNetworkUnserializing(jSONObject);
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public HomeSectionMerchant(HomeSectionMerchant homeSectionMerchant, List<BaseMerchant> list) {
        super(homeSectionMerchant);
        this.title = homeSectionMerchant.title;
        this.illustration = homeSectionMerchant.illustration;
        if (list != null) {
            setMerchants(list);
        } else {
            BaseMerchant[] baseMerchantArr = homeSectionMerchant.merchants;
            if (baseMerchantArr != null) {
                int length = baseMerchantArr.length;
                BaseMerchant[] baseMerchantArr2 = new BaseMerchant[length];
                this.merchants = baseMerchantArr2;
                System.arraycopy(homeSectionMerchant.merchants, 0, baseMerchantArr2, 0, length);
            }
        }
        this.total_count = homeSectionMerchant.total_count;
    }
}
