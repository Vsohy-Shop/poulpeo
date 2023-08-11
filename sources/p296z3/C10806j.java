package p296z3;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import com.appboy.Constants;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: z3.j */
public final class C10806j implements C10819t {

    /* renamed from: c */
    private static final Uri f16542c;

    /* renamed from: b */
    private final LogPrinter f16543b = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        builder.authority("local");
        f16542c = builder.build();
    }

    /* renamed from: a */
    public final void mo45736a(C10808l lVar) {
        ArrayList arrayList = new ArrayList(lVar.mo45743e());
        Collections.sort(arrayList, new C10807k(this));
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String obj2 = ((C10810n) obj).toString();
            if (!TextUtils.isEmpty(obj2)) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(obj2);
            }
        }
        this.f16543b.println(sb.toString());
    }

    /* renamed from: b */
    public final Uri mo45737b() {
        return f16542c;
    }
}
