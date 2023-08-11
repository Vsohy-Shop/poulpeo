package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.main.json.IJsonCacheSerialisable;
import com.rmn.api.p322v2.main.json.IJsonNetworkParsable;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import org.json.JSONObject;

/* renamed from: com.rmn.api.v2.common.model.submodel.StoreAddressSchedule */
public class StoreAddressSchedule implements IJsonNetworkParsable, IJsonCacheSerialisable {
    private String afternoon_end;
    private String afternoon_start;
    private Day day;
    private String morning_end;
    private String morning_start;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r4.hasMorningStart() == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r4.hasMorningEnd() == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006b, code lost:
        if (r4.hasAfternoonStart() == false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(com.rmn.api.p322v2.common.model.submodel.StoreAddressSchedule r4) {
        /*
            r3 = this;
            boolean r0 = r3.hasMorningStart()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r0 = r4.hasMorningStart()
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r3.morning_start
            java.lang.String r2 = r4.morning_start
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0026
            return r1
        L_0x0018:
            boolean r0 = r3.hasMorningStart()
            if (r0 != 0) goto L_0x0094
            boolean r0 = r4.hasMorningStart()
            if (r0 == 0) goto L_0x0026
            goto L_0x0094
        L_0x0026:
            boolean r0 = r3.hasMorningEnd()
            if (r0 == 0) goto L_0x003d
            boolean r0 = r4.hasMorningEnd()
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r3.morning_end
            java.lang.String r2 = r4.morning_end
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x004a
            return r1
        L_0x003d:
            boolean r0 = r3.hasMorningEnd()
            if (r0 != 0) goto L_0x0094
            boolean r0 = r4.hasMorningEnd()
            if (r0 == 0) goto L_0x004a
            goto L_0x0094
        L_0x004a:
            boolean r0 = r3.hasAfternoonStart()
            if (r0 == 0) goto L_0x0061
            boolean r0 = r4.hasAfternoonStart()
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = r3.afternoon_start
            java.lang.String r2 = r4.afternoon_start
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x006e
            return r1
        L_0x0061:
            boolean r0 = r3.hasAfternoonStart()
            if (r0 != 0) goto L_0x0094
            boolean r0 = r4.hasAfternoonStart()
            if (r0 == 0) goto L_0x006e
            goto L_0x0094
        L_0x006e:
            boolean r0 = r3.hasAfternoonEnd()
            if (r0 == 0) goto L_0x0085
            boolean r0 = r4.hasAfternoonEnd()
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = r3.afternoon_end
            java.lang.String r4 = r4.afternoon_end
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0092
            return r1
        L_0x0085:
            boolean r0 = r3.hasAfternoonEnd()
            if (r0 != 0) goto L_0x0094
            boolean r4 = r4.hasAfternoonEnd()
            if (r4 == 0) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            r4 = 1
            return r4
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.common.model.submodel.StoreAddressSchedule.equals(com.rmn.api.v2.common.model.submodel.StoreAddressSchedule):boolean");
    }

    public Day getDay() {
        return this.day;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (java.lang.Double.parseDouble(r9.afternoon_start.replace(":", ".")) <= java.lang.Double.parseDouble(r9.morning_end.replace(":", "."))) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getScheduleText() {
        /*
            r9 = this;
            boolean r0 = r9.hasMorningStart()
            java.lang.String r1 = " à "
            java.lang.String r2 = " de "
            if (r0 == 0) goto L_0x0066
            boolean r0 = r9.hasAfternoonEnd()
            if (r0 == 0) goto L_0x0066
            boolean r0 = r9.hasMorningEnd()
            r3 = 1
            if (r0 != 0) goto L_0x001f
            boolean r0 = r9.hasAfternoonStart()
            if (r0 != 0) goto L_0x001f
            r0 = r3
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            boolean r4 = r9.hasMorningEnd()
            if (r4 == 0) goto L_0x0049
            boolean r4 = r9.hasAfternoonStart()
            if (r4 == 0) goto L_0x0049
            java.lang.String r4 = r9.morning_end
            java.lang.String r5 = ":"
            java.lang.String r6 = "."
            java.lang.String r4 = r4.replace(r5, r6)
            double r7 = java.lang.Double.parseDouble(r4)
            java.lang.String r4 = r9.afternoon_start
            java.lang.String r4 = r4.replace(r5, r6)
            double r4 = java.lang.Double.parseDouble(r4)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r3 = r0
        L_0x004a:
            if (r3 == 0) goto L_0x0066
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = r9.morning_start
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r9.afternoon_end
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0066:
            boolean r0 = r9.hasMorningStart()
            java.lang.String r3 = " à partir de "
            java.lang.String r4 = " jusqu'à  "
            r5 = 0
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r9.hasMorningEnd()
            if (r0 == 0) goto L_0x0091
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r6 = r9.morning_start
            r0.append(r6)
            r0.append(r1)
            java.lang.String r6 = r9.morning_end
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            goto L_0x00bc
        L_0x0091:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r6 = r9.morning_start
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            goto L_0x00bc
        L_0x00a3:
            boolean r0 = r9.hasMorningEnd()
            if (r0 == 0) goto L_0x00bb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r6 = r9.morning_end
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            goto L_0x00bc
        L_0x00bb:
            r0 = r5
        L_0x00bc:
            boolean r6 = r9.hasAfternoonStart()
            if (r6 == 0) goto L_0x00f4
            boolean r4 = r9.hasAfternoonEnd()
            if (r4 == 0) goto L_0x00e2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = r9.afternoon_start
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r9.afternoon_end
            r3.append(r1)
            java.lang.String r5 = r3.toString()
            goto L_0x010b
        L_0x00e2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r9.afternoon_start
            r1.append(r2)
            java.lang.String r5 = r1.toString()
            goto L_0x010b
        L_0x00f4:
            boolean r1 = r9.hasAfternoonEnd()
            if (r1 == 0) goto L_0x010b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = r9.afternoon_end
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x010b:
            if (r0 == 0) goto L_0x0124
            if (r5 == 0) goto L_0x0124
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " et "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            goto L_0x0128
        L_0x0124:
            if (r0 == 0) goto L_0x0127
            goto L_0x0128
        L_0x0127:
            r0 = r5
        L_0x0128:
            if (r0 != 0) goto L_0x012d
            java.lang.String r0 = ""
            return r0
        L_0x012d:
            java.lang.String r1 = " +"
            java.lang.String r2 = " "
            java.lang.String r0 = r0.replaceAll(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.common.model.submodel.StoreAddressSchedule.getScheduleText():java.lang.String");
    }

    public boolean hasAfternoonEnd() {
        String str = this.afternoon_end;
        if (str == null || str.equals("")) {
            return false;
        }
        return true;
    }

    public boolean hasAfternoonStart() {
        String str = this.afternoon_start;
        if (str == null || str.equals("")) {
            return false;
        }
        return true;
    }

    public boolean hasMorningEnd() {
        String str = this.morning_end;
        if (str == null || str.equals("")) {
            return false;
        }
        return true;
    }

    public boolean hasMorningStart() {
        String str = this.morning_start;
        if (str == null || str.equals("")) {
            return false;
        }
        return true;
    }

    public boolean isEmpty() {
        if (!hasMorningStart() && !hasMorningEnd() && !hasAfternoonStart() && !hasAfternoonEnd()) {
            return true;
        }
        return false;
    }

    public boolean isModelValidAfterParsing() {
        if (this.day != null) {
            return true;
        }
        return false;
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        ParsingManagerJson.serializeObject(jSONObject, this);
        return jSONObject.toString();
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObject(ParsingMode.CACHE, new JSONObject(str), this);
        if (!isModelValidAfterParsing()) {
            throw new Exception();
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        ParsingManagerJson.unserializeObject(ParsingMode.NETWORK, jSONObject, this);
        if (!isModelValidAfterParsing()) {
            throw new Exception();
        }
    }
}
