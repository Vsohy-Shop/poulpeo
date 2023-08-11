package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.C11228R;
import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;

/* renamed from: com.rmn.api.v2.common.model.submodel.CouponType */
public enum CouponType implements IJsonSerialisableEnum {
    CODE_PROMO(1, (int) null) {
        /* access modifiers changed from: protected */
        public ResourceStringWrapper initName() {
            return new ResourceStringWrapper(C11228R.string.offer_type_code_promo);
        }
    },
    SOLDES(2, (int) null) {
        /* access modifiers changed from: protected */
        public ResourceStringWrapper initName() {
            return new ResourceStringWrapper(C11228R.string.offer_type_soldes);
        }
    },
    DESTOCKAGE(3, (int) null) {
        /* access modifiers changed from: protected */
        public ResourceStringWrapper initName() {
            return new ResourceStringWrapper(C11228R.string.offer_type_destockage);
        }
    },
    BON_PLAN(4, (int) null) {
        /* access modifiers changed from: protected */
        public ResourceStringWrapper initName() {
            return new ResourceStringWrapper(C11228R.string.offer_type_bon_plan);
        }
    },
    VENTE_PRIVEE(5, (int) null) {
        /* access modifiers changed from: protected */
        public ResourceStringWrapper initName() {
            return new ResourceStringWrapper(C11228R.string.offer_type_vente_privee);
        }
    },
    VENTE_FLASH(6, (int) null) {
        /* access modifiers changed from: protected */
        public ResourceStringWrapper initName() {
            return new ResourceStringWrapper(C11228R.string.offer_type_vente_flash);
        }
    },
    JEU_CONCOURS(8, (int) null) {
        /* access modifiers changed from: protected */
        public ResourceStringWrapper initName() {
            return new ResourceStringWrapper(C11228R.string.offer_type_jeu_concours);
        }
    },
    CARTE_CADEAU(9, (int) null) {
        /* access modifiers changed from: protected */
        public ResourceStringWrapper initName() {
            return new ResourceStringWrapper(C11228R.string.offer_carte_cadeau);
        }
    };
    

    /* renamed from: id */
    private final int f17808id;
    private ResourceStringWrapper name;

    public static CouponType getOfferType(int i) {
        for (CouponType couponType : values()) {
            if (couponType.f17808id == i) {
                return couponType;
            }
        }
        return null;
    }

    public int getId() {
        return this.f17808id;
    }

    public Object getJSONValue() {
        return Integer.valueOf(this.f17808id);
    }

    public ResourceStringWrapper getName() {
        return this.name;
    }

    /* access modifiers changed from: protected */
    public abstract ResourceStringWrapper initName();

    private CouponType(int i) {
        this.name = initName();
        this.f17808id = i;
    }
}
