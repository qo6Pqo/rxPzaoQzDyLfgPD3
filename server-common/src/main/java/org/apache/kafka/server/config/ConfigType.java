/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.kafka.server.config;

import java.util.Arrays;
import java.util.List;

/**
 * Represents all the entities that can be configured via ZK
 */
public class ConfigType {
    public static final String TOPIC = "topics";
    public static final String CLIENT = "clients";
    public static final String USER = "users";
    public static final String BROKER = "brokers";
    public static final String IP = "ips";
    public static final String CLIENT_METRICS = "client-metrics";
    public static final String GROUP = "groups";

    // Do not include ClientMetrics and Groups in `all` as they are not supported on ZK.
    public static final List<String> ALL = Arrays.asList(TOPIC, CLIENT, USER, BROKER, IP);
}