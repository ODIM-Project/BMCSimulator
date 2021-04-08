// Copyright (c) Intel Corporation
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.odim.simulator.tree.templates.redfish.embedded

import com.odim.simulator.tree.EmbeddedObjectTemplate
import com.odim.simulator.tree.RedfishVersion.V1_3_0
import com.odim.simulator.tree.RedfishVersion.V1_4_0
import com.odim.simulator.tree.RedfishVersion.V1_7_0
import com.odim.simulator.tree.ResourceTemplate
import com.odim.simulator.tree.structure.EmbeddedObjectType.ACCOUNT_SERVICE_AUTHENTICATION
import com.odim.simulator.tree.structure.EmbeddedObjectType.ACCOUNT_SERVICE_LDAP_SERVICE
import com.odim.simulator.tree.structure.EmbeddedObjectType.ACCOUNT_SERVICE_ROLE_MAPPING
import com.odim.simulator.tree.structure.EmbeddedObjectType.EXTERNAL_ACCOUNT_PROVIDER
import com.odim.simulator.tree.structure.Resource.Companion.embeddedArray
import com.odim.simulator.tree.structure.Resource.Companion.embeddedObject
import com.odim.simulator.tree.structure.ResourceCollection
import com.odim.simulator.tree.structure.ResourceCollectionType
import com.odim.simulator.tree.structure.ResourceCollectionType.CERTIFICATES_COLLECTION

/**
 * This is generated class. Please don't edit it's contents.
 */
@EmbeddedObjectTemplate(EXTERNAL_ACCOUNT_PROVIDER)
open class ExternalAccountProviderTemplate : ResourceTemplate() {
    init {
        version(V1_3_0, embeddedObject(
                "AccountProviderType" to null,
                "ServiceEnabled" to null,
                "ServiceAddresses" to embeddedArray(),
                "Authentication" to embeddedObject(ACCOUNT_SERVICE_AUTHENTICATION),
                "LDAPService" to embeddedObject(ACCOUNT_SERVICE_LDAP_SERVICE),
                "RemoteRoleMapping" to embeddedArray(ACCOUNT_SERVICE_ROLE_MAPPING)
        ))
        version(V1_4_0, V1_3_0, embeddedObject(
                "Certificates" to ResourceCollection(CERTIFICATES_COLLECTION)
        ))
        version(V1_7_0, V1_4_0, embeddedObject(
                "PasswordSet" to false
        ))
    }
}
