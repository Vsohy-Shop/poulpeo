package p288y6;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import androidx.autofill.HintConstants;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import p153l7.C8745a;
import p173n7.C8934d;
import p277x6.C10428a;
import p277x6.C10450a0;
import p277x6.C10494b0;

/* renamed from: y6.g */
/* compiled from: CrashlyticsReportJsonTransform */
public class C10699g {

    /* renamed from: a */
    private static final C8745a f16277a = new C8934d().mo43074j(C10428a.f15737a).mo43075k(true).mo43073i();

    /* renamed from: y6.g$a */
    /* compiled from: CrashlyticsReportJsonTransform */
    private interface C10700a<T> {
        /* renamed from: a */
        T mo45618a(@NonNull JsonReader jsonReader);
    }

    @NonNull
    /* renamed from: A */
    private static C10450a0 m22729A(@NonNull JsonReader jsonReader) {
        C10450a0.C10453b b = C10450a0.m21910b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    b.mo45170f(m22754y(jsonReader));
                    break;
                case 1:
                    b.mo45172h(jsonReader.nextString());
                    break;
                case 2:
                    b.mo45166b(jsonReader.nextString());
                    break;
                case 3:
                    b.mo45168d(jsonReader.nextString());
                    break;
                case 4:
                    b.mo45169e(jsonReader.nextString());
                    break;
                case 5:
                    b.mo45171g(jsonReader.nextInt());
                    break;
                case 6:
                    b.mo45167c(jsonReader.nextString());
                    break;
                case 7:
                    b.mo45173i(m22730B(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b.mo45165a();
    }

    @NonNull
    /* renamed from: B */
    private static C10450a0.C10460e m22730B(@NonNull JsonReader jsonReader) {
        C10450a0.C10460e.C10464b a = C10450a0.C10460e.m21968a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 5;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c = 7;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c = 9;
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c = 10;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo45230l(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo45228j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    a.mo45223e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 3:
                    a.mo45222d(m22742m(jsonReader));
                    break;
                case 4:
                    a.mo45224f(m22740k(jsonReader, new C10693a()));
                    break;
                case 5:
                    a.mo45229k(m22755z(jsonReader));
                    break;
                case 6:
                    a.mo45220b(m22738i(jsonReader));
                    break;
                case 7:
                    a.mo45231m(m22731C(jsonReader));
                    break;
                case 8:
                    a.mo45225g(jsonReader.nextString());
                    break;
                case 9:
                    a.mo45221c(jsonReader.nextBoolean());
                    break;
                case 10:
                    a.mo45226h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo45219a();
    }

    @NonNull
    /* renamed from: C */
    private static C10450a0.C10460e.C10489f m22731C(@NonNull JsonReader jsonReader) {
        C10450a0.C10460e.C10489f.C10490a a = C10450a0.C10460e.C10489f.m22151a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            } else {
                a.mo45360b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo45359a();
    }

    @NonNull
    /* renamed from: i */
    private static C10450a0.C10460e.C10461a m22738i(@NonNull JsonReader jsonReader) {
        C10450a0.C10460e.C10461a.C10462a a = C10450a0.C10460e.C10461a.m21984a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo45215e(jsonReader.nextString());
                    break;
                case 1:
                    a.mo45212b(jsonReader.nextString());
                    break;
                case 2:
                    a.mo45213c(jsonReader.nextString());
                    break;
                case 3:
                    a.mo45217g(jsonReader.nextString());
                    break;
                case 4:
                    a.mo45216f(jsonReader.nextString());
                    break;
                case 5:
                    a.mo45214d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo45211a();
    }

    @NonNull
    /* renamed from: j */
    private static C10450a0.C10451a m22739j(@NonNull JsonReader jsonReader) {
        C10450a0.C10451a.C10452a a = C10450a0.C10451a.m21923a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 0;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 1;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 2;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 3;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 4;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 5;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 6;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo45158c(jsonReader.nextInt());
                    break;
                case 1:
                    a.mo45160e(jsonReader.nextLong());
                    break;
                case 2:
                    a.mo45162g(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo45163h(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo45159d(jsonReader.nextString());
                    break;
                case 5:
                    a.mo45161f(jsonReader.nextInt());
                    break;
                case 6:
                    a.mo45164i(jsonReader.nextString());
                    break;
                case 7:
                    a.mo45157b(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo45156a();
    }

    @NonNull
    /* renamed from: k */
    private static <T> C10494b0<T> m22740k(@NonNull JsonReader jsonReader, @NonNull C10700a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo45618a(jsonReader));
        }
        jsonReader.endArray();
        return C10494b0.m22173b(arrayList);
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: l */
    public static C10450a0.C10454c m22741l(@NonNull JsonReader jsonReader) {
        C10450a0.C10454c.C10455a a = C10450a0.C10454c.m21950a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                a.mo45177b(jsonReader.nextString());
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                a.mo45178c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo45176a();
    }

    @NonNull
    /* renamed from: m */
    private static C10450a0.C10460e.C10465c m22742m(@NonNull JsonReader jsonReader) {
        C10450a0.C10460e.C10465c.C10466a a = C10450a0.C10460e.C10465c.m22013a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo45249i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a.mo45245e(jsonReader.nextString());
                    break;
                case 2:
                    a.mo45248h(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo45242b(jsonReader.nextInt());
                    break;
                case 4:
                    a.mo45244d(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo45243c(jsonReader.nextInt());
                    break;
                case 6:
                    a.mo45246f(jsonReader.nextString());
                    break;
                case 7:
                    a.mo45250j(jsonReader.nextInt());
                    break;
                case 8:
                    a.mo45247g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo45241a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: n */
    public static C10450a0.C10460e.C10467d m22743n(@NonNull JsonReader jsonReader) {
        C10450a0.C10460e.C10467d.C10482b a = C10450a0.C10460e.C10467d.m22033a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals(JSONAPIResourceIdSerializer.FIELD_TYPE)) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo45329c(m22746q(jsonReader));
                    break;
                case 1:
                    a.mo45328b(m22744o(jsonReader));
                    break;
                case 2:
                    a.mo45330d(m22750u(jsonReader));
                    break;
                case 3:
                    a.mo45332f(jsonReader.nextString());
                    break;
                case 4:
                    a.mo45331e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo45327a();
    }

    @NonNull
    /* renamed from: o */
    private static C10450a0.C10460e.C10467d.C10468a m22744o(@NonNull JsonReader jsonReader) {
        C10450a0.C10460e.C10467d.C10468a.C10469a a = C10450a0.C10460e.C10467d.C10468a.m22040a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals("background")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c = 1;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo45264b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 1:
                    a.mo45266d(m22747r(jsonReader));
                    break;
                case 2:
                    a.mo45267e(m22740k(jsonReader, new C10695c()));
                    break;
                case 3:
                    a.mo45265c(m22740k(jsonReader, new C10695c()));
                    break;
                case 4:
                    a.mo45268f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo45263a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: p */
    public static C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a m22745p(@NonNull JsonReader jsonReader) {
        C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a.C10472a a = C10450a0.C10460e.C10467d.C10468a.C10470b.C10471a.m22059a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals(HintConstants.AUTOFILL_HINT_NAME)) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo45281c(jsonReader.nextString());
                    break;
                case 1:
                    a.mo45282d(jsonReader.nextLong());
                    break;
                case 2:
                    a.mo45284f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a.mo45280b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo45279a();
    }

    @NonNull
    /* renamed from: q */
    private static C10450a0.C10460e.C10467d.C10483c m22746q(@NonNull JsonReader jsonReader) {
        C10450a0.C10460e.C10467d.C10483c.C10484a a = C10450a0.C10460e.C10467d.C10483c.m22123a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo45340b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a.mo45341c(jsonReader.nextInt());
                    break;
                case 2:
                    a.mo45343e(jsonReader.nextInt());
                    break;
                case 3:
                    a.mo45342d(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo45345g(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo45344f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo45339a();
    }

    @NonNull
    /* renamed from: r */
    private static C10450a0.C10460e.C10467d.C10468a.C10470b m22747r(@NonNull JsonReader jsonReader) {
        C10450a0.C10460e.C10467d.C10468a.C10470b.C10473b a = C10450a0.C10460e.C10467d.C10468a.C10470b.m22053a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo45286b(m22739j(jsonReader));
                    break;
                case 1:
                    a.mo45290f(m22740k(jsonReader, new C10696d()));
                    break;
                case 2:
                    a.mo45289e(m22751v(jsonReader));
                    break;
                case 3:
                    a.mo45287c(m22740k(jsonReader, new C10697e()));
                    break;
                case 4:
                    a.mo45288d(m22748s(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo45285a();
    }

    @NonNull
    /* renamed from: s */
    private static C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c m22748s(@NonNull JsonReader jsonReader) {
        C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c.C10475a a = C10450a0.C10460e.C10467d.C10468a.C10470b.C10474c.m22077a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals(JSONAPIResourceIdSerializer.FIELD_TYPE)) {
                        c = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo45298c(m22740k(jsonReader, new C10698f()));
                    break;
                case 1:
                    a.mo45300e(jsonReader.nextString());
                    break;
                case 2:
                    a.mo45301f(jsonReader.nextString());
                    break;
                case 3:
                    a.mo45297b(m22748s(jsonReader));
                    break;
                case 4:
                    a.mo45299d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo45296a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: t */
    public static C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b m22749t(@NonNull JsonReader jsonReader) {
        C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b.C10481a a = C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10480b.m22105a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo45324d(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo45326f(jsonReader.nextString());
                    break;
                case 2:
                    a.mo45325e(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo45322b(jsonReader.nextString());
                    break;
                case 4:
                    a.mo45323c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo45321a();
    }

    @NonNull
    /* renamed from: u */
    private static C10450a0.C10460e.C10467d.C10485d m22750u(@NonNull JsonReader jsonReader) {
        C10450a0.C10460e.C10467d.C10485d.C10486a a = C10450a0.C10460e.C10467d.C10485d.m22137a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("content")) {
                jsonReader.skipValue();
            } else {
                a.mo45348b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo45347a();
    }

    @NonNull
    /* renamed from: v */
    private static C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d m22751v(@NonNull JsonReader jsonReader) {
        C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d.C10477a a = C10450a0.C10460e.C10467d.C10468a.C10470b.C10476d.m22089a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(HintConstants.AUTOFILL_HINT_NAME)) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo45306b(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo45307c(jsonReader.nextString());
                    break;
                case 2:
                    a.mo45308d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo45305a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: w */
    public static C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e m22752w(@NonNull JsonReader jsonReader) {
        C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.C10479a a = C10450a0.C10460e.C10467d.C10468a.C10470b.C10478e.m22097a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(HintConstants.AUTOFILL_HINT_NAME)) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo45313b(m22740k(jsonReader, new C10698f()));
                    break;
                case 1:
                    a.mo45315d(jsonReader.nextString());
                    break;
                case 2:
                    a.mo45314c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo45312a();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: x */
    public static C10450a0.C10456d.C10458b m22753x(@NonNull JsonReader jsonReader) {
        C10450a0.C10456d.C10458b.C10459a a = C10450a0.C10456d.C10458b.m21962a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                a.mo45188c(jsonReader.nextString());
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                a.mo45187b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return a.mo45186a();
    }

    @NonNull
    /* renamed from: y */
    private static C10450a0.C10456d m22754y(@NonNull JsonReader jsonReader) {
        C10450a0.C10456d.C10457a a = C10450a0.C10456d.m21956a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                a.mo45182b(m22740k(jsonReader, new C10694b()));
            } else if (!nextName.equals("orgId")) {
                jsonReader.skipValue();
            } else {
                a.mo45183c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo45181a();
    }

    @NonNull
    /* renamed from: z */
    private static C10450a0.C10460e.C10487e m22755z(@NonNull JsonReader jsonReader) {
        C10450a0.C10460e.C10487e.C10488a a = C10450a0.C10460e.C10487e.m22141a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo45354b(jsonReader.nextString());
                    break;
                case 1:
                    a.mo45355c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a.mo45357e(jsonReader.nextString());
                    break;
                case 3:
                    a.mo45356d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo45353a();
    }

    @NonNull
    /* renamed from: D */
    public C10450a0 mo45619D(@NonNull String str) {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            C10450a0 A = m22729A(jsonReader);
            jsonReader.close();
            return A;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @NonNull
    /* renamed from: E */
    public String mo45620E(@NonNull C10450a0 a0Var) {
        return f16277a.mo42885b(a0Var);
    }

    @NonNull
    /* renamed from: g */
    public C10450a0.C10460e.C10467d mo45621g(@NonNull String str) {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            C10450a0.C10460e.C10467d n = m22743n(jsonReader);
            jsonReader.close();
            return n;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @NonNull
    /* renamed from: h */
    public String mo45622h(@NonNull C10450a0.C10460e.C10467d dVar) {
        return f16277a.mo42885b(dVar);
    }
}
