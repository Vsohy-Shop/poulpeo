package androidx.compose.p002ui.text.font;

import androidx.autofill.HintConstants;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12768j0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.font.FontVariation */
/* compiled from: FontVariation.kt */
public final class FontVariation {
    public static final int $stable = 0;
    public static final FontVariation INSTANCE = new FontVariation();

    @Immutable
    /* renamed from: androidx.compose.ui.text.font.FontVariation$Setting */
    /* compiled from: FontVariation.kt */
    public interface Setting {
        String getAxisName();

        boolean getNeedsDensity();

        float toVariationValue(Density density);
    }

    @Immutable
    /* renamed from: androidx.compose.ui.text.font.FontVariation$SettingFloat */
    /* compiled from: FontVariation.kt */
    private static final class SettingFloat implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final float value;

        public SettingFloat(String str, float f) {
            C12775o.m28639i(str, "axisName");
            this.axisName = str;
            this.value = f;
        }

        public boolean equals(Object obj) {
            boolean z;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingFloat)) {
                return false;
            }
            SettingFloat settingFloat = (SettingFloat) obj;
            if (!C12775o.m28634d(getAxisName(), settingFloat.getAxisName())) {
                return false;
            }
            if (this.value == settingFloat.value) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            return true;
        }

        public String getAxisName() {
            return this.axisName;
        }

        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + Float.hashCode(this.value);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }

        public float toVariationValue(Density density) {
            return this.value;
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.text.font.FontVariation$SettingInt */
    /* compiled from: FontVariation.kt */
    private static final class SettingInt implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final int value;

        public SettingInt(String str, int i) {
            C12775o.m28639i(str, "axisName");
            this.axisName = str;
            this.value = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingInt)) {
                return false;
            }
            SettingInt settingInt = (SettingInt) obj;
            if (C12775o.m28634d(getAxisName(), settingInt.getAxisName()) && this.value == settingInt.value) {
                return true;
            }
            return false;
        }

        public String getAxisName() {
            return this.axisName;
        }

        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + this.value;
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }

        public float toVariationValue(Density density) {
            return (float) this.value;
        }
    }

    @Immutable
    @SourceDebugExtension({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$SettingTextUnit\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n1#2:373\n*E\n"})
    /* renamed from: androidx.compose.ui.text.font.FontVariation$SettingTextUnit */
    /* compiled from: FontVariation.kt */
    private static final class SettingTextUnit implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final long value;

        public /* synthetic */ SettingTextUnit(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingTextUnit)) {
                return false;
            }
            SettingTextUnit settingTextUnit = (SettingTextUnit) obj;
            if (C12775o.m28634d(getAxisName(), settingTextUnit.getAxisName()) && TextUnit.m38646equalsimpl0(this.value, settingTextUnit.value)) {
                return true;
            }
            return false;
        }

        public String getAxisName() {
            return this.axisName;
        }

        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        /* renamed from: getValue-XSAIIZE  reason: not valid java name */
        public final long m38085getValueXSAIIZE() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + TextUnit.m38650hashCodeimpl(this.value);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + TextUnit.m38656toStringimpl(this.value) + ')';
        }

        public float toVariationValue(Density density) {
            if (density != null) {
                return TextUnit.m38649getValueimpl(this.value) * density.getFontScale();
            }
            throw new IllegalArgumentException("density must not be null".toString());
        }

        private SettingTextUnit(String str, long j) {
            this.axisName = str;
            this.value = j;
            this.needsDensity = true;
        }
    }

    @Immutable
    @SourceDebugExtension({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,372:1\n10783#2:373\n11008#2,3:374\n11011#2,3:384\n361#3,7:377\n76#4:387\n96#4,5:388\n101#5,2:393\n33#5,6:395\n103#5:401\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n*L\n52#1:373\n52#1:374,3\n52#1:384,3\n52#1:377,7\n53#1:387\n53#1:388,5\n60#1:393,2\n60#1:395,6\n60#1:401\n*E\n"})
    /* renamed from: androidx.compose.ui.text.font.FontVariation$Settings */
    /* compiled from: FontVariation.kt */
    public static final class Settings {
        public static final int $stable = 0;
        private final boolean needsDensity;
        private final List<Setting> settings;

        public Settings(Setting... settingArr) {
            C12775o.m28639i(settingArr, "settings");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z = false;
            for (Setting setting : settingArr) {
                String axisName = setting.getAxisName();
                Object obj = linkedHashMap.get(axisName);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(axisName, obj);
                }
                ((List) obj).add(setting);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                boolean z2 = true;
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list.size() != 1 ? false : z2) {
                        boolean unused = C12669b0.m28178B(arrayList, list);
                    } else {
                        throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + C12686e0.m28229h0(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) + ']').toString());
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    this.settings = arrayList2;
                    int size = arrayList2.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (((Setting) arrayList2.get(i)).getNeedsDensity()) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    this.needsDensity = z;
                    return;
                }
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Settings) && C12775o.m28634d(this.settings, ((Settings) obj).settings)) {
                return true;
            }
            return false;
        }

        public final boolean getNeedsDensity$ui_text_release() {
            return this.needsDensity;
        }

        public final List<Setting> getSettings() {
            return this.settings;
        }

        public int hashCode() {
            return this.settings.hashCode();
        }
    }

    private FontVariation() {
    }

    public final Setting Setting(String str, float f) {
        boolean z;
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        if (str.length() == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new SettingFloat(str, f);
        }
        throw new IllegalArgumentException(("Name must be exactly four characters. Actual: '" + str + '\'').toString());
    }

    /* renamed from: Settings-6EWAqTQ  reason: not valid java name */
    public final Settings m38083Settings6EWAqTQ(FontWeight fontWeight, int i, Setting... settingArr) {
        C12775o.m28639i(fontWeight, "weight");
        C12775o.m28639i(settingArr, "settings");
        C12768j0 j0Var = new C12768j0(3);
        j0Var.mo50668a(weight(fontWeight.getWeight()));
        j0Var.mo50668a(italic((float) i));
        j0Var.mo50669b(settingArr);
        return new Settings((Setting[]) j0Var.mo50671d(new Setting[j0Var.mo50670c()]));
    }

    public final Setting grade(int i) {
        boolean z = false;
        if (-1000 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return new SettingInt("GRAD", i);
        }
        throw new IllegalArgumentException("'GRAD' must be in -1000..1000".toString());
    }

    public final Setting italic(float f) {
        boolean z = false;
        if (0.0f <= f && f <= 1.0f) {
            z = true;
        }
        if (z) {
            return new SettingFloat("ital", f);
        }
        throw new IllegalArgumentException(("'ital' must be in 0.0f..1.0f. Actual: " + f).toString());
    }

    /* renamed from: opticalSizing--R2X_6o  reason: not valid java name */
    public final Setting m38084opticalSizingR2X_6o(long j) {
        if (TextUnit.m38652isSpimpl(j)) {
            return new SettingTextUnit("opsz", j, (DefaultConstructorMarker) null);
        }
        throw new IllegalArgumentException("'opsz' must be provided in sp units".toString());
    }

    public final Setting slant(float f) {
        boolean z = false;
        if (-90.0f <= f && f <= 90.0f) {
            z = true;
        }
        if (z) {
            return new SettingFloat("slnt", f);
        }
        throw new IllegalArgumentException(("'slnt' must be in -90f..90f. Actual: " + f).toString());
    }

    public final Setting weight(int i) {
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return new SettingInt("wght", i);
        }
        throw new IllegalArgumentException(("'wght' value must be in [1, 1000]. Actual: " + i).toString());
    }

    public final Setting width(float f) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new SettingFloat("wdth", f);
        }
        throw new IllegalArgumentException(("'wdth' must be strictly > 0.0f. Actual: " + f).toString());
    }
}
