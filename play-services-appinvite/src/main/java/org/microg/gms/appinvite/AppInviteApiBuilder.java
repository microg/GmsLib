/*
 * Copyright (C) 2019 e Foundation
 *
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

package org.microg.gms.appinvite;

import android.content.Context;
import android.os.Looper;
import android.util.Log;

import com.google.android.gms.appinvite.AppInvite;
import com.google.android.gms.common.api.AccountInfo;
import com.google.android.gms.common.api.GoogleApiClient;

import org.microg.gms.common.api.ApiBuilder;
import org.microg.gms.common.api.ApiConnection;
import com.google.android.gms.common.api.Api;


public class AppInviteApiBuilder implements ApiBuilder<Api.ApiOptions.NoOptions>{
    private static final String TAG = "GmsAppInviteApiBuilder";

    @Override
    public ApiConnection build(Context context, Looper looper, Api.ApiOptions.NoOptions options, AccountInfo accountInfo, GoogleApiClient.ConnectionCallbacks callbacks, GoogleApiClient.OnConnectionFailedListener connectionFailedListener) {
        return new AppInviteClientImpl(context, options, callbacks, connectionFailedListener);
    }
}
