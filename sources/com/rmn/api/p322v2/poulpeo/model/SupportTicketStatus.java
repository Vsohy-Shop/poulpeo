package com.rmn.api.p322v2.poulpeo.model;

import androidx.core.app.NotificationCompat;
import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.poulpeo.model.SupportTicketStatus */
public enum SupportTicketStatus implements IJsonSerialisableEnum {
    NEW((String) null) {
        public Object getJSONValue() {
            return "new";
        }
    },
    UNVERIFIED((String) null) {
        public Object getJSONValue() {
            return "unverified";
        }
    },
    PENDING((String) null) {
        public Object getJSONValue() {
            return "pending";
        }
    },
    ACCEPTED((String) null) {
        public Object getJSONValue() {
            return "accepted";
        }
    },
    CANCELED((String) null) {
        public Object getJSONValue() {
            return "canceled";
        }
    },
    REMINDER((String) null) {
        public Object getJSONValue() {
            return NotificationCompat.CATEGORY_REMINDER;
        }
    },
    CLOSED((String) null) {
        public Object getJSONValue() {
            return "close";
        }
    };
}
