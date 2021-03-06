
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     components/services/filesystem/public/interfaces/types.mojom
//

package org.chromium.filesystem.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class Whence {


    public static final int FROM_BEGIN = (int) (0L);

    public static final int FROM_CURRENT = (int) (1L);

    public static final int FROM_END = (int) (2L);


    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private Whence() {}

}