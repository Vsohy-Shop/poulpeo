package p398nf;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adjust.sdk.Constants;
import kotlin.jvm.internal.C12756e;
import kotlin.jvm.internal.C12775o;
import p442uf.C13591c;

/* renamed from: nf.a */
/* compiled from: JvmClassMapping.kt */
public final class C13018a {
    /* renamed from: a */
    public static final <T> Class<T> m29392a(C13591c<T> cVar) {
        C12775o.m28639i(cVar, "<this>");
        Class<?> b = ((C12756e) cVar).mo50649b();
        C12775o.m28637g(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return b;
    }

    /* renamed from: b */
    public static final <T> Class<T> m29393b(C13591c<T> cVar) {
        C12775o.m28639i(cVar, "<this>");
        Class b = ((C12756e) cVar).mo50649b();
        if (!b.isPrimitive()) {
            C12775o.m28637g(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return b;
        }
        String name = b.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    b = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    b = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    b = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    b = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals(Constants.LONG)) {
                    b = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    b = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    b = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    b = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    b = Short.class;
                    break;
                }
                break;
        }
        C12775o.m28637g(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return b;
    }
}
