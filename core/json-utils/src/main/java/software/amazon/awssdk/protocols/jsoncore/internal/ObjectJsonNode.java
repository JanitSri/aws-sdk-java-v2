/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package software.amazon.awssdk.protocols.jsoncore.internal;

import software.amazon.awssdk.annotations.SdkInternalApi;
import software.amazon.awssdk.protocols.jsoncore.JsonArray;
import software.amazon.awssdk.protocols.jsoncore.JsonNode;
import software.amazon.awssdk.protocols.jsoncore.JsonNumber;
import software.amazon.awssdk.protocols.jsoncore.JsonObject;

@SdkInternalApi
public final class ObjectJsonNode implements JsonNode {
    private final JsonObject value;

    public ObjectJsonNode(JsonObject value) {
        this.value = value;
    }

    @Override
    public Type type() {
        return Type.OBJECT;
    }

    @Override
    public boolean isObject() {
        return true;
    }

    @Override
    public JsonNumber asNumber() {
        throw new UnsupportedOperationException("A JSON object cannot be converted to a number.");
    }

    @Override
    public String asString() {
        throw new UnsupportedOperationException("A JSON object cannot be converted to a string.");
    }

    @Override
    public boolean asBoolean() {
        throw new UnsupportedOperationException("A JSON object cannot be converted to a boolean.");
    }

    @Override
    public JsonArray asArray() {
        throw new UnsupportedOperationException("A JSON object cannot be converted to an array.");
    }

    @Override
    public JsonObject asObject() {
        return value;
    }

    @Override
    public Object asEmbeddedObject() {
        throw new UnsupportedOperationException("A JSON object cannot be converted to an embedded object.");
    }

    @Override
    public String toString() {
        return value.toString();
    }
}