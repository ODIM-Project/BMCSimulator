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
import com.odim.simulator.tree.RedfishVersion.V1_0_0
import com.odim.simulator.tree.RedfishVersion.V1_3_0
import com.odim.simulator.tree.RedfishVersion.V1_5_0
import com.odim.simulator.tree.ResourceTemplate
import com.odim.simulator.tree.structure.EmbeddedObjectType.NETWORK_DEVICE_FUNCTION_ETHERNET
import com.odim.simulator.tree.structure.EmbeddedObjectType.VLAN
import com.odim.simulator.tree.structure.Resource.Companion.embeddedObject
import com.odim.simulator.tree.structure.ResourceCollection
import com.odim.simulator.tree.structure.ResourceCollectionType.VLAN_NETWORK_INTERFACES_COLLECTION

/**
 * This is generated class. Please don't edit it's contents.
 */
@EmbeddedObjectTemplate(NETWORK_DEVICE_FUNCTION_ETHERNET)
open class NetworkDeviceFunctionEthernetTemplate : ResourceTemplate() {
    init {
        version(V1_0_0, embeddedObject(
                "PermanentMACAddress" to null,
                "MACAddress" to null,
                "MTUSize" to null
        ))
        version(V1_3_0, V1_0_0, embeddedObject(
                "VLAN" to embeddedObject(VLAN),
                "VLANs" to ResourceCollection(VLAN_NETWORK_INTERFACES_COLLECTION)
        ))
        version(V1_5_0, V1_3_0, embeddedObject(
                "MTUSizeMaximum" to null
        ))
    }
}
