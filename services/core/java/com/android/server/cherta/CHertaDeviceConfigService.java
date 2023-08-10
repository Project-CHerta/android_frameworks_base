/*
 * Copyright (C) 2023 The PixelExperience Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.server.cherta;

import android.content.Context;
import com.android.server.SystemService;

import com.android.internal.util.cherta.DeviceConfigUtils;

public class CHertaDeviceConfigService extends SystemService {

    private static final String TAG = "CHertaDeviceConfigService";

    private final Context mContext;

    public CHertaDeviceConfigService(Context context) {
        super(context);
        mContext = context;
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onBootPhase(int phase) {
        if (phase == PHASE_BOOT_COMPLETED) {
            DeviceConfigUtils.setDefaultProperties(null, null);
        }
    }
}
