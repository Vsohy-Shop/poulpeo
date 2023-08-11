package com.rmn.apiclient.core.data.serializer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.core.reflection.ReflectionUtils;
import java.lang.reflect.Field;
import org.json.JSONObject;

public class FieldParser<V> implements ISpecificParser {
    @NonNull
    public final String fieldName;
    @NonNull
    public final FieldParsingFunction<V> fieldParsingFunction;

    public interface FieldParsingFunction<V> {
        @Nullable
        V parse(@NonNull JSONObject jSONObject);
    }

    public FieldParser(@NonNull String str, @NonNull FieldParsingFunction<V> fieldParsingFunction2) {
        this.fieldName = str;
        this.fieldParsingFunction = fieldParsingFunction2;
    }

    public void parse(@NonNull IModel iModel, @NonNull JSONObject jSONObject) {
        Field field = ReflectionUtils.getField(iModel, this.fieldName);
        if (field != null) {
            ReflectionUtils.setValue(this.fieldParsingFunction.parse(jSONObject), iModel, field);
        }
    }
}
