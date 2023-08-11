package p310bc;

import com.rmn.apiclient.core.data.serializer.FieldParser;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import org.json.JSONObject;

/* renamed from: bc.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10928h implements FieldParser.FieldParsingFunction {
    public final Object parse(JSONObject jSONObject) {
        return APIResourceDescriptors.extractCampaignIllustration(jSONObject);
    }
}
