package com.rmn.api.p322v2.main.oauth;

import com.rmn.api.p322v2.main.general.IApiType;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p446vd.C13630k;

/* renamed from: com.rmn.api.v2.main.oauth.BundleRequest */
public class BundleRequest {
    private IApiType api;
    private Map<String, String> args;
    private Map<String, String[]> arrayArgs;
    private String endPointUrl;
    private boolean isAccessTokenRequest;
    private URL urlGet;
    private URL urlPost;

    public BundleRequest(String str) {
        init((IApiType) null, str, (Map<String, String>) null, (Map<String, String[]>) null, false);
    }

    private void init(IApiType iApiType, String str, Map<String, String> map, Map<String, String[]> map2, boolean z) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        }
        this.api = iApiType;
        this.endPointUrl = str;
        if (map != null) {
            this.args = new HashMap(map);
        }
        if (map2 != null) {
            this.arrayArgs = new HashMap(map2);
        }
        this.urlGet = new URL(C13630k.m31137b(this.endPointUrl, this.args, this.arrayArgs));
        this.urlPost = new URL(C13630k.m31136a(this.endPointUrl, (Map<String, String>) null));
        this.isAccessTokenRequest = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BundleRequest bundleRequest = (BundleRequest) obj;
        IApiType iApiType = this.api;
        if (iApiType == null) {
            if (bundleRequest.api != null) {
                return false;
            }
        } else if (!iApiType.equals(bundleRequest.api)) {
            return false;
        }
        Map<String, String> map = this.args;
        if (map == null) {
            if (bundleRequest.args != null) {
                return false;
            }
        } else if (map.size() != bundleRequest.args.size()) {
            return false;
        } else {
            for (Map.Entry next : this.args.entrySet()) {
                String str = (String) next.getKey();
                if (str != null) {
                    String str2 = (String) next.getValue();
                    String str3 = bundleRequest.args.get(str);
                    if (str2 == null) {
                        if (str3 != null) {
                            return false;
                        }
                    } else if (!str2.equals(str3)) {
                        return false;
                    }
                }
            }
        }
        Map<String, String[]> map2 = this.arrayArgs;
        if (map2 == null) {
            if (bundleRequest.arrayArgs != null) {
                return false;
            }
        } else if (map2.size() != bundleRequest.arrayArgs.size()) {
            return false;
        } else {
            for (Map.Entry next2 : this.arrayArgs.entrySet()) {
                String str4 = (String) next2.getKey();
                if (str4 != null) {
                    String[] strArr = (String[]) next2.getValue();
                    String[] strArr2 = bundleRequest.arrayArgs.get(str4);
                    if (strArr == null) {
                        if (strArr2 != null) {
                            return false;
                        }
                    } else if (!Arrays.equals(strArr, strArr2)) {
                        return false;
                    }
                }
            }
        }
        String str5 = this.endPointUrl;
        if (str5 == null) {
            if (bundleRequest.endPointUrl != null) {
                return false;
            }
        } else if (!str5.equals(bundleRequest.endPointUrl)) {
            return false;
        }
        return true;
    }

    public IApiType getApi() {
        IApiType iApiType = this.api;
        if (iApiType != null) {
            return iApiType;
        }
        throw new IllegalStateException("API was not provided");
    }

    public Map<String, String> getArgs() {
        if (this.args == null) {
            return null;
        }
        return new HashMap(this.args);
    }

    public Map<String, String[]> getArrayArgs() {
        if (this.arrayArgs == null) {
            return null;
        }
        return new HashMap(this.arrayArgs);
    }

    public String getEndPointUrl() {
        return this.endPointUrl;
    }

    public URL getUrl(HttpMethod httpMethod) {
        if (httpMethod == null) {
            throw new IllegalArgumentException();
        } else if (httpMethod == HttpMethod.GET) {
            return this.urlGet;
        } else {
            if (httpMethod == HttpMethod.POST) {
                return this.urlPost;
            }
            throw new UnsupportedOperationException();
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        IApiType iApiType = this.api;
        int i5 = 0;
        if (iApiType == null) {
            i = 0;
        } else {
            i = iApiType.hashCode();
        }
        int i6 = (i + 31) * 31;
        Map<String, String> map = this.args;
        if (map == null) {
            i2 = 0;
        } else {
            i2 = map.hashCode();
        }
        int i7 = i6 + i2;
        Map<String, String[]> map2 = this.arrayArgs;
        if (map2 == null || map2.isEmpty()) {
            i7 *= 31;
        } else {
            for (Map.Entry next : this.arrayArgs.entrySet()) {
                String str = (String) next.getKey();
                int i8 = i7 * 31;
                if (str == null) {
                    i3 = 0;
                } else {
                    i3 = str.hashCode();
                }
                String[] strArr = (String[]) next.getValue();
                int i9 = (i8 + i3) * 31;
                if (strArr == null) {
                    i4 = 0;
                } else {
                    i4 = Arrays.hashCode(strArr);
                }
                i7 = i9 + i4;
            }
        }
        int i10 = i7 * 31;
        String str2 = this.endPointUrl;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return i10 + i5;
    }

    public boolean isAccessTokenRequest() {
        return this.isAccessTokenRequest;
    }

    public BundleRequest(String str, Map<String, String> map) {
        init((IApiType) null, str, map, (Map<String, String[]>) null, false);
    }

    public BundleRequest(IApiType iApiType, String str, Map<String, String> map) {
        init(iApiType, str, map, (Map<String, String[]>) null, false);
    }

    public BundleRequest(IApiType iApiType, String str, Map<String, String> map, Map<String, String[]> map2) {
        init(iApiType, str, map, map2, false);
    }

    public BundleRequest(IApiType iApiType, String str, Map<String, String> map, boolean z) {
        init(iApiType, str, map, (Map<String, String[]>) null, z);
    }

    public BundleRequest(IApiType iApiType, String str, String str2, Map<String, String> map) {
        if (str == null) {
            throw new IllegalArgumentException();
        } else if (str2 != null) {
            init(iApiType, str + str2, map, (Map<String, String[]>) null, false);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
