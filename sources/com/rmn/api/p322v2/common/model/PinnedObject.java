package com.rmn.api.p322v2.common.model;

import com.rmn.api.p322v2.common.pinned_object.PinnedObjectModel;
import com.rmn.api.p322v2.common.pinned_object.PinnedObjectType;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import com.rmn.api.p322v2.main.model.AbstractModel;
import com.rmn.api.p322v2.main.model.ModelRef;
import java.util.Date;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.common.model.PinnedObject */
public class PinnedObject extends AbstractModel {
    private Date date_add;
    private Date date_update;

    /* renamed from: id */
    private String f17807id;
    private PinnedObjectModel model;
    private int modelId;
    private ModelRef<? extends AbstractModel> pinnedModelRef;
    private PinnedObjectType type;

    public PinnedObject() {
    }

    private void parseCoupon(JSONObject jSONObject) {
        try {
            ParsingManagerJson.unserializeField(ParsingMode.NETWORK, jSONObject, "Coupon", (Object) this, "pinnedModelRef", (Class<?>) BaseCoupon.class);
        } catch (Exception e) {
            C13633n.m31165u(this, e);
        }
        if (this.pinnedModelRef != null) {
            try {
                ParsingManagerJson.unserializeField(ParsingMode.NETWORK, jSONObject.optJSONObject("Coupon"), "Merchant", this.pinnedModelRef, BaseCoupon.class, 0, "merchant_info", BaseMerchant.class);
            } catch (Exception e2) {
                C13633n.m31165u(this, e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finishUnserializeFromNetworkData(JSONObject jSONObject) {
        PinnedObjectModel pinnedObjectModel = this.model;
        if (pinnedObjectModel == PinnedObjectModel.COUPON) {
            parseCoupon(jSONObject);
        } else if (pinnedObjectModel == PinnedObjectModel.MERCHANT) {
            ParsingManagerJson.unserializeField(ParsingMode.NETWORK, jSONObject, "Merchant", (Object) this, "pinnedModelRef", (Class<?>) BaseMerchant.class);
        }
        ModelRef<? extends AbstractModel> modelRef = this.pinnedModelRef;
        if (modelRef != null) {
            Object obj = modelRef.get();
            if (obj instanceof BaseCoupon) {
                this.modelId = ((BaseCoupon) obj).getCouponId();
            } else if (obj instanceof BaseMerchant) {
                this.modelId = ((BaseMerchant) obj).getMerchantId();
            }
            if (!isModelValidAfterParsing()) {
                throw new Exception("Automatic unserializing problem");
            }
            return;
        }
        throw new IllegalStateException("Pinned object not parsed");
    }

    public Date getDateAdd() {
        return this.date_add;
    }

    public Date getDateUpdate() {
        return this.date_update;
    }

    public Object getIdentifier() {
        if (this.type == null) {
            throw new IllegalStateException();
        } else if (this.model != null) {
            return this.type.getJSONValue() + "_" + this.model.getJSONValue() + "_" + this.modelId;
        } else {
            throw new IllegalStateException();
        }
    }

    public PinnedObjectModel getModel() {
        return this.model;
    }

    public int getModelId() {
        return this.modelId;
    }

    public BaseCoupon getPinnedCoupon() {
        if (this.model == PinnedObjectModel.COUPON) {
            return (BaseCoupon) getPinnedModel();
        }
        throw new IllegalStateException("The pinned object type is not a BaseCoupon");
    }

    public BaseMerchant getPinnedMerchant() {
        if (this.model == PinnedObjectModel.MERCHANT) {
            return (BaseMerchant) getPinnedModel();
        }
        throw new IllegalStateException("The pinned object type is not a BaseMerchant");
    }

    public AbstractModel getPinnedModel() {
        return ModelRef.getModelOrNull(this.pinnedModelRef);
    }

    public PinnedObjectType getType() {
        return this.type;
    }

    public boolean isModelValidAfterParsing() {
        if (this.type == null || this.model == null || this.modelId <= 0) {
            return false;
        }
        return true;
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        ParsingManagerJson.serializeObjectExcludingFields(jSONObject, (Object) this, "pinnedModelRef");
        String jSONObject2 = jSONObject.toString();
        C13633n.m31159o(this, getClass().getSimpleName() + " serialized :\n" + jSONObject2);
        return jSONObject2;
    }

    public void setPinnedModelRef(ModelRef<? extends AbstractModel> modelRef) {
        if (modelRef == null) {
            throw new IllegalArgumentException();
        } else if (this.model != null) {
            Object obj = modelRef.get();
            PinnedObjectModel pinnedObjectModel = this.model;
            if (pinnedObjectModel == PinnedObjectModel.COUPON) {
                if (obj instanceof BaseCoupon) {
                    BaseCoupon baseCoupon = (BaseCoupon) obj;
                    if (this.modelId != baseCoupon.getCouponId()) {
                        throw new IllegalArgumentException("The model id is different from the pinned mode identifier : " + this.modelId + " => " + baseCoupon.getCouponId());
                    }
                } else {
                    throw new IllegalArgumentException("The pinned object type is not a BaseCoupon");
                }
            } else if (pinnedObjectModel == PinnedObjectModel.MERCHANT) {
                if (obj instanceof BaseMerchant) {
                    BaseMerchant baseMerchant = (BaseMerchant) obj;
                    if (this.modelId != baseMerchant.getMerchantId()) {
                        throw new IllegalArgumentException("The model id is different from the pinned mode identifier : " + this.modelId + " => " + baseMerchant.getMerchantId());
                    }
                } else {
                    throw new IllegalArgumentException("The pinned object type is not a BaseMerchant");
                }
            }
            this.pinnedModelRef = modelRef;
        } else {
            throw new IllegalStateException("Pinned object model not set yet");
        }
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObjectExcludingFields(ParsingMode.CACHE, new JSONObject(str), (Object) this, "pinnedModelRef");
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        ParsingManagerJson.unserializeObjectExcludingFields(ParsingMode.NETWORK, jSONObject, (Object) this, "pinnedModelRef", "modelId", "isOnline");
        finishUnserializeFromNetworkData(jSONObject);
    }

    public PinnedObject(PinnedObjectType pinnedObjectType, PinnedObjectModel pinnedObjectModel, Date date, AbstractModel abstractModel) {
        if (pinnedObjectType == null) {
            throw new IllegalArgumentException();
        } else if (pinnedObjectModel == null) {
            throw new IllegalArgumentException();
        } else if (date == null) {
            throw new IllegalArgumentException();
        } else if (abstractModel == null) {
            throw new IllegalArgumentException();
        } else if (pinnedObjectModel == PinnedObjectModel.COUPON && !(abstractModel instanceof BaseCoupon)) {
            throw new IllegalArgumentException();
        } else if (pinnedObjectModel != PinnedObjectModel.MERCHANT || (abstractModel instanceof BaseMerchant)) {
            this.type = pinnedObjectType;
            this.model = pinnedObjectModel;
            this.date_add = date;
            this.date_update = date;
            this.pinnedModelRef = ModelRef.getModelReferenceOrNew(abstractModel);
            if (abstractModel instanceof BaseCoupon) {
                this.modelId = ((BaseCoupon) abstractModel).getCouponId();
            } else if (abstractModel instanceof BaseMerchant) {
                this.modelId = ((BaseMerchant) abstractModel).getMerchantId();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
