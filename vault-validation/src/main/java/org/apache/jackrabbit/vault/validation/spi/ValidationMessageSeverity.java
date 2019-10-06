/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jackrabbit.vault.validation.spi;

public enum ValidationMessageSeverity {
    /** should only be emitted in case a debug option is enabled, not a real violation */
    DEBUG, 
    /** only for informational purposes, not a real violation */
    INFO, 
    /** a violation which might lead to unintended side-effects during package installation */
    WARN, 
    /** a severe violation which very likely leads to unintended side-effects during package installation */
    ERROR
}