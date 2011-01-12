/**
 * Copyright (C) 2010-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.flyway.core.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Formats execution times.
 */
public class TimeFormat {
    /**
     * Prevent instantiation.
     */
    private TimeFormat() {
        // Do nothing
    }

    /**
     * Formats this execution time.
     *
     * @param millis The number of millis.
     * @return The execution in a human-readable format.
     */
    public static String format(long millis) {
        DateFormat dateFormat = new SimpleDateFormat("mm:ss.SSS");
        return dateFormat.format(new Date(millis)) + "s";
    }
}
