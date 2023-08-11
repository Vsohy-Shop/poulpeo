package com.adjust.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONException;

public class SharedPreferencesManager {
    private static final int INDEX_CLICK_TIME = 1;
    private static final int INDEX_IS_SENDING = 2;
    private static final int INDEX_RAW_REFERRER = 0;
    private static final String PREFS_KEY_DEEPLINK_CLICK_TIME = "deeplink_click_time";
    private static final String PREFS_KEY_DEEPLINK_URL = "deeplink_url";
    private static final String PREFS_KEY_DISABLE_THIRD_PARTY_SHARING = "disable_third_party_sharing";
    private static final String PREFS_KEY_GDPR_FORGET_ME = "gdpr_forget_me";
    private static final String PREFS_KEY_INSTALL_TRACKED = "install_tracked";
    private static final String PREFS_KEY_PREINSTALL_PAYLOAD_READ_STATUS = "preinstall_payload_read_status";
    private static final String PREFS_KEY_PREINSTALL_SYSTEM_INSTALLER_REFERRER = "preinstall_system_installer_referrer";
    private static final String PREFS_KEY_PUSH_TOKEN = "push_token";
    private static final String PREFS_KEY_RAW_REFERRERS = "raw_referrers";
    private static final String PREFS_NAME = "adjust_preferences";
    private static final int REFERRERS_COUNT = 10;
    private final SharedPreferences sharedPreferences;

    public SharedPreferencesManager(Context context) {
        this.sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000d, code lost:
        return r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean getBoolean(java.lang.String r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.content.SharedPreferences r0 = r1.sharedPreferences     // Catch:{ ClassCastException -> 0x000c, all -> 0x0009 }
            boolean r2 = r0.getBoolean(r2, r3)     // Catch:{ ClassCastException -> 0x000c, all -> 0x0009 }
            monitor-exit(r1)
            return r2
        L_0x0009:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x000c:
            monitor-exit(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.SharedPreferencesManager.getBoolean(java.lang.String, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000d, code lost:
        return r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized long getLong(java.lang.String r2, long r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.content.SharedPreferences r0 = r1.sharedPreferences     // Catch:{ ClassCastException -> 0x000c, all -> 0x0009 }
            long r2 = r0.getLong(r2, r3)     // Catch:{ ClassCastException -> 0x000c, all -> 0x0009 }
            monitor-exit(r1)
            return r2
        L_0x0009:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x000c:
            monitor-exit(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.SharedPreferencesManager.getLong(java.lang.String, long):long");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int getRawReferrerIndex(java.lang.String r8, long r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            org.json.JSONArray r0 = r7.getRawReferrerArray()     // Catch:{ JSONException -> 0x0033, all -> 0x0030 }
            r1 = 0
            r2 = r1
        L_0x0007:
            int r3 = r0.length()     // Catch:{ JSONException -> 0x0033, all -> 0x0030 }
            if (r2 >= r3) goto L_0x0033
            org.json.JSONArray r3 = r0.getJSONArray(r2)     // Catch:{ JSONException -> 0x0033, all -> 0x0030 }
            r4 = 0
            java.lang.String r4 = r3.optString(r1, r4)     // Catch:{ JSONException -> 0x0033, all -> 0x0030 }
            if (r4 == 0) goto L_0x002d
            boolean r4 = r4.equals(r8)     // Catch:{ JSONException -> 0x0033, all -> 0x0030 }
            if (r4 != 0) goto L_0x001f
            goto L_0x002d
        L_0x001f:
            r4 = -1
            r6 = 1
            long r3 = r3.optLong(r6, r4)     // Catch:{ JSONException -> 0x0033, all -> 0x0030 }
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            monitor-exit(r7)
            return r2
        L_0x002d:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0030:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x0033:
            monitor-exit(r7)
            r8 = -1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.SharedPreferencesManager.getRawReferrerIndex(java.lang.String, long):int");
    }

    private synchronized String getString(String str) {
        try {
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable unused2) {
            if (str.equals(PREFS_KEY_RAW_REFERRERS)) {
                remove(PREFS_KEY_RAW_REFERRERS);
            }
            return null;
        }
        return this.sharedPreferences.getString(str, (String) null);
    }

    private synchronized void remove(String str) {
        this.sharedPreferences.edit().remove(str).apply();
    }

    private synchronized void saveBoolean(String str, boolean z) {
        this.sharedPreferences.edit().putBoolean(str, z).apply();
    }

    private synchronized void saveInteger(String str, int i) {
        this.sharedPreferences.edit().putInt(str, i).apply();
    }

    private synchronized void saveLong(String str, long j) {
        this.sharedPreferences.edit().putLong(str, j).apply();
    }

    private synchronized void saveString(String str, String str2) {
        this.sharedPreferences.edit().putString(str, str2).apply();
    }

    public synchronized void clear() {
        this.sharedPreferences.edit().clear().apply();
    }

    public synchronized long getDeeplinkClickTime() {
        return getLong(PREFS_KEY_DEEPLINK_CLICK_TIME, -1);
    }

    public synchronized String getDeeplinkUrl() {
        return getString(PREFS_KEY_DEEPLINK_URL);
    }

    public synchronized boolean getDisableThirdPartySharing() {
        return getBoolean(PREFS_KEY_DISABLE_THIRD_PARTY_SHARING, false);
    }

    public synchronized boolean getGdprForgetMe() {
        return getBoolean(PREFS_KEY_GDPR_FORGET_ME, false);
    }

    public synchronized boolean getInstallTracked() {
        return getBoolean(PREFS_KEY_INSTALL_TRACKED, false);
    }

    public synchronized long getPreinstallPayloadReadStatus() {
        return getLong(PREFS_KEY_PREINSTALL_PAYLOAD_READ_STATUS, 0);
    }

    public synchronized String getPreinstallReferrer() {
        return getString(PREFS_KEY_PREINSTALL_SYSTEM_INSTALLER_REFERRER);
    }

    public synchronized String getPushToken() {
        return getString(PREFS_KEY_PUSH_TOKEN);
    }

    public synchronized JSONArray getRawReferrer(String str, long j) {
        int rawReferrerIndex = getRawReferrerIndex(str, j);
        if (rawReferrerIndex >= 0) {
            try {
                return getRawReferrerArray().getJSONArray(rawReferrerIndex);
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:1|2|3|(3:5|6|(6:8|(1:10)|25|11|12|13)(4:14|15|16|17))|18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.json.JSONArray getRawReferrerArray() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "raw_referrers"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0034
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0034 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0034 }
            int r2 = r1.length()     // Catch:{ JSONException -> 0x0034 }
            r3 = 10
            if (r2 <= r3) goto L_0x002d
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0034 }
            r0.<init>()     // Catch:{ JSONException -> 0x0034 }
            r2 = 0
        L_0x001c:
            if (r2 >= r3) goto L_0x0028
            java.lang.Object r4 = r1.get(r2)     // Catch:{ JSONException -> 0x0034 }
            r0.put(r4)     // Catch:{ JSONException -> 0x0034 }
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0028:
            r5.saveRawReferrerArray(r0)     // Catch:{ JSONException -> 0x0034 }
            monitor-exit(r5)
            return r0
        L_0x002d:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0034 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0034 }
            monitor-exit(r5)
            return r1
        L_0x0034:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x003b }
            r0.<init>()     // Catch:{ all -> 0x003b }
            monitor-exit(r5)
            return r0
        L_0x003b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.SharedPreferencesManager.getRawReferrerArray():org.json.JSONArray");
    }

    public synchronized void removeDeeplink() {
        remove(PREFS_KEY_DEEPLINK_URL);
        remove(PREFS_KEY_DEEPLINK_CLICK_TIME);
    }

    public synchronized void removeDisableThirdPartySharing() {
        remove(PREFS_KEY_DISABLE_THIRD_PARTY_SHARING);
    }

    public synchronized void removeGdprForgetMe() {
        remove(PREFS_KEY_GDPR_FORGET_ME);
    }

    public synchronized void removePreinstallReferrer() {
        remove(PREFS_KEY_PREINSTALL_SYSTEM_INSTALLER_REFERRER);
    }

    public synchronized void removePushToken() {
        remove(PREFS_KEY_PUSH_TOKEN);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void removeRawReferrer(java.lang.String r3, long r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x003d
            int r0 = r3.length()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x000a
            goto L_0x003d
        L_0x000a:
            int r3 = r2.getRawReferrerIndex(r3, r4)     // Catch:{ all -> 0x003a }
            if (r3 >= 0) goto L_0x0012
            monitor-exit(r2)
            return
        L_0x0012:
            org.json.JSONArray r4 = r2.getRawReferrerArray()     // Catch:{ all -> 0x003a }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ all -> 0x003a }
            r5.<init>()     // Catch:{ all -> 0x003a }
            r0 = 0
        L_0x001c:
            int r1 = r4.length()     // Catch:{ all -> 0x003a }
            if (r0 >= r1) goto L_0x002f
            if (r0 != r3) goto L_0x0025
            goto L_0x002c
        L_0x0025:
            org.json.JSONArray r1 = r4.getJSONArray(r0)     // Catch:{ JSONException -> 0x002c }
            r5.put(r1)     // Catch:{ JSONException -> 0x002c }
        L_0x002c:
            int r0 = r0 + 1
            goto L_0x001c
        L_0x002f:
            java.lang.String r3 = "raw_referrers"
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x003a }
            r2.saveString(r3, r4)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x003d:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.SharedPreferencesManager.removeRawReferrer(java.lang.String, long):void");
    }

    public synchronized void saveDeeplink(Uri uri, long j) {
        if (uri != null) {
            saveString(PREFS_KEY_DEEPLINK_URL, uri.toString());
            saveLong(PREFS_KEY_DEEPLINK_CLICK_TIME, j);
        }
    }

    public synchronized void savePreinstallReferrer(String str) {
        saveString(PREFS_KEY_PREINSTALL_SYSTEM_INSTALLER_REFERRER, str);
    }

    public synchronized void savePushToken(String str) {
        saveString(PREFS_KEY_PUSH_TOKEN, str);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void saveRawReferrer(java.lang.String r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            org.json.JSONArray r0 = r3.getRawReferrer(r4, r5)     // Catch:{ JSONException -> 0x0032, all -> 0x002f }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r3)
            return
        L_0x0009:
            org.json.JSONArray r0 = r3.getRawReferrerArray()     // Catch:{ JSONException -> 0x0032, all -> 0x002f }
            int r1 = r0.length()     // Catch:{ JSONException -> 0x0032, all -> 0x002f }
            r2 = 10
            if (r1 != r2) goto L_0x0017
            monitor-exit(r3)
            return
        L_0x0017:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0032, all -> 0x002f }
            r1.<init>()     // Catch:{ JSONException -> 0x0032, all -> 0x002f }
            r2 = 0
            r1.put(r2, r4)     // Catch:{ JSONException -> 0x0032, all -> 0x002f }
            r4 = 1
            r1.put(r4, r5)     // Catch:{ JSONException -> 0x0032, all -> 0x002f }
            r4 = 2
            r1.put(r4, r2)     // Catch:{ JSONException -> 0x0032, all -> 0x002f }
            r0.put(r1)     // Catch:{ JSONException -> 0x0032, all -> 0x002f }
            r3.saveRawReferrerArray(r0)     // Catch:{ JSONException -> 0x0032, all -> 0x002f }
            goto L_0x0032
        L_0x002f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0032:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.SharedPreferencesManager.saveRawReferrer(java.lang.String, long):void");
    }

    public synchronized void saveRawReferrerArray(JSONArray jSONArray) {
        try {
            saveString(PREFS_KEY_RAW_REFERRERS, jSONArray.toString());
        } catch (Throwable unused) {
            remove(PREFS_KEY_RAW_REFERRERS);
        }
        return;
    }

    public synchronized void setDisableThirdPartySharing() {
        saveBoolean(PREFS_KEY_DISABLE_THIRD_PARTY_SHARING, true);
    }

    public synchronized void setGdprForgetMe() {
        saveBoolean(PREFS_KEY_GDPR_FORGET_ME, true);
    }

    public synchronized void setInstallTracked() {
        saveBoolean(PREFS_KEY_INSTALL_TRACKED, true);
    }

    public synchronized void setPreinstallPayloadReadStatus(long j) {
        saveLong(PREFS_KEY_PREINSTALL_PAYLOAD_READ_STATUS, j);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void setSendingReferrersAsNotSent() {
        /*
            r8 = this;
            monitor-enter(r8)
            org.json.JSONArray r0 = r8.getRawReferrerArray()     // Catch:{ JSONException -> 0x002b, all -> 0x0028 }
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0008:
            int r4 = r0.length()     // Catch:{ JSONException -> 0x002b, all -> 0x0028 }
            if (r2 >= r4) goto L_0x0022
            org.json.JSONArray r4 = r0.getJSONArray(r2)     // Catch:{ JSONException -> 0x002b, all -> 0x0028 }
            r5 = -1
            r6 = 2
            int r5 = r4.optInt(r6, r5)     // Catch:{ JSONException -> 0x002b, all -> 0x0028 }
            r7 = 1
            if (r5 != r7) goto L_0x001f
            r4.put(r6, r1)     // Catch:{ JSONException -> 0x002b, all -> 0x0028 }
            r3 = r7
        L_0x001f:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x0022:
            if (r3 == 0) goto L_0x002b
            r8.saveRawReferrerArray(r0)     // Catch:{ JSONException -> 0x002b, all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x002b:
            monitor-exit(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.SharedPreferencesManager.setSendingReferrersAsNotSent():void");
    }
}
