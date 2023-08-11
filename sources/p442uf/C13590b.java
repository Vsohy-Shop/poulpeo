package p442uf;

import java.util.List;
import java.util.Map;

/* renamed from: uf.b */
/* compiled from: KCallable.kt */
public interface C13590b<R> extends C13589a {
    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    String getName();

    List<Object> getParameters();

    C13603l getReturnType();

    List<Object> getTypeParameters();

    C13604m getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
