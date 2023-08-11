package com.rmn.api.p322v2.main.oauth;

import androidx.browser.trusted.sharing.ShareTarget;

/* renamed from: com.rmn.api.v2.main.oauth.HttpMethod */
public enum HttpMethod {
    GET((String) null) {
        public String toString() {
            return ShareTarget.METHOD_GET;
        }
    },
    POST((String) null) {
        public String toString() {
            return ShareTarget.METHOD_POST;
        }
    };
}
