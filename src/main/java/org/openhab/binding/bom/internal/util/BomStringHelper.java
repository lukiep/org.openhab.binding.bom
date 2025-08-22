/*
 * Copyright (c) 2010-2025 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.openhab.binding.bom.internal.util;

/**
 * Utility methods for string validation and hygiene.
 * Introduced by Luca in 2025 to replace deprecated Apache Commons usage.
 * Introduced BomStringHelper utility class for string validation, replacing deprecated Apache Commons usage.
 *
 * @author Luca Petrocelli - Initial contribution
 */

public final class BomStringHelper {

    private BomStringHelper() {
    }

    public static boolean isBlank(String s) {
        return s == null || s.isBlank();
    }

    public static boolean isNotBlank(String s) {
        return s != null && !s.isBlank();
    }
}
