package com.rmn.apiclient.impl.api.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.BaseModel;
import com.rmn.apiclient.core.model.IDisplayable;
import com.rmn.apiclient.core.model.ModelReference;
import com.rmn.apiclient.core.model.ModelRelationship;
import com.rmn.apiclient.core.model.ModelRelationshipList;
import com.rmn.apiclient.core.model.RemoteImage;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferCodeType;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferDiscount;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferIcon;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferType;
import java.util.Date;
import java.util.List;

public class Offer extends BaseModel implements IDisplayable {
    public final boolean canCombineCashbackAndOffersCodes = BaseModel.defaultBoolean();
    @NonNull
    public final ModelRelationship<CashbackObject> cashbackObjectRelationship;
    @Nullable
    public final String code = null;
    @Nullable
    public final OfferCodeType codeType = null;
    public final boolean connectionNeeded = BaseModel.defaultBoolean();
    @Nullable
    public final Date dateEnd = null;
    @Nullable
    public final Date dateEndValidity = null;
    @Nullable
    public final Date dateStart = null;
    @Nullable
    public final Date dateStartValidity = null;
    @Nullable
    public final String deepUrl = null;
    @NonNull
    public final String description = BaseModel.defaultString();
    @NonNull
    public final String descriptionHtml = BaseModel.defaultString();
    @Nullable
    public final OfferDiscount discount = null;
    public final boolean dynamicOffer = BaseModel.defaultBoolean();
    public final boolean exclusive = BaseModel.defaultBoolean();
    public final boolean hasGift = BaseModel.defaultBoolean();
    public final boolean hasShipping = BaseModel.defaultBoolean();
    @Nullable
    public final OfferIcon icon = null;
    @NonNull
    public final ModelRelationship<Merchant> merchantRelationship;
    @Nullable
    public final RemoteImage mobileIllustration = null;
    @NonNull
    private final OfferType offerTypeId;
    public final float scoreAlgo = ((float) BaseModel.defaultNumber());
    @NonNull
    public final String shortTitle = BaseModel.defaultString();
    @NonNull
    public final ModelRelationshipList<Tag> tagsRelationship;
    @NonNull
    public final String title;
    public final boolean verified = BaseModel.defaultBoolean();

    public Offer(@NonNull String str, @Nullable ModelReference<Merchant> modelReference, @Nullable ModelReference<CashbackObject> modelReference2, @Nullable List<String> list, @NonNull OfferType offerType, @NonNull String str2) {
        super(str);
        ModelRelationshipList<Tag> modelRelationshipList = new ModelRelationshipList<>();
        this.tagsRelationship = modelRelationshipList;
        this.merchantRelationship = new ModelRelationship<>(modelReference);
        this.cashbackObjectRelationship = new ModelRelationship<>(modelReference2);
        modelRelationshipList.addIds(list);
        this.title = str2;
        this.offerTypeId = offerType;
    }

    @Nullable
    public CashbackObject getCashbackObject() {
        return this.cashbackObjectRelationship.getModel();
    }

    @Nullable
    public Date getDateEnd() {
        return this.dateEnd;
    }

    @Nullable
    public Date getDateEndValidity() {
        return this.dateEndValidity;
    }

    @Nullable
    public Date getDateStart() {
        return this.dateStart;
    }

    @Nullable
    public Date getDateStartValidity() {
        return this.dateStartValidity;
    }

    @NonNull
    public String getId() {
        return this.f18063id;
    }

    @Nullable
    public Merchant getMerchant() {
        return this.merchantRelationship.getModel();
    }

    @NonNull
    public OfferType getOfferType() {
        return this.offerTypeId;
    }

    public boolean hasCashback() {
        return this.cashbackObjectRelationship.exists();
    }

    @NonNull
    public String toString() {
        return "Offer{id='" + this.f18063id + '\'' + ", merchantRelationship.id='" + this.merchantRelationship.f18064id + '\'' + ", cashbackObjectRelationship.id='" + this.cashbackObjectRelationship.f18064id + '\'' + ", title='" + this.title + '\'' + '}';
    }
}
