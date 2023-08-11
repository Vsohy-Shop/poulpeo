package com.braze.configuration;

import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appboy.support.PackageUtils;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: com.braze.configuration.c */
public class C4236c {
    public static final C4237a Companion = new C4237a((DefaultConstructorMarker) null);
    private static final int MISSING_RESOURCE_IDENTIFIER = 0;
    private final Map<String, Object> configurationCache;
    private Context context;
    private final String resourcePackageName;
    private C4245d runtimeAppConfigurationProvider;
    private boolean shouldUseConfigurationCache;

    /* renamed from: com.braze.configuration.c$a */
    public static final class C4237a {
        public /* synthetic */ C4237a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4237a() {
        }
    }

    /* renamed from: com.braze.configuration.c$b */
    public enum C4238b {
        INTEGER(TypedValues.Custom.S_INT),
        COLOR(TypedValues.Custom.S_COLOR),
        BOOLEAN("bool"),
        STRING(TypedValues.Custom.S_STRING),
        DRAWABLE_IDENTIFIER("drawable"),
        STRING_ARRAY(CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        

        /* renamed from: b */
        private final String f3493b;

        private C4238b(String str) {
            this.f3493b = str;
        }

        /* renamed from: b */
        public final String mo30968b() {
            return this.f3493b;
        }
    }

    /* renamed from: com.braze.configuration.c$c */
    public /* synthetic */ class C4239c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3494a;

        static {
            int[] iArr = new int[C4238b.values().length];
            iArr[C4238b.BOOLEAN.ordinal()] = 1;
            iArr[C4238b.STRING.ordinal()] = 2;
            iArr[C4238b.STRING_ARRAY.ordinal()] = 3;
            iArr[C4238b.INTEGER.ordinal()] = 4;
            iArr[C4238b.COLOR.ordinal()] = 5;
            iArr[C4238b.DRAWABLE_IDENTIFIER.ordinal()] = 6;
            f3494a = iArr;
        }
    }

    /* renamed from: com.braze.configuration.c$d */
    static final class C4240d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f3495g;

        /* renamed from: h */
        final /* synthetic */ Object f3496h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4240d(String str, Object obj) {
            super(0);
            this.f3495g = str;
            this.f3496h = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Using resources value for key: '" + this.f3495g + "' and value: '" + this.f3496h + '\'';
        }
    }

    /* renamed from: com.braze.configuration.c$e */
    static final class C4241e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f3497g;

        /* renamed from: h */
        final /* synthetic */ Object f3498h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4241e(String str, Object obj) {
            super(0);
            this.f3497g = str;
            this.f3498h = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Using runtime override value for key: '" + this.f3497g + "' and value: '" + this.f3498h + '\'';
        }
    }

    /* renamed from: com.braze.configuration.c$f */
    static final class C4242f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f3499g;

        /* renamed from: h */
        final /* synthetic */ Object f3500h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4242f(String str, Object obj) {
            super(0);
            this.f3499g = str;
            this.f3500h = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Primary key '" + this.f3499g + "' had no identifier. No secondary key to read resource value. Returning default value: '" + this.f3500h + '\'';
        }
    }

    /* renamed from: com.braze.configuration.c$g */
    static final class C4243g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4243g f3501g = new C4243g();

        C4243g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception retrieving resource value";
        }
    }

    /* renamed from: com.braze.configuration.c$h */
    static final class C4244h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C4238b f3502g;

        /* renamed from: h */
        final /* synthetic */ String f3503h;

        /* renamed from: i */
        final /* synthetic */ Object f3504i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4244h(C4238b bVar, String str, Object obj) {
            super(0);
            this.f3502g = bVar;
            this.f3503h = str;
            this.f3504i = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unable to find the xml " + this.f3502g + " configuration value with primary key '" + this.f3503h + "'.Using default value '" + this.f3504i + "'.";
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C4236c(Context context2) {
        this(context2, false, (C4245d) null, 6, (DefaultConstructorMarker) null);
        C12775o.m28639i(context2, "context");
    }

    private final String getFallbackConfigKey(String str) {
        if (C13755w.m31552J(str, "braze", false, 2, (Object) null)) {
            return C13754v.m31521A(str, "braze", "appboy", false, 4, (Object) null);
        }
        return null;
    }

    private final int getResourceIdentifier(String str, C4238b bVar) {
        if (str == null) {
            return 0;
        }
        return this.context.getResources().getIdentifier(str, bVar.mo30968b(), this.resourcePackageName);
    }

    public final boolean getBooleanValue(String str, boolean z) {
        C12775o.m28639i(str, "primaryKey");
        Object configurationValue = getConfigurationValue(C4238b.BOOLEAN, str, Boolean.valueOf(z));
        if (configurationValue != null) {
            return ((Boolean) configurationValue).booleanValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
    }

    public final Integer getColorValue(String str) {
        C12775o.m28639i(str, "primaryKey");
        return (Integer) getConfigurationValue(C4238b.COLOR, str, (Object) null);
    }

    public final Map<String, Object> getConfigurationCache() {
        return this.configurationCache;
    }

    public final Object getConfigurationValue(C4238b bVar, String str, Object obj) {
        C12775o.m28639i(bVar, JSONAPIResourceIdSerializer.FIELD_TYPE);
        C12775o.m28639i(str, "key");
        if (this.shouldUseConfigurationCache && this.configurationCache.containsKey(str)) {
            return this.configurationCache.get(str);
        }
        if (this.runtimeAppConfigurationProvider.mo30976c(str)) {
            return getRuntimeConfigurationValue(bVar, str, obj);
        }
        return getResourceConfigurationValue(bVar, str, obj);
    }

    /* access modifiers changed from: protected */
    public final int getDrawableValue(String str, int i) {
        C12775o.m28639i(str, "primaryKey");
        Object configurationValue = getConfigurationValue(C4238b.DRAWABLE_IDENTIFIER, str, Integer.valueOf(i));
        if (configurationValue != null) {
            return ((Integer) configurationValue).intValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    public final int getIntValue(String str, int i) {
        C12775o.m28639i(str, "primaryKey");
        Object configurationValue = getConfigurationValue(C4238b.INTEGER, str, Integer.valueOf(i));
        if (configurationValue != null) {
            return ((Integer) configurationValue).intValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    /* access modifiers changed from: protected */
    public final Object getResourceConfigurationValue(C4238b bVar, String str, Object obj) {
        C12775o.m28639i(bVar, JSONAPIResourceIdSerializer.FIELD_TYPE);
        C12775o.m28639i(str, "key");
        Object readResourceValue = readResourceValue(bVar, str, obj);
        this.configurationCache.put(str, readResourceValue);
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C4240d(str, readResourceValue), 7, (Object) null);
        return readResourceValue;
    }

    public final C4245d getRuntimeAppConfigurationProvider() {
        return this.runtimeAppConfigurationProvider;
    }

    /* access modifiers changed from: protected */
    public final Object getRuntimeConfigurationValue(C4238b bVar, String str, Object obj) {
        Object obj2;
        int i;
        C12775o.m28639i(bVar, JSONAPIResourceIdSerializer.FIELD_TYPE);
        C12775o.m28639i(str, "key");
        switch (C4239c.f3494a[bVar.ordinal()]) {
            case 1:
                C4245d dVar = this.runtimeAppConfigurationProvider;
                if (obj != null) {
                    obj2 = Boolean.valueOf(dVar.mo30977d(str, ((Boolean) obj).booleanValue()));
                    break;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
            case 2:
                obj2 = this.runtimeAppConfigurationProvider.mo30982i(str, (String) obj);
                break;
            case 3:
                C4245d dVar2 = this.runtimeAppConfigurationProvider;
                if (obj != null) {
                    obj2 = dVar2.mo30981h(str, (Set) obj);
                    break;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String?>");
                }
            case 4:
            case 5:
                if (obj == null) {
                    i = this.runtimeAppConfigurationProvider.mo30979f(str, 0);
                } else {
                    i = this.runtimeAppConfigurationProvider.mo30979f(str, ((Integer) obj).intValue());
                }
                obj2 = Integer.valueOf(i);
                break;
            case 6:
                obj2 = Integer.valueOf(getResourceIdentifier(this.runtimeAppConfigurationProvider.mo30982i(str, ""), C4238b.DRAWABLE_IDENTIFIER));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.configurationCache.put(str, obj2);
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C4241e(str, obj2), 7, (Object) null);
        return obj2;
    }

    public final Set<String> getStringSetValue(String str, Set<String> set) {
        C12775o.m28639i(str, "primaryKey");
        Object configurationValue = getConfigurationValue(C4238b.STRING_ARRAY, str, set);
        if (configurationValue == null) {
            return set;
        }
        return (Set) configurationValue;
    }

    public final String getStringValue(String str, String str2) {
        C12775o.m28639i(str, "primaryKey");
        return (String) getConfigurationValue(C4238b.STRING, str, str2);
    }

    public final Object getValueFromResources(C4238b bVar, int i) {
        C12775o.m28639i(bVar, JSONAPIResourceIdSerializer.FIELD_TYPE);
        Resources resources = this.context.getResources();
        switch (C4239c.f3494a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(resources.getBoolean(i));
            case 2:
                String string = resources.getString(i);
                C12775o.m28638h(string, "resources.getString(resourceId)");
                return string;
            case 3:
                String[] stringArray = resources.getStringArray(i);
                C12775o.m28638h(stringArray, "resources.getStringArray(resourceId)");
                return new HashSet(C12726w.m28527n(Arrays.copyOf(stringArray, stringArray.length)));
            case 4:
                return Integer.valueOf(resources.getInteger(i));
            case 5:
                return Integer.valueOf(resources.getColor(i));
            case 6:
                return Integer.valueOf(i);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Object readResourceValue(C4238b bVar, String str, Object obj) {
        C4238b bVar2 = bVar;
        String str2 = str;
        Object obj2 = obj;
        C12775o.m28639i(bVar, JSONAPIResourceIdSerializer.FIELD_TYPE);
        C12775o.m28639i(str, "key");
        try {
            int resourceIdentifier = getResourceIdentifier(str, bVar);
            if (resourceIdentifier != 0) {
                return getValueFromResources(bVar, resourceIdentifier);
            }
            String fallbackConfigKey = getFallbackConfigKey(str);
            if (fallbackConfigKey == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C4242f(str, obj2), 7, (Object) null);
                return obj2;
            }
            int resourceIdentifier2 = getResourceIdentifier(fallbackConfigKey, bVar);
            if (resourceIdentifier2 != 0) {
                return getValueFromResources(bVar, resourceIdentifier2);
            }
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C4244h(bVar, str, obj2), 7, (Object) null);
            return obj2;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C4243g.f3501g, 4, (Object) null);
        }
    }

    public final void setRuntimeAppConfigurationProvider(C4245d dVar) {
        C12775o.m28639i(dVar, "<set-?>");
        this.runtimeAppConfigurationProvider = dVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C4236c(Context context2, boolean z) {
        this(context2, z, (C4245d) null, 4, (DefaultConstructorMarker) null);
        C12775o.m28639i(context2, "context");
    }

    public C4236c(Context context2, boolean z, C4245d dVar) {
        C12775o.m28639i(context2, "context");
        C12775o.m28639i(dVar, "runtimeAppConfigurationProvider");
        this.context = context2;
        this.shouldUseConfigurationCache = z;
        this.runtimeAppConfigurationProvider = dVar;
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new HashMap());
        C12775o.m28638h(synchronizedMap, "synchronizedMap(HashMap())");
        this.configurationCache = synchronizedMap;
        String resourcePackageName2 = PackageUtils.getResourcePackageName(this.context);
        C12775o.m28638h(resourcePackageName2, "getResourcePackageName(context)");
        this.resourcePackageName = resourcePackageName2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4236c(Context context2, boolean z, C4245d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context2, (i & 2) != 0 ? true : z, (i & 4) != 0 ? new C4245d(context2) : dVar);
    }
}
