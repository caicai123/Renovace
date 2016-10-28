/*
 * Copyright (c) 2016  athou（cai353974361@163.com）.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.athou.renovace.demo;

import com.athou.renovace.demo.bean.SouguBean;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by athou on 2016/10/28.
 */

public interface TestApi {

    @GET("app.php")
    Observable<SouguBean> getSougu(@QueryMap Map<String, String> maps);

    @GET("{url}")
    Observable<ResponseBody> getWeatherStr(@Path("url") String url,
                                           @QueryMap Map<String, String> maps);
}
