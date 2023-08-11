package p393na;

import com.poulpeo.R;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import p009j9.C2036a;

/* renamed from: na.b */
/* compiled from: EarningFilter */
public enum C12959b {
    ALL((String) null) {
        /* renamed from: a */
        public C2036a mo50871a() {
            return new C2036a(new ResourceStringWrapper(R.string.earnings_filters_all_error_title), (ResourceStringWrapper) null);
        }

        /* renamed from: b */
        public String mo50872b() {
            return null;
        }

        /* renamed from: c */
        public ResourceStringWrapper mo50873c() {
            return new ResourceStringWrapper(R.string.earnings_filters_all_name);
        }
    },
    CASHBACK((String) null) {
        /* renamed from: a */
        public C2036a mo50871a() {
            return new C2036a(new ResourceStringWrapper(R.string.earnings_filters_cashback_error_title), new ResourceStringWrapper(R.string.earnings_filters_cashback_error_message));
        }

        /* renamed from: b */
        public String mo50872b() {
            return APIResourceDescriptors.RESOURCE_TYPE_CASHBACK;
        }

        /* renamed from: c */
        public ResourceStringWrapper mo50873c() {
            return new ResourceStringWrapper(R.string.earnings_filters_cashback_name);
        }
    },
    REVIEW((String) null) {
        /* renamed from: a */
        public C2036a mo50871a() {
            return new C2036a(new ResourceStringWrapper(R.string.earnings_filters_review_error_title), new ResourceStringWrapper(R.string.earnings_filters_review_error_message));
        }

        /* renamed from: b */
        public String mo50872b() {
            return "review";
        }

        /* renamed from: c */
        public ResourceStringWrapper mo50873c() {
            return new ResourceStringWrapper(R.string.earnings_filters_review_name);
        }
    },
    SPONSORSHIP((String) null) {
        /* renamed from: a */
        public C2036a mo50871a() {
            return new C2036a(new ResourceStringWrapper(R.string.earnings_filters_sponsorship_error_title), new ResourceStringWrapper(R.string.earnings_filters_sponsorship_error_message));
        }

        /* renamed from: b */
        public String mo50872b() {
            return "sponsorship";
        }

        /* renamed from: c */
        public ResourceStringWrapper mo50873c() {
            return new ResourceStringWrapper(R.string.earnings_filters_sponsorship_name);
        }
    };

    /* renamed from: a */
    public abstract C2036a mo50871a();

    /* renamed from: b */
    public abstract String mo50872b();

    /* renamed from: c */
    public abstract ResourceStringWrapper mo50873c();
}
