package com.rmn.api.p322v2.main.oauth;

/* renamed from: com.rmn.api.v2.main.oauth.TokensBundle */
public class TokensBundle {
    public final String key;
    public final String secret;

    public TokensBundle(String str, String str2) {
        this.key = str;
        this.secret = str2;
    }

    public TokensBundle(String str) {
        String str2 = null;
        String str3 = null;
        for (String split : str.split("&")) {
            String[] split2 = split.split("=");
            if (split2.length >= 2) {
                if ("oauth_token".equals(split2[0])) {
                    str2 = split2[1];
                } else if ("oauth_token_secret".equals(split2[0])) {
                    str3 = split2[1];
                }
            }
        }
        this.key = str2;
        this.secret = str3;
    }
}
