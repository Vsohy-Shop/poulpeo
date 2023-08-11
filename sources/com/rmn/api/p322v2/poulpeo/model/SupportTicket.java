package com.rmn.api.p322v2.poulpeo.model;

import android.text.TextUtils;
import com.rmn.api.p322v2.common.model.submodel.CashbackType;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import com.rmn.api.p322v2.main.model.AbstractModel;
import java.util.Date;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.model.SupportTicket */
public class SupportTicket extends AbstractModel {
    private String comment;
    private Date date;
    private SupportTicketHistory[] histories;
    private int id_support_ticket;
    private Invoice[] invoices;
    private String merchant_name;
    private double order_amount;
    private double order_cashback_amount;
    private CashbackType order_cashback_type;
    private double order_cashback_value;
    private Date order_date;
    private String order_reference;
    private String reference;
    private SupportTicketStatus status;
    private String type;

    public String getComment() {
        return this.comment;
    }

    public Date getDate() {
        return this.date;
    }

    public SupportTicketHistory[] getHistories() {
        return this.histories;
    }

    public Object getIdentifier() {
        return Integer.valueOf(this.id_support_ticket);
    }

    public Invoice[] getInvoices() {
        return this.invoices;
    }

    public String getMerchantName() {
        return this.merchant_name;
    }

    public double getOrderAmount() {
        return this.order_amount;
    }

    public double getOrderCashbackAmount() {
        return this.order_cashback_amount;
    }

    public CashbackType getOrderCashbackType() {
        return this.order_cashback_type;
    }

    public double getOrderCashbackValue() {
        return this.order_cashback_value;
    }

    public Date getOrderDate() {
        return this.order_date;
    }

    public String getOrderReference() {
        return this.order_reference;
    }

    public String getReference() {
        return this.reference;
    }

    public SupportTicketStatus getStatus() {
        return this.status;
    }

    public int getSupportTicketId() {
        return this.id_support_ticket;
    }

    public String getType() {
        return this.type;
    }

    public boolean isFull() {
        SupportTicketHistory[] supportTicketHistoryArr = this.histories;
        if (supportTicketHistoryArr == null || supportTicketHistoryArr.length <= 0 || this.order_date == null || this.order_reference == null || this.order_cashback_type == null) {
            return false;
        }
        return true;
    }

    public boolean isModelValidAfterParsing() {
        if (this.id_support_ticket > 0 && !TextUtils.isEmpty(this.merchant_name.trim()) && this.date != null && !TextUtils.isEmpty(this.reference.trim()) && this.status != null) {
            return true;
        }
        return false;
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        ParsingManagerJson.serializeObject(jSONObject, this);
        String jSONObject2 = jSONObject.toString();
        C13633n.m31159o(this, getClass().getSimpleName() + " serialized :\n" + jSONObject2);
        return jSONObject2;
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObject(ParsingMode.CACHE, new JSONObject(str), this);
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        ParsingManagerJson.unserializeObject(ParsingMode.NETWORK, jSONObject, this);
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }
}
