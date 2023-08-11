package p292z;

import java.util.ArrayList;
import java.util.EnumSet;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import p057d0.C7213c;

/* renamed from: z.c */
public enum C10732c implements C7213c<String> {
    ADJUST("adj"),
    AIRBRIDGE("air"),
    APPSFLYER("apf"),
    BLUEDOT("blt"),
    BRANCH("brc"),
    CORDOVA("cdva"),
    EXPO("expo"),
    FACTUAL("fct"),
    FOURSQUARE("fsq"),
    FLUTTER("ft"),
    GRADLE("gd"),
    GOOGLE("gg"),
    GIMBAL("gmb"),
    IONIC("ionc"),
    KOCHAVA("kch"),
    MANUAL("manu"),
    MPARTICLE("mp"),
    NPM("npm"),
    NATIVESCRIPT("ns"),
    NUGET("nugt"),
    PUB("pub"),
    RADAR("rdr"),
    REACTNATIVE("rn"),
    SEGMENT("sg"),
    SINGULAR("sng"),
    SPM("spm"),
    TEALIUM("tl"),
    UNREAL("un"),
    UNITY_PACKAGE_MANAGER("unpm"),
    UNITY("ut"),
    VIZBEE("vzb"),
    WEBCDN("wcd"),
    XAMARIN("xam");
    

    /* renamed from: c */
    public static final C10733a f16393c = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f16417b;

    /* renamed from: z.c$a */
    public static final class C10733a {
        public /* synthetic */ C10733a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final JSONArray mo45658a(EnumSet<C10732c> enumSet) {
            C12775o.m28639i(enumSet, "set");
            ArrayList arrayList = new ArrayList(C12728x.m28544v(enumSet, 10));
            for (C10732c cVar : enumSet) {
                C12775o.m28638h(cVar, "it");
                arrayList.add(cVar.f16417b);
            }
            return new JSONArray(C12686e0.m28242u0(arrayList));
        }

        private C10733a() {
        }
    }

    static {
        f16393c = new C10733a((DefaultConstructorMarker) null);
    }

    private C10732c(String str) {
        this.f16417b = str;
    }

    /* renamed from: v */
    public String forJsonPut() {
        return this.f16417b;
    }
}
